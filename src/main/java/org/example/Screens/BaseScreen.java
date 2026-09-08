package org.example.Screens;

import io.appium.java_client.AppiumDriver;
import org.example.Drivers.DriverManager;

public abstract class BaseScreen {

    protected final AppiumDriver driver;

    protected BaseScreen() {
        this.driver = DriverManager.getDriver();
    }
}
