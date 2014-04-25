package com.poopmod.mod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockPoop extends Block
{
        public BlockPoop (int id, Material material)
        {
                super(id, material);
                this.blockHardness = 1.9F;
                this.blockResistance = .5F;
        }
        
        public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
        {
            float f = 0.1F;
            return AxisAlignedBB.getAABBPool().getAABB((double)par2, (double)par3, (double)par4, (double)(par2 + 1), (double)((float)(par3 + 1) - f), (double)(par4 + 1));
        }
        
        public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
        {
            par5Entity.motionX *= 0.2D;
            par5Entity.motionZ *= 0.2D;
        }

}