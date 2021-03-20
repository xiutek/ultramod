package com.xiutek.ultramod.registry;

import com.xiutek.ultramod.Ultramod;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class USwordBDBase extends SwordItem {
    public USwordBDBase(ToolMaterial toolMaterial) {
        super(toolMaterial, 6, -3.1f, new Item.Settings().group(Ultramod.ITEM_GROUP));
    }
}
