package com.poopmod.mod.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.poopmod.mod.items.MainItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PoopyTab extends CreativeTabs {

public PoopyTab(String tabLabel)
{
super(tabLabel);
}

@Override
@SideOnly(Side.CLIENT)
public Item getTabIconItem()
{
return MainItems.PoopItem;
}

}