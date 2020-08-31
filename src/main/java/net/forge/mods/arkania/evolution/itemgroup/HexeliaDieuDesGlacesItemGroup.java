
package net.forge.mods.arkania.evolution.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.forge.mods.arkania.evolution.item.BlueOrbItem;
import net.forge.mods.arkania.evolution.EvolutionModElements;

@EvolutionModElements.ModElement.Tag
public class HexeliaDieuDesGlacesItemGroup extends EvolutionModElements.ModElement {
	public HexeliaDieuDesGlacesItemGroup(EvolutionModElements instance) {
		super(instance, 78);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabhexelia_dieu_des_glaces") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BlueOrbItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
