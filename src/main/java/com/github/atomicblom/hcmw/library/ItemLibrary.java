package com.github.atomicblom.hcmw.library;

import com.github.atomicblom.hcmw.HomecraftMinewares;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(HomecraftMinewares.MODID)
public class ItemLibrary {
    public static final Item bed_4post;
    public static final Item bed_canopy;
    public static final Item item_barrel;
    public static final Item lantern;
    public static final Item candle_holder;
    public static final Item bed_side_drawers;

    static {
        bed_4post = null;
        bed_canopy = null;
        item_barrel = null;
        lantern = null;
        candle_holder = null;
        bed_side_drawers = null;
    }
}
