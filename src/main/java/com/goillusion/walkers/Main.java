package com.goillusion.walkers;

import org.apache.logging.log4j.Logger;

import com.goillusion.walkers.client.proxy.CommonProxy;
import com.goillusion.walkers.client.tabs.MainArmors;
import com.goillusion.walkers.client.tabs.MainBlocks;
import com.goillusion.walkers.client.tabs.MainItems;
import com.goillusion.walkers.client.tabs.MainTab;
import com.goillusion.walkers.client.tabs.MainTools;
import com.goillusion.walkers.client.tabs.MainWeapons;
import com.goillusion.walkers.util.Reference;
import com.goillusion.walkers.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class Main {
	
	public static final CreativeTabs MAIN_TAB = new MainTab("mainTab");
	public static final CreativeTabs MAIN_BLOCKS = new MainBlocks("mainBlocks");
	public static final CreativeTabs MAIN_ITEMS = new MainItems("mainItems");
	public static final CreativeTabs MAIN_TOOLS = new MainTools("mainTools");
	public static final CreativeTabs MAIN_ARMORS = new MainArmors("mainArmors");
	public static final CreativeTabs MAIN_WEAPONS = new MainWeapons("mainWeapons");
	
	@Instance
	public static Main instance;

    private static Logger logger;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit();
        RegistryHandler.preInitRegistries();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init();
        RegistryHandler.initRegistries();
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
      proxy.postInit(); 
      RegistryHandler.postInitRegistries();
    }
}
