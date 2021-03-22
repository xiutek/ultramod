package com.xiutek.ultramod.registry;

import com.xiutek.ultramod.Ultramod;
import com.xiutek.ultramod.things.DiscBase;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModMusic {


    public static void registerMusic() {

        // DISCOS
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_1"), new DiscBase(1, new SoundEvent(new Identifier("ultramod", "xiutek_1")), new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_2"), new DiscBase(2, new SoundEvent(new Identifier("ultramod", "xiutek_2")), new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_3"), new DiscBase(3, new SoundEvent(new Identifier("ultramod", "xiutek_3")), new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_4"), new DiscBase(4, new SoundEvent(new Identifier("ultramod", "xiutek_4")), new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_5"), new DiscBase(5, new SoundEvent(new Identifier("ultramod", "xiutek_5")), new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_6"), new DiscBase(6, new SoundEvent(new Identifier("ultramod", "xiutek_6")), new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_7"), new DiscBase(7, new SoundEvent(new Identifier("ultramod", "xiutek_7")), new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_8"), new DiscBase(8, new SoundEvent(new Identifier("ultramod", "xiutek_8")), new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_9"), new DiscBase(9, new SoundEvent(new Identifier("ultramod", "xiutek_9")), new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_10"), new DiscBase(10, new SoundEvent(new Identifier("ultramod", "xiutek_10")), new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_11"), new DiscBase(11, new SoundEvent(new Identifier("ultramod", "xiutek_11")), new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(Ultramod.MOD_ID, "xiutek_12"), new DiscBase(12, new SoundEvent(new Identifier("ultramod", "xiutek_12")), new FabricItemSettings()));


    }
}
