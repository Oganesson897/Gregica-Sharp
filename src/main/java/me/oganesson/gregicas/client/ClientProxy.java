package me.oganesson.gregicas.client;

import me.oganesson.gregicas.client.textures.GSTextures;
import me.oganesson.gregicas.common.CommonProxy;
import me.oganesson.gregicas.common.block.GSMetaBlocks;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber({Side.CLIENT})
public class ClientProxy extends CommonProxy {

    public ClientProxy() {
    }

    public void preLoad()
    {
        super.preLoad();
        GSTextures.init();
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event)
    {
        GSMetaBlocks.registerItemModels();
    }
}
