package com.poopmod.mod.main;

import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import com.poopmod.mod.items.MainItems;


public class Achievments {

	public static Achievement eatShitAchieve;
	public static Achievement eatCleanShitAchieve;
	
	public static void addAchievments(){
		
	 eatShitAchieve = new Achievement("eatShitAchieve", "eatShitAchieve", 1, -6, MainItems.PoopItem, AchievementList.buildWorkBench).registerStat();
   	 eatCleanShitAchieve = new Achievement("eatCleanShitAchieve", "eatCleanShitAchieve",-1, -6, MainItems.CleanPoopItem, eatShitAchieve).registerStat();
  
	}

}
