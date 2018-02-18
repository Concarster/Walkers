package com.goillusion.walkers.util;

public class Reference {
	
	// Mod Constants
	
    public static final String MOD_ID = "walkers";
    public static final String MOD_NAME = "Walkers";
    public static final String MOD_VERSION = "1.12.2-1.0.2";
    public static final String MOD_DIR = MOD_ID;
    public static final String BUILD = "GRADLE:BUILD";
	public static final String VERSION = "GRADLE:VERSION-" + BUILD;
 
    // Gen Constants  
    public static final String URL = "http://www.goillusion.com";
	public static final String APDATEURL = "";
	public static final String COPYRYGHT = "GAME OF ILLUSION";
    
    // Common Constants
	
	public static final String CLIENT_PROXY_CLASS = "com.goillusion." + MOD_DIR + ".client.proxy.ClientProxy";
	public static final String COMMON_PROXY_CLASS = "com.goillusion." + MOD_DIR + ".client.proxy.CommonProxy";
	public static final String SERVER_PROXY_CLASS = "com.goillusion." + MOD_DIR + ".server.proxy.ServerProxy";
	
    // UI Constants
	public static final String PREFIX_MOD = MOD_ID+":";
	public static final String GUI_CONFIG_FACTORY = PREFIX_MOD + "config/GuiConfigFactory";
    public static final String PREFIX_GUI = PREFIX_MOD + "textures/gui/";

    // Dependencies
    
    public static final String DEPENDENCIES = "";
	public static final String RESOURCE_PREFIX = MOD_ID + ":";
	
}

