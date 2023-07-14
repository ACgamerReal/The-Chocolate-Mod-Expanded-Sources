package net.scme.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.scme.SCME;
import net.scme.sound.ModSounds;
import net.scme.block.ModBlocks;

public class ModItems {
    public static final Item BROWN_CHOCOLATE_BAR = registerItem("brown_chocolate_bar",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    public static final Item WHITE_CHOCOLATE_BAR = registerItem("white_chocolate_bar",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(5f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 0), 1f).build())));

    public static final Item DARK_CHOCOLATE_BAR = registerItem("dark_chocolate_bar",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(5f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 1f).build())));

    public static final Item GOLD_CHOCOLATE_BAR = registerItem("gold_chocolate_bar",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).food(new FoodComponent.Builder().hunger(4).saturationModifier(4f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 0), 1f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1800, 0), 1f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 0), 1f).alwaysEdible().build())));

    public static final Item ENCHANTED_GOLD_CHOCOLATE_BAR = registerItem("enchanted_gold_chocolate_bar",
            new GoldChocolateBarItem(new FabricItemSettings().rarity(Rarity.EPIC).food(new FoodComponent.Builder().hunger(4).saturationModifier(4.5f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 0), 1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1),1f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 1), 1f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 600, 0), 1f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1200, 0), 1f).alwaysEdible().build())));

    public static final Item BROWN_CHOCOLATE_BAR_BOWL = registerItem("brown_chocolate_bar_bowl",
            new Item(new FabricItemSettings().maxCount(1)));

    public static final Item HOT_CHOCOLATE_BOWL = registerItem("hot_chocolate_bowl",
            new HotChocolateBowlItem(new FabricItemSettings().maxCount(1).food(new FoodComponent.Builder().hunger(4).saturationModifier(5f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 0.50f).build())));

    public static final Item DRIED_COCOA_BEANS = registerItem("dried_cocoa_beans",
            new Item(new FabricItemSettings()));

    public static final Item MUSIC_BOX_CHOCOLATE_DISC = registerItem("music_box_chocolate_disc",
            new MusicDiscItem(5, ModSounds.CHOCOOLATE_DISC, new  FabricItemSettings().rarity(Rarity.RARE).maxCount(1), 138));

    public static final Item MAGMA_CHOCOLATE_BAR = registerItem("magma_chocolate_bar",
            new Item(new FabricItemSettings().fireproof().rarity(Rarity.RARE).food(new FoodComponent.Builder().hunger(4).saturationModifier(6f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 600, 0), 1f).build())));

    public static final Item ENDER_CHOCOLATE_BAR = registerItem("ender_chocolate_bar",
            new EnderBarItem(new FabricItemSettings().rarity(Rarity.RARE).food(new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    public static final Item SCULK_CHOCOLATE_BAR = registerItem("sculk_chocolate_bar",
            new SculkBarItem(new FabricItemSettings().rarity(Rarity.RARE).food(new FoodComponent.Builder().alwaysEdible().hunger(4).saturationModifier(3.5f).build())));

    public static final Item ICED_CHOCOLATE_BAR = registerItem("iced_chocolate_bar",
            new IcedChocolateBarItem(new FabricItemSettings().rarity(Rarity.RARE).food(new FoodComponent.Builder().hunger(4).saturationModifier(4f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 300, 0), 1f).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 400, 1),1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 300, 0), 0.70f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200, 1), 0.70f).alwaysEdible().build())));

    public static final Item BROWN_CHOCOLATE_SCROLL = registerItem("brown_chocolate_scroll",
            new BrownChocolateScrollItem(new FabricItemSettings().maxCount(1)));


    public static final Item WHITE_CHOCOLATE_SCROLL = registerItem("white_chocolate_scroll",
            new WhiteChocolateScrollItem(new FabricItemSettings().maxCount(1)));

    public static final Item DARK_CHOCOLATE_SCROLL = registerItem("dark_chocolate_scroll",
            new DarkChocolateScrollItem(new FabricItemSettings().maxCount(1)));

    public static final Item ROTTEN_CHOCOLATE_BAR = registerItem("rotten_chocolate_bar",
            new RottenChocolateBarItem(new FabricItemSettings().food(new FoodComponent.Builder().alwaysEdible().hunger(5).saturationModifier(5f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 150, 0), 0.25f).build())));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(SCME.MOD_ID,name), item);
    }


    public static void addItemsToItemGroup(){



        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, BROWN_CHOCOLATE_BAR);
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, WHITE_CHOCOLATE_BAR);
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, DARK_CHOCOLATE_BAR);
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, MAGMA_CHOCOLATE_BAR);
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, ICED_CHOCOLATE_BAR);
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, ENDER_CHOCOLATE_BAR);
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, SCULK_CHOCOLATE_BAR);
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, GOLD_CHOCOLATE_BAR);
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, ENCHANTED_GOLD_CHOCOLATE_BAR);
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, ROTTEN_CHOCOLATE_BAR);
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, BROWN_CHOCOLATE_BAR_BOWL);
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, HOT_CHOCOLATE_BOWL);
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, DRIED_COCOA_BEANS);
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, BROWN_CHOCOLATE_SCROLL);
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, WHITE_CHOCOLATE_SCROLL);
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, DARK_CHOCOLATE_SCROLL);
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, MUSIC_BOX_CHOCOLATE_DISC);











    }
    private static void addToItemGroup(RegistryKey<ItemGroup> group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));

    }



    public static void registerModItems(){
        SCME.LOGGER.debug("Registering Mod Items of" + SCME.MOD_ID);
        addItemsToItemGroup();
    }
}


