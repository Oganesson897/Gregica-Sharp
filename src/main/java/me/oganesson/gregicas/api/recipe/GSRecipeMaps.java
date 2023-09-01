package me.oganesson.gregicas.api.recipe;

import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.UniversalDistillationRecipeBuilder;
import me.oganesson.gregicas.api.capability.isamill.IsaMillBuilder;
import me.oganesson.gregicas.api.recipe.map.RecipeMapPBDT;

public class GSRecipeMaps {

    public static final RecipeMap<UniversalDistillationRecipeBuilder> PBDT;

    public static final RecipeMap<IsaMillBuilder> ISA_MILL_GRINDER;

    private GSRecipeMaps() {}

    static {
        PBDT = new RecipeMapPBDT();
        ISA_MILL_GRINDER = new RecipeMap<>("isa_mill",
                3, 3, 0, 0, new IsaMillBuilder(), false);
    }

}
