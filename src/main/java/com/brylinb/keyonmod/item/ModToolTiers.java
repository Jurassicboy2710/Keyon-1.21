package com.brylinb.keyonmod.item;

import com.brylinb.keyonmod.block.ModBlocks;
import com.brylinb.keyonmod.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier BROCCOLI = new ForgeTier(70, 3.0F, 0.5f, 10,
            ModTags.Blocks.NEEDS_BROCCOLI_TOOL, () -> Ingredient.of(ModBlocks.BROCCOLI_PLANKS.get()),
            ModTags.Blocks.INCORRECT_FOR_BROCCOLI_TOOL);
}
