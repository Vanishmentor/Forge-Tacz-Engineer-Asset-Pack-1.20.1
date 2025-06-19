package net.vanishmentor.tacz_engineer_asset_pack.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;
import net.vanishmentor.tacz_engineer_asset_pack.mobEffects.MobEffectRegistryHandler;

import java.util.function.Supplier;

public class NitricAcidBlock extends LiquidBlock {
    public NitricAcidBlock(Supplier<? extends FlowingFluid> fluid, Properties properties) {
        super(fluid, properties);
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        super.entityInside(state, level, pos, entity);

        if (!level.isClientSide && entity instanceof LivingEntity livingEntity) {
            // Apply your custom effect
            livingEntity.addEffect(new MobEffectInstance(
                    MobEffectRegistryHandler.NITRATED.get(),
                    250,
                    0,  // Amplifier
                    false, // Ambient
                    true,  // Visible
                    true   // Show icon
            ));
        }
    }
}