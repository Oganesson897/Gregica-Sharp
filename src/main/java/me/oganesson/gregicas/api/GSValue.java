package me.oganesson.gregicas.api;

import me.oganesson.gregicas.GregicaSharp;
import net.minecraft.util.ResourceLocation;

public class GSValue {

    public static ResourceLocation gregicasId(String id) {
        return new ResourceLocation(GregicaSharp.MODID, id);
    }

}
