package com.poopmod.mod.register;

import net.minecraftforge.common.MinecraftForge;

import com.poopmod.mod.EntityPoopball;
import com.poopmod.mod.MainBlocks;
import com.poopmod.mod.PoopDroping;
import com.poopmod.mod.PoopMod;
import com.poopmod.mod.handler.SoundHandler;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class Registry {

	public static void RegisterEntitys(){

		//Register Entity
        EntityRegistry.registerModEntity(EntityPoopball.class, "Poopball", 1, PoopMod.instance, 120, 3, true);
        
        //Register Events
        MinecraftForge.EVENT_BUS.register(new PoopDroping());
    	MinecraftForge.EVENT_BUS.register(new SoundHandler());
	}
	
	public static void RegisterBlocks(){
		
		GameRegistry.registerBlock(MainBlocks.toilet, MainBlocks.toilet.getUnlocalizedName());
        GameRegistry.registerBlock(MainBlocks.BlockPoop, MainBlocks.BlockPoop.getUnlocalizedName());
        GameRegistry.registerBlock(MainBlocks.BlockPoopClean, MainBlocks.BlockPoopClean.getUnlocalizedName());
        GameRegistry.registerBlock(MainBlocks.BlockBirdPoop, MainBlocks.BlockBirdPoop.getUnlocalizedName());
        GameRegistry.registerBlock(MainBlocks.BlockBirdPoopClean, MainBlocks.BlockBirdPoopClean.getUnlocalizedName());
        GameRegistry.registerBlock(MainBlocks.BlockManure, MainBlocks.BlockManure.getUnlocalizedName());
        GameRegistry.registerBlock(MainBlocks.BlockManureClean, MainBlocks.BlockManureClean.getUnlocalizedName());
        GameRegistry.registerBlock(MainBlocks.UltimatePoopBlock, MainBlocks.UltimatePoopBlock.getUnlocalizedName());
	}
	
	public static void RegisterBlockHarvestlevel(){
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
