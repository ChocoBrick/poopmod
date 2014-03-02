package com.krebs.mod;

import java.util.Map;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
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
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.common.Configuration;

@Mod(modid="KrebsModID", name="PoopCraft", version="1.0.0")
@NetworkMod(clientSideRequired=true)
public class Anythinghonestly {
        @Instance(value = "KrebsModID")
        public static Anythinghonestly instance;

        @SidedProxy(clientSide="com.krebs.mod.ClientProxy", serverSide="com.krebs.mod.CommonProxy")
        public static CommonProxy proxy;

        public static CreativeTabs tabkrebs = new CreativeTabs("tabkrebs") {
            public ItemStack getIconItemStack() {
                    return new ItemStack(PoopItem, 1, 0);
            }
    };
    
    //hurray alex is on!

    static Item PoopItem;
    static Item CleanPoopItem;
    static Item ItemPoopball;
    
    static Item ItemBirdPoop;
    static Item ItemBirdPoopClean;
    static Item ItemManure;
    static Item ItemManureClean;
    
    static Item shovelPoop;
    static Item pickaxePoop;
    static Item axePoop;
    static Item swordPoop; 
    static Item hoePoop;
    
    static Item helmetPoop;
    static Item platePoop;
    static Item legsPoop;
    static Item bootsPoop;
    
    static Entity EntityPoopball;
    
    static EnumToolMaterial toolPoop;
    static EnumArmorMaterial armorPoop;
    static EnumToolMaterial toolBirdPoop;
    static EnumArmorMaterial armorBirdPoop;
    static EnumToolMaterial toolManurePoop;
    static EnumArmorMaterial armorManurePoop;
    static EnumToolMaterial toolUltimatePoop;
    static EnumArmorMaterial armoUltimatePoop;
    
    static Block toilet;
    static Block BlockPoop;
    static Block BlockPoopClean;
    
    static Block BlockBirdPoop;
    static Block BlockBirdPoopClean;
    static Block BlockManure;
    static Block BlockManureClean;
    
    static Achievement eatShitAchieve;
    static Achievement eatCleanShitAchieve;

        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
        	MinecraftForge.EVENT_BUS.register(new KrebsMod_EventSounds());

        	Configuration configFile = new Configuration(event.getSuggestedConfigurationFile());

        	configFile.load();

        	//blocks
            int toiletId = configFile.get(Configuration.CATEGORY_BLOCK, "Toilet Block", 2460).getInt();
            int BlockPoopId = configFile.get(Configuration.CATEGORY_BLOCK, "Poop Block", 2461).getInt();
            int BlockPoopCleanId = configFile.get(Configuration.CATEGORY_BLOCK, "'Sanitized' Poop Block", 2462).getInt();
            int BlockBirdPoopId = configFile.get(Configuration.CATEGORY_BLOCK, "Bird Poop Block", 2463).getInt();
            int BlockBirdPoopCleanId = configFile.get(Configuration.CATEGORY_BLOCK, "'Sanitized' Bird Poop Block", 2464).getInt();
            int BlockManureId = configFile.get(Configuration.CATEGORY_BLOCK, "Manure Block", 2465).getInt();
            int BlockManureCleanId = configFile.get(Configuration.CATEGORY_BLOCK, "'Sanitized' Manure Block", 2466).getInt();

            //poop items
            int PoopId = configFile.getItem("Poop", 5000).getInt();
            int CleanPoopId = configFile.getItem("'Sanitized' Poop", 5001).getInt();
            int PoopballId = configFile.getItem("Poopball", 5002).getInt();
            int BirdPoopId = configFile.getItem("Bird Poop", 5003).getInt();
            int CleanBirdPoopId = configFile.getItem("Sanitized Bird Poop", 5004).getInt();
            int ManureId = configFile.getItem("Manure", 5005).getInt();
            int CleanManureId = configFile.getItem("Sanitized Manure", 5006).getInt();
            
            //tools
            int shovelPoopId = configFile.getItem("Poop Shovel", 5020).getInt();
            int pickaxePoopId = configFile.getItem("Poop Pickaxe", 5021).getInt();
            int axePoopId = configFile.getItem("Poop Axe", 5022).getInt();
            int swordPoopId = configFile.getItem("Poop Sword", 5023).getInt();
            int hoePoopId = configFile.getItem("Poop Hoe", 5024).getInt();
            
