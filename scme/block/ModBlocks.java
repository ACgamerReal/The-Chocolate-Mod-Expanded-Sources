package net.scme.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.scme.SCME;
import net.scme.block.custom.CakeBlockClassExtended;
import net.scme.block.custom.CustomButtonBlock;
import net.scme.block.custom.ModStairsBlock;
import net.scme.item.ModItemGroup;
import net.scme.world.tree.TheobromaSaplingGenerator;

public class ModBlocks {


    public static final Block CHOCOLATE_CAKE = registerBlock("chocolate_cake",
            new CakeBlockClassExtended(FabricBlockSettings.copyOf(Blocks.CAKE)), ModItemGroup.CHOCOLATE_MOD);
    public static final Block CHOCOLATERIE_TABLE = registerBlock("chocolaterie_table",
            new Block(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)), ModItemGroup.CHOCOLATE_MOD);

    public static final Block THEOBROMA_LOG = registerBlock("theobroma_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG).strength(2f,2f)), ModItemGroup.CHOCOLATE_MOD);
    public static final Block THEOBROMA_WOOD = registerBlock("theobroma_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_WOOD).strength(2f, 2f)), ModItemGroup.CHOCOLATE_MOD);
    public static final Block STRIPPED_THEOBROMA_LOG = registerBlock("stripped_theobroma_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_LOG).strength(2f ,2f)), ModItemGroup.CHOCOLATE_MOD);
    public static final Block STRIPPED_THEOBROMA_WOOD = registerBlock("stripped_theobroma_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_WOOD).strength(2f, 2f)), ModItemGroup.CHOCOLATE_MOD);
    public static final Block THEOBROMA_PLANKS = registerBlock("theobroma_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS).strength(2f, 3f)), ModItemGroup.CHOCOLATE_MOD);
    public static final Block THEOBROMA_STAIRS = registerBlock("theobroma_stairs",
            new ModStairsBlock(ModBlocks.THEOBROMA_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.ACACIA_STAIRS).strength(2f , 3f)), ModItemGroup.CHOCOLATE_MOD);
    public static final Block THEOBROMA_SLAB = registerBlock("theobroma_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_SLAB).strength(2f,3f)), ModItemGroup.CHOCOLATE_MOD);
    public static final Block THEOBROMA_FENCE = registerBlock("theobroma_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_FENCE).strength(2f, 3f)), ModItemGroup.CHOCOLATE_MOD);
    public static final Block THEOBROMA_FENCE_GATE = registerBlock("theobroma_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_FENCE).strength(2f,3f), WoodType.ACACIA), ModItemGroup.CHOCOLATE_MOD);

    public static final Block THEOBROMA_DOOR = registerBlock("theobroma_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).strength(3f ,3f).sounds(BlockSoundGroup.CHERRY_WOOD),BlockSetType.ACACIA), ModItemGroup.CHOCOLATE_MOD);

    public static final Block THEOBROMA_TRAPDOOR = registerBlock("theobroma_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_TRAPDOOR).strength(3f,3f).sounds(BlockSoundGroup.CHERRY_WOOD),BlockSetType.ACACIA), ModItemGroup.CHOCOLATE_MOD);

    public static final Block THEOBROMA_PRESSURE_PLATE = registerBlock("theobroma_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.ACACIA_PRESSURE_PLATE).strength(0.5f,0.5f), BlockSetType.ACACIA), ModItemGroup.CHOCOLATE_MOD);

    public static final Block THEOBROMA_BUTTON = registerBlock("theobroma_button",
            new CustomButtonBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_BUTTON).strength(0.5f, 0.5f), BlockSetType.ACACIA, 20, true), ModItemGroup.CHOCOLATE_MOD);



    public static final Block THEOBROMA_LEAVES = registerBlock("theobroma_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LEAVES)), ModItemGroup.CHOCOLATE_MOD);
    public static final Block THEOBROMA_SAPLING = registerBlock("theobroma_sapling",
            new SaplingBlock(new TheobromaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.ACACIA_SAPLING)), ModItemGroup.CHOCOLATE_MOD);









    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(SCME.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(SCME.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    private static void addToItemGroup(RegistryKey<ItemGroup> group, Block block){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(block));


    }
    public static void addItemsToItemGroup(){

        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, CHOCOLATERIE_TABLE );
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, CHOCOLATE_CAKE );


        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, THEOBROMA_LOG );
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, THEOBROMA_WOOD);
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, STRIPPED_THEOBROMA_LOG);
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, STRIPPED_THEOBROMA_WOOD );
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, THEOBROMA_PLANKS );
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, THEOBROMA_STAIRS);
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, THEOBROMA_SLAB );
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, THEOBROMA_FENCE );
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, THEOBROMA_FENCE_GATE );
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, THEOBROMA_DOOR );
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, THEOBROMA_TRAPDOOR );
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, THEOBROMA_BUTTON );
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, THEOBROMA_LEAVES );
        addToItemGroup(ModItemGroup.CHOCOLATE_MOD, THEOBROMA_SAPLING);


    }
    private static void addToItemGroup(RegistryKey<ItemGroup> group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));

    }

    public static void registerModBlocks() {
        SCME.LOGGER.info("registering Mod Blocks for " + SCME.MOD_ID);
        addItemsToItemGroup();
    }




}

