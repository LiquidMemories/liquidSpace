package com.liquidmemories.liquidspace.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class EngineBlock extends BlockBase {

	public EngineBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.ANVIL); //what it sounds like when you walk over it
		setHardness(3.5F); // How long it takes to harvest
		setResistance(25.0F); // How resistant to TNT
		setHarvestLevel("pickaxe", 2);  // 2 = iron 
		setLightLevel(1.0F); //How much light it emits 
		// setLightOpacity(1) <- allows light to pass through the object
		// setBlockUnbreakable(); <- stops the block from being broken
		
	}

}
