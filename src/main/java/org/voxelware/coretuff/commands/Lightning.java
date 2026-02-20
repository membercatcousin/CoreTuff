package org.voxelware.coretuff.commands;

import org.bukkit.entity.Entity;
import org.bukkit.block.BlockFace;
import org.bukkit.World;

// 1. ADDED THIS IMPORT SO JAVA KNOWS WHAT THE PROCEDURE IS
import org.voxelware.coretuff.procedures.LightningLogicProcedure;

import io.papermc.paper.command.brigadier.Commands;
import io.papermc.paper.command.brigadier.CommandSourceStack;

import com.mojang.brigadier.tree.LiteralCommandNode;

public class Lightning {
	public static LiteralCommandNode<CommandSourceStack> register() {
		return Commands.literal("lightning")

				.executes(arguments -> {
					World world = arguments.getSource().getLocation().getWorld();
					double x = arguments.getSource().getLocation().x();
					double y = arguments.getSource().getLocation().y();
					double z = arguments.getSource().getLocation().z();
					Entity entity = arguments.getSource().getExecutor();
					BlockFace direction = BlockFace.DOWN;
					if (entity != null)
						direction = entity.getFacing();

					// 2. PASSED THE VARIABLES INTO THE PROCEDURE!
					LightningLogicProcedure.execute(world, x, y, z);

					return 0;
				}).build();
	}
}
