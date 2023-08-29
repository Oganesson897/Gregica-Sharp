package me.oganesson.gregicas.api.unification.materials;

import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.material.Material;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.util.GTUtility.gregtechId;
import static me.oganesson.gregicas.api.unification.GSMaterials.*;

public class GSFirstDegreeMaterial {

  
  public static void register() {
    CorrosionResistingNickelbaseAlloys = new Material.Builder(29200, gregtechId("corrosion_resisting_nickelbase_alloys"))
                .ingot()
                .fluid()
                .color(0x958273)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_FRAME, DISABLE_DECOMPOSITION)
                .components(Nickel, 21, Chromium, 5, Molybdenum, 5, Cobalt, 1, Iron, 1)
                .fluidTemp(1632)
                .blastTemp(9001, "HIGHER", 131072, 600)
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
                .components(Materials.Bismuth, 47, Materials.Lead, 25, Materials.Tin, 13, Materials.Cadmium, 10, Materials.Indium, 5)
                .build();

    Inconel625 = new Material.Builder(29204, "inconel_625")
                .ingot()
                .fluid()
                .components(Materials.Nickel, 3, Materials.Chromium, 7, Materials.Molybdenum, 10, Materials.Invar, 10, Materials.Nichrome, 13)
                .flags(GENERATE_RING, GENERATE_BOLT_SCREW, GENERATE_GEAR)
                .blastTemp(2700, "LOW", 120, 500)
                .fluidTemp(2700)
                .color(0x3fcc60)
                .fluidPipeProperties(550, 6400, true, true, true, true)
                .build();

    MetallicHydrogen = new Material.Builder(29205, "metallic_hydrogen")
                .ingot()
                .fluid()
                .iconSet(MaterialIconSet.SHINY)
                .flags(GENERATE_PLATE, GENERATE_RING, GENERATE_ROUND, GENERATE_ROTOR, GENERATE_BOLT_SCREW, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_LONG_ROD, GENERATE_FRAME)
                .fluidTemp(1)
                .color(0x4682B4)
                .fluidPipeProperties(10240, 24000, true, true, true, true)
                .components(Hydrogen, 1)
                .build();

    SupersolidHelium = new Material.Builder(29206, "supersolid_helium")
                .ingot()
                .fluid()
                .iconSet(MaterialIconSet.SHINY)
                .fluidTemp(4)
                .color(0xFFFF00)
                .components(Helium, 1)
                .build();
  
}
}
