package net.scme.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class BrownChocolateScrollItem extends Item {
    public BrownChocolateScrollItem(Settings settings) {
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
                    StatusEffects.SPEED,
                    StatusEffects.JUMP_BOOST,
                    StatusEffects.ABSORPTION

            };

            StatusEffect statusEffect = statusEffects[world.random.nextInt(statusEffects.length)];

            player.addStatusEffect(new StatusEffectInstance(statusEffect, 5000, 1));
        }
        return TypedActionResult.success(stack);
    }
}