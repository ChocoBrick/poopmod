package com.poopmod.mod;

import java.util.Map;

import com.poopmod.mod.armor.PoopArmor;
import com.poopmod.mod.blocks.BlockPoop;
import com.poopmod.mod.blocks.BlockToilet;
import com.poopmod.mod.handler.SoundHandler;
import com.poopmod.mod.items.ItemCleanPoop;
import com.poopmod.mod.items.ItemPoop;
import com.poopmod.mod.items.ItemPoopball;
import com.poopmod.mod.main.PoopyTab;
import com.poopmod.mod.porxy.CommonProxy;
import com.poopmod.mod.register.Registry;
import com.poopmod.mod.tools.PoopHoe;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.*;
import net.minecraft.entity.Entity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid="poopmod", name="PoopCraft", version="1.1.0") 
public class PoopMod<EnumToolMaterial> {
        @Instance(value = "poopmod")
        public static PoopMod instance;

        @SidedProxy(clientSide="com.krebs.mod.ClientProxy", serverSide="com.krebs.mod.CommonProxy")
        public static CommonProxy proxy;

        public static CreativeTabs poopytab = new PoopyTab("poopytab");

    
    
    static Entity EntityPoopball;
    

    
    
    static Achievement eatShitAchieve;
    static Achievement eatCleanShitAchieve;

        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
        	MainConfig.addConfigFile();


        	
            

            
            //Tool Enums
           

            //Achivements
            eatShitAchieve = new Achievement(1500, "eatShitAchieve", 1, -6, PoopItem, AchievementList.buildWorkBench).registerAchievement();
            eatCleanShitAchieve = new Achievement(1501, "eatCleanShitAchieve", -1, -6, CleanPoopItem, eatShitAchieve).registerAchievement();
        }
        

        @EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                Recipes.addRecipes();
                Registry.RegisterEntitys();
                EnumManager.addEnumTypes();
                MainBlocks.addBlocks();
                MainItems.addItems();
                Registry.RegisterBlocks();   
                Registry.RegisterBlockHarvestlevel();
                

        }
        
        @SideOnly(Side.CLIENT)
		 public void addRenderer(Map map)
         {
                        map.put(EntityPoopball.class, new RenderPoopball());
         }

        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
        }
}