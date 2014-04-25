package com.poopmod.mod;

import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class PoopDroping {
   public static double rand;
   
   @ForgeSubscribe
   public void onEntityDrop(LivingDropsEvent event) {
	   
	   //cow/sheep/pig
         if ((event.entityLiving instanceof EntityCow) || (event.entityLiving instanceof EntitySheep) || (event.entityLiving instanceof EntityPig) || (event.entityLiving instanceof EntityMooshroom) || (event.entityLiving instanceof EntityPigZombie)){
                            rand = Math.random();
                    //1D = 100%, .5D = 50%        
            if (rand < 0.2D) {
               event.entityLiving.dropItem(PoopMod.ItemManure.itemID, 1);
            }
         }
         
         //chicken
         if (event.entityLiving instanceof EntityChicken){
             rand = Math.random();
     //1D = 100%, .5D = 50%        
             if (rand < 0.35D) {
            	 event.entityLiving.dropItem(PoopMod.ItemBirdPoop.itemID, 1);
             }
         }
         
         //zombie/witch/villiger
         if ((event.entityLiving instanceof EntityZombie) || (event.entityLiving instanceof EntityWitch) || (event.entityLiving instanceof EntityVillager)){
             rand = Math.random();
     //1D = 100%, .5D = 50%        
             if (rand < 0.2D) {
            	 event.entityLiving.dropItem(PoopMod.PoopItem.itemID, 1);
             }
         }
         
         
      }
}