package com.xiutek.ultramod.registry;

import net.minecraft.item.BowItem;

public class BowBase extends BowItem {
    public BowBase(Settings settings) {
        super(settings.maxCount(16).maxDamage(30));
    }
}
