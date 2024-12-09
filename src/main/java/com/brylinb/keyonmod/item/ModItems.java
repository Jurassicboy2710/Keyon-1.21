package com.brylinb.keyonmod.item;

import com.brylinb.keyonmod.KeyonMod;
import com.brylinb.keyonmod.entity.ModEntities;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KeyonMod.MOD_ID);

    public static final RegistryObject<Item> HAMMER = ITEMS.register("hammer",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHEESE_PIZZA = ITEMS.register("cheese_pizza",
            () -> new Item(new Item.Properties().food(ModFoods.CHEESE_PIZZA)));

    public static final RegistryObject<Item> KEYON_SPAWN_EGG = ITEMS.register("keyon_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.KEYON, 0x7e9680, 0xc5d1c5,
            new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}