package com.meelock.theTimeParadoxMod;

import org.apache.logging.log4j.Logger;

import com.meelock.theTimeParadoxMod.init.TPMBlocks;
import com.meelock.theTimeParadoxMod.init.TPMItems;
import com.meelock.theTimeParadoxMod.proxy.theTimeParadoxModCommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

@Mod(modid = theTimeParadoxMod.MODID, version = theTimeParadoxMod.VERSION)
public class theTimeParadoxMod {
	public static final String MODID = "theTimeParadoxMod";
	public static final String VERSION = "PreAlpha[0.0.2]";

	@Instance("theTimeParadoxMod")
	public static theTimeParadoxMod instance;
	public static Logger log;

	@SidedProxy(clientSide = "com.meelock.theTimeParadoxMod.proxy.theTimeParadoxModClientProxy", serverSide = "com.meelock.theTimeParadoxMod.proxy.theTimeParadoxModCommonProxy")
	public static theTimeParadoxModCommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		log = event.getModLog();
		proxy.preinit();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(TPMBlocks.paradox, new ItemStack(TPMBlocks.stableparadox), 0.1f);
		GameRegistry.addShapelessRecipe(new ItemStack(TPMItems.paradoxchip,9), new ItemStack(TPMBlocks.stableparadox));
		
		
		ItemStack paradoxchipstack = new ItemStack(TPMItems.paradoxchip); 
		ItemStack diamondpickaxestack = new ItemStack(Items.diamond_pickaxe);

		GameRegistry.addRecipe(
			    new ItemStack(TPMItems.paradoxpickaxe),
			    "ppp",
			    "pdp",
			    "ppp",
			    'p', paradoxchipstack, 'd', diamondpickaxestack);
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		log.info("done!");
	}
}
