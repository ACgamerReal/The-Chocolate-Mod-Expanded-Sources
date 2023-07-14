package net.scme.block.custom;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.scme.block.ModBlocks;

public class CustomFlammableBlocks {

    public static void registerFlammableBlock(){
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.THEOBROMA_LEAVES, 30, 50);
        registry.add(ModBlocks.THEOBROMA_PLANKS, 5, 20);
        registry.add(ModBlocks.THEOBROMA_LOG, 5, 20);
        registry.add(ModBlocks.THEOBROMA_WOOD, 5, 20);
        registry.add(ModBlocks.STRIPPED_THEOBROMA_LOG, 5, 20);
        registry.add(ModBlocks.STRIPPED_THEOBROMA_WOOD, 5, 20);


    }
}
