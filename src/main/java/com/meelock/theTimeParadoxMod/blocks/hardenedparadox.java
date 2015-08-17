package com.meelock.theTimeParadoxMod.blocks;

import java.util.ArrayList;
import java.util.Random;

import com.meelock.theTimeParadoxMod.init.TPMItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class hardenedparadox extends Block {
	
	private Item drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;
	
	public hardenedparadox(String unlocalizedName, Material par2Material, Item drop, int meta, int least_quantity, int most_quantity) {
		super(par2Material);
	    this.drop = drop;
	    this.meta = meta;
	    this.least_quantity = least_quantity;
	    this.most_quantity = most_quantity;
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(50F);
		this.setResistance(50F);
		this.setHarvestLevel("pickaxe", 4);
		this.setStepSound(soundTypeMetal);
	}
	
	public hardenedparadox(String unlocalizedName, Material mat, Item drop, int least_quantity, int most_quantity) {
	    this(unlocalizedName, mat, drop, 0, least_quantity, most_quantity);
	}

	protected hardenedparadox(String unlocalizedName, Material mat, Item drop) {
	    this(unlocalizedName, mat, drop, 1, 1);
	}
	
	@Override
	public Item getItemDropped(int meta, Random random, int fortune) {
	    return this.drop;
	}

	@Override
	public int damageDropped(int metadata) {
	    return this.meta;
	}

	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
	    if (this.least_quantity >= this.most_quantity)
	        return this.least_quantity;
	    return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
	}

}
