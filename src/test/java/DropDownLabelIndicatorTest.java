import org.testng.annotations.Test;
import io.qameta.allure.Description;
import pageobject.HealthIndicatorsPage;

import static com.codeborne.selenide.Selenide.open;
import static uri.BaseURI.MAIN_PAGE;
import static uri.BaseURI.TAB_HEALTH_INDICATORS;

public class DropDownLabelIndicatorTest extends BaseTest {

    HealthIndicatorsPage healthIndicatorsPage = new HealthIndicatorsPage();

    @Test
    @Description("Проверка перехода на вкладку 'Показатели здоровья' с главной страницы")
    public void tabOfHealthIndicatorsIsVisible_successfulResult() {
        open(TAB_HEALTH_INDICATORS);

        healthIndicatorsPage.indicatorTheConditionOfTheSkinVisible();
    }
}
