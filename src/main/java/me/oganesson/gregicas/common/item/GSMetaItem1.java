package me.oganesson.gregicas.common.item;

import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;
import me.oganesson.gregicas.common.CommonProxy;
import me.oganesson.gregicas.common.item.behaviors.MillBallBehavior;

import static me.oganesson.gregicas.common.item.GSMetaItems.*;

public class GSMetaItem1 extends StandardMetaItem
{
    public GSMetaItem1() {
        this.setRegistryName("gs_meta_item_1");
        this.setCreativeTab(CommonProxy.GREGICA_TAB);
    }

    public void registerSubItems()
    {
        GOOWARE_PROCESSOR = this.addItem(0, "circuit.gooware_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.ZPM);
        GOOWARE_ASSEMBLY = this.addItem(1, "circuit.gooware_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UV);
        GOOWARE_COMPUTER = this.addItem(2, "circuit.gooware_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        GOOWARE_MAINFRAME = this.addItem(3, "circuit.gooware_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);

        OPTICAL_PROCESSOR = this.addItem(4,"circuit.optical_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UV);
        OPTICAL_ASSEMBLY = this.addItem(5,"circuit.optical_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        OPTICAL_COMPUTER = this.addItem(6,"circuit.optical_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        OPTICAL_MAINFRAME = this.addItem(7,"circuit.optical_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);

        SPINTRONIC_PROCESSOR = this.addItem(8, "circuit.spintronic_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        SPINTRONIC_ASSEMBLY = this.addItem(9, "circuit.spintronic_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        SPINTRONIC_COMPUTER = this.addItem(10, "circuit.spintronic_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        SPINTRONIC_MAINFRAME = this.addItem(11, "circuit.spintronic_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);

        COSMIC_PROCESSOR = this.addItem(12, "circuit.cosmic_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        COSMIC_ASSEMBLY = this.addItem(13, "circuit.cosmic_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        COSMIC_COMPUTER = this.addItem(14, "circuit.cosmic_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);
        COSMIC_MAINFRAME = this.addItem(15, "circuit.cosmic_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.OpV);

        SUPRACAUSAL_PROCESSOR = this.addItem(16, "circuit.supracausal_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        SUPRACAUSAL_ASSEMBLY = this.addItem(17, "circuit.supracausal_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);
        SUPRACAUSAL_COMPUTER = this.addItem(18, "circuit.supracausal_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.OpV);
        SUPRACAUSAL_MAINFRAME = this.addItem(19, "circuit.supracausal_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.MAX);

        SUPRACHRONAL_ULV = this.addItem(20, "circuit.suprachronal.ulv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.ULV);
        SUPRACHRONAL_LV = this.addItem(21, "circuit.suprachronal.lv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.LV);
        SUPRACHRONAL_MV = this.addItem(22, "circuit.suprachronal.mv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.MV);
        SUPRACHRONAL_HV = this.addItem(23, "circuit.suprachronal.hv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.HV);
        SUPRACHRONAL_EV = this.addItem(24, "circuit.suprachronal.ev").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.EV);
        SUPRACHRONAL_IV = this.addItem(25, "circuit.suprachronal.iv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.IV);
        SUPRACHRONAL_LuV = this.addItem(26, "circuit.suprachronal.luv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.LuV);
        SUPRACHRONAL_ZPM = this.addItem(27, "circuit.suprachronal.zpm").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.ZPM);
        SUPRACHRONAL_UV = this.addItem(28, "circuit.suprachronal.uv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UV);
        SUPRACHRONAL_UHV = this.addItem(29, "circuit.suprachronal.uhv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        SUPRACHRONAL_UEV = this.addItem(30, "circuit.suprachronal.uev").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        SUPRACHRONAL_UIV = this.addItem(31, "circuit.suprachronal.uiv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        SUPRACHRONAL_UXV = this.addItem(32, "circuit.suprachronal.uxv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);
        SUPRACHRONAL_OpV = this.addItem(33, "circuit.suprachronal.opv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.OpV);
        SUPRACHRONAL_MAX = this.addItem(34, "circuit.suprachronal.max").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.MAX);

        GRINDBALL_SOAPSTONE = this.addItem(44, "item.soapstone.ball").setMaxStackSize(1).setCreativeTabs(CommonProxy.GREGICA_TAB).addComponents(new MillBallBehavior());
        GRINDBALL_ALUMINIUM = this.addItem(45, "item.aluminium.ball").setMaxStackSize(1).setCreativeTabs(CommonProxy.GREGICA_TAB).addComponents(new MillBallBehavior());

        GOOWARE_BOARD = this.addItem(46, "board.gooware");
        OPTICAL_BOARD = this.addItem(47, "board.optical");
        SPINTRONIC_BOARD = this.addItem(48, "board.spintronic");
        GOOWARE_CIRCUIT_BOARD = this.addItem(49, "circuit_board.gooware");
        OPTICAL_CIRCUIT_BOARD = this.addItem(50, "circuit_board.optical");
        SPINTRONIC_CIRCUIT_BOARD = this.addItem(51, "circuit_board.spintronic");

        // SMDs: ID 420-479
        OPTICAL_CAPACITOR = this.addItem(52, "component.optical_smd.capacitor");
        OPTICAL_DIODE = this.addItem(53, "component.optical_smd.diode");
        OPTICAL_RESISTOR = this.addItem(54, "component.optical_smd.resistor");
        OPTICAL_TRANSISTOR = this.addItem(55, "component.optical_smd.transistor");
        OPTICAL_INDUCTOR = this.addItem(56, "component.optical_smd.inductor");

        SPINTRONIC_CAPACITOR = this.addItem(57, "component.spintronic_smd.capacitor");
        SPINTRONIC_DIODE = this.addItem(58, "component.spintronic_smd.diode");
        SPINTRONIC_RESISTOR = this.addItem(59, "component.spintronic_smd.resistor");
        SPINTRONIC_TRANSISTOR = this.addItem(60, "component.spintronic_smd.transistor");
        SPINTRONIC_INDUCTOR = this.addItem(61, "component.spintronic_smd.inductor");

        BZ_REACTION_CHAMBER = this.addItem(62, "reaction_chamber.bz");
        NONLINEAR_CHEMICAL_OSCILLATOR = this.addItem(63, "nonlinear_chemical_oscillator");

        PHASE_CHANGE_MEMORY = this.addItem(64, "plate.phase_change_memory");
        OPTICAL_FIBER = this.addItem(65, "optical_fiber");
        DIELECTRIC_MIRROR = this.addItem(66, "dielectric_mirror");
        EMPTY_LASER_ASSEMBLY = this.addItem(67, "laser.assembly.empty");
        HELIUM_NEON_LASER = this.addItem(68, "laser.helium_neon");
        ND_YAG_LASER = this.addItem(69, "laser.nd_yag");
        OPTICAL_LASER_CONTROL_UNIT = this.addItem(70, "optical_laser_control_unit");

        SPIN_TRANSFER_TORQUE_MEMORY = this.addItem(71, "plate.spin_transfer_torque_memory");
        TOPOLOGICAL_INSULATOR_TUBE = this.addItem(72, "tube.topological_insulator");
        BOSE_EINSTEIN_CONDENSATE_CONTAINMENT_UNIT = this.addItem(73, "containment_unit.bose_einstein_condensate");
        BOSE_EINSTEIN_CONDENSATE = this.addItem(74, "bose_einstein_condensate");
        ESR_COMPUTATION_UNIT = this.addItem(75, "esr_computation_unit");

        EIGENFOLDED_KERR_MANIFOLD = this.addItem(76, "eigenfolded.kerr.manifold");


        HYPERDIMENSIONAL_DRONE = this.addItem(77, "hyperdimensional.drone");
    }

}
