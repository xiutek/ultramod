package com.xiutek.ultramod.registry;

import com.xiutek.ultramod.Ultramod;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
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
    public static final Item C_FLUTE = new Item(new Item.Settings().group(Ultramod.ITEM_GROUP));

    // BLOCK ITEMS
    public static final BlockItem DARK_IRON_BLOCK = new BlockItem(ModBlocks.DARK_IRON_BLOCK, new Item.Settings().group(Ultramod.ITEM_GROUP));
    public static final BlockItem SOUL_CRYSTAL_BLOCK = new BlockItem(ModBlocks.SOUL_CRYSTAL_BLOCK, new Item.Settings().group(Ultramod.ITEM_GROUP));

    // PROYECTILES

    public static final EntityType<LunarMagic> LUNAR_MAGIC_ENTITY_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier("ultramod", "lunar_magic"), FabricEntityTypeBuilder.<LunarMagic>create(SpawnGroup.MISC, LunarMagic::new)
            .dimensions(EntityDimensions.fixed(0.25f, 0.25f)) // dimensiones en unidades de MC del proyectil
            .trackRangeBlocks(4).trackedUpdateRate(10) // previene que el proyectil se rompa
            .build());
    public static final Item MOONLIGHT_BALL = new LunarMagicItem(new Item.Settings().group(Ultramod.ITEM_GROUP).maxCount(6));
    public static final Identifier PacketID = new Identifier(Ultramod.MOD_ID, "spawn_packet");




    // REGISTRO
    public static void registerItems() {

        //WEAPONS
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_sword"), new SwordBase(new ToolMaterialDI()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_pickaxe"), new PickaxeBase(new ToolMaterialDI()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_usword"), new USwordBase(new ToolMaterialDI()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "moonlight_greatsword"), new USwordBase(new ToolMaterialSC()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_halberd"), new HalberdBase(new ToolMaterialDI()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "bloody_sword"), new SwordBase(new ToolMaterialBD()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "moonlight_pickaxe"), new PickaxeBase(new ToolMaterialSC()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_dagger"), new DaggerBase(new ToolMaterialDI()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "moonlight_bow"), new BowBase(new FabricItemSettings()));


        //RENDERS

        //ITEMS
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "moneda"), MONEDA);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_ingot"), DARK_IRON_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_block"), DARK_IRON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "dark_iron_stick"), DARK_IRON_STICK);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "soul_dust"), SOUL_DUST);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "gold_stick"), GOLD_STICK);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "soul_crystal"), SOUL_CRYSTAL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "c_flute"), C_FLUTE);
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "moonlight_ball"), MOONLIGHT_BALL);

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
