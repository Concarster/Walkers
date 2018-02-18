package com.goillusion.walkers.objects.tools;

import java.util.Set;

import com.goillusion.walkers.Main;
import com.goillusion.walkers.init.ItemInit;
import com.goillusion.walkers.util.interfaces.IHasModel;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;

public class ToolAxe extends ItemTool implements IHasModel
{
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);

    public ToolAxe(String name, ToolMaterial material)
    {
        super(material, EFFECTIVE_ON);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.MAIN_TOOLS);
        
        ItemInit.ITEMS.add(this);
    }

//    public float getStrVsBlock(ItemStack stack, IBlockState state)
//    {
//        Material material = state.getMaterial();
//        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
//    }

    @Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
