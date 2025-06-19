package net.vanishmentor.tacz_engineer_asset_pack.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vanishmentor.tacz_engineer_asset_pack.TaczEngineerAssetPack;
import net.vanishmentor.tacz_engineer_asset_pack.fluids.FluidRegistryHandler;
import net.vanishmentor.tacz_engineer_asset_pack.items.ItemRegistryHandler;
import java.util.function.Supplier;

public class BlockRegistryHandler {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TaczEngineerAssetPack.MOD_ID);


    public static final RegistryObject<LiquidBlock> NITRIC_ACID_BLOCK = BLOCKS.register("nitric_acid_block",
            () -> new NitricAcidBlock(FluidRegistryHandler.SOURCE_NITRIC_ACID,
                    BlockBehaviour.Properties.copy(Blocks.WATER)
                            .noCollission()
                            .strength(100.0F)
                            .noLootTable()));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ItemRegistryHandler.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
