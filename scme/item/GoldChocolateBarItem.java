package net.scme.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GoldChocolateBarItem extends Item {
    public GoldChocolateBarItem(Settings settings) {
        super(settings);
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
