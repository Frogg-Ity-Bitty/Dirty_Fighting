package net.froggittybitty.dirtyfighting.events;


import net.froggittybitty.dirtyfighting.DirtyFightingMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;

@EventBusSubscriber(modid = DirtyFightingMod.MODID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {

    @SubscribeEvent
    public static void onDamageEvent(LivingDamageEvent.Post event){
        if(event.getSource().getDirectEntity() instanceof LivingEntity entity){
            if(entity.getMainHandItem().getItem() == Items.GRAVEL ||
                    entity.getMainHandItem().getItem() == Items.SAND ||
                    entity.getMainHandItem().getItem() == Items.RED_SAND ||
                    entity.getMainHandItem().getItem() == Items.BLACK_CONCRETE_POWDER ||
                    entity.getMainHandItem().getItem() == Items.WHITE_CONCRETE_POWDER ||
                    entity.getMainHandItem().getItem() == Items.PINK_CONCRETE_POWDER ||
                    entity.getMainHandItem().getItem() == Items.PURPLE_CONCRETE_POWDER ||
                    entity.getMainHandItem().getItem() == Items.BLUE_CONCRETE_POWDER ||
                    entity.getMainHandItem().getItem() == Items.BROWN_CONCRETE_POWDER ||
                    entity.getMainHandItem().getItem() == Items.CYAN_CONCRETE_POWDER ||
                    entity.getMainHandItem().getItem() == Items.GRAY_CONCRETE_POWDER ||
                    entity.getMainHandItem().getItem() == Items.GREEN_CONCRETE_POWDER ||
                    entity.getMainHandItem().getItem() == Items.LIGHT_BLUE_CONCRETE_POWDER ||
                    entity.getMainHandItem().getItem() == Items.LIGHT_GRAY_CONCRETE_POWDER ||
                    entity.getMainHandItem().getItem() == Items.LIME_CONCRETE_POWDER ||
                    entity.getMainHandItem().getItem() == Items.MAGENTA_CONCRETE_POWDER ||
                    entity.getMainHandItem().getItem() == Items.ORANGE_CONCRETE_POWDER ||
                    entity.getMainHandItem().getItem() == Items.YELLOW_CONCRETE_POWDER ||
                    entity.getMainHandItem().getItem() == Items.RED_CONCRETE_POWDER){

                event.getEntity().addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 120, 3));
                entity.getMainHandItem().shrink(1);
            }
        }
    }

}
