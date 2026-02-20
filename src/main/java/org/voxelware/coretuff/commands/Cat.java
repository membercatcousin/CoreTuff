package org.voxelware.coretuff.commands;

import org.voxelware.coretuff.procedures.CatLogicProcedure;
import io.papermc.paper.command.brigadier.Commands;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import com.mojang.brigadier.tree.LiteralCommandNode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;

public class Cat {
    public static LiteralCommandNode<CommandSourceStack> register() {
        // The High-Aura Brigadier Chain (No random semicolons!)
        return Commands.literal("cat")
            .executes(context -> {
                CommandSourceStack source = context.getSource();
                Entity entity = source.getExecutor();

                if (entity != null) {
                    World world = entity.getWorld();
                    Location loc = entity.getLocation();

                    // MCreator wants world, x, y, z for the blocks you used.
                    // If your procedure also needs 'entity', add it inside the brackets!
                    CatLogicProcedure.execute(world, loc.getX(), loc.getY(), loc.getZ());
                }

                return 1; // 1 means Protocol Successful
            })
            .build(); // Properly chained at the end!
    }
}
