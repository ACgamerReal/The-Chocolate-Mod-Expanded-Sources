package net.scme.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.scme.SCME;
import net.scme.block.ModBlocks;

public class ModItemGroup {
    public static ItemGroup CHOCOLATE;
    public static ItemGroup CHOCOLATE_FOODS;
    public static ItemGroup CHOCOLATE_BLOCKS;
    public static void registerItemGroups() {

        CHOCOLATE = FabricItemGroup.builder(new Identifier(SCME.MOD_ID, "chocolate"))
                .displayName(Text.literal("The Chocolate Mod Expanded"))
                .icon(() -> new ItemStack(ModItems.GOLD_CHOCOLATE_BAR)).build();


            CHOCOLATE_FOODS = FabricItemGroup.builder(new Identifier(SCME.MOD_ID, "chocolate_foods"))
                    .displayName(Text.literal("Foods"))
                    .icon(() -> new ItemStack(ModItems.BROWN_CHOCOLATE_BAR)).build();


        CHOCOLATE_BLOCKS = FabricItemGroup.builder(new Identifier(SCME.MOD_ID, "chocolate_blocks"))
                .displayName(Text.literal("Blocks"))
                .icon(() -> new ItemStack(ModBlocks.CHOCOLATERIE_TABLE)).build();

        }
    }



