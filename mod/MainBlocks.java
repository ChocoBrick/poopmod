package com.poopmod.mod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.poopmod.mod.blocks.BlockPoop;
import com.poopmod.mod.blocks.BlockToilet;

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
		
		toilet = new BlockToilet(MainConfig.toiletId, Material.iron, false).setStepSound(Block.soundTypeMetal).setBlockName("toilet").setCreativeTab(PoopMod.poopytab);
        BlockPoop = new BlockPoop(MainConfig.BlockPoopId, Material.ground).setStepSound(Block.soundTypeSand).setBlockName("poopblock").setCreativeTab(PoopMod.poopytab).setBlockTextureName("poopmod:poopblock");
        BlockPoopClean = new BlockPoop(MainConfig.BlockPoopCleanId, Material.ground).setStepSound(Block.soundTypeSand).setBlockName("cleanpoopblock").setCreativeTab(PoopMod.poopytab).setBlockTextureName("poopmod:poopblockclean");
        BlockBirdPoop = new BlockPoop(MainConfig.BlockBirdPoopId, Material.ground).setStepSound(Block.soundTypeSand).setBlockName("poopbirdblock").setCreativeTab(PoopMod.poopytab).setBlockTextureName("poopmod:birdpoop");
        BlockBirdPoopClean = new BlockPoop(MainConfig.BlockBirdPoopCleanId, Material.ground).setStepSound(Block.soundTypeSand).setBlockName("cleanpoopbirdblock").setCreativeTab(PoopMod.poopytab).setBlockTextureName("poopmod:birdpoopclean");
        BlockManure = new BlockPoop(MainConfig.BlockManureId, Material.ground).setStepSound(Block.soundTypeSand).setBlockName("manureblock").setCreativeTab(PoopMod.poopytab).setBlockTextureName("poopmod:cowpoop");
        BlockManureClean = new BlockPoop(MainConfig.BlockManureCleanId, Material.ground).setStepSound(Block.soundTypeSand).setBlockName("manureblockclean").setCreativeTab(PoopMod.poopytab).setBlockTextureName("poopmod:cowpoopclean");
        UltimatePoopBlock = new BlockPoop(MainConfig.UltimatePoopBlockId, Material.ground).setStepSound(Block.soundTypeSand).setBlockName("ultimateblock").setCreativeTab(PoopMod.poopytab).setBlockTextureName("poopmod:ultimatepoopblock");

	}
	
}
