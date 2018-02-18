package com.goillusion.walkers.objects.items;

import com.goillusion.walkers.Main;
import com.goillusion.walkers.init.ItemInit;
import com.goillusion.walkers.util.interfaces.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	
	public ItemBase(String name) {
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

