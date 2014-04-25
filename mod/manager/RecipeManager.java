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
		GameRegistry.addRecipe(new ItemStack(MainBlocks.toilet), new Object[]{"iwi", "iqi", "iii",
                'i', Items.iron_ingot, 'w', Items.water_bucket, 'q', Items.quartz});

        GameRegistry.addRecipe(new ItemStack(MainBlocks.BlockPoop), new Object[]{"ppp", "ppp", "ppp",
                'p', MainItems.PoopItem});

        GameRegistry.addRecipe(new ItemStack(MainBlocks.BlockPoopClean), new Object[]{"ppp", "ppp", "ppp",
                'p', MainItems.CleanPoopItem});
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.BlockBirdPoop), new Object[]{"ppp", "ppp", "ppp",
                'p', MainItems.ItemBirdPoop});

        GameRegistry.addRecipe(new ItemStack(MainBlocks.BlockBirdPoopClean), new Object[]{"ppp", "ppp", "ppp",
                'p', MainItems.ItemBirdPoopClean});
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.BlockManure), new Object[]{"ppp", "ppp", "ppp",
                'p', MainItems.ItemManure});

        GameRegistry.addRecipe(new ItemStack(MainBlocks.BlockManureClean), new Object[]{"ppp", "ppp", "ppp",
                'p', MainItems.ItemManureClean});
        
        GameRegistry.addRecipe(new ItemStack(MainBlocks.UltimatePoopBlock), new Object[]{"ppp", "ppp", "ppp",
                'p', MainItems.UltimatePoopIngot});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.PoopItem,9), new Object[]{"p",
                'p', MainBlocks.BlockPoop});
        //
        GameRegistry.addRecipe(new ItemStack(MainItems.CleanPoopItem,9), new Object[]{"p",
                'p', MainBlocks.BlockPoopClean});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.ItemBirdPoop,9), new Object[]{"p",
                'p', MainBlocks.BlockBirdPoopClean});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.ItemBirdPoopClean,9), new Object[]{"p",
                'p', MainBlocks.BlockBirdPoopClean});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.ItemManure,9), new Object[]{"p",
                'p', MainBlocks.BlockManure});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.ItemManureClean,9), new Object[]{"p",
                'p', MainBlocks.BlockManureClean});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.UltimatePoopIngot,9), new Object[]{"p",
                'p', MainBlocks.UltimatePoopBlock});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.CleanPoopItem,9), new Object[]{"p",
                'p', MainBlocks.BlockPoopClean});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.ItemPoopball,4), new Object[]{"p",
                'p', MainItems.PoopItem});
        //
        GameRegistry.addRecipe(new ItemStack(MainItems.ItemPoopball,4), new Object[]{"p",
                'p', MainItems.CleanPoopItem});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.ItemPoopball,4), new Object[]{"p",
                'p', MainItems.ItemBirdPoop});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.ItemPoopball,4), new Object[]{"p",
                'p', MainItems.ItemBirdPoopClean});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.ItemPoopball,4), new Object[]{"p",
                'p', MainItems.ItemManure});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.ItemPoopball,4), new Object[]{"p",
                'p', MainItems.ItemManureClean});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.ItemPoopball,16), new Object[]{"p",
                'p', MainItems.UltimatePoopIngot});
        //
        GameRegistry.addRecipe(new ItemStack(MainItems.shovelPoop), new Object[]{"p", "s", "s",
                'p',MainBlocks. BlockPoopClean, 's', Items.stick});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.pickaxePoop), new Object[]{"ppp", " s ", " s ",
                'p', MainBlocks.BlockPoopClean, 's', Items.stick});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.axePoop), new Object[]{"pp ", "ps ", " s ",
                'p', MainBlocks.BlockPoopClean, 's', Items.stick});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.swordPoop), new Object[]{"p", "p", "s",
                'p', MainBlocks.BlockPoopClean, 's', Items.stick});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.hoePoop), new Object[]{"pp ", " s ", " s ",
                'p', MainBlocks.BlockPoopClean, 's', Items.stick});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.shovelBirdPoop), new Object[]{"p", "s", "s",
                'p', MainBlocks.BlockBirdPoopClean, 's', Items.stick});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.pickaxeBirdPoop), new Object[]{"ppp", " s ", " s ",
                'p', MainBlocks.BlockBirdPoopClean, 's', Items.stick});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.axeBirdPoop), new Object[]{"pp ", "ps ", " s ",
                'p', MainBlocks.BlockBirdPoopClean, 's', Items.stick});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.swordBirdPoop), new Object[]{"p", "p", "s",
                'p', MainBlocks.BlockBirdPoopClean, 's', Items.stick});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.hoeBirdPoop), new Object[]{"pp ", " s ", " s ",
                'p', MainBlocks.BlockBirdPoopClean, 's', Items.stick});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.shovelBirdPoop), new Object[]{"p", "s", "s",
                'p', MainBlocks.BlockManureClean, 's', Items.stick});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.pickaxeManure), new Object[]{"ppp", " s ", " s ",
                'p', MainBlocks.BlockManureClean, 's', Items.stick});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.axeManure), new Object[]{"pp ", "ps ", " s ",
                'p', MainBlocks.BlockManureClean, 's', Items.stick});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.swordManure), new Object[]{"p", "p", "s",
                'p', MainBlocks.BlockManureClean, 's', Items.stick});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.hoeManure), new Object[]{"pp ", " s ", " s ",
                'p', MainBlocks.BlockManureClean, 's', Items.stick});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.shovelUltimate), new Object[]{"p", "s", "s",
                'p', MainBlocks.UltimatePoopBlock, 's', Items.stick});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.pickaxeUltimate), new Object[]{"ppp", " s ", " s ",
                'p', MainBlocks.UltimatePoopBlock, 's', Items.stick});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.axeUltimate), new Object[]{"pp ", "ps ", " s ",
                'p', MainBlocks.UltimatePoopBlock, 's', Items.stick});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.swordUltimate), new Object[]{"p", "p", "s",
                'p', MainBlocks.UltimatePoopBlock, 's', Items.stick});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.hoeUltimate), new Object[]{"pp ", " s ", " s ",
                'p', MainBlocks.UltimatePoopBlock, 's', Items.stick});
       
        GameRegistry.addRecipe(new ItemStack(MainItems.helmetPoop), new Object[]{"ppp", "p p",
                'p', MainBlocks.BlockPoopClean});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.platePoop), new Object[]{"p p", "ppp", "ppp",
                'p', MainBlocks.BlockPoopClean});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.legsPoop), new Object[]{"ppp", "p p", "p p",
                'p', MainBlocks.BlockPoopClean});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.bootsPoop), new Object[]{"p p", "p p",
                'p', MainBlocks.BlockPoopClean});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.helmetBirdPoop), new Object[]{"ppp", "p p",
                'p', MainBlocks.BlockBirdPoopClean});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.plateBirdPoop), new Object[]{"p p", "ppp", "ppp",
                'p', MainBlocks.BlockBirdPoopClean});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.legsBirdPoop), new Object[]{"ppp", "p p", "p p",
                'p', MainBlocks.BlockBirdPoopClean});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.bootsBirdPoop), new Object[]{"p p", "p p",
                'p', MainBlocks.BlockBirdPoopClean});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.helmetManure), new Object[]{"ppp", "p p",
                'p', MainBlocks.BlockManureClean});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.plateManure), new Object[]{"p p", "ppp", "ppp",
                'p', MainBlocks.BlockManureClean});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.legsManure), new Object[]{"ppp", "p p", "p p",
                'p', MainBlocks.BlockManureClean});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.bootsManure), new Object[]{"p p", "p p",
                'p', MainBlocks.BlockManureClean});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.helmetUltimate), new Object[]{"ppp", "p p",
                'p', MainBlocks.UltimatePoopBlock});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.plateUltimate), new Object[]{"p p", "ppp", "ppp",
                'p', MainBlocks.UltimatePoopBlock});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.legsUltimate), new Object[]{"ppp", "p p", "p p",
                'p', MainBlocks.UltimatePoopBlock});
        
        GameRegistry.addRecipe(new ItemStack(MainItems.bootsUltimate), new Object[]{"p p", "p p",
                'p', MainBlocks.UltimatePoopBlock});
        
        GameRegistry.addShapelessRecipe(new ItemStack(MainItems.UltimatePoopIngot),new Object[]{
        		MainBlocks.BlockBirdPoopClean, MainBlocks.BlockManureClean, MainBlocks.BlockPoopClean, Items.coal, Items.slime_ball});

	}
}
