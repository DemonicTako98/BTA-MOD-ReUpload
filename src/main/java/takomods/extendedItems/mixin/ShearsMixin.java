package takomods.extendedItems.mixin;

import net.minecraft.core.block.Block;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.ItemToolShears;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import takomods.extendedItems.blocks.Blocks;

@Mixin(value = ItemToolShears.class, remap = false)
public class ShearsMixin
{
	public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced)
	{
		int meta = 0;
		int id  = world.getBlockId(blockX, blockY, blockZ);

		if(id == Block.leavesOak.id || id == Block.leavesCherry.id || id == Blocks.stairLeavesOak.id || id == Blocks.stairLeavesCherry.id || id == Block.leavesCherryFlowering.id)
		{
			Block block = getBlock(id);
			world.playBlockSoundEffect(null, (float) blockX + 0f, (float) blockY+ 0.5f, (float) blockZ + 0f, Block.grass, EnumBlockSoundEffectType.MINE);
			world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, block.id, meta);
			itemStack.damageItem(1, entityPlayer);
			return true;
		}
		return false;
	}

	@Unique
	private static Block getBlock(int id)
	{
		Block block = null;

		if(Block.leavesOak.id == id)
		{
			block = Blocks.stairLeavesOak;
		}
		else if (Blocks.stairLeavesOak.id == id)
		{
			block = Blocks.slabLeavesoak;
		}
		else if (Block.leavesCherry.id == id || Block.leavesCherryFlowering.id == id)
		{
			block = Blocks.stairLeavesCherry;
		}
		else if (Blocks.stairLeavesCherry.id == id)
		{
			block = Blocks.cherrySlab;
		}
		return block;
	}
}
