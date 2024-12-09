package com.brylinb.keyonmod.entity;

import com.brylinb.keyonmod.KeyonMod;
import com.brylinb.keyonmod.entity.custom.KeyonEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, KeyonMod.MOD_ID);

    public static final RegistryObject<EntityType<KeyonEntity>> KEYON =
            ENTITY_TYPES.register("keyon", () -> EntityType.Builder.of(KeyonEntity::new, MobCategory.CREATURE)
                    .sized(1.5f, 2f).build("keyon"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
