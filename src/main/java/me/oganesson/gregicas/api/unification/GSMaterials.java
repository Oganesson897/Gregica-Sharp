package me.oganesson.gregicas.api.unification;

import gregtech.api.unification.material.Material;
import me.oganesson.gregicas.api.unification.materials.GSOrganicChemistryMaterial;

public class GSMaterials {

    public static Material NitrileButadieneRubber;
    public static Material FluorosiliconeElastomer;
    public static Material FluoroPhosphazeneRubber;

    //Range: 29000 - 31000

    public GSMaterials() {}

    public static void register()
    {
        GSOrganicChemistryMaterial.register();
    }

}
