package com.poopmod.mod;

import java.util.Map;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import com.poopmod.mod.blocks.MainBlocks;
import com.poopmod.mod.entity.EntityPoopball;
import com.poopmod.mod.items.MainItems;
import com.poopmod.mod.main.Achievments;
import com.poopmod.mod.main.PoopyTab;
import com.poopmod.mod.manager.ConfigManager;
import com.poopmod.mod.manager.EnumManager;
import com.poopmod.mod.manager.RecipeManager;
import com.poopmod.mod.proxy.CommonProxy;
import com.poopmod.mod.register.Registry;
import com.poopmod.mod.render.RenderPoopball;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid="poopmod", name="PoopCraft", version="1.1.0") 

public class PoopMod{
	
        @Instance(value = "poopmod")
        public static PoopMod instance;

        @SidedProxy(clientSide="com.poopmod.mod.proxy.ClientProxy", serverSide="com.poopmod.mod.proxy.CommonProxy")
        public static CommonProxy proxy;

        public static CreativeTabs poopytab = new PoopyTab("poopytab");

        static Entity EntityPoopball;

        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
        	ConfigManager.addConfigFile(event);
            proxy.registerRenderers();
            Registry.RegisterEntitys(event);
            EnumManager.addEnumTypes(event);
            MainBlocks.addBlocks(event);
            MainItems.addItems(event);
            Registry.RegisterItems(event);
            Registry.RegisterBlocks(event);   
            Registry.RegisterBlockHarvestlevel(event);
            Achievments.addAchievments(event);
            RecipeManager.addRecipes();
        }
        
        @EventHandler
        public void load(FMLInitializationEvent event) {
        }
        
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
        }
        
        @SideOnly(Side.CLIENT)
		 public void addRenderer(Map<Class<EntityPoopball>, RenderPoopball> map)
         {
                        map.put(EntityPoopball.class, new RenderPoopball());
         }
}