package com.eutils.thismod;

import com.eutils.thismod.registry.ModBlocks;
import com.eutils.thismod.registry.ModItems;

import net.fabricmc.api.ModInitializer;

public class ThisMod implements ModInitializer {
	public static final String MODID = "eutils";
	
	@Override
	public void onInitialize() {
		System.out.println("Emerald Utilities Mod is loading!");
		
		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}
}
