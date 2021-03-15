package com.xiutek.ultramod;

import com.xiutek.ultramod.registry.ModBlocks;
import com.xiutek.ultramod.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class Ultramod implements ModInitializer {

    public static final String MOD_ID = "ultramod";


    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "general"),
            () -> new ItemStack(ModItems.MONEDA)
    );


    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();

    }
}
