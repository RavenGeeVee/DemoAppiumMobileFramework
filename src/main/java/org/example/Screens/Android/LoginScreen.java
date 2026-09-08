package org.example.Screens.Android;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.Screens.BaseScreen;
import org.example.Screens.Locators.LoginLocators;
import org.openqa.selenium.support.PageFactory;

import static org.example.Drivers.DriverManager.getDriver;

public class LoginScreen extends BaseScreen implements org.example.Screens.LoginScreen {

    private final LoginLocators locators;

    public LoginScreen() {
        this.locators = new LoginLocators();
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), locators);
    }

    @Override
    public void enterUsername(String username) {
        locators.usernameField.sendKeys(username);
    }

    @Override
    public void enterPassword(String password) {
        locators.passwordField.sendKeys(password);
    }

    @Override
    public void clickLoginButton() {
        locators.loginButton.click();
    }

    @Override
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }

    @Override
    public boolean isLoginButtonDisplayed() {
        return locators.loginButton.isDisplayed();
    }

    @Override
    public boolean isUsernameFieldDisplayed() {
        return locators.usernameField.isDisplayed();
    }

    @Override
    public boolean isPasswordFieldDisplayed() {
        return locators.passwordField.isDisplayed();
    }

    @Override
    public boolean isLoginSuccessful() {
        return locators.productsTitle.isDisplayed();
    }

}

