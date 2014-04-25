package com.poopmod.mod;

import java.util.Map;

import com.poopmod.mod.main.PoopyTab;
import com.poopmod.mod.porxy.CommonProxy;
import com.poopmod.mod.register.Registry;

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
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid="poopmod", name="PoopCraft", version="1.1.0") 
public class PoopMod {
        @Instance(value = "poopmod")
        public static PoopMod instance;

        @SidedProxy(clientSide="com.krebs.mod.ClientProxy", serverSide="com.krebs.mod.CommonProxy")
        public static CommonProxy proxy;

        public static CreativeTabs poopytab = new PoopyTab("poopytab");
        
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
    
    public static Block toilet;
    public static Block BlockPoop;
    public static Block BlockPoopClean;
    public static Block BlockBirdPoop;
    public static Block BlockBirdPoopClean;
    public static Block BlockManure;
    public static Block BlockManureClean;
    public static Block UltimatePoopBlock;
    
    
    static Achievement eatShitAchieve;
    static Achievement eatCleanShitAchieve;

        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
        	MinecraftForge.EVENT_BUS.register(new KrebsMod_EventSounds());

        	Configuration configFile = new Configuration(event.getSuggestedConfigurationFile());

        	configFile.load();
        	
        	 isVulgar = configFile.get(Configuration.CATEGORY_GENERAL, "Use vulgar language?", false).getBoolean(false);

        	//blocks
            int toiletId = configFile.get("Block", "Toilet Block", 2460).getInt();
            int BlockPoopId = configFile.get("Block", "Poop Block", 2461).getInt();
            int BlockPoopCleanId = configFile.get("Block", "'Sanitized' Poop Block", 2462).getInt();
            int BlockBirdPoopId = configFile.get("Block", "Bird Poop Block", 2463).getInt();
            int BlockBirdPoopCleanId = configFile.get("Block", "'Sanitized' Bird Poop Block", 2464).getInt();
            int BlockManureId = configFile.get("Block", "Manure Block", 2465).getInt();
            int BlockManureCleanId = configFile.get("Block", "'Sanitized' Manure Block", 2466).getInt();
            int UltimatePoopBlockId = configFile.get("Block", "Ultimate Poop Block", 2467).getInt();
            
            //poop items
            int PoopId = configFile.get("Item", "Poop", 5000).getInt();
            int CleanPoopId = configFile.get("Item","'Sanitized' Poop", 5001).getInt();
            int PoopballId = configFile.get("Item","Poopball", 5002).getInt();
            int BirdPoopId = configFile.get("Item","Bird Poop", 5003).getInt();
            int CleanBirdPoopId = configFile.get("Item","Sanitized Bird Poop", 5004).getInt();
            int ManureId = configFile.get("Item","Manure", 5005).getInt();
            int CleanManureId = configFile.get("Item","Sanitized Manure", 5006).getInt();
            int UltimatePoopIngotId = configFile.get("Item","Ultimate Poop Ingot", 5007).getInt();
            
            //tools
            int shovelPoopId = configFile.get("Tool", "Poop Shovel", 5020).getInt();
            int pickaxePoopId = configFile.get("Tool","Poop Pickaxe", 5021).getInt();
            int axePoopId = configFile.get("Tool","Poop Axe", 5022).getInt();
            int swordPoopId = configFile.get("Tool","Poop Sword", 5023).getInt();
            int hoePoopId = configFile.get("Tool","Poop Hoe", 5024).getInt();
            
            int shovelBirdPoopId = configFile.get("Tool","Bird Poop Shovel", 5025).getInt();
            int pickaxeBirdPoopId = configFile.get("Tool","Bird Poop Pickaxe", 5026).getInt();
            int axeBirdPoopId = configFile.get("Tool","Bird Poop Axe", 5027).getInt();
            int swordBirdPoopId = configFile.get("Tool","Bird Poop Sword", 5028).getInt();
            int hoeBirdPoopId = configFile.get("Tool","Bird Poop Hoe", 5029).getInt();
            
