package net.scme.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.scme.SCME;
import net.scme.block.ModBlocks;

public class ModItemGroup {

 public static final RegistryKey<ItemGroup> CHOCOLATE_MOD = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(SCME.MOD_ID, "chocolate_mod"));



    public static void registerItemGroups() {

        Registry.register(Registries.ITEM_GROUP, CHOCOLATE_MOD, FabricItemGroup.builder()
                       .icon(() -> new ItemStack(ModItems.BROWN_CHOCOLATE_BAR))
                       .displayName(Text.literal("The Chocolate Mod"))
                       .build());
         }





    }




