package me.oganesson.gregicas.api.unification.materials;

import gregtech.api.unification.material.Material;
import me.oganesson.gregicas.api.unification.GSMaterials;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.util.GTUtility.gregtechId;

public class GSOrganicChemistryMaterial {

    public static void register() {
        GSMaterials.NitrileButadieneRubber = new Material.Builder(29000, gregtechId("nitrile_butadiene_rubber"))
                .polymer()
                .color(0x211A18).iconSet(SHINY)
                .flags(GENERATE_PLATE, GENERATE_RING, GENERATE_FOIL, DISABLE_DECOMPOSITION)
                .components(Carbon, 7, Hydrogen, 9, Nitrogen, 1)
                .fluidTemp(433)
                .build();

        GSMaterials.FluorosiliconeElastomer = new Material.Builder(29001, gregtechId("fluorosilicone_elastomer"))
                .build();

        GSMaterials.FluoroPhosphazeneRubber = new Material.Builder(29002, gregtechId("fluoro_phosphazene_rubber"))
                .build();

        GSMaterials.Acrylonitrile = new Material.Builder(29003, gregtechId("acrylonitrile"))
                .components(Carbon, 3, Hydrogen, 3, Nitrogen, 1)
                .polymer()
                .build();
    }

}
