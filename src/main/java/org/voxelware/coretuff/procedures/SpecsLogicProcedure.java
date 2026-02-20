package org.voxelware.coretuff.procedures;

import org.bukkit.entity.Entity;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener; // 1. Added Import

// 2. Added 'implements Listener' to fix the build error
public class SpecsLogicProcedure implements Listener {
    public static void execute(Entity entity) {
        if (entity == null) return;

        // RAM Logic
        Runtime r = Runtime.getRuntime();
        long maxMem = r.maxMemory() / 1048576L;   // The limit (e.g. 4096 MiB)
        long totalMem = r.totalMemory() / 1048576L; // Currently reserved
        long freeMem = r.freeMemory() / 1048576L;   // Empty space inside reserved
        long usedMem = totalMem - freeMem;          // Actual active RAM

        // TPS Logic
        double tps = 20.0;
        try {
            // Paper API method
            tps = Math.round(Bukkit.getServer().getTPS()[0] * 100.0) / 100.0;
            if (tps > 20.0) tps = 20.0;
        } catch (Exception e) {}

        // CPU Logic
        int cores = r.availableProcessors();

        // Output
        entity.sendMessage("§8§m------------------------");
        entity.sendMessage("§b§l  CoreTuff §3§lSpecs");
        entity.sendMessage("");
        entity.sendMessage("§7  CPU Cores: §f" + cores);
        entity.sendMessage("§7  RAM Usage: §e" + usedMem + "MB §7/ §6" + maxMem + "MB");

        if (tps >= 19.5) {
            entity.sendMessage("§7  TPS: §a" + tps + " §2(Smooth)");
        } else if (tps >= 15.0) {
            entity.sendMessage("§7  TPS: §e" + tps + " §6(Laggy)");
        } else {
            entity.sendMessage("§7  TPS: §c" + tps + " §4(Unplayable)");
        }
        entity.sendMessage("§8§m------------------------");
    }
}
