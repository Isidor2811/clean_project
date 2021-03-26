package framework.pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static framework.Wait.waitUntilVisible;

@Slf4j
public class MainPage extends BasePage {

    @FindBy(xpath = "//a[@class='cost']")
    private WebElement deliveryCostMenuItem;

    @FindBy(xpath = "//a[@class='estimatedate']")
    private WebElement estimateDateMenuItem;

    @FindBy(xpath = "//a[contains(@class,'filial')]")
    private WebElement closestFilialMenuItem;

    @FindBy(xpath = "//a[@class='timetable']")
    private WebElement timeTableMenuItem;

    @FindBy(xpath = "//a[@class='online']")
    private WebElement getCourierMenuItem;


    public DeliveryCostPage clickOnDeliveryCostMenuItem() {
        log.info("Going to the Delivery cost page");
        waitUntilVisible(deliveryCostMenuItem);
        deliveryCostMenuItem.click();
        return new DeliveryCostPage();
    }

    public EstimateDatePage clickOnEstimateDateMenuItem() {
        waitUntilVisible(estimateDateMenuItem);
        estimateDateMenuItem.click();
        return new EstimateDatePage();
    }

    public TimeTablePage clickOnTimeTableMenuItem() {
        waitUntilVisible(timeTableMenuItem);
        timeTableMenuItem.click();
        return new TimeTablePage();
    }

    public ClosestFilialPage clickOnClosestFilialMenuItem() {
        waitUntilVisible(closestFilialMenuItem);
        closestFilialMenuItem.click();
        return new ClosestFilialPage();
    }

    public GetCourierPage clickOnGetCourierMenuItem() {
        waitUntilVisible(getCourierMenuItem);
        getCourierMenuItem.click();
        return new GetCourierPage();
    }


}
