package net.scme.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.scme.SCME;
import net.scme.block.ModBlocks;

public class ModRegistries {
    public static void registerModUtils(){
        registerModFuels();

    }

    private static void registerModFuels(){
        SCME.LOGGER.info("Registering Mod Fuels for " + SCME.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModBlocks.CHOCOLATERIE_TABLE, 300);
    }
}


