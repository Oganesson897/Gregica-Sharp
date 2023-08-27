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

    //Range: 29000 - 31000

    public GSMaterials() {}

    public static void register()
    {
        GSOrganicChemistryMaterial.register();
    }

}
