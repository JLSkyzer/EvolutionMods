
package net.forge.mods.arkania.evolution.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.forge.mods.arkania.evolution.EvolutionModElements;

@EvolutionModElements.ModElement.Tag
public class DynamiteTextureItem extends EvolutionModElements.ModElement {
	@ObjectHolder("evolution:dynamite_texture")
	public static final Item block = null;
	public DynamiteTextureItem(EvolutionModElements instance) {
		super(instance, 106);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(null).maxStackSize(64));
			setRegistryName("dynamite_texture");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
