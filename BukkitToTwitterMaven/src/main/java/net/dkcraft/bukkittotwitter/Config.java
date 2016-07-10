package net.dkcraft.bukkittotwitter;

public class Config {

	public Main plugin;

	public Config(Main plugin) {
		this.plugin = plugin;
	}

	private String consumerKey;
	private String consumerSecret;
	private String oAuthAccessToken;
	private String oAuthAccessTokenSecret;
	private String dateFormat;
	
	public void loadConfiguration() {
		
		plugin.getConfig().options().copyDefaults(true);
		plugin.saveDefaultConfig();
		
		this.setConsumerKey(plugin.getConfig().getString("consumerKey"));
		this.setConsumerSecret(plugin.getConfig().getString("consumerSecret"));
		this.setOAuthAccessToken(plugin.getConfig().getString("oAuthAccessToken"));
		this.setOAuthAccessTokenSecret(plugin.getConfig().getString("oAuthAccessTokenSecret"));
		this.setDateFormat(plugin.getConfig().getString("dateFormat"));
	}

	public void setConsumerKey(String consumerKey) {
		this.consumerKey = consumerKey;
	}

	public String getConsumerKey() {
		return this.consumerKey;
	}
	
	public void setConsumerSecret(String consumerSecret) {
		this.consumerSecret = consumerSecret;
	}

	public String getConsumerSecret() {
		return this.consumerSecret;
	}
	
	public void setOAuthAccessToken(String oAuthAccessToken) {
		this.oAuthAccessToken = oAuthAccessToken;
	}

	public String getOAuthAccessToken() {
		return this.oAuthAccessToken;
	}
	
	public void setOAuthAccessTokenSecret(String oAuthAccessTokenSecret) {
		this.oAuthAccessTokenSecret = oAuthAccessTokenSecret;
	}

	public String getOAuthAccessTokenSecret() {
		return this.oAuthAccessTokenSecret;
	}
	
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	public String getDateFormat() {
		return this.dateFormat;
	}
}
