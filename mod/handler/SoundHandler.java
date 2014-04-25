package com.poopmod.mod.handler;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.client.event.sound.SoundLoadEvent;

public class SoundHandler
{
	@SideOnly(Side.CLIENT)
    public void onSound(SoundLoadEvent event)
    {
        try
        {
        	/*
        	event.manager.addSound("krebsmodid:toilet1.ogg");
        	event.manager.addSound("krebsmodid:toilet2.ogg");
        	event.manager.addSound("krebsmodid:toilet3.ogg");
        	*/
        }
        catch (Exception e)
        {
            System.err.println("Failed to register sounds in PoopMod.");
        }
    }
}