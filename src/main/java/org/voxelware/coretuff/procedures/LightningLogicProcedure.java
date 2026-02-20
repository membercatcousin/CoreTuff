package org.voxelware.coretuff.procedures;

import org.bukkit.World;
import org.bukkit.Location;
import org.bukkit.event.Listener; // Satisfies the MCreator generator

public class LightningLogicProcedure implements Listener {

    public static void execute(World world, double x, double y, double z) {
        if (world == null) return;

        // Get the location
        Location loc = new Location(world, x, y, z);

        // The TUFF Smite (Deals damage and fire)
        world.strikeLightning(loc);
    }

} // <--- THIS IS THE BRACKET YOU WERE MISSING!
