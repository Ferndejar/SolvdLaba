package com.solvd.Singleton;

public class SingletonClient {
    public static void main(String[] args) {
        // Get the single instance of ConfigurationManager.
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Retrieve configuration values.
        String appUrl = configManager.getProperty("app.url");
        String appTimeout = configManager.getProperty("app.timeout");

        System.out.println("App URL: " + appUrl);
        System.out.println("App Timeout: " + appTimeout + " ms");
    }
}
