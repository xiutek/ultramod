package com.xiutek.ultramod.registry;

import net.minecraft.item.*;

public class PickaxeBase extends PickaxeItem {
    public PickaxeBase(ToolMaterial material) {
        super(material, -8, -2.5f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
