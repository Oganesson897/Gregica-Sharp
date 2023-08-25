package me.oganesson.gregicas.loaders.recipe;

public class GSRecipeManager
{

    private GSRecipeManager() {}

    public static void init()
    {
        GSCircuitRecipes.init();
        GSMachineRecipes.init();
    }

}
