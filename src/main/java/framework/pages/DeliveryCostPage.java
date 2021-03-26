package framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static framework.DriverActions.getAllElementsFromDropdown;
import static framework.DriverActions.hoverMouseOverElement;
import static framework.Wait.waitUntilVisible;

public class DeliveryCostPage extends BasePage {

    @FindBy(xpath = "//h1[@class='page_title']")
    private WebElement deliveryPageTitle;

    @FindBy(xpath = "//input[@id='DeliveryForm_senderCity']")
    public WebElement senderCityInput;

    @FindBy(xpath = "//input[@id='DeliveryForm_floorCountAsc']")
    public WebElement florCountInput;

    @FindBy(xpath = "//div[@class='two_inputs']/following-sibling::div[@class='b_tooltip']")
    public WebElement routeToolTip;


    public String getDeliveryPageTitleText() {
        waitUntilVisible(deliveryPageTitle);
        return deliveryPageTitle.getText();
    }

    public List<String> getAllSenderCities() {
        By internalDropDownElements = By.xpath("//ul[@id='delivery_sender_cities']//li");
        waitUntilVisible(senderCityInput);
        senderCityInput.click();
        return getAllElementsFromDropdown(internalDropDownElements);
    }

    public DeliveryCostPage fillFloorsCountInput(String floors) {
        waitUntilVisible(florCountInput);
        florCountInput.sendKeys(floors);
        return this;
    }

    public String getTextFromFloorsCountInput() {
        waitUntilVisible(florCountInput);
        return florCountInput.getAttribute("value");
    }


    public DeliveryCostPage hoverMouseOverRouteToolTip() {
        waitUntilVisible(routeToolTip);
        hoverMouseOverElement(routeToolTip);
        return this;
    }

    public String getTextFromRouteTooltip() {
        WebElement toolTip = routeToolTip.findElement(By.xpath(".//div[@class='b_tooltip_body']"));
        waitUntilVisible(toolTip,2);
        return toolTip.getText();
    }

}
