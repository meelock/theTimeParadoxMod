package com.meelock.theTimeParadoxMod.init;

import com.meelock.theTimeParadoxMod.blocks.dimensionalparadoxphaser;
import com.meelock.theTimeParadoxMod.blocks.hardenedparadox;
import com.meelock.theTimeParadoxMod.blocks.paradox;
import com.meelock.theTimeParadoxMod.blocks.stableparadox;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TPMBlocks {
	public static Block paradox;
	public static Block stableparadox;
	public static Block hardendparadox;
	public static Block dimensionalparadoxphaser;

	public static void init() {
		paradox = new paradox(Material.rock).setBlockName("paradox").setCreativeTab(CreativeTabs.tabBlock)
				.setBlockTextureName("theTimeParadoxMod:paradox");
		GameRegistry.registerBlock(paradox, "paradox");
		stableparadox = new stableparadox(Material.rock).setBlockName("stableparadox").setCreativeTab(CreativeTabs.tabBlock)
				.setBlockTextureName("theTimeParadoxMod:stableparadox");
		GameRegistry.registerBlock(stableparadox, "stableparadox");
		hardendparadox = new hardenedparadox("hardenedparadox", Material.rock, TPMItems.phasedparadoxshard, 1, 7).setBlockName("hardenedparadox").setCreativeTab(CreativeTabs.tabBlock)
				.setBlockTextureName("theTimeParadoxMod:hardenedparadox");
		GameRegistry.registerBlock(hardendparadox, "hardenedparadox");
		dimensionalparadoxphaser = new dimensionalparadoxphaser(Material.rock).setBlockName("dimensionalparadoxphaser").setCreativeTab(CreativeTabs.tabBlock)
				.setBlockTextureName("theTimeParadoxMod:dimensionalparadoxphaser");
		GameRegistry.registerBlock(dimensionalparadoxphaser, "dimensionalparadoxphaser");
	}
}
