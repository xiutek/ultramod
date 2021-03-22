package com.xiutek.ultramod.things;

import com.xiutek.ultramod.Ultramod;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class EUSwordBase extends SwordItem {
    public EUSwordBase(ToolMaterial toolMaterial) {
        super(toolMaterial, 3, -3.5f, new Item.Settings().group(Ultramod.ITEM_GROUP));
    }
}