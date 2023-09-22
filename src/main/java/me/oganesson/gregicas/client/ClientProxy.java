package me.oganesson.gregicas.client;

import me.oganesson.gregicas.api.unification.GSMaterials;
import me.oganesson.gregicas.client.textures.GSTextures;
import me.oganesson.gregicas.common.CommonProxy;
import me.oganesson.gregicas.common.block.GSMetaBlocks;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemBucket;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.items.ItemStackHandler;

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
    public static void onTooltipEvent(ItemTooltipEvent event) {
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event)
    {
        GSMetaBlocks.registerItemModels();
    }
}
