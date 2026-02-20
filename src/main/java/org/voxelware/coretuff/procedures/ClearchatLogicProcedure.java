package org.voxelware.coretuff.procedures;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.event.Listener; // Pacifier

public class ClearchatLogicProcedure implements Listener {
    public static void execute(Entity entity) {
        if (entity == null) return;

        for (int i = 0; i < 100; i++) {
            Bukkit.broadcastMessage("");
        }

        Bukkit.broadcastMessage("§8§m----------------------------------------");
        Bukkit.broadcastMessage("§b§l§fThe chat has been cleared by §a" + entity.getName());
        Bukkit.broadcastMessage("§8§m----------------------------------------");
    }
}
