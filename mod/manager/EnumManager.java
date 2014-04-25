package com.poopmod.mod.manager;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class EnumManager {
	
	public static ToolMaterial toolPoop;
	public static ToolMaterial toolBirdPoop;
	public static ToolMaterial toolManurePoop;
	public static ToolMaterial toolUltimatePoop;
	
	public static ArmorMaterial armorPoop;
	public static ArmorMaterial armorBirdPoop;
	public static ArmorMaterial armorManurePoop;
	public static ArmorMaterial armorUltimatePoop;
	
	public static void addEnumTypes(FMLInitializationEvent event){
		
		//Tool ENUMS
		 toolPoop = EnumHelper.addToolMaterial("POOP", 2, 64, 18F, 1, 4);
         toolBirdPoop = EnumHelper.addToolMaterial("BIRDPOOP", 2, 60, 17F, 1, 4);
         toolManurePoop = EnumHelper.addToolMaterial("COWPOOP", 2, 62, 17F, 1, 4);
         toolUltimatePoop = EnumHelper.addToolMaterial("SUPERPOOP", 4, 1024, 100F, 1, 4);
        
        //Armour ENUMS
         armorPoop = EnumHelper.addArmorMaterial("POOP", 64, new int[] {2, 7, 5, 3}, 4);
         armorBirdPoop = EnumHelper.addArmorMaterial("BIRDPOOP", 64, new int[] {2, 7, 5, 3}, 4);
         armorManurePoop = EnumHelper.addArmorMaterial("COWPOOP", 64, new int[] {2, 7, 5, 3}, 4);
         armorUltimatePoop = EnumHelper.addArmorMaterial("SUPERPOOP", 64, new int[] {2, 7, 5, 3}, 4);
        
	}

}
