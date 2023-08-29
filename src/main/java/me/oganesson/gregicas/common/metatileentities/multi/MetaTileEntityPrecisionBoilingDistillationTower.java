package me.oganesson.gregicas.common.metatileentities.multi;

import gregicality.multiblocks.api.metatileentity.GCYMMultiblockAbility;
import gregicality.multiblocks.api.render.GCYMTextures;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;
import gregtech.common.ConfigHolder;
import gregtech.common.blocks.BlockBoilerCasing;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.metatileentities.multi.multiblockpart.MetaTileEntityMultiFluidHatch;
import me.oganesson.gregicas.api.recipe.GSRecipeMaps;
import me.oganesson.gregicas.client.textures.GSTextures;
import me.oganesson.gregicas.common.block.GSMetaBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

import static gregicality.multiblocks.api.metatileentity.GCYMRecipeMapMultiblockController.tieredCasing;
import static gregtech.api.util.RelativeDirection.*;

public class MetaTileEntityPrecisionBoilingDistillationTower extends RecipeMapMultiblockController {
    public MetaTileEntityPrecisionBoilingDistillationTower(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GSRecipeMaps.PBDT);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new MetaTileEntityPrecisionBoilingDistillationTower(metaTileEntityId);
    }

    @Nonnull
    protected OrientedOverlayRenderer getFrontOverlay() {
        return GCYMTextures.LARGE_DISTILLERY_OVERLAY;
    }

    @Nonnull
    @Override
    protected BlockPattern createStructurePattern() {
        TraceabilityPredicate casingPredicate = states(getCasingState()).setMinGlobalLimited(40); // Different characters use common constraints
        TraceabilityPredicate maintenancePredicate = this.hasMaintenanceMechanics() && ConfigHolder.machines.enableMaintenance ?
                abilities(MultiblockAbility.MAINTENANCE_HATCH).setMinGlobalLimited(1).setMaxGlobalLimited(1) : casingPredicate;
        return FactoryBlockPattern.start(RIGHT, FRONT, DOWN)
                .aisle("#####", "#ZZZ#", "#ZCZ#", "#ZZZ#", "#####")
                .aisle("##X##", "#XAX#", "XAPAX", "#XAX#", "##X##").setRepeatable(1, 12)
                .aisle("#YSY#", "YAAAY", "YATAY", "YAAAY", "#YYY#")
                .aisle("#YYY#", "YYYYY", "YYYYY", "YYYYY", "#YYY#")
                .where('S', selfPredicate())
                .where('Y', casingPredicate.or(abilities(MultiblockAbility.IMPORT_ITEMS))
                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setMinGlobalLimited(1))
                        .or(abilities(MultiblockAbility.IMPORT_FLUIDS).setMinGlobalLimited(1))
                        .or(abilities(MultiblockAbility.EXPORT_ITEMS))
                        .or(abilities(GCYMMultiblockAbility.PARALLEL_HATCH).setMaxGlobalLimited(1).setPreviewCount(1))
                        .or(maintenancePredicate))
                .where('X', casingPredicate.or(metaTileEntities(MultiblockAbility.REGISTRY.get(MultiblockAbility.EXPORT_FLUIDS).stream()
                        .filter(mte->!(mte instanceof MetaTileEntityMultiFluidHatch))
                        .toArray(MetaTileEntity[]::new))
                        .setMinLayerLimited(1).setMaxLayerLimited(1)))
                .where('Z', casingPredicate)
                .where('P', states(getCasingState2()))
                .where('C', abilities(MultiblockAbility.MUFFLER_HATCH))
                .where('T', tieredCasing().or(states(getCasingState2())))
                .where('A', air())
                .where('#', any())
                .build();
    }

    private IBlockState getCasingState() {
        return GSMetaBlocks.MULTI_CASING.getDefaultState();
    }

    private IBlockState getCasingState2() {
        return MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.STEEL_PIPE);
    }

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return GSTextures.HEAT_RESISTANT_CHEMICALLY_INERT_MACHINE_CASING;
    }
}
