package org.example.Drivers;

import io.appium.java_client.AppiumDriver;

public class DriverManager {

    private static ThreadLocal<AppiumDriver> driverThreadLocal = new ThreadLocal<>();

    public static void initializeDriver(String platform) {
        AppiumDriver appiumDriver =
                DriverFactory.createDriver(platform);
        driverThreadLocal.set(appiumDriver);
    }

    public static AppiumDriver getDriver() {
        return driverThreadLocal.get();
    }

    public static void quitDriver() {
        if (driverThreadLocal.get() != null) {
            driverThreadLocal.get().quit();
            driverThreadLocal.remove();
        }
    }

}
