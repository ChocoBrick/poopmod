package com.poopmod.mod.register;

import net.minecraftforge.common.MinecraftForge;

import com.poopmod.mod.PoopMod;
import com.poopmod.mod.blocks.MainBlocks;
import com.poopmod.mod.entity.EntityPoopball;
import com.poopmod.mod.handler.PoopDropingHandler;
import com.poopmod.mod.handler.SoundHandler;
import com.poopmod.mod.items.MainItems;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class Registry {

	public static void RegisterEntitys(FMLPreInitializationEvent event){

		//Register Entity
        EntityRegistry.registerModEntity(EntityPoopball.class, "Poopball", 1, PoopMod.instance, 120, 3, true);
        
        //Register Events
        MinecraftForge.EVENT_BUS.register(new PoopDropingHandler());
    	MinecraftForge.EVENT_BUS.register(new SoundHandler());
	}
	
	public static void RegisterBlocks(FMLPreInitializationEvent event){
		
		GameRegistry.registerBlock(MainBlocks.toilet, MainBlocks.toilet.getUnlocalizedName());
        GameRegistry.registerBlock(MainBlocks.BlockPoop, MainBlocks.BlockPoop.getUnlocalizedName());
        GameRegistry.registerBlock(MainBlocks.BlockPoopClean, MainBlocks.BlockPoopClean.getUnlocalizedName());
        GameRegistry.registerBlock(MainBlocks.BlockBirdPoop, MainBlocks.BlockBirdPoop.getUnlocalizedName());
        GameRegistry.registerBlock(MainBlocks.BlockBirdPoopClean, MainBlocks.BlockBirdPoopClean.getUnlocalizedName());
        GameRegistry.registerBlock(MainBlocks.BlockManure, MainBlocks.BlockManure.getUnlocalizedName());
        GameRegistry.registerBlock(MainBlocks.BlockManureClean, MainBlocks.BlockManureClean.getUnlocalizedName());
        GameRegistry.registerBlock(MainBlocks.UltimatePoopBlock, MainBlocks.UltimatePoopBlock.getUnlocalizedName());
	}
	
	public static void RegisterItems(FMLPreInitializationEvent event){
		
		GameRegistry.registerItem(MainItems.ItemPoopball, MainItems.ItemPoopball.getUnlocalizedName());
		GameRegistry.registerItem(MainItems.PoopItem, MainItems.PoopItem.getUnlocalizedName());
		GameRegistry.registerItem(MainItems.CleanPoopItem, MainItems.CleanPoopItem.getUnlocalizedName());
		GameRegistry.registerItem(MainItems.ItemBirdPoop, MainItems.ItemBirdPoop.getUnlocalizedName());
		GameRegistry.registerItem(MainItems.ItemBirdPoopClean, MainItems.ItemBirdPoopClean.getUnlocalizedName());
		GameRegistry.registerItem(MainItems.ItemManure, MainItems.ItemManure.getUnlocalizedName());
		GameRegistry.registerItem(MainItems.ItemManureClean, MainItems.ItemManureClean.getUnlocalizedName());
		GameRegistry.registerItem(MainItems.UltimatePoopIngot, MainItems.UltimatePoopIngot.getUnlocalizedName());
		
		GameRegistry.registerItem(MainItems.pickaxePoop, MainItems.pickaxePoop.getUnlocalizedName());
		GameRegistry.registerItem(MainItems.axePoop, MainItems.axePoop.getUnlocalizedName());
		GameRegistry.registerItem(MainItems.shovelPoop, MainItems.shovelPoop.getUnlocalizedName());
		GameRegistry.registerItem(MainItems.swordPoop, MainItems.swordPoop.getUnlocalizedName());
		GameRegistry.registerItem(MainItems.hoePoop, MainItems.hoePoop.getUnlocalizedName());
		
		GameRegistry.registerItem(MainItems.pickaxeBirdPoop, MainItems.pickaxeBirdPoop.getUnlocalizedName());
		GameRegistry.registerItem(MainItems.axeBirdPoop, MainItems.axeBirdPoop.getUnlocalizedName());
		GameRegistry.registerItem(MainItems.shovelBirdPoop, MainItems.shovelBirdPoop.getUnlocalizedName());
		GameRegistry.registerItem(MainItems.swordBirdPoop, MainItems.swordBirdPoop.getUnlocalizedName());
		GameRegistry.registerItem(MainItems.hoeBirdPoop, MainItems.hoeBirdPoop.getUnlocalizedName());
		
		GameRegistry.registerItem(MainItems.pickaxeManure, MainItems.pickaxeManure.getUnlocalizedName());
		GameRegistry.registerItem(MainItems.axeManure, MainItems.axeManure.getUnlocalizedName());
		GameRegistry.registerItem(MainItems.shovelManure, MainItems.shovelManure.getUnlocalizedName());
		GameRegistry.registerItem(MainItems.swordManure, MainItems.swordManure.getUnlocalizedName());
		GameRegistry.registerItem(MainItems.hoeManure, MainItems.hoeManure.getUnlocalizedName());
		
		GameRegistry.registerItem(MainItems.pickaxeUltimate, MainItems.pickaxeUltimate.getUnlocalizedName());
		GameRegistry.registerItem(MainItems.axeUltimate, MainItems.axeUltimate.getUnlocalizedName());
		GameRegistry.registerItem(MainItems.shovelUltimate, MainItems.shovelUltimate.getUnlocalizedName());
		GameRegistry.registerItem(MainItems.swordUltimate, MainItems.swordUltimate.getUnlocalizedName());
		
	}
	
	public static void RegisterBlockHarvestlevel(FMLPreInitializationEvent event){
		
		MainBlocks.toilet.setHarvestLevel("pickaxe", 1);
		MainBlocks.BlockPoop.setHarvestLevel("shovel", 1);
		MainBlocks.BlockPoopClean.setHarvestLevel("shovel", 1);
		MainBlocks.BlockBirdPoop.setHarvestLevel("shovel", 1);
		MainBlocks.BlockBirdPoopClean.setHarvestLevel("shovel", 1);
		MainBlocks.BlockManure.setHarvestLevel("shovel", 1);
		MainBlocks.BlockManureClean.setHarvestLevel("shovel", 1);
		MainBlocks.UltimatePoopBlock.setHarvestLevel("shovel", 1);
	}
}
