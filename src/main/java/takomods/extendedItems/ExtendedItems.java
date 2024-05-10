package takomods.extendedItems;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import takomods.extendedItems.Items.Items;
import takomods.extendedItems.blocks.Blocks;
import takomods.extendedItems.util.Recipes;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.util.ConfigUpdater;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;
import turniplabs.halplibe.util.TomlConfigHandler;
import turniplabs.halplibe.util.toml.Toml;


public class ExtendedItems implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint
{
	public static final String MOD_ID = "extendeditems";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	private static ConfigUpdater configUpdater = ConfigUpdater.fromProperties();
	private static final Toml tomlProperties = new Toml("Extended Items config");
	public static TomlConfigHandler config;
	private static int ItemID = 24000;
	private static int BlockID = 1500;

	private int getNextItemID() {return ItemID++;}
	private int getNextBlockID() {return BlockID++;}

	private void initializeConfig()
	{
		tomlProperties.addCategory("Item IDs")
			//Extended Items
			.addEntry("dSteelSword", getNextItemID())
			.addEntry("dSteelAxe", getNextItemID())
			.addEntry("dSteelPickaxe", getNextItemID())
			.addEntry("dSteelShovel", getNextItemID())
			.addEntry("dSteelHoe", getNextItemID())
			.addEntry("ironRod", getNextItemID())
			.addEntry("dSteelIngot", getNextItemID())
			.addEntry("dSteelHelmet", getNextItemID())
			.addEntry("dSteelChest", getNextItemID())
			.addEntry("dSteelLegs", getNextItemID())
			.addEntry("dSteelBoots", getNextItemID())
			.addEntry("rawPork", getNextItemID())
			.addEntry("cookedPork", getNextItemID())
			.addEntry("rawBeef", getNextItemID())
			.addEntry("cookedBeef", getNextItemID())
			.addEntry("roseSword", getNextItemID())
			.addEntry("roseAxe", getNextItemID())
			.addEntry("rosePickaxe", getNextItemID())
			.addEntry("roseShovel", getNextItemID())
			.addEntry("roseHoe", getNextItemID())
			.addEntry("roseGem", getNextItemID())
			.addEntry("roseCrystal", getNextItemID())
			.addEntry("rosePowder", getNextItemID())
			.addEntry("roseHelmet", getNextItemID())
			.addEntry("roseChest", getNextItemID())
			.addEntry("roseLegs", getNextItemID())
			.addEntry("roseBoots", getNextItemID())
			.addEntry("roseNugget", getNextItemID())
			.addEntry("brush", getNextItemID())

			.addEntry("black", getNextItemID())
			.addEntry("red", getNextItemID())
			.addEntry("green", getNextItemID())
			.addEntry("brown", getNextItemID())
			.addEntry("blue", getNextItemID())
			.addEntry("purple", getNextItemID())
			.addEntry("cyan", getNextItemID())
			.addEntry("silver", getNextItemID())
			.addEntry("gray", getNextItemID())
			.addEntry("pink", getNextItemID())
			.addEntry("lime", getNextItemID())
			.addEntry("yellow", getNextItemID())
			.addEntry("lightBlue", getNextItemID())
			.addEntry("magenta", getNextItemID())
			.addEntry("orange", getNextItemID())
			.addEntry("white", getNextItemID());

		tomlProperties.addCategory("Block IDs")
			.addEntry("roseOre", getNextBlockID())
			.addEntry("roseBlock", getNextBlockID())
			.addEntry("roseTorch", getNextBlockID())
			.addEntry("stairLeaves", getNextBlockID())
			.addEntry("slabLeaves", getNextBlockID())
			.addEntry("cherryStairs", getNextBlockID())
			.addEntry("cherrySlab", getNextBlockID());

		config = new TomlConfigHandler(configUpdater, MOD_ID, tomlProperties);
	}

	@Override
	public void onInitialize()
	{
		LOGGER.info("Extended Items initialized.");
		initializeConfig();
		Items.initializeItems();
		Blocks.createBlocks();
	}

	@Override
	public void beforeGameStart()
	{

	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady()
	{

	}

	@Override
	public void initNamespaces()
	{
		Recipes.registerCraftingRecipes();
	}
}
