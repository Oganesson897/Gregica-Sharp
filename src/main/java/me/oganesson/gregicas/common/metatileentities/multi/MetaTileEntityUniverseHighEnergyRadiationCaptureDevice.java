package me.oganesson.gregicas.common.metatileentities.multi;

import gregicality.multiblocks.common.block.GCYMMetaBlocks;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Materials;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.MetaBlocks;
import me.oganesson.gregicas.api.recipe.GSRecipeMaps;
import me.oganesson.gregicas.api.unification.GSMaterials;
import me.oganesson.gregicas.common.block.GSMetaBlocks;
import me.oganesson.gregicas.common.block.blocks.BlockMultiblockCasing;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class MetaTileEntityUniverseHighEnergyRadiationCaptureDevice extends RecipeMapMultiblockController {
    public MetaTileEntityUniverseHighEnergyRadiationCaptureDevice(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GSRecipeMaps.UHERCD);
    }

    @NotNull
    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("    SSSSSSS    ", "    SSSSSSS    ", "    SSSSSSS    ", "               ", "               ", "               ", "               ", "               ", "               ", "               ")
                .aisle("  SSGGGGGGGSS  ", "  SSIIIIIIISS  ", "  SSGGGGGGGSS  ", "    SSHHHSS    ", "    SSSSSSS    ", "    SSSSSSS    ", "    SSSSSSS    ", "               ", "               ", "               ")
                .aisle(" SGGGGGGGGGGGS ", " SIIIIIIIIIIIS ", " SGGGGGGGGGGGS ", "  SSOOOOOOOSS  ", "  SS       SS  ", "  SS       SS  ", "  SS       SS  ", "               ", "               ", "               ")
                .aisle(" SGGGGGGGGGGGS ", " SIIIIIIIIIIIS ", " SGGGGGGGGGGGS ", "  SO       OS  ", "  S         S  ", "  S         S  ", "  S         S  ", "               ", "               ", "               ")
                .aisle("SGGGGGGGGGGGGGS", "SIIIIIIIIIIIIIS", "SGGGGGGGGGGGGGS", " SO         OS ", " S           S ", " S           S ", " S           S ", "               ", "               ", "               ")
                .aisle("SGGGGGGGGGGGGGS", "SIIIIIIIIIIIIIS", "SGGGGGGGGGGGGGS", " SO         OS ", " S           S ", " S           S ", " S           S ", "               ", "               ", "               ")
                .aisle("SGGGGGGLGGGGGGS", "SIIIIIILIIIIIIS", "SGGGGGGLGGGGGGS", " HO    L    OH ", " S           S ", " S           S ", " S           S ", "               ", "       L       ", "               ")
                .aisle("SGGGGGLLLGGGGGS", "SIIIIILLLIIIIIS", "SGGGGGLLLGGGGGS", " HO   LLL   OH ", " S     L     S ", " S     L     S ", " S     L     S ", "       L       ", "      LLL      ", "       F       ")
                .aisle("SGGGGGGLGGGGGGS", "SIIIIIILIIIIIIS", "SGGGGGGLGGGGGGS", " HO    L    OH ", " S           S ", " S           S ", " S           S ", "               ", "       L       ", "               ")
                .aisle("SGGGGGGGGGGGGGS", "SIIIIIIIIIIIIIS", "SGGGGGGGGGGGGGS", " SO         OS ", " S           S ", " S           S ", " S           S ", "               ", "               ", "               ")
                .aisle("SGGGGGGGGGGGGGS", "SIIIIIIIIIIIIIS", "SGGGGGGGGGGGGGS", " SO         OS ", " S           S ", " S           S ", " S           S ", "               ", "               ", "               ")
                .aisle(" SGGGGGGGGGGGS ", " SIIIIIIIIIIIS ", " SGGGGGGGGGGGS ", "  SO       OS  ", "  S         S  ", "  S         S  ", "  S         S  ", "               ", "               ", "               ")
                .aisle(" SGGGGGGGGGGGS ", " SIIIIIIIIIIIS ", " SGGGGGGGGGGGS ", "  SSOOOOOOOSS  ", "  SS       SS  ", "  SS       SS  ", "  SS       SS  ", "               ", "               ", "               ")
                .aisle("  SSGGGGGGGSS  ", "  SSIIIIIIISS  ", "  SSGGGGGGGSS  ", "    SSHHHSS    ", "    SSSSSSS    ", "    SSSSSSS    ", "    SSSSSSS    ", "               ", "               ", "               ")
                .aisle("    SSSSSSS    ", "    SSSCSSS    ", "    SSSSSSS    ", "               ", "               ", "               ", "               ", "               ", "               ", "               ")
                .where('S', states(GSMetaBlocks.MULTI_CASING.getState(BlockMultiblockCasing.CasingType.RADIATION_RESISTANCE_CASING))
                        .or(autoAbilities(true, true, true, true, false, false, false))
                        .or(abilities(MultiblockAbility.COMPUTATION_DATA_RECEPTION)))
                .where('I', blocks(GSMaterials.GelidCryotheum.getFluid().getBlock()))
                .where('C', selfPredicate())
                .where('G', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS)))
                .where('L', states(MetaBlocks.FRAMES.get(Materials.TungstenSteel).getBlock(Materials.TungstenSteel)))
                .where('H', states())
                .build();
    }

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return null;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return null;
    }
}
