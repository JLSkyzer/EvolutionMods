
package net.forge.mods.arkania.evolution.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.forge.mods.arkania.evolution.item.AdamantiteIngotItem;
import net.forge.mods.arkania.evolution.EvolutionModElements;

@EvolutionModElements.ModElement.Tag
public class HexeliaAdamantiteItemGroup extends EvolutionModElements.ModElement {
	public HexeliaAdamantiteItemGroup(EvolutionModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabhexelia_adamantite") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AdamantiteIngotItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
