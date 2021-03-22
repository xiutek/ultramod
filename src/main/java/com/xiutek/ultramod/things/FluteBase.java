package com.xiutek.ultramod.things;

import com.xiutek.ultramod.Ultramod;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class FluteBase extends SwordItem {
    public FluteBase(ToolMaterial toolMaterial) {
        super(toolMaterial, -29, -0.1f, new Item.Settings().group(Ultramod.ITEM_GROUP));
    }
}
