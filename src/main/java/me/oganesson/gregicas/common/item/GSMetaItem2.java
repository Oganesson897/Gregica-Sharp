package me.oganesson.gregicas.common.item;

import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.items.metaitem.stats.IItemComponent;
import gregtechfoodoption.item.GTFOFoodStats;
import me.oganesson.gregicas.common.CommonProxy;

import static me.oganesson.gregicas.common.item.GSMetaItems.*;

public class GSMetaItem2 extends StandardMetaItem {

    public GSMetaItem2() {
        this.setRegistryName("gs_meta_item_2");
        this.setCreativeTab(CommonProxy.GREGICA_TAB);
    }

    public void registerSubItems() {
    }

}
