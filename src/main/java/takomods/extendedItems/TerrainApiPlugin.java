package takomods.extendedItems;

import takomods.extendedItems.blocks.Blocks;
import useless.terrainapi.api.TerrainAPI;
import useless.terrainapi.generation.overworld.api.ChunkDecoratorOverworldAPI;

import static takomods.extendedItems.ExtendedItems.MOD_ID;

public class TerrainApiPlugin implements TerrainAPI
{

	@Override
	public String getModID()
	{
		return MOD_ID;
	}

	@Override
	public void onInitialize()
	{
		ChunkDecoratorOverworldAPI.oreFeatures.addManagedOreFeature(getModID(), Blocks.redOre, 6, 20, 0f, 0.5f, false);
	}
}
