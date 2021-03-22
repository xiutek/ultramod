package com.xiutek.ultramod.materials;

import com.xiutek.ultramod.registry.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;


public class ArmorMaterialSC implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {2, 2, 2, 2}; // CASCO, ARMADURA, GREBAS, BOTAS
    private static final int[] PROTECTION_VALUES = new int[] {2, 2, 2, 2};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return  BASE_DURABILITY[slot.getEntitySlotId()] * 1;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 50;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.BLOCK_GLASS_BREAK;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.SOUL_CRYSTAL_BLOCK);
    }

    @Override
    public String getName() {
        return "moonlight";
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