            int shovelManureId = configFile.get("Tool","Manure Shovel", 5030).getInt();
            int pickaxeManureId = configFile.get("Tool","Manure Pickaxe", 5031).getInt();
            int axeManureId = configFile.get("Tool","Manure Axe", 5032).getInt();
            int swordManureId = configFile.get("Tool","Manure Sword", 5033).getInt();
            int hoeManureId = configFile.get("Tool","Manure Hoe", 5034).getInt();
            
            int shovelUltimateId = configFile.get("Tool","Ultimate Poop Shovel", 5035).getInt();
            int pickaxeUltimateId = configFile.get("Tool","Ultimate Poop Pickaxe", 5036).getInt();
            int axeUltimateId = configFile.get("Tool","Ultimate Poop Axe", 5037).getInt();
            int swordUltimateId = configFile.get("Tool","Ultimate Poop Sword", 5038).getInt();
            int hoeUltimateId = configFile.get("Tool","Ultimate Poop Hoe", 5039).getInt();
            
            //armor
            int helmetPoopId = configFile.get("Armor","Poop Helmet", 5045).getInt();
            int platePoopId = configFile.get("Armor","Poop Plate", 5046).getInt();
            int legsPoopId = configFile.get("Armor","Poop Leggings", 5047).getInt();
            int bootsPoopId = configFile.get("Armor","Poop Boots", 5048).getInt();
            
            int helmetBirdPoopId = configFile.get("Armor","Bird Poop Helmet", 5049).getInt();
            int plateBirdPoopId = configFile.get("Armor","Bird Poop Plate", 5050).getInt();
            int legsBirdPoopId = configFile.get("Armor","Bird Poop Leggings", 5051).getInt();
            int bootsBirdPoopId = configFile.get("Armor","Bird Poop Boots", 5052).getInt();
            
            int helmetManureId = configFile.get("Armor","Manure Helmet", 5053).getInt();
            int plateManureId = configFile.get("Armor","Manure Plate", 5054).getInt();
            int legsManureId = configFile.get("Armor","Manure Leggings", 5055).getInt();
            int bootsManureId = configFile.get("Armor","Manure Boots", 5056).getInt();
            
            int helmetUltimateId = configFile.get("Armor","Ultimate Poop Helmet", 5057).getInt();
            int plateUltimateId = configFile.get("Armor","Ultimate Poop Plate", 5058).getInt();
            int legsUltimateId = configFile.get("Armor","Ultimate Poop Leggings", 5059).getInt();
            int bootsUltimateId = configFile.get("Armor","Ultimate Poop Boots", 5060).getInt();

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
            ItemPoopball = new ItemPoopball(PoopballId, 1, 1, true).setUnlocalizedName("poopball").setCreativeTab(this.poopytab).setTextureName("poopmod:poopball");
            PoopItem = new ItemPoop(PoopId, 3, 1.2F, true).setAlwaysEdible().setUnlocalizedName("poopI").setCreativeTab(this.poopytab).setTextureName("poopmod:poop");
            CleanPoopItem  = new ItemCleanPoop(CleanPoopId, 6, 1.2F, true).setAlwaysEdible().setUnlocalizedName("cleanpoopI").setCreativeTab(this.poopytab).setTextureName("poopmod:cleanpoop");
            ItemBirdPoop = new ItemPoop(BirdPoopId, 1, 1.2F, true).setAlwaysEdible().setUnlocalizedName("BpoopI").setCreativeTab(this.poopytab).setTextureName("poopmod:birdpoop");
            ItemBirdPoopClean = new ItemPoop(CleanBirdPoopId, 2, 1.2F, true).setAlwaysEdible().setUnlocalizedName("BCpoopI").setCreativeTab(this.poopytab).setTextureName("poopmod:birdpoopcleani");
            ItemManure = new ItemPoop(ManureId, 2, 1.2F, true).setAlwaysEdible().setUnlocalizedName("CpoopI").setCreativeTab(this.poopytab).setTextureName("poopmod:cowpoop");
            ItemManureClean = new ItemPoop(CleanManureId, 4, 1.2F, true).setAlwaysEdible().setUnlocalizedName("CCpoopI").setCreativeTab(this.poopytab).setTextureName("poopmod:cowpoopclean");
            UltimatePoopIngot = new ItemPoop(UltimatePoopIngotId, 8, 1.5F, true).setAlwaysEdible().setUnlocalizedName("UltPooI").setCreativeTab(this.poopytab).setTextureName("poopmod:ultimatepoopingot");
            
