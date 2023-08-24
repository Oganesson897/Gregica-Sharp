package me.oganesson.gregicas.common;

import gregtech.api.unification.material.event.MaterialEvent;
import me.oganesson.gregicas.api.unification.GSMaterials;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(
        modid = "gregicas"
)
public class GSEventHandler {

    public GSEventHandler() {}

    @SubscribeEvent(
            priority = EventPriority.HIGH
    )
    public static void registerMaterials(MaterialEvent event)
    {
        GSMaterials.register();
    }

}
