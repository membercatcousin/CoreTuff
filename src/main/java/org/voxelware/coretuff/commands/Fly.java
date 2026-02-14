package org.voxelware.coretuff.commands;

import org.voxelware.coretuff.procedures.FlyLogicProcedure;

import org.bukkit.entity.Entity;
import org.bukkit.block.BlockFace;
import org.bukkit.World;

import io.papermc.paper.command.brigadier.Commands;
import io.papermc.paper.command.brigadier.CommandSourceStack;

import com.mojang.brigadier.tree.LiteralCommandNode;

public class Fly {
	public static LiteralCommandNode<CommandSourceStack> register() {
		return Commands.literal("fly")

				.executes(arguments -> {
					World world = arguments.getSource().getLocation().getWorld();
					double x = arguments.getSource().getLocation().x();
					double y = arguments.getSource().getLocation().y();
					double z = arguments.getSource().getLocation().z();
					Entity entity = arguments.getSource().getExecutor();
					BlockFace direction = BlockFace.DOWN;
					if (entity != null)
						direction = entity.getFacing();

					FlyLogicProcedure.execute(entity);
					return 0;
				}).build();
	}
}