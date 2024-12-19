package com.brylinb.keyonmod.util;

import com.brylinb.keyonmod.KeyonMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_BROCCOLI_TOOL = createTag("needs_broccoli_tool");
        public static final TagKey<Block> INCORRECT_FOR_BROCCOLI_TOOL = createTag("incorrect_for_broccoli_tool");
        public static final TagKey<Block> NEEDS_KEYONITE_TOOL = createTag("needs_keyonite_tool");
        public static final TagKey<Block> INCORRECT_FOR_KEYONITE_TOOL = createTag("incorrect_for_keyonite_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(KeyonMod.MOD_ID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(KeyonMod.MOD_ID, name));
        }
    }
}
