package com.brylinb.keyonmod.entity.client;

import com.brylinb.keyonmod.KeyonMod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation KEYON_LAYER = new ModelLayerLocation(
            ResourceLocation.fromNamespaceAndPath(KeyonMod.MOD_ID, "keyon_layer"), "main");
}
