package com.xiutek.ultramod.registry;

import com.xiutek.ultramod.Ultramod;
import net.minecraft.item.*;

public class PickaxeBase extends PickaxeItem {
    public PickaxeBase(ToolMaterial material) {
        super(material, -8, -2.4f, new Item.Settings().group(Ultramod.ITEM_GROUP));
    }
}
