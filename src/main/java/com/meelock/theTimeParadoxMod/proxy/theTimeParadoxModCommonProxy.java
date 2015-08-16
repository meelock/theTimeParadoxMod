package com.meelock.theTimeParadoxMod.proxy;

import com.meelock.theTimeParadoxMod.init.TPMBlocks;
import com.meelock.theTimeParadoxMod.init.TPMItems;
import com.meelock.theTimeParadoxMod.worldgen.Worldgen;

import cpw.mods.fml.common.registry.GameRegistry;

public class theTimeParadoxModCommonProxy {
	public void preinit(){
		GameRegistry.registerWorldGenerator(new Worldgen(), 0);
		TPMBlocks.init();
		TPMItems.init();
	}
}
