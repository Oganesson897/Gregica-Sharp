package me.oganesson.gregicas.common.metatileentities;

import gregtech.api.GTValues;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.common.metatileentities.MetaTileEntities;
import me.oganesson.gregicas.api.utils.GSLog;
import me.oganesson.gregicas.common.metatileentities.multi.MetaTileEntityLightningRod;

import static me.oganesson.gregicas.api.GSValue.gregicasId;

public class GSMetaTileEntities {

    public static MetaTileEntityLightningRod[] LIGHTNING_ROD = new MetaTileEntityLightningRod[3];

    //ID Range: 20000 - 21000

    public static void initialization() {
        GSLog.logger.info("Registering MetaTileEntities");

        //Lightning Rod: 20000 - 20002
        LIGHTNING_ROD[0] = registerMetaTileEntity(0, new MetaTileEntityLightningRod(gregicasId("lightning_rod.hv"), GTValues.HV));
        LIGHTNING_ROD[1] = registerMetaTileEntity(1, new MetaTileEntityLightningRod(gregicasId("lightning_rod.ev"), GTValues.EV));
        LIGHTNING_ROD[2] = registerMetaTileEntity(2, new MetaTileEntityLightningRod(gregicasId("lightning_rod.iv"), GTValues.IV));
    }

    private static <T extends MetaTileEntity> T registerMetaTileEntity(int id, T mte) {
        return MetaTileEntities.registerMetaTileEntity(id + 20000, mte);
    }

}
