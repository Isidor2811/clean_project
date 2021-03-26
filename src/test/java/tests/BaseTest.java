package tests;

import framework.driverFactory.DriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void beforeEveryTestMethod() {
        DriverFactory.setUp();
    }

    @AfterMethod(alwaysRun = true)
    public void afterEachMethod() {
        DriverFactory.closeDriver();
    }
}
