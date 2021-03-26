package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static framework.Wait.waitUntilVisible;

public class EstimateDatePage extends BasePage {

    @FindBy(xpath = "//h1[@class='page_title']")
    private WebElement estimateDatePageTitle;


    public String getEstimateDatePageTitleText() {
        waitUntilVisible(estimateDatePageTitle);
        return estimateDatePageTitle.getText();
    }


}
