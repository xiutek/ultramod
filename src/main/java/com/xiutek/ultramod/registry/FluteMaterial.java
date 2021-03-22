package com.xiutek.ultramod.registry;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class FluteMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 1;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 30;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 99;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.BLOOD_GEM);
    }
}
