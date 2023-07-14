package net.scme.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageEffects;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RottenChocolateBarItem extends Item {
    public RottenChocolateBarItem(Settings settings) {
        super(settings);

    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity entity) {
        super.finishUsing(stack, world, entity);



        boolean zombiesSpawned = false;
        int numZombiesKilled = 0;


        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;
            player.getHungerManager().add(5, 5F);

            if (!world.isClient && world.random.nextFloat() < 0.25f) {
                // Calculate the spawn position
                BlockPos playerPos = player.getBlockPos();
                double radius = 5.0;
                int maxZombies = 4;
                int numZombies = Math.min(maxZombies, world.random.nextInt(maxZombies) + 1);

                // Spawn the zombies within the specified radius
                for (int i = 0; i < numZombies; i++) {
                    double angle = 2.0 * Math.PI * i / numZombies;
                    double xOffset = radius * Math.cos(angle);
                    double zOffset = radius * Math.sin(angle);
                    int spawnX = playerPos.getX() + (int) xOffset;
                    int spawnZ = playerPos.getZ() + (int) zOffset;
                    BlockPos spawnPos = new BlockPos(spawnX, playerPos.getY(), spawnZ);

                    // Summon a zombie entity at the spawn position
                    ZombieEntity zombie = EntityType.ZOMBIE.create(world);
                    zombie.refreshPositionAndAngles(spawnPos.getX(), spawnPos.getY(), spawnPos.getZ(), player.getYaw(), 0.0F);
                    world.spawnEntity(zombie);
                    zombiesSpawned = true;



                }

            } else {
                world.addParticle(ParticleTypes.SWEEP_ATTACK, entity.getX() + 2.0, entity.getY() + 2.0, entity.getZ() + 2.0, 0.0, 0.0, 0.0);
                world.addParticle(ParticleTypes.SWEEP_ATTACK, entity.getX()- 2.0, entity.getY() + 2.0, entity.getZ()- 2.0, 0.0, 0.0, 0.0);
                world.addParticle(ParticleTypes.SWEEP_ATTACK, entity.getX()- 2.0, entity.getY() + 2.0, entity.getZ()+2.0, 0.0, 0.0, 0.0);
                world.addParticle(ParticleTypes.SWEEP_ATTACK, entity.getX()+ 2.0, entity.getY() + 2.0, entity.getZ()- 2.0, 0.0, 0.0, 0.0);

                BlockPos playerPos = entity.getBlockPos();
                double radius = 10.0;
                int maxZombies = 10;
                int numZombies = Math.min(maxZombies, world.random.nextInt(maxZombies) + 1);

                for (Entity nearbyEntity : world.getOtherEntities(entity, entity.getBoundingBox().expand(radius))) {
                    if (nearbyEntity instanceof ZombieEntity && numZombies > 0) {
                        ZombieEntity zombieEntity = (ZombieEntity) nearbyEntity;
                        zombieEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 5));
                        numZombies--;
                    }
                }
            }

            return stack;
                    }
        return stack;
    }
            }



