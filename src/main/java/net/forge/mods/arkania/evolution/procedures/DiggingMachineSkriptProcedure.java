package net.forge.mods.arkania.evolution.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.forge.mods.arkania.evolution.EvolutionModElements;

import java.util.Map;

@EvolutionModElements.ModElement.Tag
public class DiggingMachineSkriptProcedure extends EvolutionModElements.ModElement {
	public DiggingMachineSkriptProcedure(EvolutionModElements instance) {
		super(instance, 71);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure DiggingMachineSkript!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure DiggingMachineSkript!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure DiggingMachineSkript!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DiggingMachineSkript!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.NORTH)) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) (z + 1)));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) (z + 1)));
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) (z + 1)));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) (z + 1)));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) (z + 1)));
			world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) (z + 1)));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) (z - 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) (z + 1)));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 2), (int) (z - 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) (z + 1)));
			world.destroyBlock(new BlockPos((int) x, (int) (y + 2), (int) (z - 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z - 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) (z + 1)));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z - 1)), false);
		} else if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.SOUTH)) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) (z - 1)));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) (z - 1.5)));
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) (z - 1)));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) (z - 1)));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) (z - 1)));
			world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) (z - 1)));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) (z + 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) (z - 1)));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 2), (int) (z + 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) (z - 1)));
			world.destroyBlock(new BlockPos((int) x, (int) (y + 2), (int) (z + 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z + 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) (z - 1)));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z + 1)), false);
		} else if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.WEST)) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1))), world.getWorld(),
					new BlockPos((int) (x + 1), (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), world.getWorld(),
					new BlockPos((int) (x + 0.5), (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) z), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1))), world.getWorld(),
					new BlockPos((int) (x + 1), (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1))), world.getWorld(),
					new BlockPos((int) (x + 1), (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)), world.getWorld(),
					new BlockPos((int) (x + 1), (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1))), world.getWorld(),
					new BlockPos((int) (x + 1), (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) (z - 1))), world.getWorld(),
					new BlockPos((int) (x + 1), (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 2), (int) (z - 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) z)), world.getWorld(),
					new BlockPos((int) (x + 1), (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 2), (int) z), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) (z + 1))), world.getWorld(),
					new BlockPos((int) (x + 1), (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 2), (int) (z + 1)), false);
		} else if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.EAST)) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))), world.getWorld(),
					new BlockPos((int) (x - 1), (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), world.getWorld(),
					new BlockPos((int) (x - 1), (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) z), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))), world.getWorld(),
					new BlockPos((int) (x - 1), (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1))), world.getWorld(),
					new BlockPos((int) (x - 1), (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), world.getWorld(),
					new BlockPos((int) (x - 1), (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1))), world.getWorld(),
					new BlockPos((int) (x - 1), (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z - 1))), world.getWorld(),
					new BlockPos((int) (x - 1), (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z - 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) z)), world.getWorld(),
					new BlockPos((int) (x - 1), (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 2), (int) z), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z + 1))), world.getWorld(),
					new BlockPos((int) (x - 1), (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z + 1)), false);
		} else if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.UP)) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1))), world.getWorld(),
					new BlockPos((int) x, (int) (y - 1), (int) z));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)), world.getWorld(),
					new BlockPos((int) x, (int) (y - 1), (int) z));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1))), world.getWorld(),
					new BlockPos((int) x, (int) (y - 1), (int) z));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))), world.getWorld(),
					new BlockPos((int) x, (int) (y - 1), (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), world.getWorld(),
					new BlockPos((int) x, (int) (y - 1), (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))), world.getWorld(),
					new BlockPos((int) x, (int) (y - 1), (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1))), world.getWorld(),
					new BlockPos((int) x, (int) (y - 1), (int) z));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), world.getWorld(),
					new BlockPos((int) x, (int) (y - 1), (int) z));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1))), world.getWorld(),
					new BlockPos((int) x, (int) (y - 1), (int) z));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)), false);
		} else if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.DOWN)) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1))), world.getWorld(),
					new BlockPos((int) x, (int) (y + 1), (int) z));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)), world.getWorld(),
					new BlockPos((int) x, (int) (y + 1), (int) z));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1))), world.getWorld(),
					new BlockPos((int) x, (int) (y + 1), (int) z));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))), world.getWorld(),
					new BlockPos((int) x, (int) (y + 1), (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), world.getWorld(),
					new BlockPos((int) x, (int) (y + 1), (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))), world.getWorld(),
					new BlockPos((int) x, (int) (y + 1), (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1))), world.getWorld(),
					new BlockPos((int) x, (int) (y + 1), (int) z));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)), world.getWorld(),
					new BlockPos((int) x, (int) (y + 1), (int) z));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1))), world.getWorld(),
					new BlockPos((int) x, (int) (y + 1), (int) z));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)), false);
		}
	}
}
