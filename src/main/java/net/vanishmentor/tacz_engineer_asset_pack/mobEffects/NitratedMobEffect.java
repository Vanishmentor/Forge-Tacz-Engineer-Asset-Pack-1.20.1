package net.vanishmentor.tacz_engineer_asset_pack.mobEffects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;

import java.util.function.Consumer;

// Custom effect class
public class NitratedMobEffect extends MobEffect {
    public NitratedMobEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        // 1 heart (2 HP) damage per second


        if (entity.isOnFire()) {
            // Explode with power based on amplifier (minimum 2, +1 per level)
            float power = 3.0f + amplifier;
            entity.level().explode(entity,
                    entity.getX(), entity.getY(), entity.getZ(),
                    power, Level.ExplosionInteraction.MOB);

            // Remove the effect after explosion
            entity.removeEffect(this);
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        // Apply effect every 20 ticks (1 second)
        return duration % 20 == 0;
    }
}
