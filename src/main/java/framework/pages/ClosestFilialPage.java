package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static framework.Wait.waitUntilVisible;

public class ClosestFilialPage extends BasePage {

    @FindBy(xpath = "//h1[@class='office_page_title']")
    private WebElement closestFilialPageTitle;

    public String getClosestFilialPageTitle() {
        waitUntilVisible(closestFilialPageTitle);
        return closestFilialPageTitle.getText();
    }
}
