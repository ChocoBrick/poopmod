package com.poopmod.mod.main;

import com.poopmod.mod.PoopMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PoopyTab extends CreativeTabs {

public PoopyTab(String tabLabel)
{
super(tabLabel);
}

@Override
@SideOnly(Side.CLIENT)
public Item getTabIconItem()
{
return Item.getItemFromBlock(PoopMod.BlockPoop);
}

}