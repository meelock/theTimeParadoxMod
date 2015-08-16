package com.meelock.theTimeParadoxMod.blocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class stableparadox extends Block {
	public stableparadox(Material par2Material) {
		super(par2Material);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(50F);
		this.setResistance(50F);
		this.setHarvestLevel("pickaxe",3);
		this.setStepSound(soundTypeMetal);
	}
}
