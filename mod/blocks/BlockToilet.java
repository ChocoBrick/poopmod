package com.poopmod.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.poopmod.mod.items.MainItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockToilet extends Block
{
	@SideOnly(Side.CLIENT)
	private IIcon top;
	@SideOnly(Side.CLIENT)
	private IIcon front;

	 @SuppressWarnings("unused")
	private final boolean powered;

        public BlockToilet (int id, Material material, boolean par2)
        {
                super(material);
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
        		
        		@SuppressWarnings("unused")
				int foodlvl = player.getFoodStats().getFoodLevel();
        		if (player.getFoodStats().getFoodLevel() > 14){

        		
        world.playSoundAtEntity(player, "poopmod:toilet", 1.0F, 1.0F);

        int c = world.getBlockMetadata(i, j, k);

         world.setBlockMetadataWithNotify(i, j, k, 0, c);
         dropItemStack(new ItemStack(MainItems.PoopItem, 1), world, i, j, k);
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
        public IIcon getIcon(int side, int p_149691_2_)
        {
        return side == 1 ? this.top : (side == 2 ? this.front : this.blockIcon);
        }
        
        @SideOnly(Side.CLIENT)
        public void registerBlockIcons(IIconRegister p_149651_1_)
        {
        //side
        this.blockIcon = Blocks.iron_block.getBlockTextureFromSide(0);
        //top
        this.top = p_149651_1_.registerIcon("poopmod:" + "toilet" + "_top");
        //front
        this.front = p_149651_1_.registerIcon("poopmod:" + "toilet" + "_side");
        }
        
       

}