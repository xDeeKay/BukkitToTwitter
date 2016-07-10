package net.dkcraft.bukkittotwitter;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public Config config;
	public Methods methods;
	
	public void onEnable() {
		
		config = new Config(this);
		methods = new Methods(this);
		
		config.loadConfiguration();
		
		this.getCommand("tweet").setExecutor(new Tweet(this));
		
		this.getServer().getPluginManager().registerEvents(new EventListener(this), this);
		
		methods.tweet("The server has started.");
	}

	public void onDisable() {
		
		methods.tweet("The server has stopped.");
	}
}
