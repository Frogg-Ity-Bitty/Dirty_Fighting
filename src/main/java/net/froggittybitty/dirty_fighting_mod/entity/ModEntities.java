package net.froggittybitty.dirty_fighting_mod.entity;

import net.froggittybitty.dirty_fighting_mod.DirtyFightingMod;
import net.froggittybitty.dirty_fighting_mod.entity.custom.RaccoonEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTYTY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, DirtyFightingMod.MODID);

    public static final Supplier<EntityType<RaccoonEntity>> RACCOON =
            ENTYTY_TYPES.register("raccoon",
                    () -> EntityType.Builder.of(RaccoonEntity::new, MobCategory.CREATURE)
                            .sized(1f, 0.75f).build("raccoon"));
            // The size of the *HITBOX*

    public static void register(IEventBus eventBus){
        ENTYTY_TYPES.register(eventBus);
    }

}
