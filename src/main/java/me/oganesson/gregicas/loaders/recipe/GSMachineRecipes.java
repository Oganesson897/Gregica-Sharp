package me.oganesson.gregicas.loaders.recipe;

import gregtech.api.recipes.ModHandler;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.items.MetaItems;
import gregtech.common.metatileentities.MetaTileEntities;
import me.oganesson.gregicas.common.metatileentities.GSMetaTileEntities;
import net.minecraft.item.ItemStack;

public class GSMachineRecipes {

    public static void init() {
        ModHandler.addShapedRecipe("lightning_rod_iv", GSMetaTileEntities.LIGHTNING_ROD[0].getStackForm(),
                "LML", "MCM", "LML",
                'L', MetaItems.ENERGY_LAPOTRONIC_ORB,
                'C', new ItemStack(MetaBlocks.MACHINE_CASING, 1, 6),
                'M', MetaTileEntities.TRANSFORMER[6].getStackForm());

        ModHandler.addShapedRecipe("lightning_rod_luv", GSMetaTileEntities.LIGHTNING_ROD[1].getStackForm(),
                "LML", "MCM", "LML",
                'L', MetaItems.ENERGY_LAPOTRONIC_ORB_CLUSTER,
                'C', new ItemStack(MetaBlocks.MACHINE_CASING, 1, 7),
                'M', MetaTileEntities.TRANSFORMER[7].getStackForm());

        ModHandler.addShapedRecipe("lightning_rod_zpm", GSMetaTileEntities.LIGHTNING_ROD[2].getStackForm(),
                "LML", "MCM", "LML",
                'L', MetaItems.ULTIMATE_BATTERY,
                'C', new ItemStack(MetaBlocks.MACHINE_CASING, 1, 8),
                'M', MetaTileEntities.TRANSFORMER[8].getStackForm());
    }

}