            //Tools
            shovelPoop = (new ItemSpade(shovelPoopId, toolPoop)).setCreativeTab(this.poopytab).setTextureName("poopmod:poop_shovel").setUnlocalizedName("shovelpoop");
            pickaxePoop = (new ItemPickaxe(pickaxePoopId, toolPoop)).setCreativeTab(this.poopytab).setTextureName("poopmod:poop_pickaxe").setUnlocalizedName("pickpoop");
            axePoop = (new ItemAxe(axePoopId, toolPoop)).setCreativeTab(this.poopytab).setTextureName("poopmod:poop_axe").setUnlocalizedName("axepoop");
            swordPoop = (new ItemSword(swordPoopId, toolPoop)).setCreativeTab(this.poopytab).setTextureName("poopmod:poop_sword").setUnlocalizedName("swordpoop");
            hoePoop = (new PoopHoe(hoePoopId, toolPoop)).setCreativeTab(this.poopytab).setTextureName("poopmod:poop_hoe").setUnlocalizedName("hoepoop");
            
            shovelBirdPoop = (new ItemSpade(shovelBirdPoopId, toolBirdPoop)).setCreativeTab(this.poopytab).setTextureName("poopmod:birdpoop_shovel").setUnlocalizedName("Bshovelpoop");
            pickaxeBirdPoop = (new ItemPickaxe(pickaxeBirdPoopId, toolBirdPoop)).setCreativeTab(this.poopytab).setTextureName("poopmod:birdpoop_pickaxe").setUnlocalizedName("Bpickpoop");
            axeBirdPoop = (new ItemAxe(axeBirdPoopId, toolBirdPoop)).setCreativeTab(this.poopytab).setTextureName("poopmod:birdpoop_axe").setUnlocalizedName("Baxepoop");
            swordBirdPoop = (new ItemSword(swordBirdPoopId, toolBirdPoop)).setCreativeTab(this.poopytab).setTextureName("poopmod:birdpoop_sword").setUnlocalizedName("Bswordpoop");
            hoeBirdPoop = (new PoopHoe(hoeBirdPoopId, toolBirdPoop)).setCreativeTab(this.poopytab).setTextureName("poopmod:birdpoop_hoe").setUnlocalizedName("Bhoepoop");
            
            shovelManure = (new ItemSpade(shovelManureId, toolManurePoop)).setCreativeTab(this.poopytab).setTextureName("poopmod:manurepoop_shovel").setUnlocalizedName("Mshovelpoop");
            pickaxeManure = (new ItemPickaxe(pickaxeManureId, toolManurePoop)).setCreativeTab(this.poopytab).setTextureName("poopmod:manurepoop_pickaxe").setUnlocalizedName("Mpickpoop");
            axeManure = (new ItemAxe(axeManureId, toolManurePoop)).setCreativeTab(this.poopytab).setTextureName("poopmod:manurepoop_axe").setUnlocalizedName("Maxepoop");
            swordManure = (new ItemSword(swordManureId, toolManurePoop)).setCreativeTab(this.poopytab).setTextureName("poopmod:manurepoop_sword").setUnlocalizedName("Mswordpoop");
            hoeManure = (new PoopHoe(hoeManureId, toolManurePoop)).setCreativeTab(this.poopytab).setTextureName("poopmod:manurepoop_hoe").setUnlocalizedName("Mhoepoop");
            
