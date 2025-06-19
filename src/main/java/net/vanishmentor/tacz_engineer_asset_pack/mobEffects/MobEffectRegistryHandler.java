package net.vanishmentor.tacz_engineer_asset_pack.mobEffects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vanishmentor.tacz_engineer_asset_pack.TaczEngineerAssetPack;

public class MobEffectRegistryHandler {
    public static final DeferredRegister<MobEffect> MOBEFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TaczEngineerAssetPack.MOD_ID);

    public static final RegistryObject<MobEffect> NITRATED = MOBEFFECTS.register("nitrated_mobeffect",
            () -> new NitratedMobEffect(MobEffectCategory.HARMFUL, 0xD8D8D4)); // Orange-red color

    public static void register(IEventBus eventBus) {
        MOBEFFECTS.register(eventBus);
    }


}
