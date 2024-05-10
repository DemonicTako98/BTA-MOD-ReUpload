package takomods.extendedItems.blocks;

import net.minecraft.client.render.block.color.BlockColorCustom;
import net.minecraft.client.render.block.model.*;
import net.minecraft.client.render.colorizer.Colorizers;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockSlab;
import net.minecraft.core.block.BlockStairs;
import net.minecraft.core.block.BlockTorch;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import net.minecraft.core.sound.BlockSounds;
import takomods.extendedItems.ExtendedItems;
import turniplabs.halplibe.helper.BlockBuilder;

import static takomods.extendedItems.ExtendedItems.MOD_ID;

public class Blocks
{
	private static int blockID(String string)
	{
		return ExtendedItems.config.getInt("Block IDs." + string);
	}

	public static Block roseBlock;
	public static Block redOre;
	public static Block roseTorch;
	public static Block stairLeavesOak;
	public static Block stairLeavesCherry;
	public static Block slabLeavesoak;
	public static Block cherrySlab;

	private static void initializeBlockDetails()
	{
		ItemToolPickaxe.miningLevels.put(roseBlock, 1);
		ItemToolPickaxe.miningLevels.put(redOre, 2);
	}
	public static void createBlocks()
	{
		BlockBuilder ore = new BlockBuilder(MOD_ID)
			.setHardness(3f)
			.setResistance(5f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);

		BlockBuilder stone = new BlockBuilder(MOD_ID)
			.setHardness(1f)
			.setResistance(10f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);

		BlockBuilder torch = new BlockBuilder(MOD_ID)
			.setLuminance(14)
			.setBlockSound(BlockSounds.WOOD);

		BlockBuilder leaves = new BlockBuilder(MOD_ID)
			.setHardness(0.2f)
			.setResistance(0.03f)
			.setLightOpacity(1)
			.setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SWORD, BlockTags.SHEARS_DO_SILK_TOUCH)
			.setBlockSound(BlockSounds.GRASS);

		roseTorch = torch
			.setBlockModel(block -> new BlockModelTorch<>(block).withTextures("extendeditems:block/roseTorch"))
			.build(new BlockTorch("roseTorch", blockID("roseTorch")));

		roseBlock = stone
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("extendeditems:block/roseBlock"))
			.build(new Block("roseBlock", blockID("roseBlock"), Material.stone));

		redOre = ore
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("extendeditems:block/roseOre"))
			.build(new RedOre("roseOre", blockID("roseOre")));

		stairLeavesOak = leaves
			.setBlockModel(BlockModelStairs::new)
			.setBlockColor(block -> (new BlockColorCustom(Colorizers.oak)))
			.build(new BlockStairs(Block.leavesOak, blockID("stairLeaves")));

		stairLeavesCherry = leaves
			.setBlockModel(BlockModelStairs::new)
			.setBlockColor(block -> (new BlockColorCustom(Colorizers.cherry)))
			.build(new BlockStairs(Block.leavesCherry, blockID("cherryStairs")));

		slabLeavesoak = leaves
			.setBlockModel(BlockModelSlab::new)
			.setBlockColor(block -> (new BlockColorCustom(Colorizers.oak)))
			.build(new BlockSlab(Block.leavesOak, blockID("slabLeaves")));

		cherrySlab = leaves
			.setBlockModel(BlockModelSlab::new)
			.setBlockColor(block -> (new BlockColorCustom(Colorizers.cherry)))
			.build(new BlockSlab(Block.leavesCherry, blockID("cherrySlab")));

		initializeBlockDetails();
	}
}