            shovelUltimate = (new ItemSpade(shovelUltimateId, toolUltimatePoop)).setCreativeTab(this.poopytab).setTextureName("poopmod:Ult_poop_shovel").setUnlocalizedName("poopmod:ult_poop_shovel");
            pickaxeUltimate = (new ItemPickaxe(pickaxeUltimateId, toolUltimatePoop)).setCreativeTab(this.poopytab).setTextureName("poopmod:Ult_poop_pickaxe").setUnlocalizedName("poopmod:ult_poop_pickaxe");
            axeUltimate = (new ItemAxe(axeUltimateId, toolUltimatePoop)).setCreativeTab(this.poopytab).setTextureName("poopmod:Ult_poop_axe").setUnlocalizedName("poopmod:ult_poop_axe");
            swordUltimate = (new ItemSword(swordUltimateId, toolUltimatePoop)).setCreativeTab(this.poopytab).setTextureName("poopmod:Ult_poop_sword").setUnlocalizedName("poopmod:ult_poop_sword");
            hoeUltimate = (new PoopHoe(hoeUltimateId, toolUltimatePoop)).setCreativeTab(this.poopytab).setTextureName("poopmod:Ult_poop_hoe").setUnlocalizedName("poopmod:ult_poop_hoe");
            
            
            
            
            //Armor
            helmetPoop = (new PoopArmor(helmetPoopId, armorPoop, 3, 0)).setCreativeTab(this.poopytab).setTextureName("poopmod:poop_helmet").setUnlocalizedName("helmetpoop");
            platePoop = (new PoopArmor(platePoopId, armorPoop, 3, 1)).setCreativeTab(this.poopytab).setTextureName("poopmod:poop_chestplate").setUnlocalizedName("platepoop");
            legsPoop = (new PoopArmor(legsPoopId, armorPoop, 3, 2)).setCreativeTab(this.poopytab).setTextureName("poopmod:poop_leggings").setUnlocalizedName("legspoop");
            bootsPoop = (new PoopArmor(bootsPoopId, armorPoop, 3, 3)).setCreativeTab(this.poopytab).setTextureName("poopmod:poop_boots").setUnlocalizedName("bootspoop");
            
            helmetBirdPoop = (new PoopArmor(helmetBirdPoopId, armorBirdPoop, 3, 0)).setCreativeTab(this.poopytab).setTextureName("poopmod:birdpoop_helmet").setUnlocalizedName("Bhelmetpoop");
            plateBirdPoop = (new PoopArmor(plateBirdPoopId, armorBirdPoop, 3, 1)).setCreativeTab(this.poopytab).setTextureName("poopmod:birdpoop_chestplate").setUnlocalizedName("Bplatepoop");
            legsBirdPoop = (new PoopArmor(legsBirdPoopId, armorBirdPoop, 3, 2)).setCreativeTab(this.poopytab).setTextureName("poopmod:birdpoop_leggings").setUnlocalizedName("Blegspoop");
            bootsBirdPoop = (new PoopArmor(bootsBirdPoopId, armorBirdPoop, 3, 3)).setCreativeTab(this.poopytab).setTextureName("poopmod:birdpoop_boots").setUnlocalizedName("Bbootspoop");
            
            helmetManure = (new PoopArmor(helmetManureId, armorManurePoop, 3, 0)).setCreativeTab(this.poopytab).setTextureName("poopmod:manurepoop_helmet").setUnlocalizedName("Mhelmetpoop");
            plateManure = (new PoopArmor(plateManureId, armorManurePoop, 3, 1)).setCreativeTab(this.poopytab).setTextureName("poopmod:manurepoop_chestplate").setUnlocalizedName("Mplatepoop");
            legsManure = (new PoopArmor(legsManureId, armorManurePoop, 3, 2)).setCreativeTab(this.poopytab).setTextureName("poopmod:manurepoop_leggings").setUnlocalizedName("Mlegspoop");
            bootsManure = (new PoopArmor(bootsManureId, armorManurePoop, 3, 3)).setCreativeTab(this.poopytab).setTextureName("poopmod:manurepoop_boots").setUnlocalizedName("Mbootspoop");
            
