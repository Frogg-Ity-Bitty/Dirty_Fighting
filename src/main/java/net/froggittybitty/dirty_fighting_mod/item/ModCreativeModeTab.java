package net.froggittybitty.dirty_fighting_mod.item;

import net.froggittybitty.dirty_fighting_mod.DirtyFightingMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DirtyFightingMod.MODID);

    public static final Supplier<CreativeModeTab> MOD_TAB = CREATIVE_MODE_TAB.register("mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.AMETHYST_BLOCK))
                    .title(Component.literal("Mod Tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.RACCOON_SPAWN_EGG);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
