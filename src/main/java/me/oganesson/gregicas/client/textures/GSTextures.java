package me.oganesson.gregicas.client.textures;

import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;

public class GSTextures {

    public static OrientedOverlayRenderer LIGHTNING_ROD_OVERLAY;

    public static void init() {
        LIGHTNING_ROD_OVERLAY = new OrientedOverlayRenderer("generators/lightning_rod");
    }

}
