package me.oganesson.gregicas.loaders.recipe;

import me.oganesson.gregicas.loaders.GSDepenLoader;

public class GSRecipeManager
{

    private GSRecipeManager() {}

    public static void init()
    {
        GSCircuitRecipes.init();
        GSMachineRecipes.init();
        if (GSDepenLoader.isGTFOLoader() )GSFoodRecipes.init();
    }

}
