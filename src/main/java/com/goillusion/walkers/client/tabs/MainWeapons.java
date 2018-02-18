package com.goillusion.walkers.client.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class MainWeapons extends CreativeTabs {

	public MainWeapons(String label) {
		super("mainWeapons");
		this.setBackgroundImageName("items.png");
	}
	
	public ItemStack getTabIconItem(){
		return new ItemStack(Items.DIAMOND_SWORD);
		
	}
	
}
