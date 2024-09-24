package com.hyker.herobrinebrother;

import com.hyker.herobrinebrother.block.ModBlocks;
import com.hyker.herobrinebrother.item.ModItemGroups;
import com.hyker.herobrinebrother.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HerobrineBrother implements ModInitializer {
	public static final String MOD_ID = "herobrinebrother";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}