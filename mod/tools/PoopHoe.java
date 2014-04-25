package com.poopmod.mod.tools;

import com.poopmod.mod.items.MainItems;

import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.UseHoeEvent;

public class PoopHoe<EnumToolMaterial> extends Item
{
	
	public static double rand;
	   
    protected EnumToolMaterial theToolMaterial;

    public  PoopHoe(EnumToolMaterial par2EnumToolMaterial)
    {
        super();
        this.theToolMaterial = par2EnumToolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(128);
    }

    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
        {
            return false;
        }
        else
        {
            UseHoeEvent event = new UseHoeEvent(par2EntityPlayer, par1ItemStack, par3World, par4, par5, par6);
            if (MinecraftForge.EVENT_BUS.post(event))
            {
                return false;
            }

            if (event.getResult() == Result.ALLOW)
            {
                par1ItemStack.damageItem(1, par2EntityPlayer);
                return true;
            }

            Block i1 = par3World.getBlock(par4, par5, par6);
            boolean air = par3World.isAirBlock(par4, par5 + 1, par6);

            if (par7 != 0 && air && (i1 == Blocks.grass || i1 == Blocks.dirt))
            {
            	
            	 rand = Math.random();

                Block block = Blocks.farmland;
                par3World.playSoundEffect((double)((float)par4 + 0.5F), (double)((float)par5 + 0.5F), (double)((float)par6 + 0.5F), block.stepSound.getBreakSound(), (block.stepSound.getVolume() + 1.0F) / 2.0F, block.stepSound.getPitch() * 0.8F);

                if (par3World.isRemote)
                {
                    return true;
                }
                else
                {
                	if(this != MainItems.hoeUltimate){
                		if(rand < 0.55D){
                			par3World.setBlock(par4, par5, par6, Blocks.farmland, 1, 1);
                		}else{
                			par3World.setBlock(par4, par5, par6, block);
                			}
                				}else if(this == MainItems.hoeUltimate){
                					par3World.setBlock(par4, par5, par6, Blocks.farmland, 1, 1);	
                				}
                    				par1ItemStack.damageItem(1, par2EntityPlayer);
                    				return true;
                }
            }
            else
            {
                return false;
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }

    public String getMaterialName()
    {
        return this.theToolMaterial.toString();
    }
}
