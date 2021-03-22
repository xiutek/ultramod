package com.xiutek.ultramod.things;

import com.xiutek.ultramod.Ultramod;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class ESwordBase extends SwordItem {
    public ESwordBase(ToolMaterial toolMaterial) {
        super(toolMaterial, -5, -2.9f, new Item.Settings().group(Ultramod.ITEM_GROUP));
    }
}
