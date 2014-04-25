package com.poopmod.mod;

import com.poopmod.mod.armor.PoopArmor;
import com.poopmod.mod.items.ItemCleanPoop;
import com.poopmod.mod.items.ItemPoop;
import com.poopmod.mod.items.ItemPoopball;
import com.poopmod.mod.tools.PoopHoe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

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
    
	public static void addItems(){
		ItemPoopball = new ItemPoopball(MainConfig.PoopballId, 1, 1, true).setUnlocalizedName("poopball").setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:poopball");
        PoopItem = new ItemPoop(MainConfig.PoopId, 3, 1.2F, true).setAlwaysEdible().setUnlocalizedName("poopI").setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:poop");
        CleanPoopItem  = new ItemCleanPoop(MainConfig.CleanPoopId, 6, 1.2F, true).setAlwaysEdible().setUnlocalizedName("cleanpoopI").setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:cleanpoop");
        ItemBirdPoop = new ItemPoop(MainConfig.BirdPoopId, 1, 1.2F, true).setAlwaysEdible().setUnlocalizedName("BpoopI").setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:birdpoop");
        ItemBirdPoopClean = new ItemPoop(MainConfig.CleanBirdPoopId, 2, 1.2F, true).setAlwaysEdible().setUnlocalizedName("BCpoopI").setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:birdpoopcleani");
        ItemManure = new ItemPoop(MainConfig.ManureId, 2, 1.2F, true).setAlwaysEdible().setUnlocalizedName("CpoopI").setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:cowpoop");
        ItemManureClean = new ItemPoop(MainConfig.CleanManureId, 4, 1.2F, true).setAlwaysEdible().setUnlocalizedName("CCpoopI").setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:cowpoopclean");
        UltimatePoopIngot = new ItemPoop(MainConfig.UltimatePoopIngotId, 8, 1.5F, true).setAlwaysEdible().setUnlocalizedName("UltPooI").setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:ultimatepoopingot");
        
        //Tools
        shovelPoop = (new ItemSpade(MainConfig.shovelPoopId, EnumManager.toolPoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:poop_shovel").setUnlocalizedName("shovelpoop");
        pickaxePoop = (new ItemPickaxe(MainConfig.pickaxePoopId, toolPoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:poop_pickaxe").setUnlocalizedName("pickpoop");
        axePoop = (new ItemAxe(MainConfig.axePoopId, toolPoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:poop_axe").setUnlocalizedName("axepoop");
        swordPoop = (new ItemSword(MainConfig.swordPoopId, toolPoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:poop_sword").setUnlocalizedName("swordpoop");
        hoePoop = (new PoopHoe(MainConfig.hoePoopId, toolPoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:poop_hoe").setUnlocalizedName("hoepoop");
        
        shovelBirdPoop = (new ItemSpade(MainConfig.shovelBirdPoopId, toolBirdPoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:birdpoop_shovel").setUnlocalizedName("Bshovelpoop");
        pickaxeBirdPoop = (new ItemPickaxe(MainConfig.pickaxeBirdPoopId, toolBirdPoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:birdpoop_pickaxe").setUnlocalizedName("Bpickpoop");
        axeBirdPoop = (new ItemAxe(MainConfig.axeBirdPoopId, toolBirdPoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:birdpoop_axe").setUnlocalizedName("Baxepoop");
        swordBirdPoop = (new ItemSword(MainConfig.swordBirdPoopId, toolBirdPoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:birdpoop_sword").setUnlocalizedName("Bswordpoop");
        hoeBirdPoop = (new PoopHoe(MainConfig.hoeBirdPoopId, toolBirdPoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:birdpoop_hoe").setUnlocalizedName("Bhoepoop");
        
        shovelManure = (new ItemSpade(MainConfig.shovelManureId, toolManurePoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:manurepoop_shovel").setUnlocalizedName("Mshovelpoop");
        pickaxeManure = (new ItemPickaxe(MainConfig.pickaxeManureId, toolManurePoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:manurepoop_pickaxe").setUnlocalizedName("Mpickpoop");
        axeManure = (new ItemAxe(MainConfig.axeManureId, toolManurePoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:manurepoop_axe").setUnlocalizedName("Maxepoop");
        swordManure = (new ItemSword(MainConfig.swordManureId, toolManurePoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:manurepoop_sword").setUnlocalizedName("Mswordpoop");
        hoeManure = (new PoopHoe(MainConfig.hoeManureId, toolManurePoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:manurepoop_hoe").setUnlocalizedName("Mhoepoop");
        
        shovelUltimate = (new ItemSpade(MainConfig.shovelUltimateId, toolUltimatePoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:Ult_poop_shovel").setUnlocalizedName("poopmod:ult_poop_shovel");
        pickaxeUltimate = (new ItemPickaxe(MainConfig.pickaxeUltimateId, toolUltimatePoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:Ult_poop_pickaxe").setUnlocalizedName("poopmod:ult_poop_pickaxe");
        axeUltimate = (new ItemAxe(MainConfig.axeUltimateId, toolUltimatePoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:Ult_poop_axe").setUnlocalizedName("poopmod:ult_poop_axe");
        swordUltimate = (new ItemSword(MainConfig.swordUltimateId, toolUltimatePoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:Ult_poop_sword").setUnlocalizedName("poopmod:ult_poop_sword");
        hoeUltimate = (new PoopHoe(MainConfig.hoeUltimateId, toolUltimatePoop)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:Ult_poop_hoe").setUnlocalizedName("poopmod:ult_poop_hoe");

        //Armor
        helmetPoop = (new PoopArmor(MainConfig.helmetPoopId, armorPoop, 3, 0)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:poop_helmet").setUnlocalizedName("helmetpoop");
        platePoop = (new PoopArmor(MainConfig.platePoopId, armorPoop, 3, 1)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:poop_chestplate").setUnlocalizedName("platepoop");
        legsPoop = (new PoopArmor(MainConfig.legsPoopId, armorPoop, 3, 2)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:poop_leggings").setUnlocalizedName("legspoop");
        bootsPoop = (new PoopArmor(MainConfig.bootsPoopId, armorPoop, 3, 3)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:poop_boots").setUnlocalizedName("bootspoop");
        
        helmetBirdPoop = (new PoopArmor(MainConfig.helmetBirdPoopId, armorBirdPoop, 3, 0)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:birdpoop_helmet").setUnlocalizedName("Bhelmetpoop");
        plateBirdPoop = (new PoopArmor(MainConfig.plateBirdPoopId, armorBirdPoop, 3, 1)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:birdpoop_chestplate").setUnlocalizedName("Bplatepoop");
        legsBirdPoop = (new PoopArmor(MainConfig.legsBirdPoopId, armorBirdPoop, 3, 2)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:birdpoop_leggings").setUnlocalizedName("Blegspoop");
        bootsBirdPoop = (new PoopArmor(MainConfig.bootsBirdPoopId, armorBirdPoop, 3, 3)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:birdpoop_boots").setUnlocalizedName("Bbootspoop");
        
        helmetManure = (new PoopArmor(MainConfig.helmetManureId, armorManurePoop, 3, 0)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:manurepoop_helmet").setUnlocalizedName("Mhelmetpoop");
        plateManure = (new PoopArmor(MainConfig.plateManureId, armorManurePoop, 3, 1)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:manurepoop_chestplate").setUnlocalizedName("Mplatepoop");
        legsManure = (new PoopArmor(MainConfig.legsManureId, armorManurePoop, 3, 2)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:manurepoop_leggings").setUnlocalizedName("Mlegspoop");
        bootsManure = (new PoopArmor(MainConfig.bootsManureId, armorManurePoop, 3, 3)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:manurepoop_boots").setUnlocalizedName("Mbootspoop");
        
        helmetUltimate = (new PoopArmor(MainConfig.helmetUltimateId, armorUltimatePoop, 3, 0)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:Ult_poop_helmet").setUnlocalizedName("Ult_helmetpoop");
        plateUltimate = (new PoopArmor(MainConfig.plateUltimateId, armorUltimatePoop, 3, 1)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:Ult_poop_chestplate").setUnlocalizedName("Ult_platepoop");
        legsUltimate = (new PoopArmor(MainConfig.legsUltimateId, armorUltimatePoop, 3, 2)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:Ult_poop_leggings").setUnlocalizedName("Ult_legspoop");
        bootsUltimate = (new PoopArmor(MainConfig.bootsUltimateId, armorUltimatePoop, 3, 3)).setCreativeTab(PoopMod.poopytab).setTextureName("poopmod:Ult_poop_boots").setUnlocalizedName("Ult_bootspoop");
        
	}

}
