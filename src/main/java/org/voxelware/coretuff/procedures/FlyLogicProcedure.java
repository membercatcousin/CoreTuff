package org.voxelware.coretuff.procedures;

import org.bukkit.event.Listener;
import org.bukkit.entity.Player;
import org.bukkit.entity.Entity;
import java.util.HashSet;
import java.util.UUID;
import java.util.Set;

public class FlyLogicProcedure implements Listener {
    private static Set<UUID> flyingPlayers = new HashSet<>();

    public static void execute(Entity entity) {
        if (entity == null)
            return;

        if (entity instanceof Player _player) {
            UUID playerId = _player.getUniqueId();

            // Toggle flight status
            if (flyingPlayers.contains(playerId)) {
                // Disable flight
                _player.setAllowFlight(false);
                _player.setFlying(false);
                flyingPlayers.remove(playerId);
                _player.sendMessage("§cFlight disabled!");
            } else {
                // Enable flight
                _player.setAllowFlight(true);
                _player.setFlying(true);
                flyingPlayers.add(playerId);
                _player.sendMessage("§aFlight enabled!");
            }
        }
    }

    // Optional: Method to check if a player has flight enabled
    public static boolean hasFlight(Player player) {
        return flyingPlayers.contains(player.getUniqueId());
    }

    // Optional: Method to remove player from tracking (useful for when players leave)
    public static void removePlayer(Player player) {
        flyingPlayers.remove(player.getUniqueId());
    }
}
