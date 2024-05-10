package takomods.extendedItems.Items;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemTool;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

import java.util.Objects;

public class BrushDyed extends ItemTool
{
	int meta;

	protected BrushDyed(String name, int id, int color)
	{
		super(name, id, 1, ToolMaterial.wood, BlockTags.MINEABLE_BY_SHEARS);
		meta = color;
	}
	public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced,double yPlaced)
	{
		if(itemStack.getMetadata() < 64) {
			int id = world.getBlockId(blockX, blockY, blockZ);
			if (side != Side.BOTTOM && (id == Block.planksOak.id || id == Block.planksOakPainted.id || id == Block.fencePlanksOak.id || id == Block.fencePlanksOakPainted.id)) {
				Block block = getBlock(id);
				world.playBlockSoundEffect(null, (float) blockX + 0.0f, (float) blockY + 0.5f, (float) blockZ + 0.0f, Block.wool, EnumBlockSoundEffectType.MINE);
				world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, block.id, meta);
				itemStack.damageItem(1, entityPlayer);
				return true;
			}
		}
		else
		{
			if(Objects.requireNonNull(entityPlayer.inventory.getCurrentItem()).stackSize<=1)
			{
				entityPlayer.inventory.setInventorySlotContents(entityPlayer.inventory.currentItem, Items.brush.getDefaultStack());
			}
		}
		return false;
	}
	private static Block getBlock(int id)
	{
		Block block = null;

		if(Block.planksOak.id == id || Block.planksOakPainted.id == id)
		{
			block = Block.planksOakPainted;
		}
		else if (Block.fencePlanksOak.id == id || Block.fencePlanksOakPainted.id == id)
		{
			block = Block.fencePlanksOakPainted;
		}
		return block;
	}
}
