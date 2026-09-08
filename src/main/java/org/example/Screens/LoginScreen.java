package org.example.Screens;

public interface LoginScreen {

    void enterUsername(String username);
    void enterPassword(String password);
    void clickLoginButton();
    void login(String username, String password);
    boolean isLoginButtonDisplayed();
    boolean isUsernameFieldDisplayed();
    boolean isPasswordFieldDisplayed();
    boolean isLoginSuccessful();

}
