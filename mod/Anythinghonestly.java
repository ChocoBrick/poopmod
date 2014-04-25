package com.poopmod.mod;

import java.util.Map;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.*;
import net.minecraft.entity.Entity;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.common.Configuration;

@Mod(modid="KrebsModID", name="PoopCraft", version="1.0.0")
@NetworkMod(clientSideRequired=true)
public class Anythinghonestly {
        @Instance(value = "KrebsModID")
        public static Anythinghonestly instance;

        @SidedProxy(clientSide="com.krebs.mod.ClientProxy", serverSide="com.krebs.mod.CommonProxy")
        public static CommonProxy proxy;

        public static CreativeTabs tabkrebs = new CreativeTabs("tabkrebs") {
            public ItemStack getIconItemStack() {
                    return new ItemStack(PoopItem, 1, 0);
            }
    };
    
    //hurray alex is on!
    //Ult_
    
    String WordPoop = "Poop";
    Boolean isVulgar;

    static Item PoopItem;
    static Item CleanPoopItem;
    static Item ItemBirdPoop;
    static Item ItemBirdPoopClean;
    static Item ItemManure;
    static Item ItemManureClean;
    static Item ItemPoopball;
    static Item UltimatePoopIngot;
    
//tools
    //poop tools
    static Item shovelPoop;
    static Item pickaxePoop;
    static Item axePoop;
    static Item swordPoop; 
    static Item hoePoop;
    
    //bird poop tools
    static Item shovelBirdPoop;
    static Item pickaxeBirdPoop;
    static Item axeBirdPoop;
    static Item swordBirdPoop; 
    static Item hoeBirdPoop;
    
    //cow poop tools
    static Item shovelManure;
    static Item pickaxeManure;
    static Item axeManure;
    static Item swordManure; 
    static Item hoeManure;
    
    static Item shovelUltimate;
    static Item pickaxeUltimate;
    static Item axeUltimate;
    static Item swordUltimate; 
    static Item hoeUltimate;
    
//armor
    //poop
    static Item helmetPoop;
    static Item platePoop;
    static Item legsPoop;
    static Item bootsPoop;
    
    //bird
    static Item helmetBirdPoop;
    static Item plateBirdPoop;
    static Item legsBirdPoop;
    static Item bootsBirdPoop;
    
    //cow
    static Item helmetManure;
    static Item plateManure;
    static Item legsManure;
    static Item bootsManure;
    
    //ult
    static Item helmetUltimate;
    static Item plateUltimate;
    static Item legsUltimate;
    static Item bootsUltimate;
    
    static Entity EntityPoopball;
    
    static EnumToolMaterial toolPoop;
    static EnumArmorMaterial armorPoop;
    static EnumToolMaterial toolBirdPoop;
    static EnumArmorMaterial armorBirdPoop;
    static EnumToolMaterial toolManurePoop;
    static EnumArmorMaterial armorManurePoop;
    static EnumToolMaterial toolUltimatePoop;
    static EnumArmorMaterial armorUltimatePoop;
    
    static Block toilet;
    static Block BlockPoop;
    static Block BlockPoopClean;
    static Block BlockBirdPoop;
    static Block BlockBirdPoopClean;
    static Block BlockManure;
    static Block BlockManureClean;
    static Block UltimatePoopBlock;
    
    
    static Achievement eatShitAchieve;
    static Achievement eatCleanShitAchieve;

        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
        	MinecraftForge.EVENT_BUS.register(new KrebsMod_EventSounds());

        	Configuration configFile = new Configuration(event.getSuggestedConfigurationFile());

        	configFile.load();
        	
        	 isVulgar = configFile.get(Configuration.CATEGORY_GENERAL, "Use vulgar language?", false).getBoolean(false);

        	//blocks
            int toiletId = configFile.get(Configuration.CATEGORY_BLOCK, "Toilet Block", 2460).getInt();
            int BlockPoopId = configFile.get(Configuration.CATEGORY_BLOCK, "Poop Block", 2461).getInt();
            int BlockPoopCleanId = configFile.get(Configuration.CATEGORY_BLOCK, "'Sanitized' Poop Block", 2462).getInt();
            int BlockBirdPoopId = configFile.get(Configuration.CATEGORY_BLOCK, "Bird Poop Block", 2463).getInt();
            int BlockBirdPoopCleanId = configFile.get(Configuration.CATEGORY_BLOCK, "'Sanitized' Bird Poop Block", 2464).getInt();
            int BlockManureId = configFile.get(Configuration.CATEGORY_BLOCK, "Manure Block", 2465).getInt();
            int BlockManureCleanId = configFile.get(Configuration.CATEGORY_BLOCK, "'Sanitized' Manure Block", 2466).getInt();
            int UltimatePoopBlockId = configFile.get(Configuration.CATEGORY_BLOCK, "Ultimate Poop Block", 2467).getInt();
            
