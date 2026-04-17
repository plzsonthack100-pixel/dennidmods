package net.dennid.dennidmod;

import net.dennid.dennidmod.block.ModBlocks;
import net.dennid.dennidmod.item.ItemGroups;
import net.dennid.dennidmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DennidMods implements ModInitializer {
	public static final String MOD_ID = "dennidmods";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.register();
        ModBlocks.RMB();
        ItemGroups.RegisterItemGroup();

	}
}