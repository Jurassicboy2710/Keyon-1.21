package com.brylinb.keyonmod.datagen;

import com.brylinb.keyonmod.KeyonMod;
import com.brylinb.keyonmod.block.ModBlocks;
import com.brylinb.keyonmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, KeyonMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        tag(BlockTags.FENCES).add(ModBlocks.BROCCOLI_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.BROCCOLI_FENCE_GATE.get());

        tag(ModTags.Blocks.NEEDS_BROCCOLI_TOOL)
                .addTag(BlockTags.NEEDS_STONE_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_BROCCOLI_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_STONE_TOOL);

        tag(ModTags.Blocks.NEEDS_KEYONITE_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_KEYONITE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL);
    }
}
