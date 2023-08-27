package me.oganesson.gregicas.api.unification.materials;

import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.material.Material;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.util.GTUtility.gregtechId;
import static me.oganesson.gregicas.api.unification.GSMaterials.*;

public class GSOrganicChemistryMaterial {

    public static void register() {
        NitrileButadieneRubber = new Material.Builder(29000, gregtechId("nitrile_butadiene_rubber"))
                .polymer()
                .color(0x211A18).iconSet(SHINY)
                .flags(GENERATE_PLATE, GENERATE_RING, GENERATE_FOIL, DISABLE_DECOMPOSITION)
                .components(Carbon, 7, Hydrogen, 9, Nitrogen, 1)
                .fluidTemp(433)
                .build();

        FluoroResin2314 = new Material.Builder(29001, gregtechId("fluoro_resin_2314"))
                .polymer()
                .color(0x211A18).iconSet(SHINY)
                .flags(GENERATE_PLATE, GENERATE_RING, GENERATE_FOIL, DISABLE_DECOMPOSITION)
                .components(Carbon, 5, Hydrogen, 5, Nitrogen, 1, Fluorine, 2)
                .build();

        FluoroPhosphazeneRubber = new Material.Builder(29002, gregtechId("fluoro_phosphazene_rubber"))
                .polymer()
                .color(0x211A18).iconSet(SHINY)
                .flags(GENERATE_PLATE, GENERATE_RING, GENERATE_FOIL, DISABLE_DECOMPOSITION)
                .components(Carbon, 24, Hydrogen, 16, Oxygen, 8, Nitrogen, 4, Phosphorus, 4, Fluorine, 40)
                .build();

        Acrylonitrile = new Material.Builder(29003, gregtechId("acrylonitrile"))
                .components(Carbon, 3, Hydrogen, 3, Nitrogen, 1)
                .polymer().iconSet(SHINY)
                .flags(DISABLE_DECOMPOSITION)
                .build();

        VDF = new Material.Builder(29004, gregtechId("vdf"))
                .fluid(FluidTypes.GAS, false)
                .components(Carbon, 2, Hydrogen, 2, Fluorine, 2)
                .flags(DISABLE_DECOMPOSITION)
                .color(8224125)
                .build();

        Chlorotrifluoroethylene = new Material.Builder(29005, gregtechId("chlorotrifluoroethylene"))
                .fluid(FluidTypes.GAS, false)
                .components(Carbon, 2, Chlorine, 1, Fluorine, 3)
                .flags(DISABLE_DECOMPOSITION)
                .color(14803425)
                .build();

        Acetylene = new Material.Builder(29006, gregtechId("acetylene"))
                .components(Carbon, 2, Hydrogen, 2)
                .fluid(FluidTypes.GAS, false)
                .flags(DISABLE_DECOMPOSITION)
                .color(0x858A5F)
                .build();

        HydrogenCyanide = new Material.Builder(29007, gregtechId("hydrogen_cyanide"))
                .components(Hydrogen, 1, Carbon, 1, Nitrogen, 1)
                .fluid(FluidTypes.GAS, false)
                .flags(DISABLE_DECOMPOSITION)
                .color(0xB0CDA7)
                .build();

        R152a = new Material.Builder(29008, gregtechId("r152a"))
                .components(Carbon, 2, Hydrogen, 4, Fluorine, 2)
                .fluid(FluidTypes.GAS, false)
                .flags(DISABLE_DECOMPOSITION)
                .color(0xE1FFFF)
                .build();

        R142b = new Material.Builder(29009, gregtechId("r142b"))
                .components(Carbon, 2, Hydrogen, 3, Chlorine, 1, Fluorine, 2)
                .fluid(FluidTypes.GAS, false)
                .flags(DISABLE_DECOMPOSITION)
                .color(0x90EE90)
                .build();
        
        RawNitrileButadieneRubber = new Material.Builder(29010, gregtechId("raw_nitrile_butadiene_rubber"))
                .dust()
                .color(0x211A18)
                .flags(DISABLE_DECOMPOSITION)
                .components(Carbon, 7, Hydrogen, 9, Nitrogen, 1)
                .build();

        CalciumCarbide = new Material.Builder(29011, gregtechId("calcium_carbide"))
                .dust()
                .color(0x696969)
                .flags(DISABLE_DECOMPOSITION)
                .components(Calcium, 1, Carbon, 2)
                .build();

        CalciumHydroxide = new Material.Builder(29012, gregtechId("calcium_hydroxide"))
                .dust()
                .color(0xF5F5F5)
                .components(Calcium, 1,Oxygen , 2,Hydrogen , 2)
                .build();

        R152aChlorideMixture = new Material.Builder(29013, gregtechId("r152a_chloride_mixture"))
                .fluid(FluidTypes.GAS, false)
                .color(0xECFFBF)
                .build();

        AluminiumFluoride = new Material.Builder(29014, gregtechId("aluminium_fluoride"))
                .dust()
                .color(0xFF69B4)
                .components(Aluminium, 1, Fluorine, 3)
                .build();
        
        AntimonousChloride = new Material.Builder(29015, gregtechId("antimonous_chloride"))
                .dust()
                .color(0x808000)
                .components(Antimony, 1, Chlorine, 3)
                .build();

        AntimonousVChloride = new Material.Builder(29016, gregtechId("antimonous_v_chloride"))
                .fluid(FluidTypes.LIQUID, false)
                .color(0xBDB76B)
                .components(Antimony, 1, Chlorine, 5)
                .build();
    }

}
