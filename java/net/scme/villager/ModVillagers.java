package net.scme.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import net.scme.SCME;
import net.scme.block.ModBlocks;
import net.scme.item.ModItems;

public class ModVillagers {

        public static final PointOfInterestType CHOCOLATE_POI = registerPOI("chocolate_poi", ModBlocks.CHOCOLATERIE_TABLE);
        public static final VillagerProfession CHOCOLATE_VILLAGER = registerProfession("chocolate_villager3",
                RegistryKey.of(Registries.POINT_OF_INTEREST_TYPE.getKey(), new Identifier(SCME.MOD_ID, "chocolate_poi")));

        public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
            return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(SCME.MOD_ID, name),
                    VillagerProfessionBuilder.create().id(new Identifier(SCME.MOD_ID, name)).workstation(type)
                            .workSound(SoundEvents.ENTITY_VILLAGER_WORK_ARMORER).build());
        }

        public static PointOfInterestType registerPOI(String name, Block block) {
            return PointOfInterestHelper.register(new Identifier(SCME.MOD_ID, name),
                    1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));
        }

        public static void registerVillagers() {
            SCME.LOGGER.debug("Registering Villagers for " + SCME.MOD_ID);
        }

        public static void registerTrades() {
            TradeOfferHelper.registerVillagerOffers(CHOCOLATE_VILLAGER,1,
                    factories -> {
                        factories.add(((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 2),
                                new ItemStack(Items.COCOA_BEANS, 5),
                                6, 1, 0.02f
                        )));
                    });
            TradeOfferHelper.registerVillagerOffers(CHOCOLATE_VILLAGER,1,
                    factories -> {
                        factories.add(((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 2),
                                new ItemStack(Items.SUGAR, 5),
                                6, 1, 0.02f
                        )));
                    });

            TradeOfferHelper.registerVillagerOffers(CHOCOLATE_VILLAGER,1,
                    factories -> {
                        factories.add(((entity, random) -> new TradeOffer(
                                new ItemStack(Items.SUGAR, 5),
                                new ItemStack(Items.EMERALD, 1),
                                6, 1, 0.02f
                        )));
                    });
            TradeOfferHelper.registerVillagerOffers(CHOCOLATE_VILLAGER,1,
                    factories -> {
                        factories.add(((entity, random) -> new TradeOffer(
                                new ItemStack(Items.COCOA_BEANS, 5),
                                new ItemStack(Items.EMERALD, 1),
                                6, 1, 0.02f
                        )));
                    });


            TradeOfferHelper.registerVillagerOffers(CHOCOLATE_VILLAGER,2,
                    factories -> {
                        factories.add(((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 3),
                                new ItemStack(ModItems.BROWN_CHOCOLATE_BAR, 1),
                                10, 3, 0.02f
                        )));
                    });
            TradeOfferHelper.registerVillagerOffers(CHOCOLATE_VILLAGER,2,
                    factories -> {
                        factories.add(((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 3),
                                new ItemStack(ModItems.DARK_CHOCOLATE_BAR, 1),
                                10, 3, 0.02f
                        )));
                    });
            TradeOfferHelper.registerVillagerOffers(CHOCOLATE_VILLAGER,2,
                    factories -> {
                        factories.add(((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 3),
                                new ItemStack(ModItems.WHITE_CHOCOLATE_BAR, 1),
                                10, 3, 0.02f
                        )));
                    });

            TradeOfferHelper.registerVillagerOffers(CHOCOLATE_VILLAGER,2,
                    factories -> {
                        factories.add(((entity, random) -> new TradeOffer(
                                new ItemStack(ModItems.BROWN_CHOCOLATE_BAR, 1),
                                new ItemStack(Items.EMERALD, 2),
                                8, 3, 0.02f
                        )));
                    });
            TradeOfferHelper.registerVillagerOffers(CHOCOLATE_VILLAGER,2,
                    factories -> {
                        factories.add(((entity, random) -> new TradeOffer(
                                new ItemStack(ModItems.WHITE_CHOCOLATE_BAR, 1),
                                new ItemStack(Items.EMERALD, 2),
                                8, 3, 0.02f
                        )));
                    });

            TradeOfferHelper.registerVillagerOffers(CHOCOLATE_VILLAGER,2,
                    factories -> {
                        factories.add(((entity, random) -> new TradeOffer(
                                new ItemStack(ModItems.DARK_CHOCOLATE_BAR, 1),
                                new ItemStack(Items.EMERALD, 2),
                                8, 3, 0.02f
                        )));
                    });



            TradeOfferHelper.registerVillagerOffers(CHOCOLATE_VILLAGER,3,
                    factories -> {
                        factories.add(((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 2),
                                new ItemStack(ModItems.BROWN_CHOCOLATE_BAR_BOWL, 1),
                                6, 4, 0.02f
                        )));
                    });

            TradeOfferHelper.registerVillagerOffers(CHOCOLATE_VILLAGER,3,
                    factories -> {
                        factories.add(((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 5),
                                new ItemStack(ModBlocks.CHOCOLATE_CAKE, 1),
                                5, 4, 0.03f
                        )));
                    });
            TradeOfferHelper.registerVillagerOffers(CHOCOLATE_VILLAGER,3,
                    factories -> {
                        factories.add(((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 2),
                                new ItemStack(ModItems.HOT_CHOCOLATE_BOWL, 1),
                                3, 6, 0.02f
                        )));
                    });

            TradeOfferHelper.registerVillagerOffers(CHOCOLATE_VILLAGER,4,
                    factories -> {
                        factories.add(((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 12),
                                new ItemStack(ModBlocks.CHOCOLATERIE_TABLE, 1),
                                10, 7, 0.02f
                        )));
                    });

            TradeOfferHelper.registerVillagerOffers(CHOCOLATE_VILLAGER,4,
                    factories -> {
                        factories.add(((entity, random) -> new TradeOffer(
                                new ItemStack(ModBlocks.CHOCOLATERIE_TABLE, 1),
                                new ItemStack(Items.EMERALD, 10),
                                8, 7, 0.02f
                        )));
                    });


            TradeOfferHelper.registerVillagerOffers(CHOCOLATE_VILLAGER,5,
                    factories -> {
                        factories.add(((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 36),
                                new ItemStack(ModItems.ENCHANTED_GOLD_CHOCOLATE_BAR, 1),
                                3, 15, 0.04f
                        )));
                    });
            TradeOfferHelper.registerVillagerOffers(CHOCOLATE_VILLAGER,5,
                    factories -> {
                        factories.add(((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 12),
                                new ItemStack(ModItems.GOLD_CHOCOLATE_BAR, 1),
                                5, 12, 0.03f
                        )));
                    });

            TradeOfferHelper.registerVillagerOffers(CHOCOLATE_VILLAGER,5,
                    factories -> {
                        factories.add(((entity, random) -> new TradeOffer(
                                new ItemStack(ModItems.ENCHANTED_GOLD_CHOCOLATE_BAR, 1),
                                new ItemStack(Items.EMERALD, 32),
                                3, 15, 0.04f
                        )));
                    });
            TradeOfferHelper.registerVillagerOffers(CHOCOLATE_VILLAGER,5,
                    factories -> {
                        factories.add(((entity, random) -> new TradeOffer(
                                new ItemStack(ModItems.GOLD_CHOCOLATE_BAR, 1),
                                new ItemStack(Items.EMERALD, 10),
                                5, 12, 0.03f
                        )));
                    });
         }
        }

