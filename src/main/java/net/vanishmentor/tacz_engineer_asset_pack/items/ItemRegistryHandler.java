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
            () -> new ItemWithDescription(new Item.Properties(),"tooltip.tacz_engineer_asset_pack.casing_rifle.tooltip"));
    public static final RegistryObject<Item> CASING_BUCKSHOT = ITEMS.register("casing_buckshot",
            () -> new ItemWithDescription(new Item.Properties(),"tooltip.tacz_engineer_asset_pack.casing_buckshot.tooltip"));
    public static final RegistryObject<Item> CASING_GRENADE = ITEMS.register("casing_grenade",
            () -> new ItemWithDescription(new Item.Properties(),"tooltip.tacz_engineer_asset_pack.casing_grenade.tooltip"));
    public static final RegistryObject<Item> CASING_HEAVY = ITEMS.register("casing_heavy",
            () -> new ItemWithDescription(new Item.Properties(),"tooltip.tacz_engineer_asset_pack.casing_heavy.tooltip"));
    public static final RegistryObject<Item> CASING_SHELL = ITEMS.register("casing_shell",
            () -> new ItemWithDescription(new Item.Properties(),"tooltip.tacz_engineer_asset_pack.casing_shell.tooltip"));
    //----------heads---------
    public static final RegistryObject<Item> HEAD_AP = ITEMS.register("head_ap",
            () -> new ItemWithDescription(new Item.Properties(),"tooltip.tacz_engineer_asset_pack.head_ap.tooltip"));
    public static final RegistryObject<Item> HEAD_GRAPESHOT = ITEMS.register("head_grapeshot",
            () -> new ItemWithDescription(new Item.Properties(),"tooltip.tacz_engineer_asset_pack.head_grapeshot.tooltip"));
    public static final RegistryObject<Item> HEAD_GRENADE = ITEMS.register("head_grenade",
            () -> new ItemWithDescription(new Item.Properties(),"tooltip.tacz_engineer_asset_pack.head_grenade.tooltip"));
    public static final RegistryObject<Item> HEAD_HEAVY = ITEMS.register("head_heavy",
            () -> new ItemWithDescription(new Item.Properties(),"tooltip.tacz_engineer_asset_pack.head_heavy.tooltip"));
    public static final RegistryObject<Item> HEAD_PISTOL = ITEMS.register("head_pistol",
            () -> new ItemWithDescription(new Item.Properties(),"tooltip.tacz_engineer_asset_pack.head_pistol.tooltip"));
    public static final RegistryObject<Item> HEAD_RIFLE = ITEMS.register("head_rifle",
            () -> new ItemWithDescription(new Item.Properties(),"tooltip.tacz_engineer_asset_pack.head_rifle.tooltip"));
    public static final RegistryObject<Item> HEAD_SHELL = ITEMS.register("head_shell",
            () -> new ItemWithDescription(new Item.Properties(),"tooltip.tacz_engineer_asset_pack.head_shell.tooltip"));
    public static final RegistryObject<Item> HEAD_SLUG = ITEMS.register("head_slug",
            () -> new ItemWithDescription(new Item.Properties(),"tooltip.tacz_engineer_asset_pack.head_slug.tooltip"));
    //----------materials---------
    public static final RegistryObject<Item> MATERIAL_AP_INCOMPLETE = ITEMS.register("material_ap_incomplete",
            () -> new ItemWithDescription(new Item.Properties(),"tooltip.tacz_engineer_asset_pack.material_ap_incomplete.tooltip"));
    public static final RegistryObject<Item> MATERIAL_ARC_POWDER = ITEMS.register("material_arc_powder",
            () -> new ItemWithDescription(new Item.Properties(),"tooltip.tacz_engineer_asset_pack.material_arc_powder.tooltip"));
    public static final RegistryObject<Item> MATERIAL_BARREL_RIFLED_CMA = ITEMS.register("material_barrel_rifled_cma",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_BARREL_RIFLED_STEEL = ITEMS.register("material_barrel_rifled_steel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_BARREL_SMOOTH_CMA = ITEMS.register("material_barrel_smooth_cma",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_BARREL_SMOOTH_IRON = ITEMS.register("material_barrel_smooth_iron",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_BASTONE = ITEMS.register("material_bastone",
            () -> new ItemWithDescription(new Item.Properties(),"tooltip.tacz_engineer_asset_pack.material_bastone.tooltip"));
    public static final RegistryObject<Item> MATERIAL_BLAZOPOWDER = ITEMS.register("material_blazopowder",
            () -> new ItemWithDescription(new Item.Properties(),"tooltip.tacz_engineer_asset_pack.material_blazopowder.tooltip"));
    public static final RegistryObject<Item> MATERIAL_INTEGRATED_CIRCUIT = ITEMS.register("material_integrated_circuit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_LASER_TRANSMITTER = ITEMS.register("material_laser_transmitter",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CIRCUIT_CONTROLLER = ITEMS.register("material_circuit_controller",
            () -> new Item(new Item.Properties().craftRemainder(MATERIAL_INTEGRATED_CIRCUIT.get()).stacksTo(1)
            )
    );
    public static final RegistryObject<Item> MATERIAL_CIRCUIT_CONTROLLER_INCOMPLETE = ITEMS.register("material_circuit_controller_incomplete",
            () -> new Item(new Item.Properties().stacksTo(1)
            )
    );
    public static final RegistryObject<Item> MATERIAL_CIRCUIT_HOLOGRAPHICS = ITEMS.register("material_circuit_holographics",
            () -> new Item(new Item.Properties().craftRemainder(MATERIAL_LASER_TRANSMITTER.get()).stacksTo(1)
            )
    );
    public static final RegistryObject<Item> MATERIAL_CIRCUIT_HOLOGRAPHICS_INCOMPLETE = ITEMS.register("material_circuit_holographics_incomplete",
            () -> new Item(new Item.Properties().stacksTo(1)
            )
    );

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
            () -> new ItemWithDescription(new Item.Properties().stacksTo(1),"tooltip.tacz_engineer_asset_pack.material_fission.tooltip"));
    public static final RegistryObject<Item> MATERIAL_FUELROD = ITEMS.register("material_fuelrod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_FUSION = ITEMS.register("material_fusion",
            () -> new ItemWithDescription(new Item.Properties().stacksTo(1),"tooltip.tacz_engineer_asset_pack.material_fusion.tooltip"));
    public static final RegistryObject<Item> MATERIAL_GUNPART_HAMMER_IRON = ITEMS.register("material_gunpart_hammer_iron",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_INGOT_DOPED_QUARTZ = ITEMS.register("material_ingot_doped_quartz",
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
            () -> new ItemWithDescription(new Item.Properties(),"tooltip.tacz_engineer_asset_pack.material_nitropowder.tooltip"));
    public static final RegistryObject<Item> MATERIAL_PLATE_NANOTUBE = ITEMS.register("material_plate_nanotube",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_PRIMER = ITEMS.register("material_primer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_SCREW = ITEMS.register("material_screw",
            () -> new Item(new Item.Properties().stacksTo(512)));
    public static final RegistryObject<Item> MATERIAL_SOLIDPROPELLANT = ITEMS.register("material_solidpropellant",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_SPRING = ITEMS.register("material_spring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_STICK_CMA = ITEMS.register("material_stick_cma",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_STICK_DURALUMINIUM = ITEMS.register("material_stick_duraluminium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_TRANSISTOR = ITEMS.register("material_transistor",
            () -> new ItemWithDescription(new Item.Properties(),"tooltip.tacz_engineer_asset_pack.material_transistor.tooltip"));
    public static final RegistryObject<Item> MATERIAL_WIRE_NANOTUBE = ITEMS.register("material_wire_nanotube",
            () -> new ItemWithDescription(new Item.Properties(),"tooltip.tacz_engineer_asset_pack.material_wire_nanotube.tooltip"));
    //----------metal---------
    public static final RegistryObject<Item> METAL_INGOT_CMA = ITEMS.register("metal_ingot_cma",
            () -> new ItemWithDescription(new Item.Properties(),"tooltip.tacz_engineer_asset_pack.metal_ingot_cma.tooltip"));
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

    public static RegistryObject<Item> DRAWING_COMPASS_EMPTY = ITEMS.register("drawing_compass_empty",
            () -> new ItemWithDescription(new Item.Properties().stacksTo(1),"tooltip.tacz_engineer_asset_pack.drawing_compass_empty.tooltip"
            )
    );
    public static RegistryObject<Item> DRAWING_COMPASS = ITEMS.register("drawing_compass",
            () -> new ItemWithDescription(new Item.Properties().stacksTo(1).craftRemainder(DRAWING_COMPASS_EMPTY.get()),"tooltip.tacz_engineer_asset_pack.drawing_compass.tooltip"
            )
    );
    public static final RegistryObject<Item> PENCIL = ITEMS.register("pencil",
            () -> new ItemWithDescription(new Item.Properties(),"tooltip.tacz_engineer_asset_pack.pencil.tooltip"));


    public static final RegistryObject<Item> RULER_METAL = ITEMS.register("ruler_metal",
            () -> new ItemCraftingToolWithDescription(new Item.Properties().stacksTo(1).defaultDurability(6),"tooltip.tacz_engineer_asset_pack.ruler_metal.tooltip"
            )
    );

    public static final RegistryObject<Item> RULER_PLASTIC = ITEMS.register("ruler_plastic",
            () -> new ItemCraftingToolWithDescription(new Item.Properties().stacksTo(1).defaultDurability(2),"tooltip.tacz_engineer_asset_pack.ruler_plastic.tooltip"
            )
    );

    //----------[create]---------
    // 0.1 patch
    public static final RegistryObject<Item> MATERIAL_FCOMPONENT_BRASS = ITEMS.register("material_fcomponent_brass",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_FCOMPONENT_BRASS_INCOMPLETE = ITEMS.register("material_fcomponent_brass_incomplete",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_MAG_BRASS = ITEMS.register("material_mag_brass",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_MAG_BRASS_INCOMPLETE = ITEMS.register("material_mag_brass_incomplete",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_COLDFUSION = ITEMS.register("material_coldfusion",
            () -> new ItemWithDescription(new Item.Properties().stacksTo(1),"tooltip.tacz_engineer_asset_pack.material_coldfusion.tooltip"));
    // 0.2 patch
    public static final RegistryObject<Item> MATERIAL_CREATE_BRASS_CASING = ITEMS.register("material_create_brass_casing",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_BRASS_CASING_INCOMPLETE = ITEMS.register("material_create_brass_casing_incomplete",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_BRASS_CASING_LARGE = ITEMS.register("material_create_brass_casing_large",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_BRASS_CASING_LARGE_INCOMPLETE = ITEMS.register("material_create_brass_casing_large_incomplete",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_COPPER_CASING = ITEMS.register("material_create_copper_casing",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_COPPER_CASING_INCOMPLETE = ITEMS.register("material_create_copper_casing_incomplete",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_COPPER_CASING_LARGE = ITEMS.register("material_create_copper_casing_large",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_COPPER_CASING_LARGE_INCOMPLETE = ITEMS.register("material_create_copper_casing_large_incomplete",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_COPPER_HEAD = ITEMS.register("material_create_copper_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_GRENADE_HEAD = ITEMS.register("material_create_grenade_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_GRENADE_HEAD_INCOMPLETE = ITEMS.register("material_create_grenade_head_incomplete",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_IRON_HEAD = ITEMS.register("material_create_iron_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_PRESSUREIZED_INCOMPLETE = ITEMS.register("material_create_pressureized_incomplete",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_PRESSURIZED = ITEMS.register("material_create_pressurized",
            () -> new ItemCraftingTool(new Item.Properties().stacksTo(1).defaultDurability(128)));
    public static final RegistryObject<Item> MATERIAL_CREATE_SHELL_HEAD = ITEMS.register("material_create_shell_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_SHELL_HEAD_INCOMPLETE = ITEMS.register("material_create_shell_head_incomplete",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_AMMO_40MMHE_INCOMPLETE = ITEMS.register("material_create_ammo_40mmhe_incomplete",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_AMMO_GAS_PISTOL_AMMO_INCOMPLETE = ITEMS.register("material_create_ammo_gas_pistol_ammo_incomplete",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_AMMO_GERNADE_INCOMPLETE = ITEMS.register("material_create_ammo_gernade_incomplete",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_AMMO_RBAPB_INCOMPLETE = ITEMS.register("material_create_ammo_rbapb_incomplete",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_AMMO_SLAP_INCOMPLETE = ITEMS.register("material_create_ammo_slap_incomplete",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_NITROPOWDER_SMALL = ITEMS.register("material_create_nitropowder_small",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_NITROPOWDER_TINY = ITEMS.register("material_create_nitropowder_tiny",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_BLAZO_POWDER_SMALL = ITEMS.register("material_create_blazo_powder_small",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_PRIMER = ITEMS.register("material_create_primer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_PRIMER_INCOMPLETE = ITEMS.register("material_create_primer_incomplete",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MATERIAL_CREATE_REDSTONE_TINY = ITEMS.register("material_create_redstone_tiny",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

