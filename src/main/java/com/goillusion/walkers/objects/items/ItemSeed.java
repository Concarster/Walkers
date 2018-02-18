package com.goillusion.walkers.objects.items;

import com.goillusion.walkers.Main;
import com.goillusion.walkers.init.ItemInit;
import com.goillusion.walkers.util.interfaces.IHasModel;

import net.minecraft.item.Item;
//import net.minecraft.item.ItemSeeds;

public class ItemSeed extends Item implements IHasModel{
	
	public ItemSeed(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MAIN_ITEMS);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
	

}
