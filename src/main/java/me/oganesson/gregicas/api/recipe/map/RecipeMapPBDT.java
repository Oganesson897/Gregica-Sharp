package me.oganesson.gregicas.api.recipe.map;

import gregtech.api.recipes.builders.UniversalDistillationRecipeBuilder;
import gregtech.api.recipes.machines.RecipeMapDistillationTower;
import gregtech.core.sound.GTSoundEvents;

public class RecipeMapPBDT extends RecipeMapDistillationTower {
    public RecipeMapPBDT() {
        super("pbdt",
                2, true,
                2, true,
                4, true,
                12, false,
                new UniversalDistillationRecipeBuilder(), false);
        this.setSound(GTSoundEvents.CHEMICAL_REACTOR);
    }

    //Other things TODO
}
