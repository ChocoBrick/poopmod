package com.poopmod.mod.armor;

import java.util.List;

import com.poopmod.mod.PoopMod;
import com.poopmod.mod.items.MainItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

		public class PoopArmor extends ItemArmor {
			public PoopArmor(int par1, ArmorMaterial par2EnumArmorMaterial,int par3, int par4) {
				super(par2EnumArmorMaterial, par3, par4);
			}

			
	        public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
	        {
	        	
	        		//poop
	                if(stack == MainItems.helmetPoop.getContainerItem(stack) || stack == MainItems.platePoop.getContainerItem(stack) || stack == MainItems.bootsPoop.getContainerItem(stack))
	                {
	                        return "krebsmodid:textures/armor/POOP_layer_1.png";//1
	                }
	                
	                if(stack == MainItems.legsPoop.getContainerItem(stack))
	                {
	                        return "krebsmodid:textures/armor/POOP_layer_2.png";//2
	                }
	               
	                //bird
	                if(stack == MainItems.helmetBirdPoop.getContainerItem(stack) || stack == MainItems.plateBirdPoop.getContainerItem(stack) || stack == MainItems.bootsBirdPoop.getContainerItem(stack))
	                {
	                        return "krebsmodid:textures/armor/BIRDPOOP_layer_1.png";//1
	                }
	                
	                if(stack == MainItems.legsBirdPoop.getContainerItem(stack))
	                {
	                        return "krebsmodid:textures/armor/BIRDPOOP_layer_2.png";//2
	                }
	                
	                //cow
	                if(stack == MainItems.helmetManure.getContainerItem(stack) || stack == MainItems.plateManure.getContainerItem(stack) || stack == MainItems.bootsManure.getContainerItem(stack))
	                {
	                        return "krebsmodid:textures/armor/COWPOOP_layer_1.png";//1
	                }
	                
	                if(stack == MainItems.legsManure.getContainerItem(stack))
	                {
	                        return "krebsmodid:textures/armor/COWPOOP_layer_2.png";//2
	                }
	                

	                //ultimate
	                
	                if(stack == MainItems.helmetUltimate.getContainerItem(stack) || stack == MainItems.plateUltimate.getContainerItem(stack) || stack == MainItems.bootsUltimate.getContainerItem(stack))
	                {
	                        return "krebsmodid:textures/armor/ULTIMATEPOOP_layer_1.png";//1
	                }
	                
	                if(stack == MainItems.legsUltimate.getContainerItem(stack))
	                {
	                        return "krebsmodid:textures/armor/ULTIMATEPOOP_layer_2.png";//2
	                }
	                
	                
	                //elseifnull
	                return "krebsmodid:textures/armor/POOP_layer_1.png";//1
	        }
	        
	        @Override      
	        public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	        {
	            par3List.add("Not the best decision...");
	        }
}