
CHEMICAL_RECIPES.recipeBuilder()
  .fluidInputs(Methane.getFluid(2000))
  .fluidInputs(Ammonia.getFluid(2000))
  .fluidInputs(Oxygen.getFluid(6000))
  .notConsumable(dust, Platinum)
  .fluidOutputs(HydrogenCyanide.getFluid(2000))
  .fluidOutputs(Water.getFluid(6000))
  .duration(100)
  .EUt(6144)
  .buildAndRegister();

BLAST_RECIPES.recipeBuilder()
  .input(dust, Carbon, 3)
  .input(dust, Quicklime, 2)
  .output(dust, CalciumCarbide, 1)
  .fluidOutputs(CarbonMonoxide.getFluid(1000))
  .duration(400)
  .blastFurnaceTemp(2200)
  .EUt(480)
  .buildAndRegister();

CHEMICAL_RECIPES.recipeBuilder()
  .fluidInputs(Water.getFluid(1000))
  .input(dust, CalciumCarbide, 1)
  .fluidOutputs(Acetylene.getFluid(1000))
  .output(dust, Quicklime, 2)
  .duration(40)
  .EUt(128)
  .buildAndRegister();

CHEMICAL_RECIPES.recipeBuilder()
  .fluidInputs(Acetylene.getFluid(1000))
  .fluidInputs(HydrogenCyanide.getFluid(1000))
  .notConsumable(dust, Copper)
  .notConsumable(dust, RockSalt)
  .notConsumable(DilutedHydrochloricAcid.getFluid(1000))
  .fluidOutputs(Acrylonitrile.getFluid(1000))
  .duration(200)
  .EUt(6144)
  .buildAndRegister();

CHEMICAL_RECIPES.recipeBuilder()
  .fluidInputs(Acrylonitrile.getFluid(1000))
  .fluidInputs(Butadiene.getFluid(1000))
  .notConsumable(dust, MagnesiumChloride)
  .fluidInputs((TitaniumTetrachloride.getFluid(10))
  .output(dust, RawNitrileButadieneRubber, 9)
  .duration(480)
  .EUt(24576)
  .buildAndRegister();

CHEMICAL_RECIPES.recipeBuilder()
  .input(dust, RawNitrileButadieneRubber, 9)
  .input(dust, Sulfur, 1)
  .fluidOutputs(NitrileButadieneRubber.getFluid(1296))
  .duration(200)
  .EUt(512)
  .buildAndRegister();

CHEMICAL_RECIPES.recipeBuilder()
  .input(dust, Aluminium, 1)
  .fluidInputs(Fluorine.getFluid(3000))
  .output(dust, AluminiumFluoride, 1)
  .duration(300)
  .EUt(128)
  .buildAndRegister();

LARGE_CHEMICAL_RECIPES.recipeBuilder()
  .notConsumable(dust, AluminiumFluoride)
  .fluidInputs(Acetylene.getFluid(1000))
  .fluidInputs(HydrofluoricAcid.getFluid(2000))
  .fluidOutputs(R152a.getFluid(1000))
  .duration(240)
  .EUt(24576)
  .buildAndRegister();

LARGE_CHEMICAL_RECIPES.recipeBuilder()
  .notConsumable(dust, AntimonyPentalfluoride)
  .fluidInputs(VinylChloride.getFluid(1000))
  .fluidInputs(HydrofluoricAcid.getFluid(2000))
  .fluidOutputs(R152a.getFluid(1000))
  .fluidOutputs(HydrochloricAcid.getFluid(1000))
  .duration(600)
  .EUt(98272)
  .buildAndRegister();

LARGE_CHEMICAL_RECIPES.recipeBuilder()
  .notConsumable(dust, MagnesiumChloride)
  .fluidInputs(R152a.getFluid(1000))
  .fluidInputs(Chlorine.getFluid(2000))
  .fluidOutputs(R152aChlorideMixture.getFluid(1000))
  .duration(200)
  .EUt(98304)
  .buildAndRegister();


