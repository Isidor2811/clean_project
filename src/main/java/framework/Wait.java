package framework;

import framework.driverFactory.DriverFactory;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

@Slf4j
public class Wait {

    public static boolean waitUntilVisible(WebElement element, int... seconds) {
        int secondsToWait = seconds.length > 0 ? seconds[0] : 5;
        try {
            new FluentWait<>(DriverFactory.getDriver())
                    .withTimeout(Duration.ofSeconds(secondsToWait))
                    .pollingEvery(Duration.ofMillis(100))
                    .ignoring(NoSuchElementException.class)
                    .until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e) {
            log.info("Element is not displayed");
            return false;
        }
        return true;
    }

}