            //poop items
            int PoopId = configFile.getItem("Poop", 5000).getInt();
            int CleanPoopId = configFile.getItem("'Sanitized' Poop", 5001).getInt();
            int PoopballId = configFile.getItem("Poopball", 5002).getInt();
            int BirdPoopId = configFile.getItem("Bird Poop", 5003).getInt();
            int CleanBirdPoopId = configFile.getItem("Sanitized Bird Poop", 5004).getInt();
            int ManureId = configFile.getItem("Manure", 5005).getInt();
            int CleanManureId = configFile.getItem("Sanitized Manure", 5006).getInt();
            int UltimatePoopIngotId = configFile.getItem("Ultimate Poop Ingot", 5007).getInt();
            
            //tools
            int shovelPoopId = configFile.getItem("Poop Shovel", 5020).getInt();
            int pickaxePoopId = configFile.getItem("Poop Pickaxe", 5021).getInt();
            int axePoopId = configFile.getItem("Poop Axe", 5022).getInt();
            int swordPoopId = configFile.getItem("Poop Sword", 5023).getInt();
            int hoePoopId = configFile.getItem("Poop Hoe", 5024).getInt();
            
            int shovelBirdPoopId = configFile.getItem("Bird Poop Shovel", 5025).getInt();
            int pickaxeBirdPoopId = configFile.getItem("Bird Poop Pickaxe", 5026).getInt();
            int axeBirdPoopId = configFile.getItem("Bird Poop Axe", 5027).getInt();
            int swordBirdPoopId = configFile.getItem("Bird Poop Sword", 5028).getInt();
            int hoeBirdPoopId = configFile.getItem("Bird Poop Hoe", 5029).getInt();
            
            int shovelManureId = configFile.getItem("Manure Shovel", 5030).getInt();
            int pickaxeManureId = configFile.getItem("Manure Pickaxe", 5031).getInt();
            int axeManureId = configFile.getItem("Manure Axe", 5032).getInt();
            int swordManureId = configFile.getItem("Manure Sword", 5033).getInt();
            int hoeManureId = configFile.getItem("Manure Hoe", 5034).getInt();
            
            int shovelUltimateId = configFile.getItem("Ultimate Poop Shovel", 5035).getInt();
            int pickaxeUltimateId = configFile.getItem("Ultimate Poop Pickaxe", 5036).getInt();
            int axeUltimateId = configFile.getItem("Ultimate Poop Axe", 5037).getInt();
            int swordUltimateId = configFile.getItem("Ultimate Poop Sword", 5038).getInt();
            int hoeUltimateId = configFile.getItem("Ultimate Poop Hoe", 5039).getInt();
            
            //armor
            int helmetPoopId = configFile.getItem("Poop Helmet", 5045).getInt();
            int platePoopId = configFile.getItem("Poop Plate", 5046).getInt();
            int legsPoopId = configFile.getItem("Poop Leggings", 5047).getInt();
            int bootsPoopId = configFile.getItem("Poop Boots", 5048).getInt();
            
            int helmetBirdPoopId = configFile.getItem("Bird Poop Helmet", 5049).getInt();
            int plateBirdPoopId = configFile.getItem("Bird Poop Plate", 5050).getInt();
            int legsBirdPoopId = configFile.getItem("Bird Poop Leggings", 5051).getInt();
            int bootsBirdPoopId = configFile.getItem("Bird Poop Boots", 5052).getInt();
            
            int helmetManureId = configFile.getItem("Manure Helmet", 5053).getInt();
            int plateManureId = configFile.getItem("Manure Plate", 5054).getInt();
            int legsManureId = configFile.getItem("Manure Leggings", 5055).getInt();
            int bootsManureId = configFile.getItem("Manure Boots", 5056).getInt();
            
            int helmetUltimateId = configFile.getItem("Ultimate Poop Helmet", 5057).getInt();
            int plateUltimateId = configFile.getItem("Ultimate Poop Plate", 5058).getInt();
            int legsUltimateId = configFile.getItem("Ultimate Poop Leggings", 5059).getInt();
            int bootsUltimateId = configFile.getItem("Ultimate Poop Boots", 5060).getInt();

            configFile.save();
            
            if(isVulgar == true){
            	WordPoop = "Shit";	
            }
            