            //armor
            int helmetPoopId = configFile.getItem("Poop Helmet", 5025).getInt();
            int platePoopId = configFile.getItem("Poop Plate", 5026).getInt();
            int legsPoopId = configFile.getItem("Poop Leggings", 5027).getInt();
            int bootsPoopId = configFile.getItem("Poop Boots", 5028).getInt();

            configFile.save();
            
            //Tool Enums
            toolPoop = net.minecraftforge.common.EnumHelper.addToolMaterial("POOP", 2, 64, 18F, 1, 4);
            toolBirdPoop = net.minecraftforge.common.EnumHelper.addToolMaterial("BIRDPOOP", 2, 60, 17F, 1, 4);
            toolManurePoop = net.minecraftforge.common.EnumHelper.addToolMaterial("COWPOOP", 2, 62, 17F, 1, 4);
            
            //Armour Enums
            armorPoop = net.minecraftforge.common.EnumHelper.addArmorMaterial("POOP", 64, new int[] {2, 7, 5, 3}, 4);
            armorBirdPoop = net.minecraftforge.common.EnumHelper.addArmorMaterial("BIRDPOOP", 64, new int[] {3, 6, 6, 2}, 4); 
            armorManurePoop = net.minecraftforge.common.EnumHelper.addArmorMaterial("COWPOOP", 64, new int[] {1, 8, 4, 4}, 4);

            //Items
            ItemPoopball = new ItemPoopball(PoopballId, 1, 1, true).setUnlocalizedName("poopball").setCreativeTab(tabkrebs).setTextureName("krebsmodid:poopball");
            PoopItem = new ItemPoop(PoopId, 3, 1.2F, true).setAlwaysEdible().setUnlocalizedName("poopI").setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop");
            CleanPoopItem  = new ItemCleanPoop(CleanPoopId, 6, 1.2F, true).setAlwaysEdible().setUnlocalizedName("cleanpoopI").setCreativeTab(tabkrebs).setTextureName("krebsmodid:cleanpoop");
            ItemBirdPoop = new ItemPoop(BirdPoopId, 1, 1.2F, true).setAlwaysEdible().setUnlocalizedName("BpoopI").setCreativeTab(tabkrebs).setTextureName("krebsmodid:birdpoop");
            ItemBirdPoopClean = new ItemPoop(CleanBirdPoopId, 2, 1.2F, true).setAlwaysEdible().setUnlocalizedName("BCpoopI").setCreativeTab(tabkrebs).setTextureName("krebsmodid:birdpoopcleani");
            ItemManure = new ItemPoop(ManureId, 2, 1.2F, true).setAlwaysEdible().setUnlocalizedName("CpoopI").setCreativeTab(tabkrebs).setTextureName("krebsmodid:cowpoop");
            ItemManureClean = new ItemPoop(CleanManureId, 4, 1.2F, true).setAlwaysEdible().setUnlocalizedName("CCpoopI").setCreativeTab(tabkrebs).setTextureName("krebsmodid:cowpoopclean");
            
