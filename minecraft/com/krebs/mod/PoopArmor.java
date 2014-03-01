package com.krebs.mod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

		public class PoopArmor extends ItemArmor {
			public PoopArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
					int par3, int par4) {
				super(par1, par2EnumArmorMaterial, par3, par4);
			}

			
	        public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
	        {
	                if(stack.itemID == Anythinghonestly.helmetPoop.itemID || stack.itemID == Anythinghonestly.platePoop.itemID || stack.itemID == Anythinghonestly.bootsPoop.itemID)
	                {
	                        return "krebsmodid:textures/armor/POOP_layer_1.png";//1
	                }
	                if(stack.itemID == Anythinghonestly.legsPoop.itemID)
	                {
	                        return "krebsmodid:textures/armor/POOP_layer_2.png";//2
	                }
	                return "krebsmodid:textures/armor/POOP_layer_1.png";//1
	        }
			
}