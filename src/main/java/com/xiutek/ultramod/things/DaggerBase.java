package com.xiutek.ultramod.things;

import com.xiutek.ultramod.Ultramod;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class DaggerBase extends SwordItem {
    public DaggerBase(ToolMaterial toolMaterial) {
        super(toolMaterial, -6, -0.1f, new Item.Settings().group(Ultramod.ITEM_GROUP));
    }
}