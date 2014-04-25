package com.poopmod.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.poopmod.mod.PoopMod;
import com.poopmod.mod.manager.ConfigManager;

public class MainBlocks {
	
    public static Block toilet;
    public static Block BlockPoop;
    public static Block BlockPoopClean;
    public static Block BlockBirdPoop;
    public static Block BlockBirdPoopClean;
    public static Block BlockManure;
    public static Block BlockManureClean;
    public static Block UltimatePoopBlock;
    
	public static void addBlocks(){
		
		toilet = new BlockToilet(ConfigManager.toiletId, Material.iron, false).setStepSound(Block.soundTypeMetal).setBlockName("toilet").setCreativeTab(PoopMod.poopytab);
        BlockPoop = new BlockPoop(ConfigManager.BlockPoopId, Material.ground).setStepSound(Block.soundTypeSand).setBlockName("poopblock").setCreativeTab(PoopMod.poopytab).setBlockTextureName("poopmod:poopblock");
        BlockPoopClean = new BlockPoop(ConfigManager.BlockPoopCleanId, Material.ground).setStepSound(Block.soundTypeSand).setBlockName("cleanpoopblock").setCreativeTab(PoopMod.poopytab).setBlockTextureName("poopmod:poopblockclean");
        BlockBirdPoop = new BlockPoop(ConfigManager.BlockBirdPoopId, Material.ground).setStepSound(Block.soundTypeSand).setBlockName("poopbirdblock").setCreativeTab(PoopMod.poopytab).setBlockTextureName("poopmod:birdpoop");
        BlockBirdPoopClean = new BlockPoop(ConfigManager.BlockBirdPoopCleanId, Material.ground).setStepSound(Block.soundTypeSand).setBlockName("cleanpoopbirdblock").setCreativeTab(PoopMod.poopytab).setBlockTextureName("poopmod:birdpoopclean");
        BlockManure = new BlockPoop(ConfigManager.BlockManureId, Material.ground).setStepSound(Block.soundTypeSand).setBlockName("manureblock").setCreativeTab(PoopMod.poopytab).setBlockTextureName("poopmod:cowpoop");
        BlockManureClean = new BlockPoop(ConfigManager.BlockManureCleanId, Material.ground).setStepSound(Block.soundTypeSand).setBlockName("manureblockclean").setCreativeTab(PoopMod.poopytab).setBlockTextureName("poopmod:cowpoopclean");
        UltimatePoopBlock = new BlockPoop(ConfigManager.UltimatePoopBlockId, Material.ground).setStepSound(Block.soundTypeSand).setBlockName("ultimateblock").setCreativeTab(PoopMod.poopytab).setBlockTextureName("poopmod:ultimatepoopblock");

	}
	
}
