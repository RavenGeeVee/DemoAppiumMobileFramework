package base;

import org.example.Drivers.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {

    @BeforeMethod
    @Parameters({"platform"})
    public void setUp(@Optional("android") String platformName) {
        DriverManager.initializeDriver(platformName);
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
