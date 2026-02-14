package org.voxelware.coretuff.procedures;

import org.bukkit.event.Listener;
import org.bukkit.entity.Entity;

public class VersionProcedure implements Listener {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.sendMessage("\u00A76\u00A7lCoreTuff \u00A7fv0.1.0");
	}
}