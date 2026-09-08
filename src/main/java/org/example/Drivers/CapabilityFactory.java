package org.example.Drivers;

import org.example.Config.ConfigReader;
import org.openqa.selenium.MutableCapabilities;

public class CapabilityFactory {

    public static MutableCapabilities getCapabilities(String platformName) {
        MutableCapabilities capabilities = new MutableCapabilities();
        ConfigReader configReader = new ConfigReader(platformName);

        capabilities.setCapability("platformName", configReader.getPlatformName());
        capabilities.setCapability("appium:deviceName", configReader.getDeviceName());
        capabilities.setCapability("appium:app", configReader.getAppPath());
        capabilities.setCapability("appium:automationName", configReader.getAutomationName());
        capabilities.setCapability("appium:platformVersion", configReader.getPlatformVersion());
        capabilities.setCapability("appium:udid", configReader.getUDID());
        capabilities.setCapability("appium:appPackage", configReader.getAppPackage());
        capabilities.setCapability("appium:appActivity", configReader.getAppActivity());
        capabilities.setCapability("appium:appWaitActivity", configReader.getAppWaitActivity());
        capabilities.setCapability("appium:noReset", Boolean.parseBoolean(configReader.getNoReset()));
        capabilities.setCapability("appium:fullReset", Boolean.parseBoolean(configReader.getFullReset()));
        capabilities.setCapability("appium:newCommandTimeout", Integer.parseInt(configReader.getNewCommandTimeout()));
        capabilities.setCapability("appium:autoGrantPermissions", Boolean.parseBoolean(configReader.getAutoGrantPermissions()));
        capabilities.setCapability("appium:language", configReader.getLanguage());
        capabilities.setCapability("appium:locale", configReader.getLocale());
        capabilities.setCapability("appium:orientation", configReader.getOrientation());


        return capabilities;
    }
}
