package com.meelock.theTimeParadoxMod.init;

import com.meelock.theTimeParadoxMod.blocks.paradoxpickaxe;
import com.meelock.theTimeParadoxMod.items.Paradoxchip;
import com.meelock.theTimeParadoxMod.items.Phasedparadoxshard;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class TPMItems {
	public static Item paradoxchip;
	public static Item paradoxpickaxe;
	public static Item phasedparadoxshard;
	public static ToolMaterial PARADOX = EnumHelper.addToolMaterial("paradox", 4, 1811, 8.0F, 3.0F, 20);
	
	public static void init(){
		paradoxchip = new Paradoxchip().setUnlocalizedName("paradoxchip").setCreativeTab(CreativeTabs.tabMaterials)
				.setTextureName("theTimeParadoxMod:paradoxchip");
		phasedparadoxshard = new Phasedparadoxshard().setUnlocalizedName("phasedparadoxshard").setCreativeTab(CreativeTabs.tabMaterials)
				.setTextureName("theTimeParadoxMod:phasedparadoxshard");
		GameRegistry.registerItem(paradoxchip, "paradoxchip");
		GameRegistry.registerItem(paradoxpickaxe = new paradoxpickaxe("paradoxpickaxe", PARADOX), "paradoxpickaxe");
		GameRegistry.registerItem(phasedparadoxshard, "phasedparadoxshard");
	}
}
