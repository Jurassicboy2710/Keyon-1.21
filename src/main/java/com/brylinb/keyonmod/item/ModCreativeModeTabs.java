package com.brylinb.keyonmod.item;

import com.brylinb.keyonmod.KeyonMod;
import com.brylinb.keyonmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KeyonMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> KEYON_TAB = CREATIVE_MODE_TABS.register("keyon_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHEESE_PIZZA.get()))
                    .title(Component.translatable("creativetab.keyon_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.BROCCOLI_PLANKS.get());
                        pOutput.accept(ModItems.HAMMER.get());
                        pOutput.accept(ModItems.CHEESE_PIZZA.get());
                        pOutput.accept(ModItems.KEYON_SPAWN_EGG.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}