package net.froggittybitty.dirty_fighting_mod.events;

import net.froggittybitty.dirty_fighting_mod.DirtyFightingMod;
import net.froggittybitty.dirty_fighting_mod.entity.ModEntities;
import net.froggittybitty.dirty_fighting_mod.entity.custom.RaccoonEntity;
import net.froggittybitty.dirty_fighting_mod.entity.custom.RaccoonModel;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = DirtyFightingMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(RaccoonModel.LAYER_LOCATION, RaccoonModel::createBodyLayer);
    }
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.RACCOON.get(), RaccoonEntity.createMobAttributes().build());
    }
}
