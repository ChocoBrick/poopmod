package com.poopmod.mod.proxy;

import com.poopmod.mod.entity.EntityPoopball;
import com.poopmod.mod.render.RenderPoopball;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
        @Override
        public void registerRenderers() {
      
            RenderingRegistry.registerEntityRenderingHandler(EntityPoopball.class, new RenderPoopball());
        	
        }
}