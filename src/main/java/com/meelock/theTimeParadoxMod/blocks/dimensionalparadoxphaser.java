package com.meelock.theTimeParadoxMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class dimensionalparadoxphaser extends Block{

	public dimensionalparadoxphaser(Material par2materal) {
		super(par2materal);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(50F);
		this.setResistance(50F);
		this.setHarvestLevel("pickaxe", 4);
		this.setStepSound(soundTypeMetal);
	}
	

}
