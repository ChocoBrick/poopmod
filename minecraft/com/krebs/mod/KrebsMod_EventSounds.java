package com.krebs.mod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class KrebsMod_EventSounds
{
	@SideOnly(Side.CLIENT)
    @ForgeSubscribe
    public void onSound(SoundLoadEvent event)
    {
        try
        {
        	event.manager.addSound("krebsmodid:toilet1.ogg");
        	event.manager.addSound("krebsmodid:toilet2.ogg");
        	event.manager.addSound("krebsmodid:toilet3.ogg");
        }
        catch (Exception e)
        {
            System.err.println("Failed to register one or more sounds in PoopMod.");
        }
    }
}