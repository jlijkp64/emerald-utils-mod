package com.eutils.thismod.registry;

import com.eutils.thismod.ThisMod;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
	
	public static final Block COMPRESSED_EMERALD_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(6.0F, 7.0F).sounds(BlockSoundGroup.METAL));

	public static void registerBlocks() {
		Registry.register(Registry.BLOCK, new Identifier(ThisMod.MODID, "compressed_emerald_block"), COMPRESSED_EMERALD_BLOCK);
	}
}
