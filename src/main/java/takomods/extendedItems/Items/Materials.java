package takomods.extendedItems.Items;

import net.minecraft.core.item.material.ArmorMaterial;
import net.minecraft.core.item.material.ToolMaterial;
import takomods.extendedItems.ExtendedItems;
import turniplabs.halplibe.helper.ArmorHelper;

public class Materials
{
	public static final ToolMaterial dSteel = new ToolMaterial().setDurability(5012).setEfficiency(15f, 45f).setMiningLevel(3).setDamage(4).setBlockHitDelay(4);
	public static final ToolMaterial rose = new ToolMaterial().setDurability(3000).setEfficiency(12.0f, 40.0f).setMiningLevel(3).setDamage(4);
	public static final ArmorMaterial DSTEEL = ArmorHelper.createArmorMaterial(ExtendedItems.MOD_ID, "Diamond_Steel", 2000, 100f, 100f, 100f, 100f);
	public static final ArmorMaterial ROSE = ArmorHelper.createArmorMaterial(ExtendedItems.MOD_ID, "RoseArmor", 1500, 80.0f, 80.0f, 80.0f, 80.0f);

}
