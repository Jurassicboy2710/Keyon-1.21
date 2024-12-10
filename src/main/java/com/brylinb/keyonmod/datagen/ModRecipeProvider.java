package com.brylinb.keyonmod.datagen;

import com.brylinb.keyonmod.block.ModBlocks;
import com.brylinb.keyonmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {


    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HAMMER.get())
                .pattern("III")
                .pattern("ISI")
                .pattern(" S ")
                .define('I', Items.IRON_INGOT)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.HAMMER.get()), has(ModItems.HAMMER.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BROCCOLI_SWORD.get())
                .pattern(" B ")
                .pattern(" B ")
                .pattern(" S ")
                .define('B', ModBlocks.BROCCOLI_PLANKS.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.BROCCOLI_SWORD.get()), has(ModItems.BROCCOLI_SWORD.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BROCCOLI_PICKAXE.get())
                .pattern("BBB")
                .pattern(" S ")
                .pattern(" S ")
                .define('B', ModBlocks.BROCCOLI_PLANKS.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.BROCCOLI_PICKAXE.get()), has(ModItems.BROCCOLI_PICKAXE.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BROCCOLI_SHOVEL.get())
                .pattern(" B ")
                .pattern(" S ")
                .pattern(" S ")
                .define('B', ModBlocks.BROCCOLI_PLANKS.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.BROCCOLI_SHOVEL.get()), has(ModItems.BROCCOLI_SHOVEL.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BROCCOLI_AXE.get())
                .pattern("BB ")
                .pattern("BS ")
                .pattern(" S ")
                .define('B', ModBlocks.BROCCOLI_PLANKS.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.BROCCOLI_AXE.get()), has(ModItems.BROCCOLI_AXE.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BROCCOLI_HOE.get())
                .pattern("BB ")
                .pattern(" S ")
                .pattern(" S ")
                .define('B', ModBlocks.BROCCOLI_PLANKS.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.BROCCOLI_HOE.get()), has(ModItems.BROCCOLI_HOE.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CHEESE_PIZZA.get(), 8)
                .requires(Items.BREAD)
                .requires(Items.MILK_BUCKET)
                .unlockedBy(getHasName(ModItems.CHEESE_PIZZA.get()), has(ModItems.CHEESE_PIZZA.get()))
                .save(pRecipeOutput);
    }
}
