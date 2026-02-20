package org.voxelware.coretuff.init;

import org.voxelware.coretuff.procedures.*;

import org.bukkit.plugin.java.JavaPlugin;

public class CoretuffModProcedures {
	public static void register(JavaPlugin plugin) {
		plugin.getServer().getPluginManager().registerEvents(new VersionProcedure(), plugin);
		plugin.getServer().getPluginManager().registerEvents(new GmsLogicProcedure(), plugin);
		plugin.getServer().getPluginManager().registerEvents(new GmspLogicProcedure(), plugin);
		plugin.getServer().getPluginManager().registerEvents(new GmalogicProcedure(), plugin);
		plugin.getServer().getPluginManager().registerEvents(new FlyLogicProcedure(), plugin);
		plugin.getServer().getPluginManager().registerEvents(new GmcLogicProcedure(), plugin);
		plugin.getServer().getPluginManager().registerEvents(new HealLogicProcedure(), plugin);
		plugin.getServer().getPluginManager().registerEvents(new FeedLogicProcedure(), plugin);
		plugin.getServer().getPluginManager().registerEvents(new SuicideLogicProcedure(), plugin);
		plugin.getServer().getPluginManager().registerEvents(new ClearLogicProcedure(), plugin);
		plugin.getServer().getPluginManager().registerEvents(new CatLogicProcedure(), plugin);
		plugin.getServer().getPluginManager().registerEvents(new LightningLogicProcedure(), plugin);
		plugin.getServer().getPluginManager().registerEvents(new SpecsLogicProcedure(), plugin);
		plugin.getServer().getPluginManager().registerEvents(new ClearchatLogicProcedure(), plugin);
	}
}