package com.poopmod.mod;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockToilet extends Block
{
	@SideOnly(Side.CLIENT)
    private Icon iconTop;

	 private final boolean powered;

        public BlockToilet (int id, Material material, boolean par2)
        {
                super(id, material);
                this.blockHardness = 4F;
                this.blockResistance = 30F;
                this.powered = par2;
        }

        public int tickRate(World par1World)
        {
            return 4;
        }
        
        public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer player, int l, float f, float f2, float f3)
        {
        	if(world.isRemote){
        		return true;
        	}else{
        		
        		int foodlvl = player.getFoodStats().getFoodLevel();
        		if (player.getFoodStats().getFoodLevel() > 14){

        		
        world.playSoundAtEntity(player, "krebsmodid:toilet", 1.0F, 1.0F);

        int c = world.getBlockMetadata(i, j, k);

         world.setBlockMetadataWithNotify(i, j, k, 0, c);
         dropItemStack(new ItemStack(Anythinghonestly.PoopItem, 1), world, i, j, k);
 		player.getFoodStats().addStats(-14 , 0.1F);
        		}
         return true;
           }
        }
        /*

        public void onBlockAdded(World par1World, int par2, int par3, int par4)
        {
            if (!par1World.isRemote)
            {
              if (!this.powered && par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
                {
                	int c = par1World.getBlockMetadata(par2, par3, par4);

                    par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, c);
                	dropItemStack(new ItemStack(Anythinghonestly.PoopItem, 1), par1World, par2, par3, par4);
                }
            }
        }

        public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
        {
            if (!par1World.isRemote)
            {
                 if (this.powered == false && par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
                {
                	int c = par1World.getBlockMetadata(par2, par3, par4);

                    par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, c);
                	dropItemStack(new ItemStack(Anythinghonestly.PoopItem, 1), par1World, par2, par3, par4);
                }
            }
        }

        */
        public static void dropItemStack(ItemStack item, World world, int x, int y, int z)
        {
        EntityItem entityitem = new EntityItem(world, x, y, z, item);
        entityitem.posX = x + .5;
        entityitem.posY = y + 1;
        entityitem.posZ = z + .5;
        world.spawnEntityInWorld(entityitem);
        }

        @SideOnly(Side.CLIENT)
        public Icon getIcon(int par1, int par2)
        {
            return par1 == 1 ? this.iconTop : (par1 == 0 ? Block.blockIron.getBlockTextureFromSide(par1) : this.blockIcon);
        }
        

        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister par1IconRegister)
        {
            this.blockIcon = par1IconRegister.registerIcon("krebsmodid:" + "toilet" + "_side");
            this.iconTop = par1IconRegister.registerIcon("krebsmodid:" + "toilet" + "_top");
        }
}