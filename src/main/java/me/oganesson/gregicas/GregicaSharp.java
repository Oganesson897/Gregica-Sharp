package me.oganesson.gregicas;

import gregtech.common.ConfigHolder;
import me.oganesson.gregicas.api.utils.GSLog;
import me.oganesson.gregicas.common.CommonProxy;
import me.oganesson.gregicas.common.block.GSMetaBlocks;
import me.oganesson.gregicas.common.item.GSMetaItems;
import me.oganesson.gregicas.common.metatileentities.GSMetaTileEntities;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = "gregicas",
        name = "Gregica Sharp",
        acceptedMinecraftVersions = "[1.12.2,1.13)",
        version = "0.0.1-beta",
        dependencies = "required:forge@[14.23.5.2847,);required:gregtech@[2.7.3-beta,);"
)
public class GregicaSharp {

    public static final String MODID = "gregicas";
    public static final String NAME = "Gregica Sharp";
    public static final String VERSION = "0.0.1-beta";

    @SidedProxy
    (
            modId = "gregicas",
            serverSide = "me.oganesson.gregicas.common.CommonProxy",
            clientSide = "me.oganesson.gregicas.client.ClientProxy"
    )
    public static CommonProxy proxy;


    @Mod.EventHandler
    public void onConstruction(FMLConstructionEvent event)
    {
        //GSLog.logger.info("Enabled GregTechCEu highTierContent");
        ConfigHolder.machines.highTierContent = true;
    }

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event)
    {
        GSLog.init(event.getModLog());
        GSMetaItems.initialization();
        GSMetaTileEntities.initialization();
        GSMetaBlocks.init();
        proxy.preLoad();
    }
}
