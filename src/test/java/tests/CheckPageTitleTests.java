package tests;

import org.testng.annotations.Test;

import static framework.DriverActions.openMainPage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CheckPageTitleTests extends BaseTest {

    private final String expectedDeliveryPageTitle = "Вартість доставки";
    private final String expectedEstimatePageTitle = "Терміни доставки";
    private final String expectedClosestFilialPageTitle = "Найближче відділення";
    private final String expectedTimeTablePageTitle = "Пошук відділення за номером або за населеним пунктом";
    private final String expectedGetCourierPageTitle = "Виклик кур'єра";

    @Test
    public void checkDeliveryPageTitle() {
        String actualPageTitle = openMainPage()
                .clickOnDeliveryCostMenuItem()
                .getDeliveryPageTitleText();
        assertThat(actualPageTitle, equalTo(expectedDeliveryPageTitle));
    }

    @Test
    public void checkEstimateDatePageTitle() {
        String actualPageTitle = openMainPage()
                .clickOnEstimateDateMenuItem()
                .getEstimateDatePageTitleText();
        assertThat(actualPageTitle, equalTo(expectedEstimatePageTitle));
    }

    @Test
    public void checkClosestFilialPageTitle() {
        String actualPageTitle = openMainPage()
                .clickOnClosestFilialMenuItem()
                .getClosestFilialPageTitle();
        assertThat(actualPageTitle, equalTo(expectedClosestFilialPageTitle));
    }

    @Test
    public void checkTimeTablePageTitle() {
        String actualPageTitle = openMainPage()
                .clickOnTimeTableMenuItem()
                .getTimeTablePageTitle();
        assertThat(actualPageTitle, equalTo(expectedTimeTablePageTitle));
    }

    @Test
    public void checkGetCourierPageTitle() {
        String actualPageTitle = openMainPage()
                .clickOnGetCourierMenuItem()
                .getCourierPageTitle();
        assertThat(actualPageTitle, equalTo(expectedGetCourierPageTitle));
    }

}
