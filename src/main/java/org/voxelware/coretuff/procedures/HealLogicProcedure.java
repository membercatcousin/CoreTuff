package org.voxelware.coretuff.procedures;

import org.bukkit.event.Listener;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Entity;

public class HealLogicProcedure implements Listener {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(20);
		FeedLogicProcedure.execute(entity);
	}
}