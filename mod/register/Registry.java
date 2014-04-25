package com.poopmod.mod.register;

import net.minecraftforge.common.MinecraftForge;

import com.poopmod.mod.EntityPoopball;
import com.poopmod.mod.PoopDroping;
import com.poopmod.mod.PoopMod;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class Registry {

	public static void RegisterEntitys(){

		//Register Entity
        EntityRegistry.registerModEntity(EntityPoopball.class, "Poopball", 1, PoopMod.instance, 120, 3, true);
        
        //Register Events
        MinecraftForge.EVENT_BUS.register(new PoopDroping());
	}
	
	public static void RegisterBlocks(){
		
		GameRegistry.registerBlock(PoopMod.toilet, PoopMod.toilet.getUnlocalizedName());
        GameRegistry.registerBlock(PoopMod.BlockPoop, PoopMod.BlockPoop.getUnlocalizedName());
        GameRegistry.registerBlock(PoopMod.BlockPoopClean, PoopMod.BlockPoopClean.getUnlocalizedName());
        GameRegistry.registerBlock(PoopMod.BlockBirdPoop, PoopMod.BlockBirdPoop.getUnlocalizedName());
        GameRegistry.registerBlock(PoopMod.BlockBirdPoopClean, PoopMod.BlockBirdPoopClean.getUnlocalizedName());
        GameRegistry.registerBlock(PoopMod.BlockManure, PoopMod.BlockManure.getUnlocalizedName());
        GameRegistry.registerBlock(PoopMod.BlockManureClean, PoopMod.BlockManureClean.getUnlocalizedName());
        GameRegistry.registerBlock(PoopMod.UltimatePoopBlock, PoopMod.UltimatePoopBlock.getUnlocalizedName());
	}
}
