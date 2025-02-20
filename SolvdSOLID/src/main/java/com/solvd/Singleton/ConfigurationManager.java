package com.solvd.Singleton;

import java.util.Properties;

public class ConfigurationManager {
    private static volatile ConfigurationManager instance;
    private Properties configProperties;

    private ConfigurationManager() {
        configProperties = new Properties();
        // Simulate loading configuration data.
        configProperties.setProperty("app.url", "http://www.twitch.tv/");
        configProperties.setProperty("app.timeout", "5000");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public String getProperty(String key) {
        return configProperties.getProperty(key);
    }
}
