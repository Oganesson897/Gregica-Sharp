package me.oganesson.gregicas.api.unification;

import gregtech.api.unification.material.Material;
import me.oganesson.gregicas.api.unification.materials.GSOrganicChemistryMaterial;

public class GSMaterials {

    public static Material NitrileButadieneRubber;
    public static Material FluoroResin2314;
    public static Material FluoroPhosphazeneRubber;
    public static Material Acrylonitrile;
    public static Material Difluoroethylene;
    public static Material Chlorotrifluoroethylene;
    public static Material Acetylene;
    public static Material HydrogenCyanide;
    public static Material Difluoroethane;
    public static Material R142b;

    //Range: 29000 - 31000

    public GSMaterials() {}

    public static void register()
    {
        GSOrganicChemistryMaterial.register();
    }

}
