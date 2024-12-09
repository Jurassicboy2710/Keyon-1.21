package com.brylinb.keyonmod.event;

import com.brylinb.keyonmod.KeyonMod;
import com.brylinb.keyonmod.entity.ModEntities;
import com.brylinb.keyonmod.entity.custom.KeyonEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = KeyonMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.KEYON.get(), KeyonEntity.createAttributes().build());
    }
}
