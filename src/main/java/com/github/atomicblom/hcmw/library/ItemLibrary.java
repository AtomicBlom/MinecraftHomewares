package com.github.atomicblom.hcmw.library;

import com.github.atomicblom.hcmw.HomecraftMineware;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@SuppressWarnings({"Duplicates", "AssignmentToNull"})
@ObjectHolder(HomecraftMineware.MODID)
public final class ItemLibrary {
    public static final Item bed_4post;
    public static final Item bed_canopy;
    public static final Item door_inner_gate;
    public static final Item door_grand;
    public static final Item door_tower;
    public static final Item door_super_double;
    public static final Item item_barrel;
    public static final Item fluid_barrel;
    public static final Item lantern;
    public static final Item candle_holder;
    public static final Item bed_side_drawers;

	static {
        bed_4post = null;
        bed_canopy = null;
        door_inner_gate = null;
        door_tower = null;
        door_grand = null;
        door_super_double = null;
        item_barrel = null;
        fluid_barrel = null;
        lantern = null;
        candle_holder = null;
        bed_side_drawers = null;
    }
}
