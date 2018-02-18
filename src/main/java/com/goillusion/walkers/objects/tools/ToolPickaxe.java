package com.goillusion.walkers.objects.tools;

import com.goillusion.walkers.Main;
import com.goillusion.walkers.init.ItemInit;
import com.goillusion.walkers.util.interfaces.IHasModel;

import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {

	
	
	public ToolPickaxe(String name, ToolMaterial material) {
	
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MAIN_TOOLS);
		
		ItemInit.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

	

}

