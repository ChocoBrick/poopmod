package com.poopmod.mod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import com.poopmod.mod.main.Achievments;

public class ItemPoop extends ItemFood {
        public ItemPoop(int par1, int par2, float par3, boolean par4) {
                super(par1, par2, par4);
        }

        public void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
        {
            super.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
            
        	if((this == MainItems.PoopItem) || (this == MainItems.ItemBirdPoop) || (this == MainItems.ItemManure)){

            	if (!par2World.isRemote)
            	{
            		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.hunger.id, 600, 3));
            		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 600, 3));
            		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.poison.id, 600, 3));
            		par3EntityPlayer.addStat(Achievments.eatShitAchieve, 1);
            	}
        	}
        }
}
