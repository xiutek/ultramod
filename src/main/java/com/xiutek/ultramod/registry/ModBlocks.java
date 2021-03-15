package com.xiutek.ultramod.registry;

import com.xiutek.ultramod.Ultramod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    //BLOCKS
    public static final Block DARK_IRON_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 4)
            .requiresTool()
            .strength(7f,40f)
            .sounds(BlockSoundGroup.CHAIN));
    public static final Block SOUL_CRYSTAL_BLOCK = new Block(FabricBlockSettings
            .of(Material.GLASS));

    //REGISTRO
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Ultramod.MOD_ID, "dark_iron_block"), DARK_IRON_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Ultramod.MOD_ID, "soul_crystal"), SOUL_CRYSTAL_BLOCK);
    }
}
