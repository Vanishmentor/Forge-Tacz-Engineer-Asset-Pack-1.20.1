package net.vanishmentor.tacz_engineer_asset_pack.items;

import blusunrize.immersiveengineering.api.ApiUtils;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class ItemCraftingTool extends Item {

    public ItemCraftingTool(Properties pProperties) {
        super(pProperties);
    }

    @Nonnull
    @Override
    public ItemStack getCraftingRemainingItem(@Nonnull ItemStack stack)
    {
        ItemStack container = stack.copy();
        if(container.hurt(1, ApiUtils.RANDOM_SOURCE, null))
            return ItemStack.EMPTY;
        else
            return container;
    }

    @Override
    public boolean hasCraftingRemainingItem(@Nonnull ItemStack stack)
    {
        return true;
    }


}
