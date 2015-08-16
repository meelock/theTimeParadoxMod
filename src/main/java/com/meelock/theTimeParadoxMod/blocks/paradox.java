package com.meelock.theTimeParadoxMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class paradox extends Block {


	public paradox(Material par2Material) {
		super(par2Material);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(50F);
		this.setResistance(50F);
		this.setHarvestLevel("pickaxe",3);
		this.setStepSound(soundTypeMetal);
	}
}
