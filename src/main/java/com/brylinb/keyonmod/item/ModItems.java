package com.brylinb.keyonmod.item;

import com.brylinb.keyonmod.KeyonMod;
import com.brylinb.keyonmod.entity.ModEntities;
import net.minecraft.world.item.*;
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

    public static final RegistryObject<Item> BROCCOLI_SWORD = ITEMS.register("broccoli_sword",
            () -> new SwordItem(ModToolTiers.BROCCOLI, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.BROCCOLI, 3, -2.4f))));
    public static final RegistryObject<Item> BROCCOLI_PICKAXE = ITEMS.register("broccoli_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BROCCOLI, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.BROCCOLI, 1, -2.8f))));
    public static final RegistryObject<Item> BROCCOLI_SHOVEL = ITEMS.register("broccoli_shovel",
            () -> new ShovelItem(ModToolTiers.BROCCOLI, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.BROCCOLI, 1.5f, -3.0f))));
    public static final RegistryObject<Item> BROCCOLI_AXE = ITEMS.register("broccoli_axe",
            () -> new AxeItem(ModToolTiers.BROCCOLI, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.BROCCOLI, 6, -3.2f))));
    public static final RegistryObject<Item> BROCCOLI_HOE = ITEMS.register("broccoli_hoe",
            () -> new HoeItem(ModToolTiers.BROCCOLI, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.BROCCOLI, 0, -3.0f))));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}