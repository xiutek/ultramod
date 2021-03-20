package com.xiutek.ultramod.registry;

import com.xiutek.ultramod.Ultramod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.item.PickaxeItem;
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

    public static final Block SOUL_CRYSTAL_BLOCK = new GlassBlock(FabricBlockSettings
            .of(Material.GLASS)
            .breakByHand(true)
            .nonOpaque()
            .luminance(10)
            );

    public static final Block TITANITE_ORE = new Block(FabricBlockSettings
            .of(Material.SOIL)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .requiresTool()
            .strength(6f,30f)
            .sounds(BlockSoundGroup.SAND));

    public static final Block SHINIGH_TITANITE_ORE = new Block(FabricBlockSettings
            .of(Material.SOIL)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .requiresTool()
            .strength(4f,10f)
            .luminance(9)
            .sounds(BlockSoundGroup.SAND));

    //REGISTRO
    public static void registerBlocks() {

        Registry.register(Registry.BLOCK, new Identifier(Ultramod.MOD_ID, "dark_iron_block"), DARK_IRON_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Ultramod.MOD_ID, "soul_crystal"), SOUL_CRYSTAL_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Ultramod.MOD_ID, "titanite_ore"), TITANITE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Ultramod.MOD_ID, "shining_titanite_ore"), SHINIGH_TITANITE_ORE);

    }
}
