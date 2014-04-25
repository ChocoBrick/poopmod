package com.poopmod.mod.manager;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import com.poopmod.mod.blocks.MainBlocks;
import com.poopmod.mod.items.MainItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeManager {

	public static void addRecipes(){
		
		//Smelting
		GameRegistry.addSmelting(MainItems.PoopItem, new ItemStack(MainItems.CleanPoopItem), 5f);
        GameRegistry.addSmelting(MainItems.ItemBirdPoop, new ItemStack(MainItems.ItemBirdPoopClean), 5f);
        GameRegistry.addSmelting(MainItems.ItemManure, new ItemStack(MainItems.ItemManureClean), 5f);
         
         //Crafting
		GameRegistry.addRecipe(new ItemStack(MainBlocks.toilet), "iwi", "iqi", "iii",
                'i', Items.iron_ingot, 'w', Items.water_bucket, 'q', Items.quartz);

        GameRegistry.addRecipe(new ItemStack(MainBlocks.BlockPoop), "ppp", "ppp", "ppp",
                'p', MainItems.PoopItem);

        GameRegistry.addRecipe(new ItemStack(MainBlocks.BlockPoopClean), "ppp", "ppp", "ppp",
                'p', MainItems.CleanPoopItem);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.BlockBirdPoop), "ppp", "ppp", "ppp",
                'p', MainItems.ItemBirdPoop);

        GameRegistry.addRecipe(new ItemStack(MainBlocks.BlockBirdPoopClean), "ppp", "ppp", "ppp",
                'p', MainItems.ItemBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.BlockManure), "ppp", "ppp", "ppp",
                'p', MainItems.ItemManure);

        GameRegistry.addRecipe(new ItemStack(MainBlocks.BlockManureClean), "ppp", "ppp", "ppp",
                'p', MainItems.ItemManureClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.UltimatePoopBlock), "ppp", "ppp", "ppp",
                'p', MainItems.UltimatePoopIngot);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.PoopItem,9), "p",
                'p', MainBlocks.BlockPoop);
        //
        GameRegistry.addRecipe(new ItemStack(MainItems.CleanPoopItem,9), "p",
                'p', MainBlocks.BlockPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.ItemBirdPoop,9), "p",
                'p', MainBlocks.BlockBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.ItemBirdPoopClean,9), "p",
                'p', MainBlocks.BlockBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.ItemManure,9), "p",
                'p', MainBlocks.BlockManure);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.ItemManureClean,9), "p",
                'p', MainBlocks.BlockManureClean);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.UltimatePoopIngot,9), "p",
                'p', MainBlocks.UltimatePoopBlock);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.CleanPoopItem,9), "p",
                'p', MainBlocks.BlockPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.ItemPoopball,4), "p",
                'p', MainItems.PoopItem);
        //
        GameRegistry.addRecipe(new ItemStack(MainItems.ItemPoopball,4), "p",
                'p', MainItems.CleanPoopItem);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.ItemPoopball,4), "p",
                'p', MainItems.ItemBirdPoop);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.ItemPoopball,4), "p",
                'p', MainItems.ItemBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.ItemPoopball,4), "p",
                'p', MainItems.ItemManure);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.ItemPoopball,4), "p",
                'p', MainItems.ItemManureClean);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.ItemPoopball,16), "p",
                'p', MainItems.UltimatePoopIngot);
        //
        GameRegistry.addRecipe(new ItemStack(MainItems.shovelPoop), "p", "s", "s",
                'p',MainBlocks. BlockPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.pickaxePoop), "ppp", " s ", " s ",
                'p', MainBlocks.BlockPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.axePoop), "pp ", "ps ", " s ",
                'p', MainBlocks.BlockPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.swordPoop), "p", "p", "s",
                'p', MainBlocks.BlockPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.hoePoop), "pp ", " s ", " s ",
                'p', MainBlocks.BlockPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.shovelBirdPoop), "p", "s", "s",
                'p', MainBlocks.BlockBirdPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.pickaxeBirdPoop), "ppp", " s ", " s ",
                'p', MainBlocks.BlockBirdPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.axeBirdPoop), "pp ", "ps ", " s ",
                'p', MainBlocks.BlockBirdPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.swordBirdPoop), "p", "p", "s",
                'p', MainBlocks.BlockBirdPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.hoeBirdPoop), "pp ", " s ", " s ",
                'p', MainBlocks.BlockBirdPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.shovelBirdPoop), "p", "s", "s",
                'p', MainBlocks.BlockManureClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.pickaxeManure), "ppp", " s ", " s ",
                'p', MainBlocks.BlockManureClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.axeManure), "pp ", "ps ", " s ",
                'p', MainBlocks.BlockManureClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.swordManure), "p", "p", "s",
                'p', MainBlocks.BlockManureClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.hoeManure), "pp ", " s ", " s ",
                'p', MainBlocks.BlockManureClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.shovelUltimate), "p", "s", "s",
                'p', MainBlocks.UltimatePoopBlock, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.pickaxeUltimate), "ppp", " s ", " s ",
                'p', MainBlocks.UltimatePoopBlock, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.axeUltimate), "pp ", "ps ", " s ",
                'p', MainBlocks.UltimatePoopBlock, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.swordUltimate), "p", "p", "s",
                'p', MainBlocks.UltimatePoopBlock, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.hoeUltimate), "pp ", " s ", " s ",
                'p', MainBlocks.UltimatePoopBlock, 's', Items.stick);
       
        GameRegistry.addRecipe(new ItemStack(MainItems.helmetPoop), "ppp", "p p",
                'p', MainBlocks.BlockPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.platePoop), "p p", "ppp", "ppp",
                'p', MainBlocks.BlockPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.legsPoop), "ppp", "p p", "p p",
                'p', MainBlocks.BlockPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.bootsPoop), "p p", "p p",
                'p', MainBlocks.BlockPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.helmetBirdPoop), "ppp", "p p",
                'p', MainBlocks.BlockBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.plateBirdPoop), "p p", "ppp", "ppp",
                'p', MainBlocks.BlockBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.legsBirdPoop), "ppp", "p p", "p p",
                'p', MainBlocks.BlockBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.bootsBirdPoop), "p p", "p p",
                'p', MainBlocks.BlockBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.helmetManure), "ppp", "p p",
                'p', MainBlocks.BlockManureClean);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.plateManure), "p p", "ppp", "ppp",
                'p', MainBlocks.BlockManureClean);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.legsManure), "ppp", "p p", "p p",
                'p', MainBlocks.BlockManureClean);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.bootsManure), "p p", "p p",
                'p', MainBlocks.BlockManureClean);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.helmetUltimate), "ppp", "p p",
                'p', MainBlocks.UltimatePoopBlock);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.plateUltimate), "p p", "ppp", "ppp",
                'p', MainBlocks.UltimatePoopBlock);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.legsUltimate), "ppp", "p p", "p p",
                'p', MainBlocks.UltimatePoopBlock);
        
        GameRegistry.addRecipe(new ItemStack(MainItems.bootsUltimate), "p p", "p p",
                'p', MainBlocks.UltimatePoopBlock);
        
        GameRegistry.addShapelessRecipe(new ItemStack(MainItems.UltimatePoopIngot),
        		MainBlocks.BlockBirdPoopClean, MainBlocks.BlockManureClean, MainBlocks.BlockPoopClean, Items.coal, Items.slime_ball);

	}
}
