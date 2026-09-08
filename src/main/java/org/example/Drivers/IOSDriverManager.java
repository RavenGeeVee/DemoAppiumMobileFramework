package org.example.Drivers;

import io.appium.java_client.ios.IOSDriver;
import org.example.Config.ConfigReader;
import org.openqa.selenium.MutableCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class IOSDriverManager {

    public IOSDriver createDriver() {
        ConfigReader configReader = new ConfigReader("ios");
        try {
            return new IOSDriver(new URL(configReader.getAppiumServerURL()), CapabilityFactory.getCapabilities("ios"));
        } catch (MalformedURLException e) {
            throw new RuntimeException("Invalid Appium server URL", e);
        }
    }
}
