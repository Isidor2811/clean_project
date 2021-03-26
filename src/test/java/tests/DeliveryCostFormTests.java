package tests;

import org.testng.annotations.Test;

import java.util.List;

import static framework.DriverActions.openMainPage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DeliveryCostFormTests extends BaseTest {

    @Test
    public void checkSenderCityContainsTenElements() {
        List<String> allSenderCities = openMainPage()
                .clickOnDeliveryCostMenuItem()
                .getAllSenderCities();
        assertThat(allSenderCities, hasSize(10));
    }

    @Test
    public void checkSenderCityContainsSpecialCityName() {
        List<String> allSenderCities = openMainPage()
                .clickOnDeliveryCostMenuItem()
                .getAllSenderCities();
        assertThat(allSenderCities, hasItem("Вінниця"));
    }

    @Test
    public void checkThatOnlyTwoNumbersAllowedInFloorsInput() {
        String textFromFloorsCountInput = openMainPage()
                .clickOnDeliveryCostMenuItem()
                .fillFloorsCountInput("199")
                .getTextFromFloorsCountInput();
        assertThat(textFromFloorsCountInput, equalTo("99"));
    }


    @Test
    public void checkThatToolTipAppearsWithCorrectText() {
        String textFromRouteTooltip = openMainPage()
                .clickOnDeliveryCostMenuItem()
                .hoverMouseOverRouteToolTip()
                .getTextFromRouteTooltip();
        assertThat(textFromRouteTooltip, equalTo("Введіть місто, з якого Ви будете відправляти, і місто, в яке має прибути Ваше відправлення"));
    }

}
