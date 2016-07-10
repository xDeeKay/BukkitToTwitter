package net.dkcraft.bukkittotwitter;

import org.apache.commons.lang.StringUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Tweet implements CommandExecutor  {

	public Main plugin;
	public Methods methods;

	public Tweet(Main plugin) {
		this.plugin = plugin;
		this.methods = this.plugin.methods;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("tweet")) {
			if (args.length >= 1) {
				
				String string = StringUtils.join(args, ' ', 0, args.length);
				
				methods.tweet(string);
			}
		}
		return true;
	}
}
