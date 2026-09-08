package tests;

import base.BaseTest;
import org.example.Screens.Android.LoginScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test(dataProvider = "loginData", dataProviderClass = Data.LoginData.class)
    public void testLogin(String username, String password) {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login(username, password);
        Assert.assertTrue(loginScreen.isLoginSuccessful(), "Login was not successful");
    }

}
