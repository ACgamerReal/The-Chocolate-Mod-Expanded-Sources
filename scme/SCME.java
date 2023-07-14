package net.scme;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.scme.block.ModBlocks;
import net.scme.block.custom.CustomFlammableBlocks;
import net.scme.block.custom.StrippableBlocksCustom;
import net.scme.item.ModItemGroup;
import net.scme.item.ModItems;
import net.scme.sound.ModSounds;
import net.scme.util.ModLootTableModifiers;
import net.scme.util.ModRegistries;
import net.scme.villager.ModVillagers;
import net.scme.world.gen.ModTreeGeneration;
import net.scme.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SCME implements ModInitializer {



    public static final Logger LOGGER = LoggerFactory.getLogger("scme");
    public static final String MOD_ID = "scme";



    @Override
    public void onInitialize() {







        ModItems.registerModItems();
        ModItemGroup.registerItemGroups();
        ModBlocks.registerModBlocks();


        ModWorldGeneration.generateModWorldGeneration();


        ModVillagers.registerVillagers();
        ModVillagers.registerTrades();
        ModRegistries.registerModUtils();
        ModLootTableModifiers.modifyLootTables();
        CustomFlammableBlocks.registerFlammableBlock();
        StrippableBlocksCustom.registerStrippableBlock();



        FlammableBlockRegistry.getDefaultInstance();




}



    }
