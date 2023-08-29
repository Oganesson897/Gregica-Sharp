package me.oganesson.gregicas.common.metatileentities;

import gregtech.api.GTValues;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.multiblock.MultiblockControllerBase;
import gregtech.common.metatileentities.MetaTileEntities;
import me.oganesson.gregicas.api.utils.GSLog;
import me.oganesson.gregicas.common.metatileentities.multi.MetaTileEntityPrecisionBoilingDistillationTower;
import me.oganesson.gregicas.common.metatileentities.multi.generators.MetaTileEntityLightningRod;

import static me.oganesson.gregicas.api.GSValue.gregicasId;

public class GSMetaTileEntities {

    public static MetaTileEntityLightningRod[] LIGHTNING_ROD = new MetaTileEntityLightningRod[3];

    //Multi
    public static MetaTileEntityPrecisionBoilingDistillationTower PBDT;

    //ID Range: 20000 - 21000

    public static void initialization() {
        GSLog.logger.info("Registering MetaTileEntities");

        //SingleBlock: 20000 - 20300
        LIGHTNING_ROD[0] = registerSingleMetaTileEntity(0, new MetaTileEntityLightningRod(gregicasId("lightning_rod.hv"), GTValues.HV));
        LIGHTNING_ROD[1] = registerSingleMetaTileEntity(1, new MetaTileEntityLightningRod(gregicasId("lightning_rod.ev"), GTValues.EV));
        LIGHTNING_ROD[2] = registerSingleMetaTileEntity(2, new MetaTileEntityLightningRod(gregicasId("lightning_rod.iv"), GTValues.IV));

        //Multi: 20301 - 21000
        PBDT = registerMultiMetaTileEntity(0, new MetaTileEntityPrecisionBoilingDistillationTower(gregicasId("pbdt")));
    }

    private static <T extends MetaTileEntity> T registerSingleMetaTileEntity(int id, T mte) {
        if (id > 300) return null;
        return MetaTileEntities.registerMetaTileEntity(id + 20000, mte);
    }

    private static <F extends MultiblockControllerBase> F registerMultiMetaTileEntity(int id, F mte) {
        return MetaTileEntities.registerMetaTileEntity(id + 20301, mte);
    }

}
