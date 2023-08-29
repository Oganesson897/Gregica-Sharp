package me.oganesson.gregicas.client.textures;

import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;
import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer;

public class GSTextures {

    public static OrientedOverlayRenderer LIGHTNING_ROD_OVERLAY;
    public static SimpleOverlayRenderer HEAT_RESISTANT_CHEMICALLY_INERT_MACHINE_CASING;

    public static void init() {
        LIGHTNING_ROD_OVERLAY = new OrientedOverlayRenderer("generators/lightning_rod");
        HEAT_RESISTANT_CHEMICALLY_INERT_MACHINE_CASING = new SimpleOverlayRenderer("casings/multiblock_casing/heat_resistant_chemically_inert_machine_casing");
    }

}
