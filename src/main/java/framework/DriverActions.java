package framework;

import framework.driverFactory.DriverFactory;
import framework.pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.stream.Collectors;

public class DriverActions {

    public static MainPage openMainPage() {
        DriverFactory.getDriver().get("https://novaposhta.ua/");
        return new MainPage();
    }

    public static List<String> getAllElementsFromDropdown(By xpath) {
        List<WebElement> elements = DriverFactory.getDriver().findElements(xpath);
        return elements.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    public static void hoverMouseOverElement(WebElement element) {
        Actions actions = new Actions(DriverFactory.getDriver());
        actions.moveToElement(element).build().perform();
    }
}
