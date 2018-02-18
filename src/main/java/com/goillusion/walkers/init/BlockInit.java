package com.goillusion.walkers.init;

import java.util.ArrayList;
import java.util.List;

import com.goillusion.walkers.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class BlockInit {

	public BlockInit() {

	}

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	/** Plain Blocks */
	public static final Block BLOCK_MAIN = new BlockBase("block_main", Material.IRON);

}
