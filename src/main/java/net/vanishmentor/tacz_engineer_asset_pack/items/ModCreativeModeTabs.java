package net.vanishmentor.tacz_engineer_asset_pack.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.vanishmentor.tacz_engineer_asset_pack.TaczEngineerAssetPack;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TaczEngineerAssetPack.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TaczEngineerAssetPack_Tab = CREATIVE_MODE_TAB.register("tacz_engineer_asset_pack_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemRegistryHandler.CASING_RIFLE.get()))
                    .title(Component.translatable("creativetab.tacz_engineer_asset_pack_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //----------casings---------
                        pOutput.accept(ItemRegistryHandler.CASING_RIFLE.get());
                        pOutput.accept(ItemRegistryHandler.CASING_HEAVY.get());
                        pOutput.accept(ItemRegistryHandler.CASING_BUCKSHOT.get());
                        pOutput.accept(ItemRegistryHandler.CASING_GRENADE.get());
                        pOutput.accept(ItemRegistryHandler.CASING_SHELL.get());
                        //----------heads---------
                        pOutput.accept(ItemRegistryHandler.HEAD_PISTOL.get());
                        pOutput.accept(ItemRegistryHandler.HEAD_RIFLE.get());
                        pOutput.accept(ItemRegistryHandler.HEAD_HEAVY.get());
                        pOutput.accept(ItemRegistryHandler.HEAD_GRAPESHOT.get());
                        pOutput.accept(ItemRegistryHandler.HEAD_SLUG.get());
                        pOutput.accept(ItemRegistryHandler.HEAD_GRENADE.get());
                        pOutput.accept(ItemRegistryHandler.HEAD_SHELL.get());
                        pOutput.accept(ItemRegistryHandler.HEAD_AP.get());
                        //----------materials---------
                        pOutput.accept(ItemRegistryHandler.MATERIAL_AP_INCOMPLETE.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_PRIMER.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_SCREW.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_SPRING.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_GUNPART_HAMMER_IRON.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_FIRING_PIN_IRON.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_FIRING_PIN_STEEL.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_FIRING_PIN_CMA.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_BARREL_RIFLED_CMA.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_BARREL_RIFLED_STEEL.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_BARREL_SMOOTH_CMA.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_BARREL_SMOOTH_IRON.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_MAG_BRASS.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_MAG_IRON.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_MAG_PLASTIC.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_MAG_STEEL.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_FCOMPONENT_IRON.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_FCOMPONENT_STEEL.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_FCOMPONENT_PLASTIC.get());
//                        pOutput.accept(ItemRegistryHandler.MATERIAL_FCOMPONENT_PLASTIC_DURALUMINIUM.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_FCOMPONENT_CMA.get());
//                        pOutput.accept(ItemRegistryHandler.MATERIAL_FCOMPONENT_CMA_NANOTUBE.get());

                        pOutput.accept(ItemRegistryHandler.MATERIAL_INGOT_DOPED_QUARTZ.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_ELECTROLYTIC_CAPACITOR.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_TRANSISTOR.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_INTEGRATED_CIRCUIT.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_DISPLAY.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_LASER_TRANSMITTER.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_CIRCUIT_CONTROLLER.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_CIRCUIT_CONTROLLER_INCOMPLETE.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_CIRCUIT_HOLOGRAPHICS.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_CIRCUIT_HOLOGRAPHICS_INCOMPLETE.get());

                        pOutput.accept(ItemRegistryHandler.MATERIAL_NITROCELLULOSE.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_NITROPOWDER.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_BLAZOPOWDER.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_SOLIDPROPELLANT.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_ARC_POWDER.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_FUELROD.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_DEUTERIUM.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_FISSION.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_FUSION.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_COLDFUSION.get());

                        pOutput.accept(ItemRegistryHandler.MATERIAL_BASTONE.get());
                        //----------metal---------
                        pOutput.accept(ItemRegistryHandler.MATERIAL_WIRE_NANOTUBE.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_PLATE_NANOTUBE.get());
                        pOutput.accept(ItemRegistryHandler.METAL_INGOT_CMA.get());
                        pOutput.accept(ItemRegistryHandler.METAL_PLATE_CMA.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_STICK_CMA.get());
                        pOutput.accept(ItemRegistryHandler.METAL_INGOT_DURALUMINIUM.get());
                        pOutput.accept(ItemRegistryHandler.METAL_PLATE_DURALUMINIUM.get());
                        pOutput.accept(ItemRegistryHandler.MATERIAL_STICK_DURALUMINIUM.get());
                        //----------mold---------
                        pOutput.accept(ItemRegistryHandler.MOLD_CASING_BUCKSHOT.get());
                        pOutput.accept(ItemRegistryHandler.MOLD_CASING_GRENADE.get());
                        pOutput.accept(ItemRegistryHandler.MOLD_CASING_HEAVY.get());
                        pOutput.accept(ItemRegistryHandler.MOLD_CASING_PISTOL.get());
                        pOutput.accept(ItemRegistryHandler.MOLD_CASING_RIFLE.get());
                        pOutput.accept(ItemRegistryHandler.MOLD_CASING_SHELL.get());
                        pOutput.accept(ItemRegistryHandler.MOLD_GRAPESHOT.get());
                        pOutput.accept(ItemRegistryHandler.MOLD_HEAD_AP.get());
                        pOutput.accept(ItemRegistryHandler.MOLD_HEAD_GRENADE.get());
                        pOutput.accept(ItemRegistryHandler.MOLD_HEAD_HEAVY.get());
                        pOutput.accept(ItemRegistryHandler.MOLD_HEAD_PISTOL.get());
                        pOutput.accept(ItemRegistryHandler.MOLD_HEAD_RIFLE.get());
                        pOutput.accept(ItemRegistryHandler.MOLD_HEAD_SHELL.get());
                        pOutput.accept(ItemRegistryHandler.MOLD_HEAD_SLUG.get());
                        pOutput.accept(ItemRegistryHandler.MOLD_MATERIAL_BARREL_RIFLED.get());
                        pOutput.accept(ItemRegistryHandler.MOLD_MATERIAL_BARREL_SMOOTH.get());
                        pOutput.accept(ItemRegistryHandler.MOLD_MATERIAL_FIRING_PIN.get());
                        //----------wire coil---------
                        pOutput.accept(ItemRegistryHandler.WIRECOIL_SOLDER.get());

                        //----------fluid related--------
                        pOutput.accept(ItemRegistryHandler.FLUID_CONTAINERS_BUCKET_NITRIC_ACID.get());

                        //----------utilities---------
                        pOutput.accept(ItemRegistryHandler.DRAWING_COMPASS.get());
                        pOutput.accept(ItemRegistryHandler.PENCIL.get());
                        pOutput.accept(ItemRegistryHandler.RULER_METAL.get());
                        pOutput.accept(ItemRegistryHandler.RULER_PLASTIC.get());

                        //----------IE---------
                        pOutput.accept(ItemRegistryHandler.RULER_PLASTIC.get());



                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register((eventBus));
    }
}
