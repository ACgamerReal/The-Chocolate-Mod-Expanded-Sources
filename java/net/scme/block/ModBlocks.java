package net.scme.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.scme.SCME;
import net.scme.block.custom.CakeBlockClassExtended;
import net.scme.item.ModItemGroup;

public class ModBlocks {

    public static final Block CHOCOLATERIE_TABLE = registerBlock("chocolaterie_table",
            new Block(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).requiresTool()), ModItemGroup.CHOCOLATE_BLOCKS);
    public static final Block CHOCOLATE_CAKE = registerBlock("chocolate_cake",
            new CakeBlockClassExtended(FabricBlockSettings.copyOf(Blocks.CAKE)), ModItemGroup.CHOCOLATE_FOODS);





    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(SCME.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(SCME.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    private static void addToItemGroup(ItemGroup group, Block block){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(block));


    }
    public static void addItemsToItemGroup(){



        addToItemGroup(ModItemGroup.CHOCOLATE, CHOCOLATE_CAKE );
        addToItemGroup(ModItemGroup.CHOCOLATE, CHOCOLATERIE_TABLE );





    }
    private static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));

    }

    public static void registerModBlocks() {
        SCME.LOGGER.info("registering Mod Blocks for " + SCME.MOD_ID);
        addItemsToItemGroup();
    }




}

