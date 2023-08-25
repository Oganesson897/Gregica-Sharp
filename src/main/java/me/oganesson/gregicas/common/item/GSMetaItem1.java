package me.oganesson.gregicas.common.item;

import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;
import me.oganesson.gregicas.common.CommonProxy;

public class GSMetaItem1 extends StandardMetaItem
{
    public GSMetaItem1() {
        this.setRegistryName("gs_meta_item_1");
        this.setCreativeTab(CommonProxy.GREGICA_TAB);
    }

    public void registerSubItems()
    {
        GSMetaItems.GOOWARE_PROCESSOR = this.addItem(0, "circuit.gooware_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.ZPM);
        GSMetaItems.GOOWARE_ASSEMBLY = this.addItem(1, "circuit.gooware_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UV);
        GSMetaItems.GOOWARE_COMPUTER = this.addItem(2, "circuit.gooware_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        GSMetaItems.GOOWARE_MAINFRAME = this.addItem(3, "circuit.gooware_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);

        GSMetaItems.OPTICAL_PROCESSOR = this.addItem(4,"circuit.optical_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UV);
        GSMetaItems.OPTICAL_ASSEMBLY = this.addItem(5,"circuit.optical_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        GSMetaItems.OPTICAL_COMPUTER = this.addItem(6,"circuit.optical_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        GSMetaItems.OPTICAL_MAINFRAME = this.addItem(7,"circuit.optical_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);

        GSMetaItems.SPINTRONIC_PROCESSOR = this.addItem(8, "circuit.spintronic_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        GSMetaItems.SPINTRONIC_ASSEMBLY = this.addItem(9, "circuit.spintronic_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        GSMetaItems.SPINTRONIC_COMPUTER = this.addItem(10, "circuit.spintronic_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        GSMetaItems.SPINTRONIC_MAINFRAME = this.addItem(11, "circuit.spintronic_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);

        GSMetaItems.COSMIC_PROCESSOR = this.addItem(12, "circuit.cosmic_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        GSMetaItems.COSMIC_ASSEMBLY = this.addItem(13, "circuit.cosmic_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        GSMetaItems.COSMIC_COMPUTER = this.addItem(14, "circuit.cosmic_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);
        GSMetaItems.COSMIC_MAINFRAME = this.addItem(15, "circuit.cosmic_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.OpV);

        GSMetaItems.SUPRACAUSAL_PROCESSOR = this.addItem(16, "circuit.supracausal_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        GSMetaItems.SUPRACAUSAL_ASSEMBLY = this.addItem(17, "circuit.supracausal_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);
        GSMetaItems.SUPRACAUSAL_COMPUTER = this.addItem(18, "circuit.supracausal_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.OpV);
        GSMetaItems.SUPRACAUSAL_MAINFRAME = this.addItem(19, "circuit.supracausal_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.MAX);

        GSMetaItems.SUPRACHRONAL_ULV = this.addItem(20, "circuit.suprachronal.ulv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.ULV);
        GSMetaItems.SUPRACHRONAL_LV = this.addItem(21, "circuit.suprachronal.lv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.LV);
        GSMetaItems.SUPRACHRONAL_MV = this.addItem(22, "circuit.suprachronal.mv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.MV);
        GSMetaItems.SUPRACHRONAL_HV = this.addItem(23, "circuit.suprachronal.hv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.HV);
        GSMetaItems.SUPRACHRONAL_EV = this.addItem(24, "circuit.suprachronal.ev").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.EV);
        GSMetaItems.SUPRACHRONAL_IV = this.addItem(25, "circuit.suprachronal.iv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.IV);
        GSMetaItems.SUPRACHRONAL_LuV = this.addItem(26, "circuit.suprachronal.luv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.LuV);
        GSMetaItems.SUPRACHRONAL_ZPM = this.addItem(27, "circuit.suprachronal.zpm").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.ZPM);
        GSMetaItems.SUPRACHRONAL_UV = this.addItem(28, "circuit.suprachronal.uv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UV);
        GSMetaItems.SUPRACHRONAL_UHV = this.addItem(29, "circuit.suprachronal.uhv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        GSMetaItems.SUPRACHRONAL_UEV = this.addItem(30, "circuit.suprachronal.uev").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        GSMetaItems.SUPRACHRONAL_UIV = this.addItem(31, "circuit.suprachronal.uiv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        GSMetaItems.SUPRACHRONAL_UXV = this.addItem(32, "circuit.suprachronal.uxv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);
        GSMetaItems.SUPRACHRONAL_OpV = this.addItem(33, "circuit.suprachronal.opv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.OpV);
        GSMetaItems.SUPRACHRONAL_MAX = this.addItem(34, "circuit.suprachronal.max").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.MAX);

        GSMetaItems.RAW_NITRILE_BUTADIENE_RUBBER = this.addItem(35, "raw_nitrile_butadiene_rubber");
    }

}
