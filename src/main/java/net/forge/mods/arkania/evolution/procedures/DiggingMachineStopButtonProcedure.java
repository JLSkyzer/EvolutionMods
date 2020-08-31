package net.forge.mods.arkania.evolution.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.state.IProperty;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.block.BlockState;

import net.forge.mods.arkania.evolution.block.DiggingMachineOffBlock;
import net.forge.mods.arkania.evolution.EvolutionModElements;

import java.util.Map;

@EvolutionModElements.ModElement.Tag
public class DiggingMachineStopButtonProcedure extends EvolutionModElements.ModElement {
	public DiggingMachineStopButtonProcedure(EvolutionModElements instance) {
		super(instance, 74);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure DiggingMachineStopButton!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure DiggingMachineStopButton!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure DiggingMachineStopButton!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DiggingMachineStopButton!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			BlockState _bs = DiggingMachineOffBlock.block.getDefaultState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
				if (_bs.has(_property))
					_bs = _bs.with(_property, (Comparable) entry.getValue());
			}
			TileEntity _te = world.getTileEntity(_bp);
			CompoundNBT _bnbt = null;
			if (_te != null) {
				_bnbt = _te.write(new CompoundNBT());
				_te.remove();
			}
			world.setBlockState(_bp, _bs, 3);
			if (_bnbt != null) {
				_te = world.getTileEntity(_bp);
				if (_te != null) {
					try {
						_te.read(_bnbt);
					} catch (Exception ignored) {
					}
				}
			}
		}
	}
}
