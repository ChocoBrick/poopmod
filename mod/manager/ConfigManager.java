package com.poopmod.mod.manager;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigManager {
	
    static String WordPoop = "Poop";
    static Boolean isVulgar;
	
    public static int toiletId;
	public static int BlockPoopId;
	public static int BlockPoopCleanId;
	public static int BlockBirdPoopId;
	public static int BlockBirdPoopCleanId;
	public static int BlockManureId;
	public static int BlockManureCleanId;
	public static int UltimatePoopBlockId;
    
    //poop items
	public static int PoopId;
	public static int CleanPoopId;
	public static int PoopballId;
	public static int BirdPoopId;
	public static int CleanBirdPoopId;
	public static int ManureId;
	public static int CleanManureId;
	public static int UltimatePoopIngotId;
    
    //tools
	public static int shovelPoopId;
	public static int pickaxePoopId;
	public static int axePoopId;
	public static int swordPoopId;
	public static int hoePoopId;
    
	public static int shovelBirdPoopId;
	public static int pickaxeBirdPoopId;
    public static int axeBirdPoopId;
    public static int swordBirdPoopId;
    public static int hoeBirdPoopId;
    
    public static int shovelManureId;
    public static int pickaxeManureId;
    public static int axeManureId;
    public static int swordManureId;
    public static int hoeManureId;
    
    public static int shovelUltimateId;
    public static int pickaxeUltimateId;
    public static int axeUltimateId;
    public static int swordUltimateId;
    public static int hoeUltimateId;
    
    //armor
    public static int helmetPoopId;
    public static int platePoopId;
    public static int legsPoopId;
    public static int bootsPoopId;
    
    public static int helmetBirdPoopId;
    public static int plateBirdPoopId;
    public static int legsBirdPoopId;
    public static int bootsBirdPoopId;
    
    public static int helmetManureId;
    public static int plateManureId;
    public static int legsManureId;
    public static int bootsManureId;
    
    public static int helmetUltimateId;
    public static int plateUltimateId;
    public static int legsUltimateId;
    public static int bootsUltimateId;
	
	public static void addConfigFile(){

		FMLPreInitializationEvent event = new FMLPreInitializationEvent();
		
		Configuration configFile = new Configuration(event.getSuggestedConfigurationFile());

    	configFile.load();
    	
    	 isVulgar = configFile.get(Configuration.CATEGORY_GENERAL, "Use vulgar language?", false).getBoolean(false);

    	//blocks
         toiletId = configFile.get("Block", "Toilet Block", 2460).getInt();
         BlockPoopId = configFile.get("Block", "Poop Block", 2461).getInt();
         BlockPoopCleanId = configFile.get("Block", "'Sanitized' Poop Block", 2462).getInt();
         BlockBirdPoopId = configFile.get("Block", "Bird Poop Block", 2463).getInt();
         BlockBirdPoopCleanId = configFile.get("Block", "'Sanitized' Bird Poop Block", 2464).getInt();
         BlockManureId = configFile.get("Block", "Manure Block", 2465).getInt();
         BlockManureCleanId = configFile.get("Block", "'Sanitized' Manure Block", 2466).getInt();
         UltimatePoopBlockId = configFile.get("Block", "Ultimate Poop Block", 2467).getInt();
        
        //poop items
         PoopId = configFile.get("Item", "Poop", 5000).getInt();
         CleanPoopId = configFile.get("Item","'Sanitized' Poop", 5001).getInt();
         PoopballId = configFile.get("Item","Poopball", 5002).getInt();
         BirdPoopId = configFile.get("Item","Bird Poop", 5003).getInt();
         CleanBirdPoopId = configFile.get("Item","Sanitized Bird Poop", 5004).getInt();
         ManureId = configFile.get("Item","Manure", 5005).getInt();
         CleanManureId = configFile.get("Item","Sanitized Manure", 5006).getInt();
         UltimatePoopIngotId = configFile.get("Item","Ultimate Poop Ingot", 5007).getInt();
        
        //tools
         shovelPoopId = configFile.get("Tool", "Poop Shovel", 5020).getInt();
         pickaxePoopId = configFile.get("Tool","Poop Pickaxe", 5021).getInt();
         axePoopId = configFile.get("Tool","Poop Axe", 5022).getInt();
         swordPoopId = configFile.get("Tool","Poop Sword", 5023).getInt();
         hoePoopId = configFile.get("Tool","Poop Hoe", 5024).getInt();
        
         shovelBirdPoopId = configFile.get("Tool","Bird Poop Shovel", 5025).getInt();
         pickaxeBirdPoopId = configFile.get("Tool","Bird Poop Pickaxe", 5026).getInt();
         axeBirdPoopId = configFile.get("Tool","Bird Poop Axe", 5027).getInt();
         swordBirdPoopId = configFile.get("Tool","Bird Poop Sword", 5028).getInt();
         hoeBirdPoopId = configFile.get("Tool","Bird Poop Hoe", 5029).getInt();
        
         shovelManureId = configFile.get("Tool","Manure Shovel", 5030).getInt();
         pickaxeManureId = configFile.get("Tool","Manure Pickaxe", 5031).getInt();
         axeManureId = configFile.get("Tool","Manure Axe", 5032).getInt();
         swordManureId = configFile.get("Tool","Manure Sword", 5033).getInt();
         hoeManureId = configFile.get("Tool","Manure Hoe", 5034).getInt();
        
         shovelUltimateId = configFile.get("Tool","Ultimate Poop Shovel", 5035).getInt();
         pickaxeUltimateId = configFile.get("Tool","Ultimate Poop Pickaxe", 5036).getInt();
         axeUltimateId = configFile.get("Tool","Ultimate Poop Axe", 5037).getInt();
         swordUltimateId = configFile.get("Tool","Ultimate Poop Sword", 5038).getInt();
         hoeUltimateId = configFile.get("Tool","Ultimate Poop Hoe", 5039).getInt();
        
        //armor
         helmetPoopId = configFile.get("Armor","Poop Helmet", 5045).getInt();
         platePoopId = configFile.get("Armor","Poop Plate", 5046).getInt();
         legsPoopId = configFile.get("Armor","Poop Leggings", 5047).getInt();
         bootsPoopId = configFile.get("Armor","Poop Boots", 5048).getInt();
        
         helmetBirdPoopId = configFile.get("Armor","Bird Poop Helmet", 5049).getInt();
         plateBirdPoopId = configFile.get("Armor","Bird Poop Plate", 5050).getInt();
         legsBirdPoopId = configFile.get("Armor","Bird Poop Leggings", 5051).getInt();
         bootsBirdPoopId = configFile.get("Armor","Bird Poop Boots", 5052).getInt();
        
         helmetManureId = configFile.get("Armor","Manure Helmet", 5053).getInt();
         plateManureId = configFile.get("Armor","Manure Plate", 5054).getInt();
         legsManureId = configFile.get("Armor","Manure Leggings", 5055).getInt();
         bootsManureId = configFile.get("Armor","Manure Boots", 5056).getInt();
        
         helmetUltimateId = configFile.get("Armor","Ultimate Poop Helmet", 5057).getInt();
         plateUltimateId = configFile.get("Armor","Ultimate Poop Plate", 5058).getInt();
         legsUltimateId = configFile.get("Armor","Ultimate Poop Leggings", 5059).getInt();
         bootsUltimateId = configFile.get("Armor","Ultimate Poop Boots", 5060).getInt();

        configFile.save();
        
        if(isVulgar == true){
        	WordPoop = "Shit";	
        }
	}

}
