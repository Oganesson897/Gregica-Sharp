package me.oganesson.gregicas.api.recipe;

import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.UniversalDistillationRecipeBuilder;
import me.oganesson.gregicas.api.recipe.map.RecipeMapPBDT;

public class GSRecipeMaps {

    public static final RecipeMap<UniversalDistillationRecipeBuilder> PBDT;

    private GSRecipeMaps() {}

    static {
        PBDT = new RecipeMapPBDT();
    }

}
