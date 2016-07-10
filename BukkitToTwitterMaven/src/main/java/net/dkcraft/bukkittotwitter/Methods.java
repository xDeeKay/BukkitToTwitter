package net.dkcraft.bukkittotwitter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class Methods {
	
	public Main plugin;
	public Config config;

	public Methods(Main plugin) {
		this.plugin = plugin;
		this.config = this.plugin.config;
	}
	
	public void tweet(String string) {
		
		String consumerKey = config.getConsumerKey();
		String consumerSecret = config.getConsumerSecret();
		String oAuthAccessToken = config.getOAuthAccessToken();
		String oAuthAccessTokenSecret = config.getOAuthAccessTokenSecret();

		ConfigurationBuilder cb = new ConfigurationBuilder();

		cb.setDebugEnabled(true)
		.setOAuthConsumerKey(consumerKey)
		.setOAuthConsumerSecret(consumerSecret)
		.setOAuthAccessToken(oAuthAccessToken)
		.setOAuthAccessTokenSecret(oAuthAccessTokenSecret);
		
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		
		String dateFormatString = config.getDateFormat();
		DateFormat dateFormat = new SimpleDateFormat(dateFormatString);
		Date date = new Date();
		String dateString = dateFormat.format(date);

		try {
			twitter.updateStatus("[" + dateString + "] " + string);
			System.out.println("BukkitToTwitter successful.");
		} catch (TwitterException e) {
			System.out.println("BukkitToTwitter unsuccessful.");
			e.printStackTrace();
		}
	}
}
