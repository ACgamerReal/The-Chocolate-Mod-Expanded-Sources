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
        registry.add(ModBlocks.THEOBROMA_FENCE, 300);
        registry.add(ModBlocks.THEOBROMA_FENCE_GATE, 300);
        registry.add(ModBlocks.THEOBROMA_SLAB, 150);
        registry.add(ModBlocks.THEOBROMA_STAIRS, 300);
        registry.add(ModBlocks.THEOBROMA_BUTTON, 100);
        registry.add(ModBlocks.STRIPPED_THEOBROMA_LOG, 300);
        registry.add(ModBlocks.STRIPPED_THEOBROMA_WOOD, 300);
        registry.add(ModBlocks.THEOBROMA_LOG, 300);
        registry.add(ModBlocks.THEOBROMA_WOOD, 300);

        registry.add(ModBlocks.THEOBROMA_LEAVES, 50);
        registry.add(ModBlocks.THEOBROMA_SAPLING, 100);

    }
}


