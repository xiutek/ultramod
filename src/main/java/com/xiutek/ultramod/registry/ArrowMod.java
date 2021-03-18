package com.xiutek.ultramod.registry;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.world.World;

public class ArrowMod extends ArrowEntity {
    public ArrowMod(EntityType<? extends ArrowEntity> entityType, World world) {
        super(entityType, world);
    }
}
