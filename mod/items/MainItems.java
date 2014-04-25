package com.poopmod.mod.items;

import net.minecraft.item.Item;

import com.poopmod.mod.PoopMod;
import com.poopmod.mod.armor.PoopArmor;
import com.poopmod.mod.manager.ConfigManager;
import com.poopmod.mod.manager.EnumManager;
import com.poopmod.mod.tools.PoopAxe;
import com.poopmod.mod.tools.PoopHoe;
import com.poopmod.mod.tools.PoopPickaxe;
import com.poopmod.mod.tools.PoopSpade;
import com.poopmod.mod.tools.PoopSword;

public class MainItems {
	
	//items
	public static Item PoopItem;
	public static Item CleanPoopItem;
	public static Item ItemBirdPoop;
	public static Item ItemBirdPoopClean;
	public static Item ItemManure;
	public static Item ItemManureClean;
	public static Item ItemPoopball;
	public static Item UltimatePoopIngot;
    
//tools
    //poop tools
	public static Item shovelPoop;
	public static Item pickaxePoop;
	public static Item axePoop;
	public static Item swordPoop; 
	public static Item hoePoop;
    
    //bird poop tools
	public static Item shovelBirdPoop;
	public static Item pickaxeBirdPoop;
	public static Item axeBirdPoop;
	public static Item swordBirdPoop; 
	public static Item hoeBirdPoop;
    
    //cow poop tools
	public static Item shovelManure;
	public static Item pickaxeManure;
	public static Item axeManure;
	public static Item swordManure; 
	public static Item hoeManure;
    
	public static Item shovelUltimate;
	public static Item pickaxeUltimate;
	public static Item axeUltimate;
	public static Item swordUltimate; 
	public static Item hoeUltimate;
    
//armor
    //poop
	public static Item helmetPoop;
	public static Item platePoop;
	public static Item legsPoop;
	public static Item bootsPoop;
    
    //bird
	public static Item helmetBirdPoop;
	public static Item plateBirdPoop;
	public static Item legsBirdPoop;
	public static Item bootsBirdPoop;
    
    //cow
	public static Item helmetManure;
	public static Item plateManure;
	public static Item legsManure;
	public static Item bootsManure;
    
