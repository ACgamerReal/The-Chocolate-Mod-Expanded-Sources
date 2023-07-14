package net.scme.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;



public class SculkBarItem extends Item {
    public SculkBarItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        world.addParticle(ParticleTypes.SCULK_SOUL, user.getX(), user.getY() + 2.0, user.getZ(), 0.0, 0.0, 0.0);
        world.addParticle(ParticleTypes.SCULK_SOUL, user.getX(), user.getY() + 2.0, user.getZ(), 0.0, 0.0, 0.0);
        world.addParticle(ParticleTypes.SCULK_SOUL, user.getX(), user.getY() + 2.0, user.getZ(), 0.0, 0.0, 0.0);
        world.addParticle(ParticleTypes.SCULK_SOUL, user.getX(), user.getY() + 2.0, user.getZ(), 0.0, 0.0, 0.0);
        world.addParticle(ParticleTypes.SCULK_SOUL, user.getX(), user.getY() + 2.0, user.getZ(), 0.0, 0.0, 0.0);
        if (user instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) user;
            if (!world.isClient) {
                player.addExperience(6);



            }
        }
        return super.finishUsing(stack, world, user);
    }
}









