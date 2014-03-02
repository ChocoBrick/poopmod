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
    
    //hurray This is alex!

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

            int toiletId = configFile.get(Configuration.CATEGORY_BLOCK, "Toilet Block", 2460).getInt();
            int BlockPoopId = configFile.get(Configuration.CATEGORY_BLOCK, "Poop Block", 2461).getInt();
            int BlockPoopCleanId = configFile.get(Configuration.CATEGORY_BLOCK, "'Sanitized' Poop Block", 2462).getInt();

            int PoopId = configFile.getItem("Poop", 5000).getInt();
            int CleanPoopId = configFile.getItem("'Sanitized' Poop", 5001).getInt();
            int PoopballId = configFile.getItem("Poopball", 5002).getInt();
            
            int shovelPoopId = configFile.getItem("Poop Shovel", 5003).getInt();
            int pickaxePoopId = configFile.getItem("Poop Pickaxe", 5004).getInt();
            int axePoopId = configFile.getItem("Poop Axe", 5005).getInt();
            int swordPoopId = configFile.getItem("Poop Sword", 5006).getInt();
            int hoePoopId = configFile.getItem("Poop Hoe", 5007).getInt();
            
            int helmetPoopId = configFile.getItem("Poop Helmet", 5008).getInt();
            int platePoopId = configFile.getItem("Poop Plate", 5009).getInt();
            int legsPoopId = configFile.getItem("Poop Leggings", 5010).getInt();
            int bootsPoopId = configFile.getItem("Poop Boots", 5011).getInt();

            configFile.save();
            
            toolPoop = net.minecraftforge.common.EnumHelper.addToolMaterial("POOP", 2, 64, 18F, 1, 4);
            armorPoop = net.minecraftforge.common.EnumHelper.addArmorMaterial("POOP", 64, new int[] {2, 7, 5, 3}, 4);

            PoopItem = new ItemPoop(PoopId, 3, 1.2F, true).setAlwaysEdible().setUnlocalizedName("poopI").setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop");
            CleanPoopItem  = new ItemCleanPoop(CleanPoopId, 6, 1.2F, true).setAlwaysEdible().setUnlocalizedName("cleanpoopI").setCreativeTab(tabkrebs).setTextureName("krebsmodid:cleanpoop");
            ItemPoopball  = new ItemPoopball(PoopballId, 20, 1.2F, true).setUnlocalizedName("poopballI").setCreativeTab(tabkrebs).setTextureName("krebsmodid:poopball");
            
            shovelPoop = (new ItemSpade(shovelPoopId, toolPoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_shovel").setUnlocalizedName("phovelpoop");
            pickaxePoop = (new ItemPickaxe(pickaxePoopId, toolPoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_pickaxe").setUnlocalizedName("pickpoop");
            axePoop = (new ItemAxe(axePoopId, toolPoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_axe").setUnlocalizedName("axepoop");
            swordPoop = (new ItemSword(swordPoopId, toolPoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_sword").setUnlocalizedName("swordpoop");
            hoePoop = (new ItemHoe(hoePoopId, toolPoop)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_hoe").setUnlocalizedName("hoepoop");
            
            helmetPoop = (new PoopArmor(helmetPoopId, armorPoop, 3, 0)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_helmet").setUnlocalizedName("helmetpoop");
            platePoop = (new PoopArmor(platePoopId, armorPoop, 3, 1)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_chestplate").setUnlocalizedName("platepoop");
            legsPoop = (new PoopArmor(legsPoopId, armorPoop, 3, 2)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_leggings").setUnlocalizedName("legspoop");
            bootsPoop = (new PoopArmor(bootsPoopId, armorPoop, 3, 3)).setCreativeTab(tabkrebs).setTextureName("krebsmodid:poop_boots").setUnlocalizedName("bootspoop");
            
            toilet = new BlockToilet(toiletId, Material.iron, false).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("toilet").setCreativeTab(tabkrebs);
            BlockPoop = new BlockPoop(BlockPoopId, Material.ground).setStepSound(Block.soundSandFootstep).setUnlocalizedName("poopblock").setCreativeTab(tabkrebs).setTextureName("krebsmodid:poopblock");
            BlockPoopClean = new BlockPoop(BlockPoopCleanId, Material.ground).setStepSound(Block.soundSandFootstep).setUnlocalizedName("cleanpoopblock").setCreativeTab(tabkrebs).setTextureName("krebsmodid:poopblockclean");

            eatShitAchieve = new Achievement(1500, "eatShitAchieve", 1, -6, PoopItem, AchievementList.buildWorkBench).registerAchievement();
            eatCleanShitAchieve = new Achievement(1501, "eatCleanShitAchieve", -1, -6, CleanPoopItem, eatShitAchieve).registerAchievement();
        }
        

        @EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();

                LanguageRegistry.addName(PoopItem,"Poop");
                LanguageRegistry.addName(CleanPoopItem, "'Sanitized' Poop");
                LanguageRegistry.addName(ItemPoopball, "Poopball");
                LanguageRegistry.addName(toilet,"Toilet");
                LanguageRegistry.addName(BlockPoop,"Poop Block");
                LanguageRegistry.addName(BlockPoopClean, "'Sanitized' Poop Block");
                
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

                GameRegistry.registerBlock(toilet);
                GameRegistry.registerBlock(BlockPoop);
                GameRegistry.registerBlock(BlockPoopClean)
                ;
                MinecraftForge.setBlockHarvestLevel(toilet, "pickaxe", 1);
                MinecraftForge.setBlockHarvestLevel(BlockPoop, "shovel", 1);
                MinecraftForge.setBlockHarvestLevel(BlockPoopClean, "shovel", 1);

                GameRegistry.addRecipe(new ItemStack(toilet), "iwi", "iqi", "iii",
                        'i', Item.ingotIron, 'w', Item.bucketWater, 'q', Item.netherQuartz);

                GameRegistry.addRecipe(new ItemStack(BlockPoop), "ppp", "ppp", "ppp",
                        'p', PoopItem);

                GameRegistry.addRecipe(new ItemStack(BlockPoopClean), "ppp", "ppp", "ppp",
                        'p', CleanPoopItem);
                
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