package com.poopmod.mod;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
        @Override
        public void registerRenderers() {
      
            RenderingRegistry.registerEntityRenderingHandler(EntityPoopball.class, new RenderPoopball());
        	
        }
}