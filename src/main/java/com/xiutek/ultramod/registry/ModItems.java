package com.xiutek.ultramod.registry;

import com.xiutek.ultramod.Ultramod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.client.sound.Sound;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.*;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {


    // ITEMS
    public static final Item MONEDA = new Item(new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final Item DARK_IRON_INGOT = new Item(new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final Item DARK_IRON_STICK = new Item(new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final Item SOUL_DUST = new Item(new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final Item GOLD_STICK = new Item(new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final Item TITANITE_DUST = new Item(new Item.Settings().group(Ultramod.ITEM_GROUP).maxCount(64));
    public static final Item SHINING_TITANITE_DUST = new Item(new Item.Settings().group(Ultramod.ITEM_GROUP).maxCount(32));
    public static final Item TITANITE_SHARD = new Item(new Item.Settings().group(Ultramod.ITEM_GROUP).maxCount(9));
    public static final Item LARGE_TITANITE_SHARD = new Item(new Item.Settings().group(Ultramod.ITEM_GROUP).maxCount(9));
    public static final Item TITANITE_CHUNK = new Item(new Item.Settings().group(Ultramod.ITEM_GROUP).maxCount(9));
    public static final Item TITANITE_SLAB = new Item(new Item.Settings().group(Ultramod.ITEM_GROUP).maxCount(1));
    public static final Item SHINING_TITANITE = new Item(new Item.Settings().group(Ultramod.ITEM_GROUP).maxCount(9));
    public static final Item TITANITE_SCALE = new Item(new Item.Settings().group(Ultramod.ITEM_GROUP).maxCount(9));
    public static final Item BLUE_TITANITE_SLAB = new Item(new Item.Settings().group(Ultramod.ITEM_GROUP).maxCount(1));
    public static final Item BLOOD_GEM = new Item(new Item.Settings().group(Ultramod.ITEM_GROUP).maxCount(1));
    public static final Item FIRE_GEM = new Item(new Item.Settings().group(Ultramod.ITEM_GROUP).maxCount(1));
    public static final Item DARK_GEM = new Item(new Item.Settings().group(Ultramod.ITEM_GROUP).maxCount(1));
    public static final Item SOUL_REMNANT = new Item(new Item.Settings().group(Ultramod.ITEM_GROUP).maxCount(36));

    // FLAUTAS
    public static final Identifier BASIC_FLUTE_ID = new Identifier("ultramod:basic_flute_sound");
    public static SoundEvent BASIC_FLUTE_EVENT = new SoundEvent(BASIC_FLUTE_ID);


    // ARMADURA Y MATERIALES
    public static final ArmorMaterial moonlightArmorMaterial = new ModArmorSC();
    public static final Item MOONLIGHT_MATERIAL = new ModArmorSCItem(new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final Item MOONLIGHT_HELMET = new ArmorItem(moonlightArmorMaterial, EquipmentSlot.HEAD, new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final Item MOONLIGHT_CHESTPLATE = new ArmorItem(moonlightArmorMaterial, EquipmentSlot.CHEST, new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final Item MOONLIGHT_LEGGINGS = new ArmorItem(moonlightArmorMaterial, EquipmentSlot.LEGS, new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final Item MOONLIGHT_BOOTS = new ArmorItem(moonlightArmorMaterial, EquipmentSlot.FEET, new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final ArmorMaterial darkIronArmorMaterial = new ModArmorDI();
    public static final Item DARK_IRON_MATERIAL = new ModArmorDIItem(new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final Item DARK_IRON_HELMET = new ArmorItem(darkIronArmorMaterial, EquipmentSlot.HEAD, new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final Item DARK_IRON_CHESTPLATE = new ArmorItem(darkIronArmorMaterial, EquipmentSlot.CHEST, new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final Item DARK_IRON_LEGGINGS = new ArmorItem(darkIronArmorMaterial, EquipmentSlot.LEGS, new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final Item DARK_IRON_BOOTS = new ArmorItem(darkIronArmorMaterial, EquipmentSlot.FEET, new Item.Settings().group(Ultramod.ITEM_GROUP));



    // BLOCK ITEMS
    public static final BlockItem DARK_IRON_BLOCK = new BlockItem(ModBlocks.DARK_IRON_BLOCK, new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final BlockItem SOUL_CRYSTAL_BLOCK = new BlockItem(ModBlocks.SOUL_CRYSTAL_BLOCK, new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final BlockItem TITANITE_ORE = new BlockItem(ModBlocks.TITANITE_ORE, new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final BlockItem SHINING_TITANITE_ORE = new BlockItem(ModBlocks.SHINIGH_TITANITE_ORE, new Item.Settings().group(Ultramod.ITEM_GROUP));


    // PROYECTILES
    public static final EntityType<LunarMagic> LUNAR_MAGIC_ENTITY_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier("ultramod", "lunar_magic"), FabricEntityTypeBuilder.<LunarMagic>create(SpawnGroup.MISC, LunarMagic::new)
            .dimensions(EntityDimensions.fixed(0.75f, 0.75f)) // dimensiones en unidades de MC del proyectil
            .trackRangeBlocks(4).trackedUpdateRate(10) // previene que el proyectil se rompa
            .build());
    public static final Item MOONLIGHT_BALL = new LunarMagicItem(new Item.Settings().group(Ultramod.ITEM_GROUP).maxCount(16));
    public static final Identifier PacketID = new Identifier(Ultramod.MOD_ID, "spawn_packet");




    // REGISTRO
    public static void registerItems() {

        //WEAPONS & TOOLS
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
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "bloody_usword"), new USwordBDBase(new ToolMaterialBD()));

        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "fire_sword"), new SwordBase(new ToolMaterialFR()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "fire_usword"), new USwordBase(new ToolMaterialFR()));

        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_sword"), new SwordBase(new ToolMaterialDK()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_usword"), new USwordBase(new ToolMaterialDK()));


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

        // FLAUTAS
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "basic_flute"), new FluteBase(new FluteMaterial()));
        Registry.register(Registry.SOUND_EVENT, BASIC_FLUTE_ID, BASIC_FLUTE_EVENT);

        //ITEMS
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "moneda"), MONEDA);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_ingot"), DARK_IRON_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_block"), DARK_IRON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_stick"), DARK_IRON_STICK);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "soul_dust"), SOUL_DUST);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "gold_stick"), GOLD_STICK);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "soul_crystal"), SOUL_CRYSTAL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "moonlight_ball"), MOONLIGHT_BALL);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "titanite_ore"), TITANITE_ORE);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "shining_titanite_ore"), SHINING_TITANITE_ORE);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "titanite_dust"), TITANITE_DUST);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "shining_titanite_dust"), SHINING_TITANITE_DUST);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "titanite_shard"), TITANITE_SHARD);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "large_titanite_shard"), LARGE_TITANITE_SHARD);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "titanite_chunk"), TITANITE_CHUNK);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "titanite_slab"), TITANITE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "shining_titanite"), SHINING_TITANITE);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "titanite_scale"), TITANITE_SCALE);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "blue_titanite_slab"), BLUE_TITANITE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "blood_gem"), BLOOD_GEM);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "fire_gem"), FIRE_GEM);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_gem"), DARK_GEM);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "soul_remnant"), SOUL_REMNANT);


        //MUSICA
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_1"), new ModMusic(1, new SoundEvent(new Identifier("ultramod", "xiutek_1")), new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_2"), new ModMusic(2, new SoundEvent(new Identifier("ultramod", "xiutek_2")), new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_3"), new ModMusic(3, new SoundEvent(new Identifier("ultramod", "xiutek_3")), new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_4"), new ModMusic(4, new SoundEvent(new Identifier("ultramod", "xiutek_4")), new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_5"), new ModMusic(5, new SoundEvent(new Identifier("ultramod", "xiutek_5")), new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_6"), new ModMusic(6, new SoundEvent(new Identifier("ultramod", "xiutek_6")), new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_7"), new ModMusic(7, new SoundEvent(new Identifier("ultramod", "xiutek_7")), new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_8"), new ModMusic(8, new SoundEvent(new Identifier("ultramod", "xiutek_8")), new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_9"), new ModMusic(9, new SoundEvent(new Identifier("ultramod", "xiutek_9")), new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_10"), new ModMusic(10, new SoundEvent(new Identifier("ultramod", "xiutek_10")), new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_11"), new ModMusic(11, new SoundEvent(new Identifier("ultramod", "xiutek_11")), new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_12"), new ModMusic(12, new SoundEvent(new Identifier("ultramod", "xiutek_12")), new FabricItemSettings()));

    }

}
