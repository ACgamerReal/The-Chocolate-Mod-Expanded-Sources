package net.scme.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.scme.SCME;

public class ModItems {
    public static final Item BROWN_CHOCOLATE_BAR = registerItem("brown_chocolate_bar",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    public static final Item WHITE_CHOCOLATE_BAR = registerItem("white_chocolate_bar",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(5f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 0), 1f).build())));

    public static final Item DARK_CHOCOLATE_BAR = registerItem("dark_chocolate_bar",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(5f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1f).build())));

    public static final Item GOLD_CHOCOLATE_BAR = registerItem("gold_chocolate_bar",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).food(new FoodComponent.Builder().hunger(4).saturationModifier(5f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 0), 1f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1800, 0), 1f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 0), 1f).alwaysEdible().build())));

    public static final Item ENCHANTED_GOLD_CHOCOLATE_BAR = registerItem("enchanted_gold_chocolate_bar",
            new GoldChocolateBarItem(new FabricItemSettings().rarity(Rarity.EPIC).food(new FoodComponent.Builder().hunger(4).saturationModifier(5f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 0), 1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1),1f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 1), 1f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 600, 0), 1f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1200, 0), 1f).alwaysEdible().build())));

    public static final Item BROWN_CHOCOLATE_BAR_BOWL = registerItem("brown_chocolate_bar_bowl",
            new Item(new FabricItemSettings().maxCount(1)));

    public static final Item HOT_CHOCOLATE_BOWL = registerItem("hot_chocolate_bowl",
            new HotChocolateBowlItem(new FabricItemSettings().maxCount(1).food(new FoodComponent.Builder().hunger(4).saturationModifier(4f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 1f).build())));

    public static final Item DRIED_COCOA_BEANS = registerItem("dried_cocoa_beans",
            new Item(new FabricItemSettings()));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(SCME.MOD_ID,name), item);
    }


    public static void addItemsToItemGroup(){



        addToItemGroup(ModItemGroup.CHOCOLATE, BROWN_CHOCOLATE_BAR);
        addToItemGroup(ModItemGroup.CHOCOLATE, WHITE_CHOCOLATE_BAR);
        addToItemGroup(ModItemGroup.CHOCOLATE, DARK_CHOCOLATE_BAR);
        addToItemGroup(ModItemGroup.CHOCOLATE, GOLD_CHOCOLATE_BAR);
        addToItemGroup(ModItemGroup.CHOCOLATE, ENCHANTED_GOLD_CHOCOLATE_BAR);
        addToItemGroup(ModItemGroup.CHOCOLATE, BROWN_CHOCOLATE_BAR_BOWL);
        addToItemGroup(ModItemGroup.CHOCOLATE, HOT_CHOCOLATE_BOWL);
        addToItemGroup(ModItemGroup.CHOCOLATE, DRIED_COCOA_BEANS);




        addToItemGroup(ModItemGroup.CHOCOLATE_FOODS, BROWN_CHOCOLATE_BAR);
        addToItemGroup(ModItemGroup.CHOCOLATE_FOODS, WHITE_CHOCOLATE_BAR);
        addToItemGroup(ModItemGroup.CHOCOLATE_FOODS, DARK_CHOCOLATE_BAR);
        addToItemGroup(ModItemGroup.CHOCOLATE_FOODS, GOLD_CHOCOLATE_BAR);
        addToItemGroup(ModItemGroup.CHOCOLATE_FOODS, ENCHANTED_GOLD_CHOCOLATE_BAR);
        addToItemGroup(ModItemGroup.CHOCOLATE_FOODS, BROWN_CHOCOLATE_BAR_BOWL);
        addToItemGroup(ModItemGroup.CHOCOLATE_FOODS, HOT_CHOCOLATE_BOWL);
        addToItemGroup(ModItemGroup.CHOCOLATE_FOODS, DRIED_COCOA_BEANS);





    }
    private static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));

    }
    public static void registerModItems(){
        SCME.LOGGER.debug("Registering Mod Items of" + SCME.MOD_ID);
        addItemsToItemGroup();
    }
}


