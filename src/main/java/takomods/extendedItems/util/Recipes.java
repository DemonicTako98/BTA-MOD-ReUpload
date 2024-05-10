package takomods.extendedItems.util;

import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import takomods.extendedItems.Items.Items;
import takomods.extendedItems.blocks.Blocks;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;

import static takomods.extendedItems.ExtendedItems.MOD_ID;

public class Recipes
{
	public static void registerCraftingRecipes()
	{
		//Templates
		RecipeBuilderShaped SwordShapedtemplate = new RecipeBuilderShaped(MOD_ID, " X ", " X ", " Y ");
		RecipeBuilderShaped PickaxeShapedTemplate = new RecipeBuilderShaped(MOD_ID, "XXX", " Y ", " Y ");
		RecipeBuilderShaped AxeShapedTemplate = new RecipeBuilderShaped(MOD_ID, " XX", " YX", " Y ");
		RecipeBuilderShaped ShovelShapedTemplate = new RecipeBuilderShaped(MOD_ID, " X ", " Y ", " Y ");
		RecipeBuilderShaped HoeShapedTemplate = new RecipeBuilderShaped(MOD_ID, "XX", " Y ", " Y ");

		RecipeBuilderShaped ArmorHelmetTemplate = new RecipeBuilderShaped(MOD_ID, "XXX", "X X");
		RecipeBuilderShaped ArmorChestTemplate = new RecipeBuilderShaped(MOD_ID, "X X", "XXX", "XXX");
		RecipeBuilderShaped ArmorLegsTemplate = new RecipeBuilderShaped(MOD_ID, "XXX", "X X", "X X");
		RecipeBuilderShaped ArmorBootsTemplate = new RecipeBuilderShaped(MOD_ID, "X X", "X X");

		//Recipes
		//Blocks
		RecipeBuilder.Shaped(MOD_ID, "XXX", "XYX", "XXX")
			.addInput('X', Items.roseGem)
			.addInput('Y', Items.rosePowder)
			.create("roseBlock", Blocks.roseBlock.getDefaultStack());
		RecipeBuilder.Shaped(MOD_ID, "X", "Y")
			.addInput('X', Items.rosePowder)
			.addInput('Y', Item.stick)
			.create("roseBlock", Blocks.roseTorch.getDefaultStack());
		//Items
		RecipeBuilder.Shaped(MOD_ID, "X", "X")
			.addInput('X', Item.ingotIron)
			.create("ironRod", Items.ironRod.getDefaultStack());
		RecipeBuilder.Shaped(MOD_ID, "XYX")
			.addInput('X', Item.ingotSteel)
			.addInput('Y', Item.diamond)
			.create("dSteelIngot", Items.dSteelIngot.getDefaultStack());

		Item[] brushes = {Items.brushBlack, Items.brushRed, Items.brushGreen, Items.brushBrown, Items.brushBlack, Items.brushPurple,
							Items.brushCyan, Items.brushSilver, Items.brushGray, Items.brushPink, Items.brushLime, Items.brushYellow,
							Items.brushLightBlue,Items.brushMagenta,Items.brushOrange, Items.brushWhite};
		for (int dye = 0; dye < 16; dye++)
		{
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(Item.dye, dye)
				.addInput(Items.brush)
				.create(dye + "brush", new ItemStack(brushes[dye]));
		}
		//Tools
		SwordShapedtemplate
			.addInput('X', Items.dSteelIngot)
			.addInput('Y', Items.ironRod)
			.create("dSteelSword", Items.dSteelSword.getDefaultStack());
		SwordShapedtemplate
			.addInput('X', Items.roseGem)
			.addInput('Y', Item.stick)
			.create("roseSword", Items.roseSword.getDefaultStack());
		PickaxeShapedTemplate
			.addInput('X', Items.dSteelIngot)
			.addInput('Y', Items.ironRod)
			.create("dSteelPickAxe", Items.dSteelPickaxe.getDefaultStack());
		PickaxeShapedTemplate
			.addInput('X', Items.roseGem)
			.addInput('Y', Item.stick)
			.create("rosePickaxe", Items.rosePickaxe.getDefaultStack());
		AxeShapedTemplate
			.addInput('X', Items.dSteelIngot)
			.addInput('Y', Items.ironRod)
			.create("dSteelAxe", Items.dSteelAxe.getDefaultStack());
		AxeShapedTemplate
			.addInput('X', Items.roseGem)
			.addInput('Y', Item.stick)
			.create("roseAxe", Items.roseAxe.getDefaultStack());
		ShovelShapedTemplate
			.addInput('X', Items.dSteelIngot)
			.addInput('Y', Items.ironRod)
			.create("dSteelShovel", Items.dSteelShovel.getDefaultStack());
		ShovelShapedTemplate
			.addInput('X', Items.roseGem)
			.addInput('Y', Item.stick)
			.create("roseShovel", Items.roseShovel.getDefaultStack());
		HoeShapedTemplate
			.addInput('X', Items.dSteelIngot)
			.addInput('Y', Items.ironRod)
			.create("dSteelHoe", Items.dSteelHoe.getDefaultStack());

		//Armor
		ArmorHelmetTemplate
			.addInput('X', Items.dSteelIngot)
			.create("dSteelHelmet", Items.dSteelHelmet.getDefaultStack());
		ArmorChestTemplate
			.addInput('X', Items.dSteelIngot)
			.create("dSteelChest", Items.dSteelChestplate.getDefaultStack());
		ArmorLegsTemplate
			.addInput('X', Items.dSteelIngot)
			.create("dSteelLegs", Items.dSteelLeggings.getDefaultStack());
		ArmorBootsTemplate
			.addInput('X', Items.dSteelIngot)
			.create("dSteelBoots", Items.dSteelBoots.getDefaultStack());

		ArmorHelmetTemplate
			.addInput('X', Items.roseGem)
			.create("roseHelmet", Items.roseHelmet.getDefaultStack());
		ArmorChestTemplate
			.addInput('X', Items.roseGem)
			.create("roseChest", Items.roseChestplate.getDefaultStack());
		ArmorLegsTemplate
			.addInput('X', Items.roseGem)
			.create("roseLegs", Items.roseLeggings.getDefaultStack());
		ArmorBootsTemplate
			.addInput('X', Items.roseGem)
			.create("roseBoots", Items.roseBoots.getDefaultStack());

		//Furnace Recipes
		RecipeBuilder.Furnace(MOD_ID)
			.setInput(Block.flowerRed)
			.create("rosePowder", Items.rosePowder.getDefaultStack());
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(Items.rosePowder)
			.create("roseCrystal", Items.roseCrystal.getDefaultStack());
	}
}
