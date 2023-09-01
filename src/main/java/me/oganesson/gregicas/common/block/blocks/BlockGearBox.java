package me.oganesson.gregicas.common.block.blocks;

import gregtech.api.block.VariantBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import javax.annotation.Nonnull;

public class BlockGearBox extends VariantBlock<BlockGearBox.BlockType> {
    public BlockGearBox() {
        super(Material.IRON);
        this.setTranslationKey("gear_box.json");
        this.setHardness(5.0F);
        this.setResistance(10.0F);
        this.setSoundType(SoundType.METAL);
        this.setHarvestLevel("wrench", 2);
    }

    public boolean canCreatureSpawn(@Nonnull IBlockState state, @Nonnull IBlockAccess world, @Nonnull BlockPos pos, @Nonnull EntityLiving.SpawnPlacementType type) {
        return false;
    }

    public static enum BlockType implements IStringSerializable {
        ISA_MILL_GEARBOX("isa_mill_gearbox");

        private final String name;

        BlockType(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }

}
