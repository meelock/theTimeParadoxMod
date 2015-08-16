package com.meelock.theTimeParadoxMod.blocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class paradoxpickaxe extends ItemPickaxe{

	public paradoxpickaxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("paradoxpickaxe");
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName("theTimeParadoxMod:paradoxpickaxe");
	}

}
