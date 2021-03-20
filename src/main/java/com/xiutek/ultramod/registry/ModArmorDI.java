package com.xiutek.ultramod.registry;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;


public class ModArmorDI implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {20, 20, 20, 20}; // CASCO, ARMADURA, GREBAS, BOTAS
    private static final int[] PROTECTION_VALUES = new int[] {6, 16, 14, 3};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return  BASE_DURABILITY[slot.getEntitySlotId()] * 2;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_CHAIN;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.DARK_IRON_BLOCK);
    }

    @Override
    public String getName() {
        return "dark_iron";
    }

    @Override
    public float getToughness() {
        return 3.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0F;
    }


}
