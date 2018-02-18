package com.goillusion.walkers.material;

import com.goillusion.walkers.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class Materials {
	
	
	public static final ToolMaterial COPPER = EnumHelper.addToolMaterial("copper", 2, 180, 5.0F, 1.5F, 5);
	public static final ToolMaterial AGNITITE = EnumHelper.addToolMaterial("agnitite", 2, 180, 5.0F, 1.5F, 5);
	public static final ArmorMaterial ARMOR_COPPER = EnumHelper.addArmorMaterial("armor_copper", Reference.MOD_ID + ":copper", 13, new int[]{2, 5, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_AGNITITE = EnumHelper.addArmorMaterial("armor_agnitite", Reference.MOD_ID + ":agnitite", 15, new int[]{2, 5, 6, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F);
	public static final ArmorMaterial ARMOR_BLACK = EnumHelper.addArmorMaterial("armor_black", Reference.MOD_ID + ":armor_black", 15, new int[]{2, 5, 6, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F);

}
