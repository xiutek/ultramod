package com.xiutek.ultramod.registry;

import com.xiutek.ultramod.Ultramod;
import net.minecraft.item.*;
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


    // BLOCK ITEMS
    public static final BlockItem DARK_IRON_BLOCK = new BlockItem(ModBlocks.DARK_IRON_BLOCK, new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final BlockItem SOUL_CRYSTAL_BLOCK = new BlockItem(ModBlocks.SOUL_CRYSTAL_BLOCK, new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final BlockItem TITANITE_ORE = new BlockItem(ModBlocks.TITANITE_ORE, new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final BlockItem SHINING_TITANITE_ORE = new BlockItem(ModBlocks.SHINIGH_TITANITE_ORE, new Item.Settings().group(Ultramod.ITEM_GROUP));

    // LEGACY (COMPATIBILIDAD)
    public static final Item C_FLUTE = new Item(new Item.Settings().group(Ultramod.ITEM_GROUP));


    // REGISTRO
    public static void registerItems() {

        //ITEMS
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "moneda"), MONEDA);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_ingot"), DARK_IRON_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_block"), DARK_IRON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_stick"), DARK_IRON_STICK);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "soul_dust"), SOUL_DUST);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "gold_stick"), GOLD_STICK);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "soul_crystal"), SOUL_CRYSTAL_BLOCK);
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

        //LEGACY
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "c_flute"), C_FLUTE);

        // EXPERIMENTAL

    }


}
