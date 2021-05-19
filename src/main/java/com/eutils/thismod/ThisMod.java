package com.eutils.thismod;

import com.eutils.thismod.registry.ModBlocks;
import com.eutils.thismod.registry.ModItems;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ThisMod implements ModInitializer {
	public static final String MODID = "eutils";
	
	public static final ItemGroup EMERALD_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MODID, "emerald_group"),
			() -> new ItemStack(ModItems.EMERALD_STICK));
	
	@Override
	public void onInitialize() {
		System.out.println("Emerald Utilities Mod is loading!");
		
		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}
}
