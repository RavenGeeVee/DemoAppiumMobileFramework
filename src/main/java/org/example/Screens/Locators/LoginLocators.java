package org.example.Screens.Locators;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class LoginLocators {

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='test-Username']")
    @iOSXCUITFindBy(accessibility = "username")
    public WebElement usernameField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='test-Password']")
    @iOSXCUITFindBy(accessibility = "password")
    public WebElement passwordField;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='test-LOGIN']")
    @iOSXCUITFindBy(accessibility = "login")
    public WebElement loginButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Error message']")
    @iOSXCUITFindBy(accessibility = "error")
    public WebElement errorMessage;

    @AndroidFindBy(accessibility = "test-PRODUCTS")
    @iOSXCUITFindBy(accessibility = "products")
    public WebElement productsTitle;

}
