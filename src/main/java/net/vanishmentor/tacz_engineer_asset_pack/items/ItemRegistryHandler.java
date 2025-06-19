package net.vanishmentor.tacz_engineer_asset_pack.items;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vanishmentor.tacz_engineer_asset_pack.TaczEngineerAssetPack;
import net.vanishmentor.tacz_engineer_asset_pack.fluids.FluidRegistryHandler;

public class ItemRegistryHandler {
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
            () -> new MaterialBAStoneItem(new Item.Properties()));
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
    public static final RegistryObject<Item> METAL_INGOT_CMA = ITEMS.register("metal_ingot_cma",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_INGOT_DURALUMINIUM = ITEMS.register("metal_ingot_duraluminium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_PLATE_CMA = ITEMS.register("metal_plate_cma",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_PLATE_DURALUMINIUM = ITEMS.register("metal_plate_duraluminium",
            () -> new Item(new Item.Properties()));
    //----------mold---------
    public static final RegistryObject<Item> MOLD_CASING_BUCKSHOT = ITEMS.register("mold_casing_buckshot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOLD_CASING_GRENADE = ITEMS.register("mold_casing_grenade",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOLD_CASING_HEAVY = ITEMS.register("mold_casing_heavy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOLD_CASING_PISTOL = ITEMS.register("mold_casing_pistol",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOLD_CASING_RIFLE = ITEMS.register("mold_casing_rifle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOLD_CASING_SHELL = ITEMS.register("mold_casing_shell",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOLD_GRAPESHOT = ITEMS.register("mold_grapeshot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOLD_HEAD_AP = ITEMS.register("mold_head_ap",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOLD_HEAD_GRENADE = ITEMS.register("mold_head_grenade",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOLD_HEAD_HEAVY = ITEMS.register("mold_head_heavy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOLD_HEAD_PISTOL = ITEMS.register("mold_head_pistol",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOLD_HEAD_RIFLE = ITEMS.register("mold_head_rifle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOLD_HEAD_SHELL = ITEMS.register("mold_head_shell",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOLD_HEAD_SLUG = ITEMS.register("mold_head_slug",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOLD_MATERIAL_BARREL_RIFLED = ITEMS.register("mold_material_barrel_rifled",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOLD_MATERIAL_BARREL_SMOOTH = ITEMS.register("mold_material_barrel_smooth",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOLD_MATERIAL_FIRING_PIN = ITEMS.register("mold_material_firing_pin",
            () -> new Item(new Item.Properties()));
    //----------wire coil---------
    public static final RegistryObject<Item> WIRECOIL_SOLDER = ITEMS.register("wirecoil_solder",
            () -> new Item(new Item.Properties()));
    //----------fluid related--------
    public static final RegistryObject<Item> FLUID_CONTAINERS_BUCKET_NITRIC_ACID = ITEMS.register("fluid_containers_bucket_nitric_acid",
            () -> new BucketItem(FluidRegistryHandler.SOURCE_NITRIC_ACID,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)
            )
    );
    //----------utilities---------
    public static final RegistryObject<Item> DRAWING_COMPASS = ITEMS.register("drawing_compass",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PENCIL = ITEMS.register("pencil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RULER_METAL = ITEMS.register("ruler_metal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RULER_PLASTIC = ITEMS.register("ruler_plastic",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

