package net.scme.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;

public class IcedChocolateBarItem extends Item {
    public IcedChocolateBarItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        world.addParticle(ParticleTypes.SNOWFLAKE, user.getX(), user.getY() + 2.0, user.getZ(), 0.0, 0.0, 0.0);
        world.addParticle(ParticleTypes.SNOWFLAKE, user.getX(), user.getY() + 2.0, user.getZ(), 0.0, 0.0, 0.0);
        world.addParticle(ParticleTypes.SNOWFLAKE, user.getX(), user.getY() + 2.0, user.getZ(), 0.0, 0.0, 0.0);

        return super.finishUsing(stack, world, user);
    }
}



