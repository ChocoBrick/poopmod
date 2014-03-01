package com.krebs.mod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPoop extends Block
{
        public BlockPoop (int id, Material material)
        {
                super(id, material);
                this.blockHardness = 1.9F;
                this.blockResistance = .5F;
        }
}