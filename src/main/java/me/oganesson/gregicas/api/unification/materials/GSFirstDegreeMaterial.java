package me.oganesson.gregicas.api.unification.materials;

import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialIconSet;
import gregtech.api.unification.material.properties.BlastProperty;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.util.GTUtility.gregtechId;
import static me.oganesson.gregicas.api.unification.GSMaterials.*;

public class GSFirstDegreeMaterial {

  
  public static void register() {
    CorrosionResistingNickelbaseAlloys = new Material.Builder(29200, gregtechId("corrosion_resisting_nickelbase_alloys"))
                .ingot()
                .fluid()
                .color(0x958273)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_FRAME, DISABLE_DECOMPOSITION)
                .components(Nickel, 21, Chrome, 5, Molybdenum, 5, Cobalt, 1, Iron, 1)
                .fluidTemp(1632)
                .blastTemp(9001, BlastProperty.GasTier.HIGHER, 131072, 600)
                .build();

    NeutronsFlow = new Material.Builder(29201, gregtechId("neutrons_flow"))
                .fluid(FluidTypes.GAS, false)
                .color(16448250)
                .build();

    ProtonFlow = new Material.Builder(29202, gregtechId("proton_flow"))
                .fluid(FluidTypes.GAS, false)
                .color(16448250)
                .build();

    BismuthLeadAlloy = new Material.Builder(29203, gregtechId("bismuth_lead_alloy"))
                .fluid()
                .dust()
                .color(0x800080)
                .fluidTemp(5475)
                .components(Bismuth, 47, Lead, 25, Tin, 13, Cadmium, 10, Indium, 5)
                .build();

    Inconel625 = new Material.Builder(29204, gregtechId("inconel_625"))
                .ingot()
                .fluid()
                .components(Nickel, 3, Chrome, 7, Molybdenum, 10, Invar, 10, Nichrome, 13)
                .flags(GENERATE_RING, GENERATE_BOLT_SCREW, GENERATE_GEAR)
                .blastTemp(2700, BlastProperty.GasTier.LOW, 120, 500)
                .fluidTemp(2700)
                .color(0x3fcc60)
                .fluidPipeProperties(550, 6400, true, true, true, true)
                .build();

    MetallicHydrogen = new Material.Builder(29205, gregtechId("metallic_hydrogen"))
                .ingot()
                .fluid()
                .iconSet(MaterialIconSet.SHINY)
                .flags(GENERATE_PLATE, GENERATE_RING, GENERATE_ROUND, GENERATE_ROTOR, GENERATE_BOLT_SCREW, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_LONG_ROD, GENERATE_FRAME)
                .fluidTemp(1)
                .color(0x4682B4)
                .fluidPipeProperties(10240, 24000, true, true, true, true)
                .components(Hydrogen, 1)
                .build();

    SupersolidHelium = new Material.Builder(29206, gregtechId("supersolid_helium"))
                .ingot()
                .fluid()
                .iconSet(MaterialIconSet.SHINY)
                .fluidTemp(4)
                .color(0xFFFF00)
                .components(Helium, 1)
                .build();

    GelidCryotheum = new Material.Builder(29207, gregtechId("gelid_cryotheum"))
            .color(0x40B8FB)
            .fluid(FluidTypes.LIQUID, true)
            .fluidTemp(0)
            .build();
}
}
