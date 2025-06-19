package net.vanishmentor.tacz_engineer_asset_pack.fluids;

import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vanishmentor.tacz_engineer_asset_pack.TaczEngineerAssetPack;
import net.vanishmentor.tacz_engineer_asset_pack.blocks.BlockRegistryHandler;
import net.vanishmentor.tacz_engineer_asset_pack.items.ItemRegistryHandler;

public class FluidRegistryHandler {

    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, TaczEngineerAssetPack.MOD_ID);
    public static final RegistryObject<FlowingFluid> SOURCE_NITRIC_ACID = FLUIDS.register("nitric_acid_fluid",
            () -> new ForgeFlowingFluid.Source(FluidRegistryHandler.NITRIC_ACID_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_NITRIC_ACID = FLUIDS.register("flowing_nitric_acid",
            () -> new ForgeFlowingFluid.Flowing(FluidRegistryHandler.NITRIC_ACID_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties NITRIC_ACID_FLUID_PROPERTIES =
            new ForgeFlowingFluid.Properties(
                    FluidTypeRegistryHandler.NITRIC_ACID_FLUID_TYPE,
                    SOURCE_NITRIC_ACID,
                    FLOWING_NITRIC_ACID
            )
                    .slopeFindDistance(2)
                    .levelDecreasePerBlock(1)
                    .block(BlockRegistryHandler.NITRIC_ACID_BLOCK)
                    .bucket(ItemRegistryHandler.FLUID_CONTAINERS_BUCKET_NITRIC_ACID);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
