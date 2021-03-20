package com.xiutek.ultramod;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xiutek.ultramod.registry.EntitySpawnPacket;
import com.xiutek.ultramod.registry.ModBlocks;
import com.xiutek.ultramod.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.network.ClientSidePacketRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.UUID;


public class Ultramod implements ModInitializer {

    // MOD ID

    public static final String MOD_ID = "ultramod";

    // TABLA CREATIVA

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "general"),
            () -> new ItemStack(ModItems.MONEDA)
    );


    // GENERACION DE ORES EN EL MUNDO

    private static ConfiguredFeature <?, ?> TITANITE_ORE_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.TITANITE_ORE.getDefaultState(),
            11)) // tamaño de la vena
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    20,
                    35,
                    64)))
            .spreadHorizontally()
            .repeat(10); // numero de venas por chunk

    private static ConfiguredFeature <?, ?> SHINING_TITANITE_ORE_OVERWORLD = Feature.ORE
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
                    7))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    3,
                    30,
                    64)))
            .spreadHorizontally()
            .repeat(3);


    // ENTIDADES DE PROYECTIL

    public void receiveEntityPacket() {
        ClientSidePacketRegistry.INSTANCE.register(ModItems.PacketID, (ctx, byteBuf) -> {
            EntityType<?> et = Registry.ENTITY_TYPE.get(byteBuf.readVarInt());
            UUID uuid = byteBuf.readUuid();
            int entityId = byteBuf.readVarInt();
            Vec3d pos = EntitySpawnPacket.PacketBufUtil.readVec3d(byteBuf);
            float pitch = EntitySpawnPacket.PacketBufUtil.readAngle(byteBuf);
            float yaw = EntitySpawnPacket.PacketBufUtil.readAngle(byteBuf);
            ctx.getTaskQueue().execute(() -> {
                if (MinecraftClient.getInstance().world == null)
                    throw new IllegalStateException("Tried to spawn entity in a null world!");
                Entity e = et.create(MinecraftClient.getInstance().world);
                if (e == null)
                    throw new IllegalStateException("Failed to create instance of entity \"" + Registry.ENTITY_TYPE.getId(et) + "\"!");
                e.updateTrackedPosition(pos);
                e.setPos(pos.x, pos.y, pos.z);
                e.pitch = pitch;
                e.yaw = yaw;
                e.setEntityId(entityId);
                e.setUuid(uuid);
                MinecraftClient.getInstance().world.addEntity(entityId, e);
            });
        });
    }


    // INICIALIZADOR

    @Override
    public void onInitialize() {

        //INICIAR REGISTRO
        ModItems.registerItems();
        ModBlocks.registerBlocks();


        // RENDERIZAR BLOQUES TRASPARENTES
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SOUL_CRYSTAL_BLOCK, RenderLayer.getTranslucent());


        //INICIAR ENTIDADES
        EntityRendererRegistry.INSTANCE.register(ModItems.LUNAR_MAGIC_ENTITY_TYPE, (dispatcher, context) ->
                new FlyingItemEntityRenderer(dispatcher, context.getItemRenderer()));
        receiveEntityPacket();


        //INICIAR ORES
        RegistryKey<ConfiguredFeature<?,?>> TitaniteOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("ultramod", "titanite_ore_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, TitaniteOreOverworld.getValue(), TITANITE_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, TitaniteOreOverworld);

        RegistryKey<ConfiguredFeature<?,?>> ShiningTitaniteOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("ultramod", "shining_titanite_ore_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ShiningTitaniteOreOverworld.getValue(), SHINING_TITANITE_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ShiningTitaniteOreOverworld);

        RegistryKey<ConfiguredFeature<?, ?>> oreDarkIronBlockNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("ultramod", "dark_iron_block_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreDarkIronBlockNether.getValue(), DARK_IRON_BLOCK_NETHER);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreDarkIronBlockNether);
    }
}
