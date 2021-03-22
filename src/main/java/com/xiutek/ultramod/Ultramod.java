package com.xiutek.ultramod;

import com.xiutek.ultramod.registry.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class Ultramod implements ModInitializer {

    // MOD ID
    public static final String MOD_ID = "ultramod";

    // TABLA CREATIVA
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "general"),
            () -> new ItemStack(ModItems.MONEDA)
    );


    @Override
    public void onInitialize() {

        // REGISTRO
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ModGear.registerGear();
        ModMusic.registerMusic();
        ModOres.registerOres();

    }
}
