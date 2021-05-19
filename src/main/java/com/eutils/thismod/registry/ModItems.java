package com.eutils.thismod.registry;

import com.eutils.thismod.ThisMod;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems{
	
	//BASIC ITEMS
	public static final Item EMERALD_STICK = new Item(new Item.Settings().group(ThisMod.EMERALD_GROUP));
	
	//FOOD ITEMS
	public static final Item EMERALD_APPLE = new Item(new Item.Settings().group(ThisMod.EMERALD_GROUP).food(EmeraldFoodComponents.EMERALD_APPLE));
	
	//ITEMS BLOCKS
	public static final BlockItem COMPRESSED_EMERALD_BLOCK = new BlockItem(ModBlocks.COMPRESSED_EMERALD_BLOCK, new Item.Settings().group(ThisMod.EMERALD_GROUP));
	
	public static void registerItems() {
		//BASIC ITEM REGISTERING
		Registry.register(Registry.ITEM, new Identifier(ThisMod.MODID, "emerald_stick"), EMERALD_STICK);
		//FOOD ITEM REGISTERING
		Registry.register(Registry.ITEM, new Identifier(ThisMod.MODID, "emerald_apple"), EMERALD_APPLE);
		//ITEMS BLOCKS REGISTERING
		Registry.register(Registry.ITEM, new Identifier(ThisMod.MODID, "compressed_emerald_block"), COMPRESSED_EMERALD_BLOCK);
	}
}
