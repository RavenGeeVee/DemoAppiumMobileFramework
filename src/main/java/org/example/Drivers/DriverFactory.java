package org.example.Drivers;

import io.appium.java_client.AppiumDriver;

public class DriverFactory {

    public static AppiumDriver createDriver(String platform) {
        switch (platform.toLowerCase()) {
            case "android":
                return new AndroidDriverManager().createDriver();
            case "ios":
                return new IOSDriverManager().createDriver();
            default:
                throw new IllegalArgumentException("Unsupported platform: " + platform);
        }
    }

}
