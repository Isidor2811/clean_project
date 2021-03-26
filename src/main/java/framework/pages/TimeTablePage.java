package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static framework.Wait.waitUntilVisible;

public class TimeTablePage extends BasePage {

    @FindBy(xpath = "//h1[@class='office_page_title']")
    private WebElement timeTablePageTitleTitle;

    public String getTimeTablePageTitle() {
        waitUntilVisible(timeTablePageTitleTitle);
        return timeTablePageTitleTitle.getText();
    }

}
