package net.dkcraft.bukkittotwitter;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class EventListener implements Listener {
	
	public Main plugin;
	public Methods methods;
	
	public EventListener(Main plugin) {
		this.plugin = plugin;
		this.methods = this.plugin.methods;
	}
	
	@EventHandler
	public void onPlayerLogin(PlayerLoginEvent event) {

		Player player = event.getPlayer();
		String playerName = player.getName();
		
		methods.tweet(playerName + " has joined the game.");
	}
	
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {

		Player player = event.getPlayer();
		String playerName = player.getName();
		
		methods.tweet(playerName + " has left the game.");
	}
}
