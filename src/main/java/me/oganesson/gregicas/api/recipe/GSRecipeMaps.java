package me.oganesson.gregicas.api.recipe;

import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.widgets.ProgressWidget;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.ComputationRecipeBuilder;
import gregtech.api.recipes.builders.UniversalDistillationRecipeBuilder;
import gregtech.core.sound.GTSoundEvents;
import me.oganesson.gregicas.api.capability.isamill.IsaMillBuilder;
import me.oganesson.gregicas.api.recipe.map.RecipeMapPBDT;

public class GSRecipeMaps {

    public static final RecipeMap<UniversalDistillationRecipeBuilder> PBDT;

    public static final RecipeMap<IsaMillBuilder> ISA_MILL_GRINDER;
    public static final RecipeMap<ComputationRecipeBuilder> UHERCD;

    private GSRecipeMaps() {}

    static {
        PBDT = new RecipeMapPBDT();
        ISA_MILL_GRINDER = new RecipeMap<>("isa_mill",
                3, 3, 0, 0, new IsaMillBuilder(), false);

        UHERCD = new RecipeMap<>("universe_high_energy_radiation_capture_divece", 1, 1, 0, 0,
                new ComputationRecipeBuilder(), false)
                .setSlotOverlay(true, false, GuiTextures.CIRCUIT_OVERLAY)
                .setProgressBar(GuiTextures.SCANNER_OVERLAY, ProgressWidget.MoveType.HORIZONTAL)
                .setSound(GTSoundEvents.ASSEMBLER);
    }

}