            //Tools
            shovelPoop = (new ItemSpade(shovelPoopId, toolPoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_shovel").setUnlocalizedName("phovelpoop");
            pickaxePoop = (new ItemPickaxe(pickaxePoopId, toolPoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_pickaxe").setUnlocalizedName("pickpoop");
            axePoop = (new ItemAxe(axePoopId, toolPoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_axe").setUnlocalizedName("axepoop");
            swordPoop = (new ItemSword(swordPoopId, toolPoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_sword").setUnlocalizedName("swordpoop");
            hoePoop = (new ItemHoe(hoePoopId, toolPoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_hoe").setUnlocalizedName("hoepoop");
            
            //Armor
            helmetPoop = (new PoopArmor(helmetPoopId, armorPoop, 3, 0)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_helmet").setUnlocalizedName("helmetpoop");
            platePoop = (new PoopArmor(platePoopId, armorPoop, 3, 1)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_chestplate").setUnlocalizedName("platepoop");
            legsPoop = (new PoopArmor(legsPoopId, armorPoop, 3, 2)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_leggings").setUnlocalizedName("legspoop");
            bootsPoop = (new PoopArmor(bootsPoopId, armorPoop, 3, 3)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_boots").setUnlocalizedName("bootspoop");
            
            //Blocks
            toilet = new BlockToilet(toiletId, Material.iron, false).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("toilet").setCreativeTab(tabkrebs);
            BlockPoop = new BlockPoop(BlockPoopId, Material.ground).setStepSound(Block.soundSandFootstep).setUnlocalizedName("poopblock").setCreativeTab(tabkrebs).setTextureName("krebsmodid:poopblock");
            BlockPoopClean = new BlockPoop(BlockPoopCleanId, Material.ground).setStepSound(Block.soundSandFootstep).setUnlocalizedName("cleanpoopblock").setCreativeTab(tabkrebs).setTextureName("krebsmodid:poopblockclean");
            BlockBirdPoop = new BlockPoop(BlockBirdPoopId, Material.ground).setStepSound(Block.soundSandFootstep).setUnlocalizedName("poopbirdblock").setCreativeTab(tabkrebs).setTextureName("krebsmodid:birdpoop");
            BlockBirdPoopClean = new BlockPoop(BlockBirdPoopCleanId, Material.ground).setStepSound(Block.soundSandFootstep).setUnlocalizedName("cleanpoopbirdblock").setCreativeTab(tabkrebs).setTextureName("krebsmodid:birdpoopclean");
            BlockManure = new BlockPoop(BlockManureId, Material.ground).setStepSound(Block.soundSandFootstep).setUnlocalizedName("manureblock").setCreativeTab(tabkrebs).setTextureName("krebsmodid:cowpoop");
            BlockManureClean = new BlockPoop(BlockManureCleanId, Material.ground).setStepSound(Block.soundSandFootstep).setUnlocalizedName("manureblockclean").setCreativeTab(tabkrebs).setTextureName("krebsmodid:cowpoopclean");

            //Achivements
            eatShitAchieve = new Achievement(1500, "eatShitAchieve", 1, -6, PoopItem, AchievementList.buildWorkBench).registerAchievement();
            eatCleanShitAchieve = new Achievement(1501, "eatCleanShitAchieve", -1, -6, CleanPoopItem, eatShitAchieve).registerAchievement();
        }
        

        @EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();

                LanguageRegistry.addName(PoopItem,"Poop");
                LanguageRegistry.addName(CleanPoopItem, "'Sanitized' Poop");
                
                LanguageRegistry.addName(ItemBirdPoop,"Bird Poop");
                LanguageRegistry.addName(ItemBirdPoopClean, "'Sanitized' Bird Poop");
                LanguageRegistry.addName(ItemManure,"Manure");
                LanguageRegistry.addName(ItemManureClean, "'Sanitized' Manure");
                
                LanguageRegistry.addName(ItemPoopball, "Poopball");
                
                LanguageRegistry.addName(toilet,"Toilet");
                LanguageRegistry.addName(BlockPoop,"Poop Block");
                LanguageRegistry.addName(BlockPoopClean, "'Sanitized' Poop Block");
                LanguageRegistry.addName(BlockBirdPoop,"Bird Poop Block");
                LanguageRegistry.addName(BlockBirdPoopClean, "'Sanitized' Bird Poop Block");
                LanguageRegistry.addName(BlockManure,"Manure Block");
                LanguageRegistry.addName(BlockManureClean, "'Sanitized' Manure Block");
                
                LanguageRegistry.addName(shovelPoop, "Poop Shovel");
                LanguageRegistry.addName(pickaxePoop, "Poop Pickaxe");
                LanguageRegistry.addName(axePoop, "Poop Axe");
                LanguageRegistry.addName(swordPoop, "Poop Sword");
                LanguageRegistry.addName(hoePoop, "Poop Hoe");
                
                LanguageRegistry.addName(helmetPoop, "Poop Helmet");
                LanguageRegistry.addName(platePoop, "Poop Chestplate");
                LanguageRegistry.addName(legsPoop, "Poop Leggings");
                LanguageRegistry.addName(bootsPoop, "Poop Boots");

                LanguageRegistry.instance().addStringLocalization("achievement.eatShitAchieve", "en_US", "Got Poop!");
                LanguageRegistry.instance().addStringLocalization("achievement.eatShitAchieve.desc", "en_US", "You fool! What's wrong with you!!!");
                LanguageRegistry.instance().addStringLocalization("achievement.eatCleanShitAchieve", "en_US", "Got 'Clean' Poop!");
                LanguageRegistry.instance().addStringLocalization("achievement.eatCleanShitAchieve.desc", "en_US", "That's still disgusting.");
                LanguageRegistry.instance().addStringLocalization("itemGroup.tabkrebs", "en_US", "Poop Mod");

                GameRegistry.registerBlock(toilet, toilet.getUnlocalizedName());
                GameRegistry.registerBlock(BlockPoop, BlockPoop.getUnlocalizedName());
                GameRegistry.registerBlock(BlockPoopClean, BlockPoopClean.getUnlocalizedName());
                GameRegistry.registerBlock(BlockBirdPoop, BlockBirdPoop.getUnlocalizedName());
                GameRegistry.registerBlock(BlockBirdPoopClean, BlockBirdPoopClean.getUnlocalizedName());
                GameRegistry.registerBlock(BlockManure, BlockManure.getUnlocalizedName());
                GameRegistry.registerBlock(BlockManureClean, BlockManureClean.getUnlocalizedName());
                
                
                MinecraftForge.setBlockHarvestLevel(toilet, "pickaxe", 1);
                MinecraftForge.setBlockHarvestLevel(BlockPoop, "shovel", 1);
                MinecraftForge.setBlockHarvestLevel(BlockPoopClean, "shovel", 1);
                MinecraftForge.setBlockHarvestLevel(BlockBirdPoop, "shovel", 1);
                MinecraftForge.setBlockHarvestLevel(BlockBirdPoopClean, "shovel", 1);
                MinecraftForge.setBlockHarvestLevel(BlockManure, "shovel", 1);
                MinecraftForge.setBlockHarvestLevel(BlockManureClean, "shovel", 1);

                GameRegistry.addRecipe(new ItemStack(toilet), "iwi", "iqi", "iii",
                        'i', Item.ingotIron, 'w', Item.bucketWater, 'q', Item.netherQuartz);

                GameRegistry.addRecipe(new ItemStack(BlockPoop), "ppp", "ppp", "ppp",
                        'p', PoopItem);

                GameRegistry.addRecipe(new ItemStack(BlockPoopClean), "ppp", "ppp", "ppp",
                        'p', CleanPoopItem);
                
                GameRegistry.addRecipe(new ItemStack(BlockBirdPoop), "ppp", "ppp", "ppp",
                        'p', ItemBirdPoop);

                GameRegistry.addRecipe(new ItemStack(BlockBirdPoopClean), "ppp", "ppp", "ppp",
                        'p', ItemBirdPoopClean);
                
                GameRegistry.addRecipe(new ItemStack(BlockManure), "ppp", "ppp", "ppp",
                        'p', ItemManure);

                GameRegistry.addRecipe(new ItemStack(BlockManureClean), "ppp", "ppp", "ppp",
                        'p', ItemManureClean);
                
                GameRegistry.addRecipe(new ItemStack(PoopItem,9), "p",
                        'p', BlockPoop);
                
                GameRegistry.addRecipe(new ItemStack(CleanPoopItem,9), "p",
                        'p', BlockPoopClean);
                
                GameRegistry.addRecipe(new ItemStack(ItemPoopball,4), "p",
                        'p', PoopItem);
                
                GameRegistry.addRecipe(new ItemStack(ItemPoopball,4), "p",
                        'p', CleanPoopItem);
                
                GameRegistry.addRecipe(new ItemStack(shovelPoop), "p", "s", "s",
                        'p', BlockPoopClean, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(pickaxePoop), "ppp", " s ", " s ",
                        'p', BlockPoopClean, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(axePoop), "pp ", "ps ", " s ",
                        'p', BlockPoopClean, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(swordPoop), "p", "p", "s",
                        'p', BlockPoopClean, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(hoePoop), "pp ", " s ", " s ",
                        'p', BlockPoopClean, 's', Item.stick);
                
                GameRegistry.addRecipe(new ItemStack(helmetPoop), "ppp", "p p",
                        'p', BlockPoopClean);
                
                GameRegistry.addRecipe(new ItemStack(platePoop), "p p", "ppp", "ppp",
                        'p', BlockPoopClean);
                
                GameRegistry.addRecipe(new ItemStack(legsPoop), "ppp", "p p", "p p",
                        'p', BlockPoopClean);
                
                GameRegistry.addRecipe(new ItemStack(bootsPoop), "p p", "p p",
                        'p', BlockPoopClean);

                GameRegistry.addSmelting(PoopItem.itemID, new ItemStack(CleanPoopItem), 5f);
                GameRegistry.addSmelting(ItemBirdPoop.itemID, new ItemStack(ItemBirdPoopClean), 5f);
                GameRegistry.addSmelting(ItemManure.itemID, new ItemStack(ItemManureClean), 5f);
                
                EntityRegistry.registerModEntity(EntityPoopball.class, "Poopball", 1, instance, 120, 3, true);

                
                
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