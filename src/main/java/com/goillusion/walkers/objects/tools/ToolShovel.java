package com.goillusion.walkers.objects.tools;

import com.goillusion.walkers.Main;
import com.goillusion.walkers.init.ItemInit;
import com.goillusion.walkers.util.interfaces.IHasModel;

import net.minecraft.item.ItemSpade;

public class ToolShovel extends ItemSpade implements IHasModel
{
	public ToolShovel(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MAIN_TOOLS);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
