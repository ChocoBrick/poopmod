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
		GameRegistry.addRecipe(new ItemStack(PoopMod.toilet), "iwi", "iqi", "iii",
                'i', Items.iron_ingot, 'w', Items.water_bucket, 'q', Items.quartz);

        GameRegistry.addRecipe(new ItemStack(PoopMod.BlockPoop), "ppp", "ppp", "ppp",
                'p', PoopMod.PoopItem);

        GameRegistry.addRecipe(new ItemStack(PoopMod.BlockPoopClean), "ppp", "ppp", "ppp",
                'p', PoopMod.CleanPoopItem);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.BlockBirdPoop), "ppp", "ppp", "ppp",
                'p', PoopMod.ItemBirdPoop);

        GameRegistry.addRecipe(new ItemStack(PoopMod.BlockBirdPoopClean), "ppp", "ppp", "ppp",
                'p', PoopMod.ItemBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.BlockManure), "ppp", "ppp", "ppp",
                'p', PoopMod.ItemManure);

        GameRegistry.addRecipe(new ItemStack(PoopMod.BlockManureClean), "ppp", "ppp", "ppp",
                'p', PoopMod.ItemManureClean);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.UltimatePoopBlock), "ppp", "ppp", "ppp",
                'p', PoopMod.UltimatePoopIngot);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.PoopItem,9), "p",
                'p', PoopMod.BlockPoop);
        //
        GameRegistry.addRecipe(new ItemStack(PoopMod.CleanPoopItem,9), "p",
                'p', PoopMod.BlockPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.ItemBirdPoop,9), "p",
                'p', PoopMod.BlockBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.ItemBirdPoopClean,9), "p",
                'p', PoopMod.BlockBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.ItemManure,9), "p",
                'p', PoopMod.BlockManure);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.ItemManureClean,9), "p",
                'p', PoopMod.BlockManureClean);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.UltimatePoopIngot,9), "p",
                'p', PoopMod.UltimatePoopBlock);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.CleanPoopItem,9), "p",
                'p', PoopMod.BlockPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.ItemPoopball,4), "p",
                'p', PoopMod.PoopItem);
        //
        GameRegistry.addRecipe(new ItemStack(PoopMod.ItemPoopball,4), "p",
                'p', PoopMod.CleanPoopItem);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.ItemPoopball,4), "p",
                'p', PoopMod.ItemBirdPoop);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.ItemPoopball,4), "p",
                'p', PoopMod.ItemBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.ItemPoopball,4), "p",
                'p', PoopMod.ItemManure);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.ItemPoopball,4), "p",
                'p', PoopMod.ItemManureClean);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.ItemPoopball,16), "p",
                'p', PoopMod.UltimatePoopIngot);
        //
        GameRegistry.addRecipe(new ItemStack(PoopMod.shovelPoop), "p", "s", "s",
                'p',PoopMod. BlockPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.pickaxePoop), "ppp", " s ", " s ",
                'p', PoopMod.BlockPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.axePoop), "pp ", "ps ", " s ",
                'p', PoopMod.BlockPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.swordPoop), "p", "p", "s",
                'p', PoopMod.BlockPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.hoePoop), "pp ", " s ", " s ",
                'p', PoopMod.BlockPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.shovelBirdPoop), "p", "s", "s",
                'p', PoopMod.BlockBirdPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.pickaxeBirdPoop), "ppp", " s ", " s ",
                'p', PoopMod.BlockBirdPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.axeBirdPoop), "pp ", "ps ", " s ",
                'p', PoopMod.BlockBirdPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.swordBirdPoop), "p", "p", "s",
                'p', PoopMod.BlockBirdPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.hoeBirdPoop), "pp ", " s ", " s ",
                'p', PoopMod.BlockBirdPoopClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.shovelBirdPoop), "p", "s", "s",
                'p', PoopMod.BlockManureClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.pickaxeManure), "ppp", " s ", " s ",
                'p', PoopMod.BlockManureClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.axeManure), "pp ", "ps ", " s ",
                'p', PoopMod.BlockManureClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.swordManure), "p", "p", "s",
                'p', PoopMod.BlockManureClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.hoeManure), "pp ", " s ", " s ",
                'p', PoopMod.BlockManureClean, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.shovelUltimate), "p", "s", "s",
                'p', PoopMod.UltimatePoopBlock, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.pickaxeUltimate), "ppp", " s ", " s ",
                'p', PoopMod.UltimatePoopBlock, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.axeUltimate), "pp ", "ps ", " s ",
                'p', PoopMod.UltimatePoopBlock, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.swordUltimate), "p", "p", "s",
                'p', PoopMod.UltimatePoopBlock, 's', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.hoeUltimate), "pp ", " s ", " s ",
                'p', PoopMod.UltimatePoopBlock, 's', Items.stick);
       
        GameRegistry.addRecipe(new ItemStack(PoopMod.helmetPoop), "ppp", "p p",
                'p', PoopMod.BlockPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.platePoop), "p p", "ppp", "ppp",
                'p', PoopMod.BlockPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.legsPoop), "ppp", "p p", "p p",
                'p', PoopMod.BlockPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.bootsPoop), "p p", "p p",
                'p', PoopMod.BlockPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.helmetBirdPoop), "ppp", "p p",
                'p', PoopMod.BlockBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.plateBirdPoop), "p p", "ppp", "ppp",
                'p', PoopMod.BlockBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.legsBirdPoop), "ppp", "p p", "p p",
                'p', PoopMod.BlockBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.bootsBirdPoop), "p p", "p p",
                'p', PoopMod.BlockBirdPoopClean);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.helmetManure), "ppp", "p p",
                'p', PoopMod.BlockManureClean);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.plateManure), "p p", "ppp", "ppp",
                'p', PoopMod.BlockManureClean);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.legsManure), "ppp", "p p", "p p",
                'p', PoopMod.BlockManureClean);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.bootsManure), "p p", "p p",
                'p', PoopMod.BlockManureClean);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.helmetUltimate), "ppp", "p p",
                'p', PoopMod.UltimatePoopBlock);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.plateUltimate), "p p", "ppp", "ppp",
                'p', PoopMod.UltimatePoopBlock);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.legsUltimate), "ppp", "p p", "p p",
                'p', PoopMod.UltimatePoopBlock);
        
        GameRegistry.addRecipe(new ItemStack(PoopMod.bootsUltimate), "p p", "p p",
                'p', PoopMod.UltimatePoopBlock);
        
        GameRegistry.addShapelessRecipe(new ItemStack(PoopMod.UltimatePoopIngot),
        		PoopMod.BlockBirdPoopClean, PoopMod.BlockManureClean, PoopMod.BlockPoopClean, Items.coal, Items.slime_ball);

	}
}
