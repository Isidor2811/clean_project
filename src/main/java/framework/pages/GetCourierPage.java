package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static framework.Wait.waitUntilVisible;

public class GetCourierPage extends BasePage {

    @FindBy(xpath = "//h1[@class='page_title']")
    private WebElement getCourierPageTitleTitle;

    public String getCourierPageTitle() {
        waitUntilVisible(getCourierPageTitleTitle);
        return getCourierPageTitleTitle.getText();
    }
}
