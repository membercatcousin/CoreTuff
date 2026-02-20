package org.voxelware.coretuff.commands;

import org.voxelware.coretuff.procedures.SpecsLogicProcedure;
import io.papermc.paper.command.brigadier.Commands;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import com.mojang.brigadier.tree.LiteralCommandNode;
import org.bukkit.entity.Entity;

public class Specs {
    public static LiteralCommandNode<CommandSourceStack> register() {
        return Commands.literal("specs")
            .executes(context -> {
                // 1. Get the entity (player) who typed it
                Entity entity = context.getSource().getExecutor();

                // 2. Pass the entity into the procedure!
                if (entity != null) {
                    SpecsLogicProcedure.execute(entity);
                }

                return 1;
            })
            .build();
    }
}