    //ult
	public static Item helmetUltimate;
	public static Item plateUltimate;
	public static Item legsUltimate;
	public static Item bootsUltimate;
    
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void addItems(){
		
		ItemPoopball = new ItemPoopball(ConfigManager.PoopballId, 1, 1, true).setUnlocalizedName("poopball").setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:poopball");
        PoopItem = new ItemPoop(ConfigManager.PoopId, 3, 1.2F, true).setAlwaysEdible().setUnlocalizedName("poopI").setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:poop");
        CleanPoopItem  = new ItemCleanPoop(ConfigManager.CleanPoopId, 6, 1.2F, true).setAlwaysEdible().setUnlocalizedName("cleanpoopI").setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:cleanpoop");
        ItemBirdPoop = new ItemPoop(ConfigManager.BirdPoopId, 1, 1.2F, true).setAlwaysEdible().setUnlocalizedName("BpoopI").setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:birdpoop");
        ItemBirdPoopClean = new ItemPoop(ConfigManager.CleanBirdPoopId, 2, 1.2F, true).setAlwaysEdible().setUnlocalizedName("BCpoopI").setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:birdpoopcleani");
        ItemManure = new ItemPoop(ConfigManager.ManureId, 2, 1.2F, true).setAlwaysEdible().setUnlocalizedName("CpoopI").setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:cowpoop");
        ItemManureClean = new ItemPoop(ConfigManager.CleanManureId, 4, 1.2F, true).setAlwaysEdible().setUnlocalizedName("CCpoopI").setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:cowpoopclean");
        UltimatePoopIngot = new ItemPoop(ConfigManager.UltimatePoopIngotId, 8, 1.5F, true).setAlwaysEdible().setUnlocalizedName("UltPooI").setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:ultimatepoopingot");
        
        //Tools
        shovelPoop = (new PoopSpade(EnumManager.toolPoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:poop_shovel").setUnlocalizedName("shovelpoop");
        pickaxePoop = (new PoopPickaxe(EnumManager.toolPoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:poop_pickaxe").setUnlocalizedName("pickpoop");
        axePoop = (new PoopAxe(EnumManager.toolPoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:poop_axe").setUnlocalizedName("axepoop");
        swordPoop = (new PoopSword(EnumManager.toolPoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:poop_sword").setUnlocalizedName("swordpoop");
        hoePoop = new PoopHoe(EnumManager.toolPoop).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:poop_hoe").setUnlocalizedName("hoepoop");
        
        shovelBirdPoop = (new PoopSpade(EnumManager.toolBirdPoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:birdpoop_shovel").setUnlocalizedName("Bshovelpoop");
        pickaxeBirdPoop = (new PoopPickaxe(EnumManager.toolBirdPoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:birdpoop_pickaxe").setUnlocalizedName("Bpickpoop");
        axeBirdPoop = (new PoopAxe(EnumManager.toolBirdPoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:birdpoop_axe").setUnlocalizedName("Baxepoop");
        swordBirdPoop = (new PoopSword(EnumManager.toolBirdPoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:birdpoop_sword").setUnlocalizedName("Bswordpoop");
        hoeBirdPoop = (new PoopHoe(EnumManager.toolBirdPoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:birdpoop_hoe").setUnlocalizedName("Bhoepoop");
        
        shovelManure = (new PoopSpade(EnumManager.toolManurePoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:manurepoop_shovel").setUnlocalizedName("Mshovelpoop");
        pickaxeManure = (new PoopPickaxe(EnumManager.toolManurePoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:manurepoop_pickaxe").setUnlocalizedName("Mpickpoop");
        axeManure = (new PoopAxe(EnumManager.toolManurePoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:manurepoop_axe").setUnlocalizedName("Maxepoop");
        swordManure = (new PoopSword(EnumManager.toolManurePoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:manurepoop_sword").setUnlocalizedName("Mswordpoop");
        hoeManure = (new PoopHoe(EnumManager.toolManurePoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:manurepoop_hoe").setUnlocalizedName("Mhoepoop");
        
        shovelUltimate = (new PoopSpade(EnumManager.toolUltimatePoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:Ult_poop_shovel").setUnlocalizedName("poopmod:ult_poop_shovel");
        pickaxeUltimate = (new PoopPickaxe(EnumManager.toolUltimatePoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:Ult_poop_pickaxe").setUnlocalizedName("poopmod:ult_poop_pickaxe");
        axeUltimate = (new PoopAxe( EnumManager.toolUltimatePoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:Ult_poop_axe").setUnlocalizedName("poopmod:ult_poop_axe");
        swordUltimate = (new PoopSword(EnumManager.toolUltimatePoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:Ult_poop_sword").setUnlocalizedName("poopmod:ult_poop_sword");
        hoeUltimate = (new PoopHoe(EnumManager.toolUltimatePoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:Ult_poop_hoe").setUnlocalizedName("poopmod:ult_poop_hoe");

        //Armor
        helmetPoop = (new PoopArmor(ConfigManager.helmetPoopId, EnumManager.armorPoop, 3, 0)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:poop_helmet").setUnlocalizedName("helmetpoop");
        platePoop = (new PoopArmor(ConfigManager.platePoopId, EnumManager.armorPoop, 3, 1)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:poop_chestplate").setUnlocalizedName("platepoop");
        legsPoop = (new PoopArmor(ConfigManager.legsPoopId, EnumManager.armorPoop, 3, 2)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:poop_leggings").setUnlocalizedName("legspoop");
        bootsPoop = (new PoopArmor(ConfigManager.bootsPoopId, EnumManager.armorPoop, 3, 3)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:poop_boots").setUnlocalizedName("bootspoop");
        
        helmetBirdPoop = (new PoopArmor(ConfigManager.helmetBirdPoopId, EnumManager.armorBirdPoop, 3, 0)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:birdpoop_helmet").setUnlocalizedName("Bhelmetpoop");
        plateBirdPoop = (new PoopArmor(ConfigManager.plateBirdPoopId, EnumManager.armorBirdPoop, 3, 1)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:birdpoop_chestplate").setUnlocalizedName("Bplatepoop");
        legsBirdPoop = (new PoopArmor(ConfigManager.legsBirdPoopId, EnumManager.armorBirdPoop, 3, 2)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:birdpoop_leggings").setUnlocalizedName("Blegspoop");
        bootsBirdPoop = (new PoopArmor(ConfigManager.bootsBirdPoopId, EnumManager.armorBirdPoop, 3, 3)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:birdpoop_boots").setUnlocalizedName("Bbootspoop");
        
        helmetManure = (new PoopArmor(ConfigManager.helmetManureId, EnumManager.armorManurePoop, 3, 0)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:manurepoop_helmet").setUnlocalizedName("Mhelmetpoop");
        plateManure = (new PoopArmor(ConfigManager.plateManureId, EnumManager.armorManurePoop, 3, 1)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:manurepoop_chestplate").setUnlocalizedName("Mplatepoop");
        legsManure = (new PoopArmor(ConfigManager.legsManureId, EnumManager.armorManurePoop, 3, 2)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:manurepoop_leggings").setUnlocalizedName("Mlegspoop");
        bootsManure = (new PoopArmor(ConfigManager.bootsManureId, EnumManager.armorManurePoop, 3, 3)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:manurepoop_boots").setUnlocalizedName("Mbootspoop");
        
        helmetUltimate = (new PoopArmor(ConfigManager.helmetUltimateId, EnumManager.armorUltimatePoop, 3, 0)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:Ult_poop_helmet").setUnlocalizedName("Ult_helmetpoop");
        plateUltimate = (new PoopArmor(ConfigManager.plateUltimateId, EnumManager.armorUltimatePoop, 3, 1)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:Ult_poop_chestplate").setUnlocalizedName("Ult_platepoop");
        legsUltimate = (new PoopArmor(ConfigManager.legsUltimateId, EnumManager.armorUltimatePoop, 3, 2)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:Ult_poop_leggings").setUnlocalizedName("Ult_legspoop");
        bootsUltimate = (new PoopArmor(ConfigManager.bootsUltimateId, EnumManager.armorUltimatePoop, 3, 3)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:Ult_poop_boots").setUnlocalizedName("Ult_bootspoop");
        
	}

}
