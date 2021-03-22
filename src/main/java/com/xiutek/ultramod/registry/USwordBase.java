package com.xiutek.ultramod.registry;

import com.xiutek.ultramod.Ultramod;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class USwordBase extends SwordItem {
    public USwordBase(ToolMaterial toolMaterial) {
        super(toolMaterial, 7, -3.5f, new Item.Settings().group(Ultramod.ITEM_GROUP));
    }
}
