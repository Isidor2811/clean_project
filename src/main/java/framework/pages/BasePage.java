package framework.pages;

import framework.driverFactory.DriverFactory;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }
}
