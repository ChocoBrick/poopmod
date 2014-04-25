package com.poopmod.mod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemPoop extends ItemFood {
        public ItemPoop(int par1, int par2, float par3, boolean par4) {
                super(par1, par2, par3, par4);
                // TODO Auto-generated constructor stub
        }

        public void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
        {
            super.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
            
        	if((this == Anythinghonestly.PoopItem) || (this == Anythinghonestly.ItemBirdPoop) || (this == Anythinghonestly.ItemManure)){

            	if (!par2World.isRemote)
            	{
            		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.hunger.id, 600, 3));
            		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 600, 3));
            		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.poison.id, 600, 3));
            		par3EntityPlayer.addStat(Anythinghonestly.eatShitAchieve, 1);
            	}
        	}
        }
}
