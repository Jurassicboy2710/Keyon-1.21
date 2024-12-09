package com.brylinb.keyonmod.entity.client;

import com.brylinb.keyonmod.KeyonMod;
import com.brylinb.keyonmod.entity.custom.KeyonEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class KeyonRenderer extends MobRenderer<KeyonEntity, KeyonModel<KeyonEntity>> {

    public KeyonRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new KeyonModel<>(pContext.bakeLayer(ModModelLayers.KEYON_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(KeyonEntity pEntity) {
        return ResourceLocation.fromNamespaceAndPath(KeyonMod.MOD_ID,"textures/entity/keyon.png");
    }

    @Override
    public void render(KeyonEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
