package me.oganesson.gregicas.api.unification.materials;

import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.BlastProperty;

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




  
}
}
