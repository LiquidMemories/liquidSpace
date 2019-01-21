package com.liquidmemories.liquidspace.init;

import java.util.ArrayList;
import java.util.List;

import com.liquidmemories.liquidspace.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block> ();
	
	public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.GLASS);
	
}
