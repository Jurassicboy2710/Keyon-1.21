package com.brylinb.keyonmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CHEESE_PIZZA = new FoodProperties.Builder().nutrition(2).fast()
            .saturationModifier(0.2f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.1f).build();
}
