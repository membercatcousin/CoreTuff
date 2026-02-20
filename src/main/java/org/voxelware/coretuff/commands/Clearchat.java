package org.voxelware.coretuff.commands;

import org.voxelware.coretuff.procedures.ClearchatLogicProcedure;
import io.papermc.paper.command.brigadier.Commands;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import com.mojang.brigadier.tree.LiteralCommandNode;
import org.bukkit.entity.Entity;

public class Clearchat {
    public static LiteralCommandNode<CommandSourceStack> register() {
        // You can change "clearchat" to "cc" here if you prefer a shorter command!
        return Commands.literal("clearchat")
            .executes(context -> {
                // 1. Grab the player who typed it
                Entity entity = context.getSource().getExecutor();

                // 2. Pass them into the procedure!
                if (entity != null) {
                    ClearchatLogicProcedure.execute(entity);
                }

                return 1;
            })
            .build();
    }
}
