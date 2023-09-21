package me.oganesson.gregicas.loaders;

import gregtechfoodoption.GregTechFoodOption;
import net.minecraftforge.fml.common.Loader;

public class GSDepenLoader {

    public static boolean isGTFOLoader() {
        return Loader.isModLoaded(GregTechFoodOption.MODID);
    }

}
