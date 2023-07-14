package net.scme.block.custom;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.scme.block.ModBlocks;

public class StrippableBlocksCustom {

    public static void registerStrippableBlock() {
        StrippableBlockRegistry.register( ModBlocks.THEOBROMA_LOG, ModBlocks.STRIPPED_THEOBROMA_LOG);
        StrippableBlockRegistry.register( ModBlocks.THEOBROMA_WOOD, ModBlocks.STRIPPED_THEOBROMA_WOOD);


    }
}