            helmetUltimate = (new PoopArmor(helmetUltimateId, armorUltimatePoop, 3, 0)).setCreativeTab(this.poopytab).setTextureName("poopmod:Ult_poop_helmet").setUnlocalizedName("Ult_helmetpoop");
            plateUltimate = (new PoopArmor(plateUltimateId, armorUltimatePoop, 3, 1)).setCreativeTab(this.poopytab).setTextureName("poopmod:Ult_poop_chestplate").setUnlocalizedName("Ult_platepoop");
            legsUltimate = (new PoopArmor(legsUltimateId, armorUltimatePoop, 3, 2)).setCreativeTab(this.poopytab).setTextureName("poopmod:Ult_poop_leggings").setUnlocalizedName("Ult_legspoop");
            bootsUltimate = (new PoopArmor(bootsUltimateId, armorUltimatePoop, 3, 3)).setCreativeTab(this.poopytab).setTextureName("poopmod:Ult_poop_boots").setUnlocalizedName("Ult_bootspoop");
            
            //Blocks
            toilet = new BlockToilet(toiletId, Material.iron, false).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("toilet").setCreativeTab(this.poopytab);
            BlockPoop = new BlockPoop(BlockPoopId, Material.ground).setStepSound(Block.soundSandFootstep).setUnlocalizedName("poopblock").setCreativeTab(this.poopytab).setTextureName("poopmod:poopblock");
            BlockPoopClean = new BlockPoop(BlockPoopCleanId, Material.ground).setStepSound(Block.soundSandFootstep).setUnlocalizedName("cleanpoopblock").setCreativeTab(this.poopytab).setTextureName("poopmod:poopblockclean");
            BlockBirdPoop = new BlockPoop(BlockBirdPoopId, Material.ground).setStepSound(Block.soundSandFootstep).setUnlocalizedName("poopbirdblock").setCreativeTab(this.poopytab).setTextureName("poopmod:birdpoop");
            BlockBirdPoopClean = new BlockPoop(BlockBirdPoopCleanId, Material.ground).setStepSound(Block.soundSandFootstep).setUnlocalizedName("cleanpoopbirdblock").setCreativeTab(this.poopytab).setTextureName("poopmod:birdpoopclean");
            BlockManure = new BlockPoop(BlockManureId, Material.ground).setStepSound(Block.soundSandFootstep).setUnlocalizedName("manureblock").setCreativeTab(this.poopytab).setTextureName("poopmod:cowpoop");
            BlockManureClean = new BlockPoop(BlockManureCleanId, Material.ground).setStepSound(Block.soundSandFootstep).setUnlocalizedName("manureblockclean").setCreativeTab(this.poopytab).setTextureName("poopmod:cowpoopclean");
            UltimatePoopBlock = new BlockPoop(UltimatePoopBlockId, Material.ground).setStepSound(Block.soundSandFootstep).setUnlocalizedName("ultimateblock").setCreativeTab(this.poopytab).setTextureName("poopmod:ultimatepoopblock");

            //Achivements
            eatShitAchieve = new Achievement(1500, "eatShitAchieve", 1, -6, PoopItem, AchievementList.buildWorkBench).registerAchievement();
            eatCleanShitAchieve = new Achievement(1501, "eatCleanShitAchieve", -1, -6, CleanPoopItem, eatShitAchieve).registerAchievement();
        }
        

        @EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                Recipes.addRecipes();
                Registry.RegisterEntitys();
                Registry.RegisterBlocks();
                
                toilet.setHarvestLevel("pickaxe", 1);
                BlockPoop.setHarvestLevel("shovel", 1);
                BlockPoopClean.setHarvestLevel("shovel", 1);
                BlockBirdPoop.setHarvestLevel("shovel", 1);
                BlockBirdPoopClean.setHarvestLevel("shovel", 1);
                BlockManure.setHarvestLevel("shovel", 1);
                BlockManureClean.setHarvestLevel("shovel", 1);
                UltimatePoopBlock.setHarvestLevel("shovel", 1);
                

                
                
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