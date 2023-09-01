package me.oganesson.gregicas.common.block;

import gregtech.common.blocks.MetaBlocks;
import me.oganesson.gregicas.common.block.blocks.BlockGearBox;
import me.oganesson.gregicas.common.block.blocks.BlockMultiblockCasing;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GSMetaBlocks {
    public static BlockMultiblockCasing MULTI_CASING;
    public static BlockGearBox GEAR_BOX;

    private GSMetaBlocks() {}

    public static void init() {
        MULTI_CASING = new BlockMultiblockCasing();
        MULTI_CASING.setRegistryName("multiblock_casing");
        GEAR_BOX = new BlockGearBox();
        GEAR_BOX.setRegistryName("gear_box");
    }

    @SideOnly(Side.CLIENT)
    public static void registerItemModels() {
        registerItemModel(MULTI_CASING);
        registerItemModel(GEAR_BOX);
    }

    @SideOnly(Side.CLIENT)
    private static void registerItemModel(Block block) {

        for (IBlockState state : block.getBlockState().getValidStates()) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),
                    block.getMetaFromState(state),
                    new ModelResourceLocation(block.getRegistryName(),
                    MetaBlocks.statePropertiesToString(state.getProperties())));
        }

    }

}
