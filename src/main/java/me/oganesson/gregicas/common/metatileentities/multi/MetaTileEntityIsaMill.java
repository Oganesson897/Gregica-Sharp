package me.oganesson.gregicas.common.metatileentities.multi;

import codechicken.lib.raytracer.CuboidRayTraceResult;
import codechicken.lib.render.CCRenderState;
import codechicken.lib.render.pipeline.IVertexOperation;
import codechicken.lib.vec.Matrix4;
import com.sun.istack.internal.NotNull;
import gregtech.api.capability.IMultiblockController;
import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.damagesources.DamageSources;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.recipes.Recipe;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.core.advancement.AdvancementTriggers;
import me.oganesson.gregicas.api.capability.GSCapabilities;
import me.oganesson.gregicas.api.capability.isamill.IsaMillProperties;
import me.oganesson.gregicas.api.item.IBall;
import me.oganesson.gregicas.api.recipe.GSRecipeMaps;
import me.oganesson.gregicas.client.textures.GSTextures;
import me.oganesson.gregicas.common.block.GSMetaBlocks;
import me.oganesson.gregicas.common.block.blocks.BlockGearBox;
import me.oganesson.gregicas.common.block.blocks.BlockMultiblockCasing;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;
import java.util.List;

public class MetaTileEntityIsaMill extends RecipeMapMultiblockController {

    private int ball_tier = 0;

    public MetaTileEntityIsaMill(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GSRecipeMaps.ISA_MILL_GRINDER);
        this.recipeMapWorkable = new MetaTileEntityIsaMill.IsaMillLogic(this);
    }

    protected IBlockState getCasingState() {
        return GSMetaBlocks.MULTI_CASING.getState(BlockMultiblockCasing.CasingType.ISA_MILL_CASING);
    }

    protected IBlockState getCasingState1() {
        return GSMetaBlocks.GEAR_BOX.getState(BlockGearBox.BlockType.ISA_MILL_GEARBOX);
    }

    @NotNull
    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("EEE", "EEE", "EEE")
                .aisle("EEE", "EGE", "EEE")
                .aisle("EEE", "EGE", "EEE")
                .aisle("EEE", "EGE", "EEE")
                .aisle("EEE", "EGE", "EEE")
                .aisle("EEE", "EGE", "EEE")
                .aisle("CCC", "CSC", "CCC")
                .where('S', selfPredicate())
                .where('C', states(getCasingState()))
                .where('E', states(getCasingState()).setMinGlobalLimited(31)
                        .or(abilities(MultiblockAbility.MUFFLER_HATCH).setExactLimit(1))
                        .or(abilities(MultiblockAbility.MAINTENANCE_HATCH).setExactLimit(1))
                        .or(abilities(GSCapabilities.GRINDBALL).setExactLimit(1))
                        .or(abilities(MultiblockAbility.EXPORT_ITEMS).setMinGlobalLimited(1).setPreviewCount(1))
                        .or(abilities(MultiblockAbility.IMPORT_ITEMS).setMinGlobalLimited(1).setPreviewCount(1))
                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setMinGlobalLimited(1).setMaxGlobalLimited(2).setPreviewCount(1)))
                .where('G', states(getCasingState1()))
                //.where('#', any())
                .build();
    }

    public IBall getBallHolder() {
        List<IBall> abilities = getAbilities(GSCapabilities.GRINDBALL);
        if (abilities.isEmpty())
            return null;
        return abilities.get(0);
    }

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return GSTextures.ISA_MILL_CASING;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new MetaTileEntityIsaMill(metaTileEntityId);
    }

    private boolean onRotorHolderInteract(@Nonnull EntityPlayer player) {
        if (player.isCreative()) return false;

        if (!getWorld().isRemote && this.isActive()) {
            player.attackEntityFrom(DamageSources.getTurbineDamage(), 7);
            AdvancementTriggers.ROTOR_HOLDER_DEATH.trigger((EntityPlayerMP) player);
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean onRightClick(EntityPlayer playerIn, EnumHand hand, EnumFacing facing, CuboidRayTraceResult hitResult) {
        return onRotorHolderInteract(playerIn) || super.onRightClick(playerIn, hand, facing, hitResult);
    }

    @Override
    public boolean onWrenchClick(EntityPlayer playerIn, EnumHand hand, EnumFacing facing, CuboidRayTraceResult hitResult) {
        return onRotorHolderInteract(playerIn) || super.onWrenchClick(playerIn, hand, facing, hitResult);
    }

    @Override
    public boolean onScrewdriverClick(EntityPlayer playerIn, EnumHand hand, EnumFacing facing, CuboidRayTraceResult hitResult) {
        return onRotorHolderInteract(playerIn);
    }

    @Override
    public void onLeftClick(EntityPlayer player, EnumFacing facing, CuboidRayTraceResult hitResult) {
        onRotorHolderInteract(player);
    }

    @Override
    public void update() {
        super.update();

        List<IBall> abilities = getAbilities(GSCapabilities.GRINDBALL);

        if(!abilities.isEmpty() && abilities.get(0) != null)
            this.ball_tier = getBallHolder().getGrinderTier();
    }

    @Override
    public void renderMetaTileEntity(CCRenderState renderState, Matrix4 translation, IVertexOperation[] pipeline) {
        super.renderMetaTileEntity(renderState, translation, pipeline);
        Textures.ROTOR_HOLDER_OVERLAY.renderSided(getFrontFacing(), renderState, translation, pipeline);
        GSTextures.ISA_MILL.renderSided(renderState, translation, pipeline, getFrontFacing(), isStructureFormed(), this.getRecipeLogic().isActive());
    }

    public class IsaMillLogic extends MultiblockRecipeLogic {

        private final MetaTileEntityIsaMill metaTileEntity;

        public IsaMillLogic(MetaTileEntityIsaMill tileEntity) {
            super(tileEntity);
            this.metaTileEntity = tileEntity;
        }

        @Override
        public boolean checkRecipe(@Nonnull Recipe recipe) {
            if (!super.checkRecipe(recipe))
                return false;

            return recipe.getProperty(IsaMillProperties.getInstance(), 0) == ball_tier;
        }

        protected boolean canProgressRecipe() {
            return (super.canProgressRecipe() && !((IMultiblockController)this.metaTileEntity).isStructureObstructed() && this.metaTileEntity.getBallHolder().hasBall());
        }
    }

}
