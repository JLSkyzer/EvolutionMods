
package net.forge.mods.arkania.evolution.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.forge.mods.arkania.evolution.itemgroup.HexeliaHexeliaItemGroup;
import net.forge.mods.arkania.evolution.EvolutionModElements;

@EvolutionModElements.ModElement.Tag
public class HexeliaHoeItem extends EvolutionModElements.ModElement {
	@ObjectHolder("evolution:hexelia_hoe")
	public static final Item block = null;
	public HexeliaHoeItem(EvolutionModElements instance) {
		super(instance, 61);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(HexeliaHexeliaItemGroup.tab)) {
		}.setRegistryName("hexelia_hoe"));
	}
}
