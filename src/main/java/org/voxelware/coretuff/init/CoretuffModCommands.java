package org.voxelware.coretuff.init;

import org.voxelware.coretuff.commands.*;

import org.bukkit.plugin.java.JavaPlugin;

import io.papermc.paper.plugin.lifecycle.event.types.LifecycleEvents;

public class CoretuffModCommands {
	public static void register(JavaPlugin plugin) {
		plugin.getLifecycleManager().registerEventHandler(LifecycleEvents.COMMANDS, commands -> {
			commands.registrar().register(Coretuff.register());
			commands.registrar().register(Gms.register());
			commands.registrar().register(Gmsp.register());
			commands.registrar().register(Gma.register());
			commands.registrar().register(Fly.register());
			commands.registrar().register(Gmc.register());
			commands.registrar().register(Heal.register());
			commands.registrar().register(Feed.register());
			commands.registrar().register(Suicide.register());
		});
	}
}