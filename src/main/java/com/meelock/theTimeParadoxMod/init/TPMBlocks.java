package com.meelock.theTimeParadoxMod.init;

import com.meelock.theTimeParadoxMod.blocks.hardendparadox;
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

	public static void init() {
		paradox = new paradox(Material.rock).setBlockName("paradox").setCreativeTab(CreativeTabs.tabBlock)
				.setBlockTextureName("theTimeParadoxMod:paradox");
		GameRegistry.registerBlock(paradox, "paradox");
		stableparadox = new stableparadox(Material.rock).setBlockName("stableparadox").setCreativeTab(CreativeTabs.tabBlock)
				.setBlockTextureName("theTimeParadoxMod:stableparadox");
		GameRegistry.registerBlock(stableparadox, "stableparadox");
		hardendparadox = new hardendparadox(Material.rock).setBlockName("hardendparadox").setCreativeTab(CreativeTabs.tabBlock)
				.setBlockTextureName("theTimeParadoxMod:hardendparadox");
		GameRegistry.registerBlock(hardendparadox, "hardendparadox");
	}
}
