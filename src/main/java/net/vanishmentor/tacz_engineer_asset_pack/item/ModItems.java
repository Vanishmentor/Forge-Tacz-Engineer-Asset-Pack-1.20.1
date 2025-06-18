package net.vanishmentor.tacz_engineer_asset_pack.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;
import net.vanishmentor.tacz_engineer_asset_pack.TaczEngineerAssetPack;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TaczEngineerAssetPack.MOD_ID);

    //----------casings---------
    public static final RegistryObject<Item> CASING_RIFLE = ITEMS.register("casing_rifle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASING_BUCKSHOT = ITEMS.register("casing_buckshot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASING_GRENADE = ITEMS.register("casing_grenade",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASING_HEAVY = ITEMS.register("casing_heavy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASING_SHELL = ITEMS.register("casing_shell",
            () -> new Item(new Item.Properties()));
    //----------heads---------
    public static final RegistryObject<Item> HEAD_AP = ITEMS.register("head_ap",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEAD_GRAPESHOT = ITEMS.register("head_grapeshot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEAD_GRENADE = ITEMS.register("head_grenade",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEAD_HEAVY = ITEMS.register("head_heavy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEAD_PISTOL = ITEMS.register("head_pistol",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEAD_RIFLE = ITEMS.register("head_rifle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEAD_SHELL = ITEMS.register("head_shell",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEAD_SLUG = ITEMS.register("head_slug",
            () -> new Item(new Item.Properties()));
    //----------materials---------
    public static final RegistryObject<Item> MATERIAL_AP_INCOMPLETE = ITEMS.register("material_ap_incomplete",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_ARC_POWDER = ITEMS.register("material_arc_powder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_BARREL_RIFLED_CMA = ITEMS.register("material_barrel_rifled_cma",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_BARREL_RIFLED_STEEL = ITEMS.register("material_barrel_rifled_steel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_BARREL_SMOOTH_CMA = ITEMS.register("material_barrel_smooth_cma",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_BARREL_SMOOTH_IRON = ITEMS.register("material_barrel_smooth_iron",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_BASTONE = ITEMS.register("material_bastone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_BLAZOPOWDER = ITEMS.register("material_blazopowder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CIRCUIT_CONTROLLER = ITEMS.register("material_circuit_controller",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CIRCUIT_CONTROLLER_INCOMPLETE = ITEMS.register("material_circuit_controller_incomplete",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CIRCUIT_HOLOGRAPHICS = ITEMS.register("material_circuit_holographics",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CIRCUIT_HOLOGRAPHICS_INCOMPLETE = ITEMS.register("material_circuit_holographics_incomplete",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_COLDFUSION = ITEMS.register("material_coldfusion",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_DEUTERIUM = ITEMS.register("material_deuterium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_DISPLAY = ITEMS.register("material_display",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_ELECTROLYTIC_CAPACITOR = ITEMS.register("material_electrolytic_capacitor",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_FCOMPONENT_CMA = ITEMS.register("material_fcomponent_cma",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_FCOMPONENT_CMA_NANOTUBE = ITEMS.register("material_fcomponent_cma_nanotube",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_FCOMPONENT_IRON = ITEMS.register("material_fcomponent_iron",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_FCOMPONENT_PLASTIC = ITEMS.register("material_fcomponent_plastic",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_FCOMPONENT_PLASTIC_DURALUMINIUM = ITEMS.register("material_fcomponent_plastic_duraluminium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_FCOMPONENT_STEEL = ITEMS.register("material_fcomponent_steel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_FIRING_PIN_CMA = ITEMS.register("material_firing_pin_cma",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_FIRING_PIN_IRON = ITEMS.register("material_firing_pin_iron",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_FIRING_PIN_STEEL = ITEMS.register("material_firing_pin_steel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_FISSION = ITEMS.register("material_fission",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_FUELROD = ITEMS.register("material_fuelrod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_FUSION = ITEMS.register("material_fusion",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_GUNPART_HAMMER_IRON = ITEMS.register("material_gunpart_hammer_iron",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_INGOT_DOPED_QUARTZ = ITEMS.register("material_ingot_doped_quartz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_INTEGRATED_CIRCUIT = ITEMS.register("material_integrated_circuit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_LASER_TRANSMITTER = ITEMS.register("material_laser_transmitter",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_MAG_BRASS = ITEMS.register("material_mag_brass",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_MAG_IRON = ITEMS.register("material_mag_iron",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_MAG_PLASTIC = ITEMS.register("material_mag_plastic",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_MAG_STEEL = ITEMS.register("material_mag_steel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_NITROCELLULOSE = ITEMS.register("material_nitrocellulose",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_NITROPOWDER = ITEMS.register("material_nitropowder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_PLATE_NANOTUBE = ITEMS.register("material_plate_nanotube",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_PRIMER = ITEMS.register("material_primer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_SCREW = ITEMS.register("material_screw",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_SOLIDPROPELLANT = ITEMS.register("material_solidpropellant",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_SPRING = ITEMS.register("material_spring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_STICK_CMA = ITEMS.register("material_stick_cma",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_STICK_DURALUMINIUM = ITEMS.register("material_stick_duraluminium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_TRANSISTOR = ITEMS.register("material_transistor",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_WIRE_NANOTUBE = ITEMS.register("material_wire_nanotube",
            () -> new Item(new Item.Properties()));
    //----------metal---------
    //----------mold---------
    //----------wire coil---------
    //----------utilities---------
    public static final RegistryObject<Item> DRAWING_COMPASS = ITEMS.register("drawing_compass",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
