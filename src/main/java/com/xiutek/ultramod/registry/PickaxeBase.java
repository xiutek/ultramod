package com.xiutek.ultramod.registry;

import net.minecraft.item.*;

public class PickaxeBase extends PickaxeItem {
    public PickaxeBase(ToolMaterial material) {
        super(material, -1, -2, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
