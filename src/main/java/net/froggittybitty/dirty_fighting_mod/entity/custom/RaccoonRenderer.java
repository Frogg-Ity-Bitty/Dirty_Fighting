package net.froggittybitty.dirty_fighting_mod.entity.custom;

import com.mojang.blaze3d.vertex.PoseStack;
import net.froggittybitty.dirty_fighting_mod.DirtyFightingMod;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RaccoonRenderer extends MobRenderer<RaccoonEntity, RaccoonModel<RaccoonEntity>> {

    public RaccoonRenderer(EntityRendererProvider.Context context) {
        super(context, new RaccoonModel<>(context.bakeLayer(RaccoonModel.LAYER_LOCATION)), 0.25f);
    }

    @Override
    public ResourceLocation getTextureLocation(RaccoonEntity raccoonEntity) {
        return ResourceLocation.fromNamespaceAndPath(DirtyFightingMod.MODID, "textures/entity/raccoon/raccoon.png");
    }

    @Override
    public void render(RaccoonEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
