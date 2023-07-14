package net.scme.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class DarkChocolateScrollItem extends Item {
    public DarkChocolateScrollItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);
        if (!world.isClient) {
            if (world.random.nextFloat() < 0.10f) {

            } else {

                stack.decrement(1);
            }

            StatusEffect[] statusEffects = {
                StatusEffects.LUCK,
                    StatusEffects.HASTE,
                    StatusEffects.HEALTH_BOOST

            };

            StatusEffect statusEffect = statusEffects[world.random.nextInt(statusEffects.length)];

            player.addStatusEffect(new StatusEffectInstance(statusEffect, 1200, 1));
        }
        return TypedActionResult.success(stack);
    }
}
