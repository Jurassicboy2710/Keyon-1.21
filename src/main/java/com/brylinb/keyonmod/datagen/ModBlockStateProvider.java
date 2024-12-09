package com.brylinb.keyonmod.datagen;

import com.brylinb.keyonmod.KeyonMod;
import com.brylinb.keyonmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, KeyonMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.BROCCOLI_PLANKS);

        stairsBlock(((StairBlock) ModBlocks.BROCCOLI_STAIRS.get()), blockTexture(ModBlocks.BROCCOLI_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.BROCCOLI_SLAB.get()), blockTexture(ModBlocks.BROCCOLI_PLANKS.get()), blockTexture(ModBlocks.BROCCOLI_PLANKS.get()));

        buttonBlock(((ButtonBlock) ModBlocks.BROCCOLI_BUTTON.get()), blockTexture(ModBlocks.BROCCOLI_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.BROCCOLI_PRESSURE_PLATE.get()), blockTexture(ModBlocks.BROCCOLI_PLANKS.get()));

        fenceBlock(((FenceBlock) ModBlocks.BROCCOLI_FENCE.get()), blockTexture(ModBlocks.BROCCOLI_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.BROCCOLI_FENCE_GATE.get()), blockTexture(ModBlocks.BROCCOLI_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.BROCCOLI_DOOR.get()), modLoc("block/broccoli_door_bottom"), modLoc("block/broccoli_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.BROCCOLI_TRAPDOOR.get()), modLoc("block/broccoli_trapdoor"), true, "cutout");
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
