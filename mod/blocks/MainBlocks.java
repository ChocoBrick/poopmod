package com.poopmod.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.poopmod.mod.PoopMod;
import com.poopmod.mod.manager.ConfigManager;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class MainBlocks {
	
    public static Block toilet;
    public static Block BlockPoop;
    public static Block BlockPoopClean;
    public static Block BlockBirdPoop;
    public static Block BlockBirdPoopClean;
    public static Block BlockManure;
    public static Block BlockManureClean;
    public static Block UltimatePoopBlock;
    
	public static void addBlocks(FMLPreInitializationEvent event){
		
		toilet = new BlockToilet(ConfigManager.toiletId, Material.iron, false).setStepSound(Block.soundTypeMetal).setBlockName("toilet").setCreativeTab(PoopMod.poopytab);
        BlockPoop = new BlockPoop(ConfigManager.BlockPoopId, Material.ground).setStepSound(Block.soundTypeSand).setBlockName("poop_block").setCreativeTab(PoopMod.poopytab).setBlockTextureName("poopmod:poopblock");
        BlockPoopClean = new BlockPoop(ConfigManager.BlockPoopCleanId, Material.ground).setStepSound(Block.soundTypeSand).setBlockName("clean_poop_block").setCreativeTab(PoopMod.poopytab).setBlockTextureName("poopmod:poopblockclean");
        BlockBirdPoop = new BlockPoop(ConfigManager.BlockBirdPoopId, Material.ground).setStepSound(Block.soundTypeSand).setBlockName("bird_poop_block").setCreativeTab(PoopMod.poopytab).setBlockTextureName("poopmod:birdpoop");
        BlockBirdPoopClean = new BlockPoop(ConfigManager.BlockBirdPoopCleanId, Material.ground).setStepSound(Block.soundTypeSand).setBlockName("clean_bird_poop_block").setCreativeTab(PoopMod.poopytab).setBlockTextureName("poopmod:birdpoopclean");
        BlockManure = new BlockPoop(ConfigManager.BlockManureId, Material.ground).setStepSound(Block.soundTypeSand).setBlockName("manure_block").setCreativeTab(PoopMod.poopytab).setBlockTextureName("poopmod:cowpoop");
        BlockManureClean = new BlockPoop(ConfigManager.BlockManureCleanId, Material.ground).setStepSound(Block.soundTypeSand).setBlockName("clean_manure_block").setCreativeTab(PoopMod.poopytab).setBlockTextureName("poopmod:cowpoopclean");
        UltimatePoopBlock = new BlockPoop(ConfigManager.UltimatePoopBlockId, Material.ground).setStepSound(Block.soundTypeSand).setBlockName("ultimate_poop_block").setCreativeTab(PoopMod.poopytab).setBlockTextureName("poopmod:ultimatepoopblock");

	}
	
}
