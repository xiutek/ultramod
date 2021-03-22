package com.xiutek.ultramod.things;

import com.xiutek.ultramod.Ultramod;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class BDUSwordBase extends SwordItem {
    public BDUSwordBase(ToolMaterial toolMaterial) {
        super(toolMaterial, -4, -2.7f, new Item.Settings().group(Ultramod.ITEM_GROUP));
    }
}
