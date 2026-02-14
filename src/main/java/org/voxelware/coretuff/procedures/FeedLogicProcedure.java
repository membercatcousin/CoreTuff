package org.voxelware.coretuff.procedures;

import org.bukkit.event.Listener;
import org.bukkit.entity.Player;
import org.bukkit.entity.Entity;

public class FeedLogicProcedure implements Listener {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.setFoodLevel(20);
		if (entity instanceof Player _player)
			_player.setSaturation(5);
	}
}