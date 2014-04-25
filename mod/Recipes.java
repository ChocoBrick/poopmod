package com.poopmod.mod;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void addRecipes(){
		
		//Smelting
		GameRegistry.addSmelting(PoopMod.PoopItem, new ItemStack(PoopMod.CleanPoopItem), 5f);
        GameRegistry.addSmelting(PoopMod.ItemBirdPoop, new ItemStack(PoopMod.ItemBirdPoopClean), 5f);
        GameRegistry.addSmelting(PoopMod.ItemManure, new ItemStack(PoopMod.ItemManureClean), 5f);
         
         //Crafting
		GameRegistry.addRecipe(new ItemStack(MainBlocks.toilet), "iwi", "iqi", "iii",
                'i', Items.iron_ingot, 'w', Items.water_bucket, 'q', Items.quartz);

        GameRegistry.addRecipe(new ItemStack(MainBlocks.BlockPoop), "ppp", "ppp", "ppp",
                'p', MainBlocks.PoopItem);

        GameRegistry.addRecipe(new ItemStack(MainBlocks.BlockPoopClean), "ppp", "ppp", "ppp",
                'p', MainBlocks.CleanPoopItem);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.BlockBirdPoop), "ppp", "ppp", "ppp",
                'p', MainBlocks.ItemBirdPoop);

        GameRegistry.addRecipe(new ItemStack(MainBlocks.BlockBirdPoopClean), "ppp", "ppp", "ppp",
                'p', MainBlocks.ItemBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.BlockManure), "ppp", "ppp", "ppp",
                'p', MainBlocks.ItemManure);

        GameRegistry.addRecipe(new ItemStack(MainBlocks.BlockManureClean), "ppp", "ppp", "ppp",
                'p', MainBlocks.ItemManureClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.UltimatePoopBlock), "ppp", "ppp", "ppp",
                'p', MainBlocks.UltimatePoopIngot);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.PoopItem,9), "p",
                'p', MainBlocks.BlockPoop);
        //
        GameRegistry.addRecipe(new ItemStack(MainBlocks.CleanPoopItem,9), "p",
                'p', MainBlocks.BlockPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.ItemBirdPoop,9), "p",
                'p', MainBlocks.BlockBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.ItemBirdPoopClean,9), "p",
                'p', MainBlocks.BlockBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.ItemManure,9), "p",
                'p', MainBlocks.BlockManure);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.ItemManureClean,9), "p",
                'p', MainBlocks.BlockManureClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.UltimatePoopIngot,9), "p",
                'p', MainBlocks.UltimatePoopBlock);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.CleanPoopItem,9), "p",
                'p', MainBlocks.BlockPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.ItemPoopball,4), "p",
                'p', MainBlocks.PoopItem);
        //
        GameRegistry.addRecipe(new ItemStack(MainBlocks.ItemPoopball,4), "p",
                'p', MainBlocks.CleanPoopItem);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.ItemPoopball,4), "p",
                'p', MainBlocks.ItemBirdPoop);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.ItemPoopball,4), "p",
                'p', MainBlocks.ItemBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.ItemPoopball,4), "p",
                'p', MainBlocks.ItemManure);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.ItemPoopball,4), "p",
                'p', MainBlocks.ItemManureClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.ItemPoopball,16), "p",
                'p', MainBlocks.UltimatePoopIngot);
        //
        GameRegistry.addRecipe(new ItemStack(MainBlocks.shovelPoop), "p", "s", "s",
                'p',MainBlocks. BlockPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.pickaxePoop), "ppp", " s ", " s ",
                'p', MainBlocks.BlockPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.axePoop), "pp ", "ps ", " s ",
                'p', MainBlocks.BlockPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.swordPoop), "p", "p", "s",
                'p', MainBlocks.BlockPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.hoePoop), "pp ", " s ", " s ",
                'p', MainBlocks.BlockPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.shovelBirdPoop), "p", "s", "s",
                'p', MainBlocks.BlockBirdPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.pickaxeBirdPoop), "ppp", " s ", " s ",
                'p', MainBlocks.BlockBirdPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.axeBirdPoop), "pp ", "ps ", " s ",
                'p', MainBlocks.BlockBirdPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.swordBirdPoop), "p", "p", "s",
                'p', MainBlocks.BlockBirdPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.hoeBirdPoop), "pp ", " s ", " s ",
                'p', MainBlocks.BlockBirdPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.shovelBirdPoop), "p", "s", "s",
                'p', MainBlocks.BlockManureClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.pickaxeManure), "ppp", " s ", " s ",
                'p', MainBlocks.BlockManureClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.axeManure), "pp ", "ps ", " s ",
                'p', MainBlocks.BlockManureClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.swordManure), "p", "p", "s",
                'p', MainBlocks.BlockManureClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.hoeManure), "pp ", " s ", " s ",
                'p', MainBlocks.BlockManureClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.shovelUltimate), "p", "s", "s",
                'p', MainBlocks.UltimatePoopBlock, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.pickaxeUltimate), "ppp", " s ", " s ",
                'p', MainBlocks.UltimatePoopBlock, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.axeUltimate), "pp ", "ps ", " s ",
                'p', MainBlocks.UltimatePoopBlock, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.swordUltimate), "p", "p", "s",
                'p', MainBlocks.UltimatePoopBlock, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.hoeUltimate), "pp ", " s ", " s ",
                'p', MainBlocks.UltimatePoopBlock, 's', Items.stick);
       
        GameRegistry.addRecipe(new ItemStack(MainBlocks.helmetPoop), "ppp", "p p",
                'p', MainBlocks.BlockPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.platePoop), "p p", "ppp", "ppp",
                'p', MainBlocks.BlockPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.legsPoop), "ppp", "p p", "p p",
                'p', MainBlocks.BlockPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.bootsPoop), "p p", "p p",
                'p', MainBlocks.BlockPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.helmetBirdPoop), "ppp", "p p",
                'p', MainBlocks.BlockBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.plateBirdPoop), "p p", "ppp", "ppp",
                'p', MainBlocks.BlockBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.legsBirdPoop), "ppp", "p p", "p p",
                'p', MainBlocks.BlockBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.bootsBirdPoop), "p p", "p p",
                'p', MainBlocks.BlockBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.helmetManure), "ppp", "p p",
                'p', MainBlocks.BlockManureClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.plateManure), "p p", "ppp", "ppp",
                'p', MainBlocks.BlockManureClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.legsManure), "ppp", "p p", "p p",
                'p', MainBlocks.BlockManureClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.bootsManure), "p p", "p p",
                'p', MainBlocks.BlockManureClean);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.helmetUltimate), "ppp", "p p",
                'p', MainBlocks.UltimatePoopBlock);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.plateUltimate), "p p", "ppp", "ppp",
                'p', MainBlocks.UltimatePoopBlock);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.legsUltimate), "ppp", "p p", "p p",
                'p', MainBlocks.UltimatePoopBlock);
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.bootsUltimate), "p p", "p p",
                'p', MainBlocks.UltimatePoopBlock);
        
        GameRegistry.addShapelessRecipe(new ItemStack(MainBlocks.UltimatePoopIngot),
        		MainBlocks.BlockBirdPoopClean, MainBlocks.BlockManureClean, MainBlocks.BlockPoopClean, Items.coal, Items.slime_ball);

	}
}
