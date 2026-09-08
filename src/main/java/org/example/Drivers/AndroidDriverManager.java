package org.example.Drivers;

import io.appium.java_client.android.AndroidDriver;
import org.example.Config.ConfigReader;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverManager {

    public AndroidDriver createDriver() {
        ConfigReader configReader = new ConfigReader("android");
        try {
            return new AndroidDriver(new URL(configReader.getAppiumServerURL()), CapabilityFactory.getCapabilities("android"));
        } catch (MalformedURLException e) {
            throw new RuntimeException("Invalid Appium server URL", e);
        }
    }
}
