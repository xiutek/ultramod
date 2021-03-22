package com.xiutek.ultramod.registry;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModOres {

    // GENERACION DE ORES EN EL MUNDO (BROKEN)

    private static ConfiguredFeature<?, ?> TITANITE_ORE_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.TITANITE_ORE.getDefaultState(),
                    11)) // tamaño de la vena
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    20,
                    45,
                    64)))
            .spreadHorizontally()
            .repeat(10); // numero de venas por chunk

    private static ConfiguredFeature<?, ?> SHINING_TITANITE_ORE_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.SHINIGH_TITANITE_ORE.getDefaultState(),
                    7)) // tamaño de la vena
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    1,
                    26,
                    64)))
            .spreadHorizontally()
            .repeat(6); // numero de venas por chunk

    private static ConfiguredFeature<?, ?> DARK_IRON_BLOCK_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER, // We use OreFeatureConfig.Rules.BASE_STONE_NETHER for nether
                    ModBlocks.DARK_IRON_BLOCK.getDefaultState(),
                    3))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    3,
                    30,
                    64)))
            .spreadHorizontally()
            .repeat(3);


public static void registerOres () {

    RegistryKey<ConfiguredFeature<?, ?>> TitaniteOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
            new Identifier("ultramod", "titanite_ore_overworld"));
    Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, TitaniteOreOverworld.getValue(), TITANITE_ORE_OVERWORLD);
    BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, TitaniteOreOverworld);

    RegistryKey<ConfiguredFeature<?, ?>> ShiningTitaniteOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
            new Identifier("ultramod", "shining_titanite_ore_overworld"));
    Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ShiningTitaniteOreOverworld.getValue(), SHINING_TITANITE_ORE_OVERWORLD);
    BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ShiningTitaniteOreOverworld);

    RegistryKey<ConfiguredFeature<?, ?>> oreDarkIronBlockNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
            new Identifier("ultramod", "dark_iron_block_nether"));
    Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreDarkIronBlockNether.getValue(), DARK_IRON_BLOCK_NETHER);
    BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreDarkIronBlockNether);

   }
}