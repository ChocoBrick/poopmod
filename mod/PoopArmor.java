package com.poopmod.mod;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

		public class PoopArmor extends ItemArmor {
			public PoopArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
					int par3, int par4) {
				super(par1, par2EnumArmorMaterial, par3, par4);
			}

			
	        public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
	        {
	        	
	        		//poop
	                if(stack.itemID == Anythinghonestly.helmetPoop.itemID || stack.itemID == Anythinghonestly.platePoop.itemID || stack.itemID == Anythinghonestly.bootsPoop.itemID)
	                {
	                        return "krebsmodid:textures/armor/POOP_layer_1.png";//1
	                }
	                
	                if(stack.itemID == Anythinghonestly.legsPoop.itemID)
	                {
	                        return "krebsmodid:textures/armor/POOP_layer_2.png";//2
	                }
	               
	                //bird
	                if(stack.itemID == Anythinghonestly.helmetBirdPoop.itemID || stack.itemID == Anythinghonestly.plateBirdPoop.itemID || stack.itemID == Anythinghonestly.bootsBirdPoop.itemID)
	                {
	                        return "krebsmodid:textures/armor/BIRDPOOP_layer_1.png";//1
	                }
	                
	                if(stack.itemID == Anythinghonestly.legsBirdPoop.itemID)
	                {
	                        return "krebsmodid:textures/armor/BIRDPOOP_layer_2.png";//2
	                }
	                
	                //cow
	                if(stack.itemID == Anythinghonestly.helmetManure.itemID || stack.itemID == Anythinghonestly.plateManure.itemID || stack.itemID == Anythinghonestly.bootsManure.itemID)
	                {
	                        return "krebsmodid:textures/armor/COWPOOP_layer_1.png";//1
	                }
	                
	                if(stack.itemID == Anythinghonestly.legsManure.itemID)
	                {
	                        return "krebsmodid:textures/armor/COWPOOP_layer_2.png";//2
	                }
	                

	                //ultimate
	                
	                if(stack.itemID == Anythinghonestly.helmetUltimate.itemID || stack.itemID == Anythinghonestly.plateUltimate.itemID || stack.itemID == Anythinghonestly.bootsUltimate.itemID)
	                {
	                        return "krebsmodid:textures/armor/ULTIMATEPOOP_layer_1.png";//1
	                }
	                
	                if(stack.itemID == Anythinghonestly.legsUltimate.itemID)
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