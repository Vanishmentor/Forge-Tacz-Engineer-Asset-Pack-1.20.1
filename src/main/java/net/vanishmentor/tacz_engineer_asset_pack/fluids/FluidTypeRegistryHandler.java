package net.vanishmentor.tacz_engineer_asset_pack.fluids;



import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.SoundActions;
import net.vanishmentor.tacz_engineer_asset_pack.TaczEngineerAssetPack;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class FluidTypeRegistryHandler {
    public static final ResourceLocation NITRIC_ACID_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation NITRIC_ACID_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation NITRIC_ACID_OVERLAY_RL = new ResourceLocation("block/water_still");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TaczEngineerAssetPack.MOD_ID);

    public static final RegistryObject<FluidType> NITRIC_ACID_FLUID_TYPE = register("nitric_acid_fluid",
            FluidType.Properties.create().lightLevel(0).density(1000).viscosity(2000).temperature(300).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
            .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
    );



    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(NITRIC_ACID_STILL_RL, NITRIC_ACID_FLOWING_RL, NITRIC_ACID_OVERLAY_RL,
                0xA1D8D8D4, new Vector3f(232f / 255f, 232f / 255f, 228f / 255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}

