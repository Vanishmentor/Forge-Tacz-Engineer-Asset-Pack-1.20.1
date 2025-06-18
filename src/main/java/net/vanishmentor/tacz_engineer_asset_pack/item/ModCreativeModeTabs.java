package net.vanishmentor.tacz_engineer_asset_pack.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.vanishmentor.tacz_engineer_asset_pack.TaczEngineerAssetPack;

import java.rmi.registry.Registry;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TaczEngineerAssetPack.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TaczEngineerAssetPack_Tab = CREATIVE_MODE_TAB.register("tacz_engineer_asset_pack_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CASING_RIFLE.get()))
                    .title(Component.translatable("creativetab.tacz_engineer_asset_pack_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //----------casings---------
                        pOutput.accept(ModItems.CASING_RIFLE.get());
                        pOutput.accept(ModItems.CASING_HEAVY.get());
                        pOutput.accept(ModItems.CASING_BUCKSHOT.get());
                        pOutput.accept(ModItems.CASING_GRENADE.get());
                        pOutput.accept(ModItems.CASING_SHELL.get());
                        //----------heads---------
                        pOutput.accept(ModItems.HEAD_PISTOL.get());
                        pOutput.accept(ModItems.HEAD_RIFLE.get());
                        pOutput.accept(ModItems.HEAD_HEAVY.get());
                        pOutput.accept(ModItems.HEAD_GRAPESHOT.get());
                        pOutput.accept(ModItems.HEAD_SLUG.get());
                        pOutput.accept(ModItems.HEAD_GRENADE.get());
                        pOutput.accept(ModItems.HEAD_SHELL.get());
                        pOutput.accept(ModItems.HEAD_AP.get());
                        //----------materials---------
                        pOutput.accept(ModItems.MATERIAL_AP_INCOMPLETE.get());
                        pOutput.accept(ModItems.MATERIAL_PRIMER.get());
                        pOutput.accept(ModItems.MATERIAL_SCREW.get());
                        pOutput.accept(ModItems.MATERIAL_SPRING.get());
                        pOutput.accept(ModItems.MATERIAL_GUNPART_HAMMER_IRON.get());
                        pOutput.accept(ModItems.MATERIAL_FIRING_PIN_IRON.get());
                        pOutput.accept(ModItems.MATERIAL_FIRING_PIN_STEEL.get());
                        pOutput.accept(ModItems.MATERIAL_FIRING_PIN_CMA.get());
                        pOutput.accept(ModItems.MATERIAL_BARREL_RIFLED_CMA.get());
                        pOutput.accept(ModItems.MATERIAL_BARREL_RIFLED_STEEL.get());
                        pOutput.accept(ModItems.MATERIAL_BARREL_SMOOTH_CMA.get());
                        pOutput.accept(ModItems.MATERIAL_BARREL_SMOOTH_IRON.get());
                        pOutput.accept(ModItems.MATERIAL_MAG_BRASS.get());
                        pOutput.accept(ModItems.MATERIAL_MAG_IRON.get());
                        pOutput.accept(ModItems.MATERIAL_MAG_PLASTIC.get());
                        pOutput.accept(ModItems.MATERIAL_MAG_STEEL.get());
                        pOutput.accept(ModItems.MATERIAL_FCOMPONENT_IRON.get());
                        pOutput.accept(ModItems.MATERIAL_FCOMPONENT_STEEL.get());
                        pOutput.accept(ModItems.MATERIAL_FCOMPONENT_PLASTIC.get());
                        pOutput.accept(ModItems.MATERIAL_FCOMPONENT_PLASTIC_DURALUMINIUM.get());
                        pOutput.accept(ModItems.MATERIAL_FCOMPONENT_CMA.get());
                        pOutput.accept(ModItems.MATERIAL_FCOMPONENT_CMA_NANOTUBE.get());

                        pOutput.accept(ModItems.MATERIAL_INGOT_DOPED_QUARTZ.get());
                        pOutput.accept(ModItems.MATERIAL_ELECTROLYTIC_CAPACITOR.get());
                        pOutput.accept(ModItems.MATERIAL_TRANSISTOR.get());
                        pOutput.accept(ModItems.MATERIAL_INTEGRATED_CIRCUIT.get());
                        pOutput.accept(ModItems.MATERIAL_DISPLAY.get());
                        pOutput.accept(ModItems.MATERIAL_LASER_TRANSMITTER.get());
                        pOutput.accept(ModItems.MATERIAL_CIRCUIT_CONTROLLER.get());
                        pOutput.accept(ModItems.MATERIAL_CIRCUIT_CONTROLLER_INCOMPLETE.get());
                        pOutput.accept(ModItems.MATERIAL_CIRCUIT_HOLOGRAPHICS.get());
                        pOutput.accept(ModItems.MATERIAL_CIRCUIT_HOLOGRAPHICS_INCOMPLETE.get());

                        pOutput.accept(ModItems.MATERIAL_NITROCELLULOSE.get());
                        pOutput.accept(ModItems.MATERIAL_NITROPOWDER.get());
                        pOutput.accept(ModItems.MATERIAL_BLAZOPOWDER.get());
                        pOutput.accept(ModItems.MATERIAL_SOLIDPROPELLANT.get());
                        pOutput.accept(ModItems.MATERIAL_ARC_POWDER.get());
                        pOutput.accept(ModItems.MATERIAL_FUELROD.get());
                        pOutput.accept(ModItems.MATERIAL_DEUTERIUM.get());
                        pOutput.accept(ModItems.MATERIAL_FISSION.get());
                        pOutput.accept(ModItems.MATERIAL_FUSION.get());
                        pOutput.accept(ModItems.MATERIAL_COLDFUSION.get());


                        pOutput.accept(ModItems.MATERIAL_STICK_CMA.get());
                        pOutput.accept(ModItems.MATERIAL_STICK_DURALUMINIUM.get());

                        pOutput.accept(ModItems.MATERIAL_WIRE_NANOTUBE.get());
                        pOutput.accept(ModItems.MATERIAL_PLATE_NANOTUBE.get());

                        pOutput.accept(ModItems.MATERIAL_BASTONE.get());
                        //----------metal---------
                        //----------mold---------
                        //----------wire coil---------
                        //----------utilities---------
                        pOutput.accept(ModItems.DRAWING_COMPASS.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register((eventBus));
    }
}
