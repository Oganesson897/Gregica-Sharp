package me.oganesson.gregicas.api.unification.materials;

import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.material.Material;
import me.oganesson.gregicas.api.unification.GSMaterials;

import static gregtech.api.util.GTUtility.gregtechId;

public class GSFoodOptionAddonMaterials {

    public static void register() {
        GSMaterials.SoySauce = new Material.Builder(29300, gregtechId("soy_sauce"))
                .fluid(FluidTypes.LIQUID, true)
                .color(0x2D1416)
                .build();

        GSMaterials.SoybeanOil = new Material.Builder(29301, gregtechId("soybean_oil"))
                .fluid(FluidTypes.LIQUID, true)
                .color(0xFFE3A1)
                .build();
    }

}
