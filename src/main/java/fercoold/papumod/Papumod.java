package fercoold.papumod;

import fercoold.papumod.block.ModBlocks;
import fercoold.papumod.item.ModItemGroups;
import fercoold.papumod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Papumod implements ModInitializer {
	public static final String MOD_ID = "papumod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}