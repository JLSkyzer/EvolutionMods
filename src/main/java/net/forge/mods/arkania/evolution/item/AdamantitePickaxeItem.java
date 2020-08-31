
package net.forge.mods.arkania.evolution.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.forge.mods.arkania.evolution.itemgroup.HexeliaAdamantiteItemGroup;
import net.forge.mods.arkania.evolution.EvolutionModElements;

@EvolutionModElements.ModElement.Tag
public class AdamantitePickaxeItem extends EvolutionModElements.ModElement {
	@ObjectHolder("evolution:adamantite_pickaxe")
	public static final Item block = null;
	public AdamantitePickaxeItem(EvolutionModElements instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 902;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 35;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(HexeliaAdamantiteItemGroup.tab)) {
		}.setRegistryName("adamantite_pickaxe"));
	}
}
