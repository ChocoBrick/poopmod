package com.poopmod.mod.items;

import com.poopmod.mod.PoopMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemCleanPoop extends ItemFood {
        public ItemCleanPoop(int par1, int par2, float par3, boolean par4) {
                super(par1, par2, par3, par4);
                // TODO Auto-generated constructor stub
        }

        public void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
        {
            super.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
            if (!par2World.isRemote)
            {
            	par3EntityPlayer.addStat(PoopMod.eatCleanShitAchieve, 1);
            }
        }
}
