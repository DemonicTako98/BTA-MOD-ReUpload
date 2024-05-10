package takomods.extendedItems.Items;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.tool.*;
import takomods.extendedItems.ExtendedItems;
import turniplabs.halplibe.helper.ItemBuilder;

import static takomods.extendedItems.ExtendedItems.MOD_ID;

public class Items
{
	private static int itemID(String string)
	{
		return ExtendedItems.config.getInt("Item IDs." + string);
	}

	public static Item dSteelSword;
	public static Item dSteelAxe;
	public static Item dSteelPickaxe;
	public static Item dSteelShovel;
	public static Item dSteelHoe;
	public static Item dSteelIngot;
	public static Item ironRod;

	public static Item roseSword;
	public static Item roseAxe;
	public static Item rosePickaxe;
	public static Item roseShovel;
	public static Item roseGem;
	public static Item roseCrystal;
	public static Item rosePowder;

	public static Item roseHelmet;
	public static Item roseChestplate;
	public static Item roseLeggings;
	public static Item roseBoots;

	public static Item dSteelHelmet;
	public static Item dSteelChestplate;
	public static Item dSteelLeggings;
	public static Item dSteelBoots;

	public static Item brush;
	public static Item brushBlack;
	public static Item brushRed;
	public static Item brushGreen;
	public static Item brushBrown;
	public static Item brushBlue;
	public static Item brushPurple;
	public static Item brushCyan;
	public static Item brushSilver;
	public static Item brushGray;
	public static Item brushPink;
	public static Item brushLime;
	public static Item brushYellow;
	public static Item brushLightBlue;
	public static Item brushMagenta;
	public static Item brushOrange;
	public static Item brushWhite;

	public static void initializeItems()
	{
		dSteelIngot = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/dSteelIngot")
			.build(new Item("dSteelIngot", itemID("dSteelIngot")));
		ironRod = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/ironRod")
			.build(new Item("ironRod", itemID("ironRod")));
		roseGem = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/roseGem")
			.build(new Item("roseGem", itemID("roseGem")));
		rosePowder = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/rosePowder")
			.build(new Item("rosePowder", itemID("rosePowder")));
		roseCrystal = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/roseCrystal")
			.build(new Item("roseCrystal", itemID("roseCrystal")));
		brush = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/brush")
			.build(new Item("brush", itemID("brush")));
		brushBlack = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/brushBlack")
			.build(new BrushDyed("brushBlack", itemID("black"), 15));
		brushRed = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/brushRed")
			.build(new BrushDyed("brushRed", itemID("red"), 14));
		brushGreen = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/brushGreen")
			.build(new BrushDyed("brushGreen", itemID("green"), 13));
		brushBrown = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/brushBrown")
			.build(new BrushDyed("brushBrown", itemID("brown"), 12));
		brushBlue = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/brushBlue")
			.build(new BrushDyed("brushBlue", itemID("blue"), 11));
		brushPurple = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/brushPurple")
			.build(new BrushDyed("brushPurple", itemID("purple"), 10));
		brushCyan = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/brushCyan")
			.build(new BrushDyed("brushCyan", itemID("cyan"), 9));
		brushSilver = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/brushSilver")
			.build(new BrushDyed("brushSilver", itemID("silver"), 8));
		brushGray = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/brushGray")
			.build(new BrushDyed("brushGray", itemID("gray"), 7));
		brushPink = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/brushPink")
			.build(new BrushDyed("brushPink", itemID("pink"), 6));
		brushLime = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/brushLime")
			.build(new BrushDyed("brushLime", itemID("lime"), 5));
		brushYellow = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/brushYellow")
			.build(new BrushDyed("brushYellow", itemID("yellow"), 4));
		brushLightBlue = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/brushLightBlue")
			.build(new BrushDyed("brushLightBlue", itemID("lightBlue"), 3));
		brushMagenta = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/brushMagenta")
			.build(new BrushDyed("brushMagenta", itemID("magenta"), 2));
		brushOrange = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/brushOrange")
			.build(new BrushDyed("brushOrange", itemID("orange"), 1));
		brushWhite = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/brushWhite")
			.build(new BrushDyed("brushWhite", itemID("white"), 0));

		dSteelSword = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/dSteelSword")
			.build(new ItemToolSword("dSteelSword", itemID("dSteelSword"), Materials.dSteel));
		dSteelAxe = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/dSteelAxe")
			.build(new ItemToolAxe("dSteelAxe", itemID("dSteelAxe"), Materials.dSteel));
		dSteelPickaxe = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/dSteelPickaxe")
			.build(new ItemToolPickaxe("dSteelPickaxe", itemID("dSteelPickaxe"), Materials.dSteel));
		dSteelShovel = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/dSteelShovel")
			.build(new ItemToolShovel("dSteelShovel", itemID("dSteelShovel"), Materials.dSteel));
		dSteelHoe = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/dSteelHoe")
			.build(new ItemToolHoe("dSteelHoe", itemID("dSteelHoe"), Materials.dSteel));
		roseSword = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/roseSword")
			.build(new ItemToolSword("roseSword", itemID("roseSword"), Materials.rose));
		roseAxe = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/roseAxe")
			.build(new ItemToolAxe("roseAxe", itemID("roseAxe"), Materials.rose));
		rosePickaxe = new ItemBuilder(MOD_ID)
			.setIcon(("extendeditems:item/rosePickaxe"))
			.build(new ItemToolPickaxe("rosePickaxe", itemID("rosePickaxe"), Materials.rose));
		roseShovel = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/roseShovel")
			.build(new ItemToolShovel("roseShovel", itemID("roseShovel"), Materials.rose));

		dSteelHelmet = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/dSteelHelmet")
			.build(new ItemArmor("dSteelHelmet", itemID("dSteelHelmet"), Materials.DSTEEL, 0));
		dSteelChestplate = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/dSteelChestplate")
			.build(new ItemArmor("dSteelChestplate", itemID("dSteelChest"), Materials.DSTEEL, 1));
		dSteelLeggings = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/dSteelLeggings")
			.build(new ItemArmor("dSteelLeggings", itemID("dSteelLegs"), Materials.DSTEEL, 2));
		dSteelBoots = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/dSteelBoots")
			.build(new ItemArmor("dSteelBoots", itemID("dSteelBoots"), Materials.DSTEEL, 3));
		roseHelmet = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/armorHelmetRose")
			.build(new ItemArmor("roseHelmet", itemID("roseHelmet"), Materials.ROSE, 0));
		roseChestplate = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/armorChestRose")
			.build(new ItemArmor("roseChest", itemID("roseChest"), Materials.ROSE, 1));
		roseLeggings = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/armorLegsRose")
			.build(new ItemArmor("roseLegs", itemID("roseLegs"), Materials.ROSE, 2));
		roseBoots = new ItemBuilder(MOD_ID)
			.setIcon("extendeditems:item/armorBootsRose")
			.build(new ItemArmor("roseBoots", itemID("roseBoots"), Materials.ROSE, 3));
	}
}
