package com.brylinb.keyonmod.item;

import com.brylinb.keyonmod.block.ModBlocks;
import com.brylinb.keyonmod.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier BROCCOLI = new ForgeTier(70, 3.0F, 0.5f, 20,
            ModTags.Blocks.NEEDS_BROCCOLI_TOOL, () -> Ingredient.of(ModBlocks.BROCCOLI_PLANKS.get()),
            ModTags.Blocks.INCORRECT_FOR_BROCCOLI_TOOL);

    public static final Tier KEYONITE = new ForgeTier(600, 7.0F, 3.0f, 15,
            ModTags.Blocks.NEEDS_KEYONITE_TOOL, () -> Ingredient.of(ModItems.KEYONITE_INGOT.get()),
            ModTags.Blocks.INCORRECT_FOR_KEYONITE_TOOL);
}
