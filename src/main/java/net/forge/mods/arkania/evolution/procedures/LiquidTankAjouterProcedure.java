package net.forge.mods.arkania.evolution.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.forge.mods.arkania.evolution.block.LiquidtankBlock;
import net.forge.mods.arkania.evolution.block.LiquidTank9Block;
import net.forge.mods.arkania.evolution.block.LiquidTank8Block;
import net.forge.mods.arkania.evolution.block.LiquidTank7Block;
import net.forge.mods.arkania.evolution.block.LiquidTank6Block;
import net.forge.mods.arkania.evolution.block.LiquidTank5Block;
import net.forge.mods.arkania.evolution.block.LiquidTank4Block;
import net.forge.mods.arkania.evolution.block.LiquidTank3Block;
import net.forge.mods.arkania.evolution.block.LiquidTank2Block;
import net.forge.mods.arkania.evolution.block.LiquidTank1Block;
import net.forge.mods.arkania.evolution.block.LiquidTank10Block;
import net.forge.mods.arkania.evolution.EvolutionModElements;

import java.util.Map;
import java.util.HashMap;

@EvolutionModElements.ModElement.Tag
public class LiquidTankAjouterProcedure extends EvolutionModElements.ModElement {
	public LiquidTankAjouterProcedure(EvolutionModElements instance) {
		super(instance, 90);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LiquidTankAjouter!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure LiquidTankAjouter!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure LiquidTankAjouter!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure LiquidTankAjouter!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure LiquidTankAjouter!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.WATER_BUCKET, (int) (1)).getItem())) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == LiquidtankBlock.block.getDefaultState().getBlock())) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LiquidTank1Block.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.clearMatchingItems(p -> new ItemStack(Items.WATER_BUCKET, (int) (1)).getItem() == p.getItem(),
							(int) 1);
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == LiquidTank1Block.block.getDefaultState()
					.getBlock())) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LiquidTank2Block.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.clearMatchingItems(p -> new ItemStack(Items.WATER_BUCKET, (int) (1)).getItem() == p.getItem(),
							(int) 1);
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == LiquidTank2Block.block.getDefaultState()
					.getBlock())) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LiquidTank3Block.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.clearMatchingItems(p -> new ItemStack(Items.WATER_BUCKET, (int) (1)).getItem() == p.getItem(),
							(int) 1);
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == LiquidTank3Block.block.getDefaultState()
					.getBlock())) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LiquidTank4Block.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.clearMatchingItems(p -> new ItemStack(Items.WATER_BUCKET, (int) (1)).getItem() == p.getItem(),
							(int) 1);
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == LiquidTank4Block.block.getDefaultState()
					.getBlock())) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LiquidTank5Block.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.clearMatchingItems(p -> new ItemStack(Items.WATER_BUCKET, (int) (1)).getItem() == p.getItem(),
							(int) 1);
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == LiquidTank5Block.block.getDefaultState()
					.getBlock())) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LiquidTank6Block.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.clearMatchingItems(p -> new ItemStack(Items.WATER_BUCKET, (int) (1)).getItem() == p.getItem(),
							(int) 1);
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == LiquidTank6Block.block.getDefaultState()
					.getBlock())) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LiquidTank7Block.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.clearMatchingItems(p -> new ItemStack(Items.WATER_BUCKET, (int) (1)).getItem() == p.getItem(),
							(int) 1);
			} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == LiquidTank7Block.block.getDefaultState()
					.getBlock())) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LiquidTank8Block.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.clearMatchingItems(p -> new ItemStack(Items.WATER_BUCKET, (int) (1)).getItem() == p.getItem(),
							(int) 1);
			} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == LiquidTank8Block.block.getDefaultState()
					.getBlock())) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LiquidTank9Block.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.clearMatchingItems(p -> new ItemStack(Items.WATER_BUCKET, (int) (1)).getItem() == p.getItem(),
							(int) 1);
			} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == LiquidTank9Block.block.getDefaultState()
					.getBlock())) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LiquidTank10Block.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.clearMatchingItems(p -> new ItemStack(Items.WATER_BUCKET, (int) (1)).getItem() == p.getItem(),
							(int) 1);
			}
		}
	}

	@SubscribeEvent
	public void onLeftClickBlock(PlayerInteractEvent.LeftClickBlock event) {
		PlayerEntity entity = event.getPlayer();
		if (event.getHand() != entity.getActiveHand())
			return;
		int i = event.getPos().getX();
		int j = event.getPos().getY();
		int k = event.getPos().getZ();
		World world = event.getWorld();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
