package net.torocraft.bouncermod.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.torocraft.bouncermod.item.BounceModItems;

public class BlockRubberWood extends Block {

	public static final String NAME = "rubberWoodBlock";
		
	public BlockRubberWood() {
		super(Material.WOOD);
		setUnlocalizedName(NAME);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
		if(rand.nextInt(10) == 0) {
	        return BounceModItems.rubberSapItem;			
		}
        return BounceModBlocks.rubberWoodBlockItem;
    }
	
}
