package me.oganesson.gregicas.api.unification;

import gregtech.api.unification.material.Material;
import me.oganesson.gregicas.api.unification.materials.GSOrganicChemistryMaterial;

public class GSMaterials {

    public static Material NitrileButadieneRubber;
    public static Material FluoroResin2314;
    public static Material FluoroPhosphazeneRubber;
    public static Material Acrylonitrile;
    public static Material VDF;
    public static Material Chlorotrifluoroethylene;
    public static Material Acetylene;
    public static Material HydrogenCyanide;
    public static Material R152a;
    public static Material R142b;
    public static Material RawNitrileButadieneRubber;
    public static Material CalciumCarbide;
    public static Material CalciumHydroxide;
    public static Material R152aChlorideMixture;
    public static Material AluminiumFluoride;
    public static Material AntimonousChloride;
    public static Material AntimonousVChloride;
    public static Material Hexachloroethane;
    public static Material F113;
    public static Material ZincChloride;

    public static Material CorrosionResistingNickelbaseAlloys;
    public static Material NeutronsFlow;
    public static Material ProtonFlow;
    public static Material BismuthLeadAlloy;
    public static Material Inconel625;
    public static Material MetallicHydrogen;
    public static Material SupersolidHelium;

    //Range: 29000 - 31000

    public GSMaterials() {}

    public static void register()
    {
        GSOrganicChemistryMaterial.register();
    }

}
