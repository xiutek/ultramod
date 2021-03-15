package com.xiutek.ultramod.registry;

import com.xiutek.ultramod.Ultramod;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class HalberdBase extends SwordItem {
    public HalberdBase(ToolMaterial toolMaterial) {
        super(toolMaterial, 3, -6f, new Item.Settings().group(Ultramod.ITEM_GROUP));
    }
}
