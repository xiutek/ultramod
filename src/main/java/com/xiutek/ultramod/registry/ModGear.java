package com.xiutek.ultramod.registry;

import com.xiutek.ultramod.Ultramod;
import com.xiutek.ultramod.materials.*;
import com.xiutek.ultramod.things.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModGear {

    // ARMADURA Y MATERIALES
    public static final ArmorMaterial moonlightArmorMaterial = new ArmorMaterialSC();
    public static final Item MOONLIGHT_MATERIAL = new SCArmorItem(new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final Item MOONLIGHT_HELMET = new ArmorItem(moonlightArmorMaterial, EquipmentSlot.HEAD, new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final Item MOONLIGHT_CHESTPLATE = new ArmorItem(moonlightArmorMaterial, EquipmentSlot.CHEST, new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final Item MOONLIGHT_LEGGINGS = new ArmorItem(moonlightArmorMaterial, EquipmentSlot.LEGS, new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final Item MOONLIGHT_BOOTS = new ArmorItem(moonlightArmorMaterial, EquipmentSlot.FEET, new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final ArmorMaterial darkIronArmorMaterial = new ArmorMaterialDI();
    public static final Item DARK_IRON_MATERIAL = new DIArmorItem(new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final Item DARK_IRON_HELMET = new ArmorItem(darkIronArmorMaterial, EquipmentSlot.HEAD, new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final Item DARK_IRON_CHESTPLATE = new ArmorItem(darkIronArmorMaterial, EquipmentSlot.CHEST, new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final Item DARK_IRON_LEGGINGS = new ArmorItem(darkIronArmorMaterial, EquipmentSlot.LEGS, new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final Item DARK_IRON_BOOTS = new ArmorItem(darkIronArmorMaterial, EquipmentSlot.FEET, new Item.Settings().group(Ultramod.ITEM_GROUP));

    public static void registerGear (){

        //ARMADURAS Y MATERIALES
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "moonlight"), MOONLIGHT_MATERIAL);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "moonlight_helmet"), MOONLIGHT_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "moonlight_chestplate"), MOONLIGHT_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "moonlight_leggings"), MOONLIGHT_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "moonlight_boots"), MOONLIGHT_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron"), DARK_IRON_MATERIAL);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_helmet"), DARK_IRON_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_chestplate"), DARK_IRON_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_leggings"), DARK_IRON_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_boots"),DARK_IRON_BOOTS);

        //ARMAS
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_pickaxe"), new PickaxeBase(new ToolMaterialDI()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "moonlight_pickaxe"), new PickaxeBase(new ToolMaterialSC()));

        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_sword"), new SwordBase(new ToolMaterialDI()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_usword"), new USwordBase(new ToolMaterialDI()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_halberd"), new HalberdBase(new ToolMaterialDI()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_dagger"), new DaggerBase(new ToolMaterialDI()));

        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "moonlight_sword"), new SwordBase(new ToolMaterialSC()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "moonlight_usword"), new USwordBase(new ToolMaterialSC()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "moonlight_bow"), new BowBase(new FabricItemSettings()));

        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "bloody_sword"), new SwordBase(new ToolMaterialBD()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "bloody_usword"), new BDUSwordBase(new ToolMaterialBD()));

        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "fire_sword"), new ESwordBase(new ToolMaterialFR()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "fire_usword"), new ESwordBase(new ToolMaterialFR()));

        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_sword"), new ESwordBase(new ToolMaterialDK()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_usword"), new EUSwordBase(new ToolMaterialDK()));

        //LEGACY
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "moonlight_greatsword"), new USwordBase(new ToolMaterialSC()));

    }

}
