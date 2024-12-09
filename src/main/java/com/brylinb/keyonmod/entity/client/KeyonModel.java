package com.brylinb.keyonmod.entity.client;

import com.brylinb.keyonmod.entity.animations.ModAnimationDefinitions;
import com.brylinb.keyonmod.entity.custom.KeyonEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class KeyonModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart keyon;
	private final ModelPart left_cheek;
	private final ModelPart right_cheek;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart right_arm;
	private final ModelPart left_arm;
	private final ModelPart body;
	private final ModelPart head;

	public KeyonModel(ModelPart root) {
		this.keyon = root.getChild("keyon");
		this.left_cheek = this.keyon.getChild("left_cheek");
		this.right_cheek = this.keyon.getChild("right_cheek");
		this.right_leg = this.keyon.getChild("right_leg");
		this.left_leg = this.keyon.getChild("left_leg");
		this.right_arm = this.keyon.getChild("right_arm");
		this.left_arm = this.keyon.getChild("left_arm");
		this.body = this.keyon.getChild("body");
		this.head = this.keyon.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition keyon = partdefinition.addOrReplaceChild("keyon", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_cheek = keyon.addOrReplaceChild("left_cheek", CubeListBuilder.create().texOffs(0, 53).addBox(-4.0F, -3.0F, 1.0F, 9.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -11.0F, 4.0F));

		PartDefinition right_cheek = keyon.addOrReplaceChild("right_cheek", CubeListBuilder.create().texOffs(48, 52).addBox(-5.0F, -3.0F, 1.0F, 9.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -11.0F, 4.0F));

		PartDefinition right_leg = keyon.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(32, 39).addBox(-4.0F, 2.0F, -2.0F, 8.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -11.0F, 0.0F));

		PartDefinition left_leg = keyon.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(44, 23).addBox(-4.0F, 2.0F, -2.0F, 7.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -11.0F, 0.0F));

		PartDefinition right_arm = keyon.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(32, 52).addBox(-5.0F, -0.5F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-9.0F, -20.5F, 0.0F));

		PartDefinition left_arm = keyon.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(56, 36).addBox(1.0F, -0.5F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, -20.5F, 0.0F));

		PartDefinition body = keyon.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 3.0F, -6.0F, 20.0F, 12.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition head = keyon.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 39).addBox(-4.0F, -3.0F, -4.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 23).addBox(-6.0F, -9.0F, -5.0F, 12.0F, 6.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(44, 36).addBox(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitions.KEYON_WALKING, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((KeyonEntity) entity).idleAnimationState, ModAnimationDefinitions.KEYON_IDLE, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		keyon.render(poseStack, vertexConsumer, packedLight, packedOverlay);
	}

	@Override
	public ModelPart root() {
		return keyon;
	}
}