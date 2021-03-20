package com.xiutek.ultramod.registry;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialSC implements ToolMaterial {
    @Override
    public int getDurability() {
        return 20;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 16;
    }

    @Override
    public float getAttackDamage() {
        return 10;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 60;
    }

    @Override
    public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(ModItems.SOUL_CRYSTAL_BLOCK);

    }
}
