package org.example.Config;

import java.util.Properties;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

public class ConfigReader {

    private final Properties properties = new Properties();

    public ConfigReader(String platform) {
        String fileName = "Config/" + platform.toLowerCase() + ".properties";
        loadProperties("Config/framework.properties");
        loadProperties(fileName);
    }

    private void loadProperties(String fileName) {
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName)) {
            if (inputStream == null) {
                throw new IllegalStateException("Configuration resource not found: " + fileName);
            }
            properties.load(inputStream);
        } catch (IOException e) {
            throw new IllegalStateException("Unable to load configuration: " + fileName, e);
        }
    }

    private String getPropertyOrDefault(String key, String defaultValue) {
        return getProperty(key, defaultValue);
    }

    public String getProperty(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }

    public String getPlatformName() {
        return getPropertyOrDefault("platformName", "Android");
    }

    public String getDeviceName() {
        return getPropertyOrDefault("deviceName", "emulator");
    }

    public String getAppPath() {
        String appPath = getPropertyOrDefault("app", "");
        return appPath.isBlank() ? appPath : Path.of(appPath).toAbsolutePath().toString();
    }

    public String getAppiumServerURL() {
        return getPropertyOrDefault("appiumServerUrl", "http://localhost:4723/wd/hub");
    }

    public String getAutomationName() {
        return getPropertyOrDefault("automationName", "UiAutomator2");
    }

    public String getPlatformVersion() {
        return getPropertyOrDefault("platformVersion", "");
    }

    public String getUDID() {
        return getPropertyOrDefault("udid", "");
    }

    public String getAppPackage() {
        return getPropertyOrDefault("appPackage", "");
    }

    public String getAppActivity() {
        return getPropertyOrDefault("appActivity", "");
    }

    public String getAppWaitActivity() {
        return getPropertyOrDefault("appWaitActivity", "");
    }

    public String getNoReset() {
        return getPropertyOrDefault("noReset", "");
    }

    public String getFullReset() {
        return getPropertyOrDefault("fullReset", "");
    }

    public String getNewCommandTimeout() {
        return getPropertyOrDefault("newCommandTimeout", "60");
    }

    public String getAutoGrantPermissions() {
        return getPropertyOrDefault("autoGrantPermissions", "");
    }

    public String getLanguage() {
        return getPropertyOrDefault("language", "");
    }

    public String getLocale() {
        return getPropertyOrDefault("locale", "");
    }

    public String getOrientation() {
        return getPropertyOrDefault("orientation", "PORTRAIT");
    }

}
