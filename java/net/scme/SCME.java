package net.scme;

import net.fabricmc.api.ModInitializer;

import net.scme.block.ModBlocks;
import net.scme.item.ModItemGroup;
import net.scme.item.ModItems;
import net.scme.util.ModRegistries;
import net.scme.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SCME implements ModInitializer {
    public static final String MOD_ID = "scme";

    public static final Logger LOGGER = LoggerFactory.getLogger("simplechocolatemodexpanded");

    @Override
    public void onInitialize() {

        ModItemGroup.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModVillagers.registerVillagers();
        ModVillagers.registerTrades();
        ModRegistries.registerModUtils();

        LOGGER.info("Hello Fabric world!");
    }
}