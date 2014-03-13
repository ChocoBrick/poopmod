package com.krebs.mod;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class PoopDroping {
   public static double rand;
   
   @ForgeSubscribe
   public void onEntityDrop(LivingDropsEvent event) {
	   
	   //cow/sheep/pig
         if ((event.entityLiving instanceof EntityCow) || (event.entityLiving instanceof EntitySheep) || (event.entityLiving instanceof EntityPig)){
                            rand = Math.random();
                    //1D = 100%, .5D = 50%        
            if (rand < 0.3D) {
               event.entityLiving.dropItem(Anythinghonestly.ItemManure.itemID, 1);
            }
         }
         
         //chicken
         if (event.entityLiving instanceof EntityChicken){
             rand = Math.random();
     //1D = 100%, .5D = 50%        
             if (rand < 0.3D) {
            	 event.entityLiving.dropItem(Anythinghonestly.ItemBirdPoop.itemID, 1);
             }
         }
         
         //zombie
         if (event.entityLiving instanceof EntityZombie){
             rand = Math.random();
     //1D = 100%, .5D = 50%        
             if (rand < 0.1D) {
            	 event.entityLiving.dropItem(Anythinghonestly.PoopItem.itemID, 1);
             }
         }
         
         
      }
}