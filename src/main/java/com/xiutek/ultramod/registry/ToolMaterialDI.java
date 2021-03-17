package com.xiutek.ultramod.registry;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialDI implements ToolMaterial {
    @Override
    public int getDurability() {
        return 3000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 4;
    }

    @Override
    public float getAttackDamage() { return 17; }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.CRYING_OBSIDIAN);
    }
}