            //Tool Enums
            toolPoop = net.minecraftforge.common.EnumHelper.addToolMaterial("POOP", 2, 64, 18F, 1, 4);
            toolBirdPoop = net.minecraftforge.common.EnumHelper.addToolMaterial("BIRDPOOP", 2, 60, 17F, 1, 4);
            toolManurePoop = net.minecraftforge.common.EnumHelper.addToolMaterial("COWPOOP", 2, 62, 17F, 1, 4);
            toolUltimatePoop = net.minecraftforge.common.EnumHelper.addToolMaterial("SUPERPOOP", 4, 1024, 100F, 1, 4);
            
            //Armour Enums
            armorPoop = net.minecraftforge.common.EnumHelper.addArmorMaterial("POOP", 64, new int[] {2, 7, 5, 3}, 4);
            armorBirdPoop = net.minecraftforge.common.EnumHelper.addArmorMaterial("BIRDPOOP", 64, new int[] {3, 6, 6, 2}, 4); 
            armorManurePoop = net.minecraftforge.common.EnumHelper.addArmorMaterial("COWPOOP", 64, new int[] {1, 8, 4, 4}, 4);
            armorUltimatePoop = net.minecraftforge.common.EnumHelper.addArmorMaterial("SUPERPOOP", 512, new int[] {4, 5, 4, 4}, 4);

            //Items
            ItemPoopball = new ItemPoopball(PoopballId, 1, 1, true).setUnlocalizedName("poopball").setCreativeTab(tabkrebs).setTextureName("krebsmodid:poopball");
            PoopItem = new ItemPoop(PoopId, 3, 1.2F, true).setAlwaysEdible().setUnlocalizedName("poopI").setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop");
            CleanPoopItem  = new ItemCleanPoop(CleanPoopId, 6, 1.2F, true).setAlwaysEdible().setUnlocalizedName("cleanpoopI").setCreativeTab(tabkrebs).setTextureName("krebsmodid:cleanpoop");
            ItemBirdPoop = new ItemPoop(BirdPoopId, 1, 1.2F, true).setAlwaysEdible().setUnlocalizedName("BpoopI").setCreativeTab(tabkrebs).setTextureName("krebsmodid:birdpoop");
            ItemBirdPoopClean = new ItemPoop(CleanBirdPoopId, 2, 1.2F, true).setAlwaysEdible().setUnlocalizedName("BCpoopI").setCreativeTab(tabkrebs).setTextureName("krebsmodid:birdpoopcleani");
            ItemManure = new ItemPoop(ManureId, 2, 1.2F, true).setAlwaysEdible().setUnlocalizedName("CpoopI").setCreativeTab(tabkrebs).setTextureName("krebsmodid:cowpoop");
            ItemManureClean = new ItemPoop(CleanManureId, 4, 1.2F, true).setAlwaysEdible().setUnlocalizedName("CCpoopI").setCreativeTab(tabkrebs).setTextureName("krebsmodid:cowpoopclean");
            UltimatePoopIngot = new ItemPoop(UltimatePoopIngotId, 8, 1.5F, true).setAlwaysEdible().setUnlocalizedName("UltPooI").setCreativeTab(tabkrebs).setTextureName("krebsmodid:ultimatepoopingot");
            
