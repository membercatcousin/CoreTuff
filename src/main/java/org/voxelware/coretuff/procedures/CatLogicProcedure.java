package org.voxelware.coretuff.procedures;

import org.bukkit.World;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.event.Listener; // Satisfies the MCreator generator

// Added 'implements Listener' back so the main plugin file doesn't crash
public class CatLogicProcedure implements Listener {
    public static void execute(World world, double x, double y, double z) {
        if (world == null) return;

        // The TUFF Loop: Spawns exactly 10 cousins cleanly
        Location loc = new Location(world, x, y, z);
        for (int i = 0; i < 10; i++) {
            world.spawnEntity(loc, EntityType.CAT);
        }
    }
}
