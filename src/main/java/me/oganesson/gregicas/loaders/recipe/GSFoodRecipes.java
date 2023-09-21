package me.oganesson.gregicas.loaders.recipe;

import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.material.Materials;
import gregtechfoodoption.item.GTFOMetaItem;
import me.oganesson.gregicas.api.unification.GSMaterials;

public class GSFoodRecipes {

    public static void init() {
        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder()
                .input(GTFOMetaItem.SOYBEAN, 8)
                .fluidInputs(Materials.Water.getFluid(4000))
                .fluidOutputs(GSMaterials.SoySauce.getFluid(3800))
                .EUt(1)
                .duration(600)
                .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
                .input(GTFOMetaItem.SOYBEAN, 1)
                .fluidOutputs(GSMaterials.SoybeanOil.getFluid(200))
                .circuitMeta(1)
                .EUt(2)
                .duration(50)
                .buildAndRegister();
    }

}