            //Tools
            shovelPoop = (new ItemSpade(shovelPoopId, toolPoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_shovel").setUnlocalizedName("shovelpoop");
            pickaxePoop = (new ItemPickaxe(pickaxePoopId, toolPoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_pickaxe").setUnlocalizedName("pickpoop");
            axePoop = (new ItemAxe(axePoopId, toolPoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_axe").setUnlocalizedName("axepoop");
            swordPoop = (new ItemSword(swordPoopId, toolPoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_sword").setUnlocalizedName("swordpoop");
            hoePoop = (new PoopHoe(hoePoopId, toolPoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_hoe").setUnlocalizedName("hoepoop");
            
            shovelBirdPoop = (new ItemSpade(shovelBirdPoopId, toolBirdPoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:birdpoop_shovel").setUnlocalizedName("Bshovelpoop");
            pickaxeBirdPoop = (new ItemPickaxe(pickaxeBirdPoopId, toolBirdPoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:birdpoop_pickaxe").setUnlocalizedName("Bpickpoop");
            axeBirdPoop = (new ItemAxe(axeBirdPoopId, toolBirdPoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:birdpoop_axe").setUnlocalizedName("Baxepoop");
            swordBirdPoop = (new ItemSword(swordBirdPoopId, toolBirdPoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:birdpoop_sword").setUnlocalizedName("Bswordpoop");
            hoeBirdPoop = (new PoopHoe(hoeBirdPoopId, toolBirdPoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:birdpoop_hoe").setUnlocalizedName("Bhoepoop");
            
            shovelManure = (new ItemSpade(shovelManureId, toolManurePoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:manurepoop_shovel").setUnlocalizedName("Mshovelpoop");
            pickaxeManure = (new ItemPickaxe(pickaxeManureId, toolManurePoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:manurepoop_pickaxe").setUnlocalizedName("Mpickpoop");
            axeManure = (new ItemAxe(axeManureId, toolManurePoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:manurepoop_axe").setUnlocalizedName("Maxepoop");
            swordManure = (new ItemSword(swordManureId, toolManurePoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:manurepoop_sword").setUnlocalizedName("Mswordpoop");
            hoeManure = (new PoopHoe(hoeManureId, toolManurePoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:manurepoop_hoe").setUnlocalizedName("Mhoepoop");
            
            shovelUltimate = (new ItemSpade(shovelUltimateId, toolUltimatePoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:Ult_poop_shovel").setUnlocalizedName("krebsmodid:ult_poop_shovel");
            pickaxeUltimate = (new ItemPickaxe(pickaxeUltimateId, toolUltimatePoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:Ult_poop_pickaxe").setUnlocalizedName("krebsmodid:ult_poop_pickaxe");
            axeUltimate = (new ItemAxe(axeUltimateId, toolUltimatePoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:Ult_poop_axe").setUnlocalizedName("krebsmodid:ult_poop_axe");
            swordUltimate = (new ItemSword(swordUltimateId, toolUltimatePoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:Ult_poop_sword").setUnlocalizedName("krebsmodid:ult_poop_sword");
            hoeUltimate = (new PoopHoe(hoeUltimateId, toolUltimatePoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:Ult_poop_hoe").setUnlocalizedName("krebsmodid:ult_poop_hoe");
            
            
            
            
            //Armor
            helmetPoop = (new PoopArmor(helmetPoopId, armorPoop, 3, 0)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_helmet").setUnlocalizedName("helmetpoop");
            platePoop = (new PoopArmor(platePoopId, armorPoop, 3, 1)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_chestplate").setUnlocalizedName("platepoop");
            legsPoop = (new PoopArmor(legsPoopId, armorPoop, 3, 2)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_leggings").setUnlocalizedName("legspoop");
            bootsPoop = (new PoopArmor(bootsPoopId, armorPoop, 3, 3)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_boots").setUnlocalizedName("bootspoop");
            
            helmetBirdPoop = (new PoopArmor(helmetBirdPoopId, armorBirdPoop, 3, 0)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:birdpoop_helmet").setUnlocalizedName("Bhelmetpoop");
            plateBirdPoop = (new PoopArmor(plateBirdPoopId, armorBirdPoop, 3, 1)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:birdpoop_chestplate").setUnlocalizedName("Bplatepoop");
            legsBirdPoop = (new PoopArmor(legsBirdPoopId, armorBirdPoop, 3, 2)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:birdpoop_leggings").setUnlocalizedName("Blegspoop");
            bootsBirdPoop = (new PoopArmor(bootsBirdPoopId, armorBirdPoop, 3, 3)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:birdpoop_boots").setUnlocalizedName("Bbootspoop");
            
            helmetManure = (new PoopArmor(helmetManureId, armorManurePoop, 3, 0)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:manurepoop_helmet").setUnlocalizedName("Mhelmetpoop");
            plateManure = (new PoopArmor(plateManureId, armorManurePoop, 3, 1)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:manurepoop_chestplate").setUnlocalizedName("Mplatepoop");
            legsManure = (new PoopArmor(legsManureId, armorManurePoop, 3, 2)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:manurepoop_leggings").setUnlocalizedName("Mlegspoop");
            bootsManure = (new PoopArmor(bootsManureId, armorManurePoop, 3, 3)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:manurepoop_boots").setUnlocalizedName("Mbootspoop");
            
            helmetUltimate = (new PoopArmor(helmetUltimateId, armorUltimatePoop, 3, 0)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:Ult_poop_helmet").setUnlocalizedName("Ult_helmetpoop");
            plateUltimate = (new PoopArmor(plateUltimateId, armorUltimatePoop, 3, 1)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:Ult_poop_chestplate").setUnlocalizedName("Ult_platepoop");
            legsUltimate = (new PoopArmor(legsUltimateId, armorUltimatePoop, 3, 2)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:Ult_poop_leggings").setUnlocalizedName("Ult_legspoop");
            bootsUltimate = (new PoopArmor(bootsUltimateId, armorUltimatePoop, 3, 3)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:Ult_poop_boots").setUnlocalizedName("Ult_bootspoop");
            
            //Blocks
            toilet = new BlockToilet(toiletId, Material.iron, false).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("toilet").setCreativeTab(tabkrebs);
            BlockPoop = new BlockPoop(BlockPoopId, Material.ground).setStepSound(Block.soundSandFootstep).setUnlocalizedName("poopblock").setCreativeTab(tabkrebs).setTextureName("krebsmodid:poopblock");
            BlockPoopClean = new BlockPoop(BlockPoopCleanId, Material.ground).setStepSound(Block.soundSandFootstep).setUnlocalizedName("cleanpoopblock").setCreativeTab(tabkrebs).setTextureName("krebsmodid:poopblockclean");
            BlockBirdPoop = new BlockPoop(BlockBirdPoopId, Material.ground).setStepSound(Block.soundSandFootstep).setUnlocalizedName("poopbirdblock").setCreativeTab(tabkrebs).setTextureName("krebsmodid:birdpoop");
            BlockBirdPoopClean = new BlockPoop(BlockBirdPoopCleanId, Material.ground).setStepSound(Block.soundSandFootstep).setUnlocalizedName("cleanpoopbirdblock").setCreativeTab(tabkrebs).setTextureName("krebsmodid:birdpoopclean");
            BlockManure = new BlockPoop(BlockManureId, Material.ground).setStepSound(Block.soundSandFootstep).setUnlocalizedName("manureblock").setCreativeTab(tabkrebs).setTextureName("krebsmodid:cowpoop");
            BlockManureClean = new BlockPoop(BlockManureCleanId, Material.ground).setStepSound(Block.soundSandFootstep).setUnlocalizedName("manureblockclean").setCreativeTab(tabkrebs).setTextureName("krebsmodid:cowpoopclean");
            UltimatePoopBlock = new BlockPoop(UltimatePoopBlockId, Material.ground).setStepSound(Block.soundSandFootstep).setUnlocalizedName("ultimateblock").setCreativeTab(tabkrebs).setTextureName("krebsmodid:ultimatepoopblock");

            //Achivements
            eatShitAchieve = new Achievement(1500, "eatShitAchieve", 1, -6, PoopItem, AchievementList.buildWorkBench).registerAchievement();
            eatCleanShitAchieve = new Achievement(1501, "eatCleanShitAchieve", -1, -6, CleanPoopItem, eatShitAchieve).registerAchievement();
        }
        

        @EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();

                LanguageRegistry.addName(PoopItem, WordPoop);
                LanguageRegistry.addName(CleanPoopItem, "'Sanitized' " + WordPoop);
                LanguageRegistry.addName(ItemBirdPoop,"Bird " + WordPoop);
                LanguageRegistry.addName(ItemBirdPoopClean, "'Sanitized' Bird " + WordPoop);
                LanguageRegistry.addName(ItemManure,"Manure");
                LanguageRegistry.addName(ItemManureClean, "'Sanitized' Manure");
                LanguageRegistry.addName(ItemPoopball,  WordPoop + "ball");
                LanguageRegistry.addName(UltimatePoopIngot, "Ultimate " + WordPoop + " Ingot");
                
                LanguageRegistry.addName(toilet,"Toilet");
                LanguageRegistry.addName(BlockPoop, WordPoop + " Block");
                LanguageRegistry.addName(BlockPoopClean, "'Sanitized' " + WordPoop + " Block");
                LanguageRegistry.addName(BlockBirdPoop,"Bird " + WordPoop + " Block");
                LanguageRegistry.addName(BlockBirdPoopClean, "'Sanitized' Bird " + WordPoop + " Block");
                LanguageRegistry.addName(BlockManure,"Manure Block");
                LanguageRegistry.addName(BlockManureClean, "'Sanitized' Manure Block");
                LanguageRegistry.addName(UltimatePoopBlock, "\u00a71Ultimate " + WordPoop + " Block");
                
                LanguageRegistry.addName(shovelPoop, WordPoop + " Shovel");
                LanguageRegistry.addName(pickaxePoop, WordPoop + " Pickaxe");
                LanguageRegistry.addName(axePoop, WordPoop + " Axe");
                LanguageRegistry.addName(swordPoop, WordPoop + " Sword");
                LanguageRegistry.addName(hoePoop, WordPoop + " Hoe");
                LanguageRegistry.addName(shovelBirdPoop, "Bird " + WordPoop + " Shovel");
                LanguageRegistry.addName(pickaxeBirdPoop, "Bird " + WordPoop + " Pickaxe");
                LanguageRegistry.addName(axeBirdPoop, "Bird " + WordPoop + " Axe");
                LanguageRegistry.addName(swordBirdPoop, "Bird " + WordPoop + " Sword");
                LanguageRegistry.addName(hoeBirdPoop, "Bird " + WordPoop + " Hoe");
                LanguageRegistry.addName(shovelManure, "Manure Shovel");
                LanguageRegistry.addName(pickaxeManure, "Manure Pickaxe");
                LanguageRegistry.addName(axeManure, "Manure Axe");
                LanguageRegistry.addName(swordManure, "Manure Sword");
                LanguageRegistry.addName(hoeManure, "Manure Hoe");
                LanguageRegistry.addName(shovelUltimate, "\u00a71Ultimate " + WordPoop + " Shovel");
                LanguageRegistry.addName(pickaxeUltimate, "\u00a71Ultimate " + WordPoop + " Pickaxe");
                LanguageRegistry.addName(axeUltimate, "\u00a71Ultimate " + WordPoop + " Axe");
                LanguageRegistry.addName(swordUltimate, "\u00a71Ultimate " + WordPoop + " Sword");
                LanguageRegistry.addName(hoeUltimate, "\u00a71Ultimate " + WordPoop + " Hoe");
                
                LanguageRegistry.addName(helmetPoop, WordPoop + " Helmet");
                LanguageRegistry.addName(platePoop, WordPoop + " Chestplate");
                LanguageRegistry.addName(legsPoop, WordPoop + " Leggings");
                LanguageRegistry.addName(bootsPoop, WordPoop + " Boots");
                LanguageRegistry.addName(helmetBirdPoop, "Bird " + WordPoop + " Helmet");
                LanguageRegistry.addName(plateBirdPoop, "Bird " + WordPoop + " Chestplate");
                LanguageRegistry.addName(legsBirdPoop, "Bird " + WordPoop + " Leggings");
                LanguageRegistry.addName(bootsBirdPoop, "Bird " + WordPoop + " Boots");
                LanguageRegistry.addName(helmetManure, "Manure Helmet");
                LanguageRegistry.addName(plateManure, "Manure Chestplate");
                LanguageRegistry.addName(legsManure, "Manure Leggings");
                LanguageRegistry.addName(bootsManure, "Manure Boots");
                LanguageRegistry.addName(helmetUltimate, "\u00a71Ultimate " + WordPoop + " Helmet");
                LanguageRegistry.addName(plateUltimate, "\u00a71Ultimate " + WordPoop + " Chestplate");
                LanguageRegistry.addName(legsUltimate, "\u00a71Ultimate " + WordPoop + " Leggings");
                LanguageRegistry.addName(bootsUltimate, "\u00a71Ultimate " + WordPoop + " Boots");

                LanguageRegistry.instance().addStringLocalization("achievement.eatShitAchieve", "en_US", "Got " + WordPoop);
                LanguageRegistry.instance().addStringLocalization("achievement.eatShitAchieve.desc", "en_US", "You fool! What's wrong with you!!!");
                LanguageRegistry.instance().addStringLocalization("achievement.eatCleanShitAchieve", "en_US", "Got 'Clean' " + WordPoop + " !");
                LanguageRegistry.instance().addStringLocalization("achievement.eatCleanShitAchieve.desc", "en_US", "That's still disgusting.");
                LanguageRegistry.instance().addStringLocalization("itemGroup.tabkrebs", "en_US", WordPoop + " Mod");

                GameRegistry.registerBlock(toilet, toilet.getUnlocalizedName());
                GameRegistry.registerBlock(BlockPoop, BlockPoop.getUnlocalizedName());
                GameRegistry.registerBlock(BlockPoopClean, BlockPoopClean.getUnlocalizedName());
                GameRegistry.registerBlock(BlockBirdPoop, BlockBirdPoop.getUnlocalizedName());
                GameRegistry.registerBlock(BlockBirdPoopClean, BlockBirdPoopClean.getUnlocalizedName());
                GameRegistry.registerBlock(BlockManure, BlockManure.getUnlocalizedName());
                GameRegistry.registerBlock(BlockManureClean, BlockManureClean.getUnlocalizedName());
                GameRegistry.registerBlock(UltimatePoopBlock, UltimatePoopBlock.getUnlocalizedName());
                
                
                MinecraftForge.setBlockHarvestLevel(toilet, "pickaxe", 1);
                MinecraftForge.setBlockHarvestLevel(BlockPoop, "shovel", 1);
                MinecraftForge.setBlockHarvestLevel(BlockPoopClean, "shovel", 1);
                MinecraftForge.setBlockHarvestLevel(BlockBirdPoop, "shovel", 1);
                MinecraftForge.setBlockHarvestLevel(BlockBirdPoopClean, "shovel", 1);
                MinecraftForge.setBlockHarvestLevel(BlockManure, "shovel", 1);
                MinecraftForge.setBlockHarvestLevel(BlockManureClean, "shovel", 1);
                MinecraftForge.setBlockHarvestLevel(UltimatePoopBlock, "shovel", 1);

                GameRegistry.addRecipe(new ItemStack(toilet), "iwi", "iqi", "iii",
                        'i', Item.ingotIron, 'w', Item.bucketWater, 'q', Item.netherQuartz);

                GameRegistry.addRecipe(new ItemStack(BlockPoop), "ppp", "ppp", "ppp",
                        'p', PoopItem);

                GameRegistry.addRecipe(new ItemStack(BlockPoopClean), "ppp", "ppp", "ppp",
                        'p', CleanPoopItem);
                
                GameRegistry.addRecipe(new ItemStack(BlockBirdPoop), "ppp", "ppp", "ppp",
                        'p', ItemBirdPoop);

                GameRegistry.addRecipe(new ItemStack(BlockBirdPoopClean), "ppp", "ppp", "ppp",
                        'p', ItemBirdPoopClean);
                
                GameRegistry.addRecipe(new ItemStack(BlockManure), "ppp", "ppp", "ppp",
                        'p', ItemManure);

                GameRegistry.addRecipe(new ItemStack(BlockManureClean), "ppp", "ppp", "ppp",
                        'p', ItemManureClean);
                
                GameRegistry.addRecipe(new ItemStack(UltimatePoopBlock), "ppp", "ppp", "ppp",
                        'p', UltimatePoopIngot);
                
                GameRegistry.addRecipe(new ItemStack(PoopItem,9), "p",
                        'p', BlockPoop);
                //
                GameRegistry.addRecipe(new ItemStack(CleanPoopItem,9), "p",
                        'p', BlockPoopClean);
                
                GameRegistry.addRecipe(new ItemStack(ItemBirdPoop,9), "p",
                        'p', BlockBirdPoopClean);
                
                GameRegistry.addRecipe(new ItemStack(ItemBirdPoopClean,9), "p",
                        'p', BlockBirdPoopClean);
                
                GameRegistry.addRecipe(new ItemStack(ItemManure,9), "p",
                        'p', BlockManure);
                
                GameRegistry.addRecipe(new ItemStack(ItemManureClean,9), "p",
                        'p', BlockManureClean);
                
                GameRegistry.addRecipe(new ItemStack(UltimatePoopIngot,9), "p",
                        'p', UltimatePoopBlock);
                
                GameRegistry.addRecipe(new ItemStack(CleanPoopItem,9), "p",
                        'p', BlockPoopClean);
                
                GameRegistry.addRecipe(new ItemStack(ItemPoopball,4), "p",
                        'p', PoopItem);
                //
                GameRegistry.addRecipe(new ItemStack(ItemPoopball,4), "p",
                        'p', CleanPoopItem);
                
                GameRegistry.addRecipe(new ItemStack(ItemPoopball,4), "p",
                        'p', ItemBirdPoop);
                
                GameRegistry.addRecipe(new ItemStack(ItemPoopball,4), "p",
                        'p', ItemBirdPoopClean);
                
                GameRegistry.addRecipe(new ItemStack(ItemPoopball,4), "p",
                        'p', ItemManure);
                
                GameRegistry.addRecipe(new ItemStack(ItemPoopball,4), "p",
                        'p', ItemManureClean);
                
                GameRegistry.addRecipe(new ItemStack(ItemPoopball,16), "p",
                        'p', UltimatePoopIngot);
                //
                GameRegistry.addRecipe(new ItemStack(shovelPoop), "p", "s", "s",
                        'p', BlockPoopClean, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(pickaxePoop), "ppp", " s ", " s ",
                        'p', BlockPoopClean, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(axePoop), "pp ", "ps ", " s ",
                        'p', BlockPoopClean, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(swordPoop), "p", "p", "s",
                        'p', BlockPoopClean, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(hoePoop), "pp ", " s ", " s ",
                        'p', BlockPoopClean, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(shovelBirdPoop), "p", "s", "s",
                        'p', BlockBirdPoopClean, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(pickaxeBirdPoop), "ppp", " s ", " s ",
                        'p', BlockBirdPoopClean, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(axeBirdPoop), "pp ", "ps ", " s ",
                        'p', BlockBirdPoopClean, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(swordBirdPoop), "p", "p", "s",
                        'p', BlockBirdPoopClean, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(hoeBirdPoop), "pp ", " s ", " s ",
                        'p', BlockBirdPoopClean, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(shovelBirdPoop), "p", "s", "s",
                        'p', BlockManureClean, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(pickaxeManure), "ppp", " s ", " s ",
                        'p', BlockManureClean, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(axeManure), "pp ", "ps ", " s ",
                        'p', BlockManureClean, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(swordManure), "p", "p", "s",
                        'p', BlockManureClean, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(hoeManure), "pp ", " s ", " s ",
                        'p', BlockManureClean, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(shovelUltimate), "p", "s", "s",
                        'p', UltimatePoopBlock, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(pickaxeUltimate), "ppp", " s ", " s ",
                        'p', UltimatePoopBlock, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(axeUltimate), "pp ", "ps ", " s ",
                        'p', UltimatePoopBlock, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(swordUltimate), "p", "p", "s",
                        'p', UltimatePoopBlock, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(hoeUltimate), "pp ", " s ", " s ",
                        'p', UltimatePoopBlock, 's', Item.stick);
               
                GameRegistry.addRecipe(new ItemStack(helmetPoop), "ppp", "p p",
                        'p', BlockPoopClean);
                
                GameRegistry.addRecipe(new ItemStack(platePoop), "p p", "ppp", "ppp",
                        'p', BlockPoopClean);
                
                GameRegistry.addRecipe(new ItemStack(legsPoop), "ppp", "p p", "p p",
                        'p', BlockPoopClean);
                
                GameRegistry.addRecipe(new ItemStack(bootsPoop), "p p", "p p",
                        'p', BlockPoopClean);
                
                GameRegistry.addRecipe(new ItemStack(helmetBirdPoop), "ppp", "p p",
                        'p', BlockBirdPoopClean);
                
                GameRegistry.addRecipe(new ItemStack(plateBirdPoop), "p p", "ppp", "ppp",
                        'p', BlockBirdPoopClean);
                
                GameRegistry.addRecipe(new ItemStack(legsBirdPoop), "ppp", "p p", "p p",
                        'p', BlockBirdPoopClean);
                
                GameRegistry.addRecipe(new ItemStack(bootsBirdPoop), "p p", "p p",
                        'p', BlockBirdPoopClean);
                
                GameRegistry.addRecipe(new ItemStack(helmetManure), "ppp", "p p",
                        'p', BlockManureClean);
                
                GameRegistry.addRecipe(new ItemStack(plateManure), "p p", "ppp", "ppp",
                        'p', BlockManureClean);
                
                GameRegistry.addRecipe(new ItemStack(legsManure), "ppp", "p p", "p p",
                        'p', BlockManureClean);
                
                GameRegistry.addRecipe(new ItemStack(bootsManure), "p p", "p p",
                        'p', BlockManureClean);
                
                GameRegistry.addRecipe(new ItemStack(helmetUltimate), "ppp", "p p",
                        'p', UltimatePoopBlock);
                
                GameRegistry.addRecipe(new ItemStack(plateUltimate), "p p", "ppp", "ppp",
                        'p', UltimatePoopBlock);
                
                GameRegistry.addRecipe(new ItemStack(legsUltimate), "ppp", "p p", "p p",
                        'p', UltimatePoopBlock);
                
                GameRegistry.addRecipe(new ItemStack(bootsUltimate), "p p", "p p",
                        'p', UltimatePoopBlock);
                
                GameRegistry.addShapelessRecipe(new ItemStack(UltimatePoopIngot),
                		BlockBirdPoopClean, BlockManureClean, BlockPoopClean, Item.coal, Item.slimeBall);

                GameRegistry.addSmelting(PoopItem.itemID, new ItemStack(CleanPoopItem), 5f);
                GameRegistry.addSmelting(ItemBirdPoop.itemID, new ItemStack(ItemBirdPoopClean), 5f);
                GameRegistry.addSmelting(ItemManure.itemID, new ItemStack(ItemManureClean), 5f);
                
                EntityRegistry.registerModEntity(EntityPoopball.class, "Poopball", 1, instance, 120, 3, true);
                MinecraftForge.EVENT_BUS.register(new PoopDroping());

                
                
        }
        @SideOnly(Side.CLIENT)
		 public void addRenderer(Map map)
         {
                        map.put(EntityPoopball.class, new RenderPoopball());
         }

        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
        }
}