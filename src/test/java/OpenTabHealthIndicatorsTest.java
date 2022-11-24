
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import pageobject.HealthIndicatorsPage;
import pageobject.PersonalAccountPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.refresh;
import static uri.BaseURI.MAIN_PAGE;

public class OpenTabHealthIndicatorsTest extends BaseTest {
    PersonalAccountPage personalAccountPage = new PersonalAccountPage();
    HealthIndicatorsPage healthIndicatorsPage = new HealthIndicatorsPage();

    @Test
    @Description("Проверка перехода на вкладку 'Показатели здоровья' с главной страницы")
    public void tabOfHealthIndicatorsIsVisible_successfulResult() {
        open(MAIN_PAGE);
        mainPage.transitionToThePersonalAccount();
        personalAccountPage.clickButtonWithNameDifferent();
        healthIndicatorsPage.tabOfHealthIndicatorsVisible();
        healthIndicatorsPage.elementHealthMonitoringVisible();
    }

    @Test
    @Description("Проверка недоступности перехода на вкладку 'Показатели здоровья' с главной страницы для ребенка")
    public void tabOfHealthIndicatorsIsNotVisible_notSuccessfulResult() {
        open(MAIN_PAGE);
        mainPage.transitionToTheChildrenAccount();
        personalAccountPage.clickButtonWithNameDifferent();
        healthIndicatorsPage.tabOfHealthIndicatorsIsNotVisible();
    }

    @Test
    @Description("Проверка недоступности перехода на вкладку 'Показатели здоровья' с главной страницы для ребенка после перезагрузки страницы личного кабинета")
    public void tabOfHealthIndicatorsIsNotVisibleAfterRefresh_notSuccessfulResult() {
        open(MAIN_PAGE);
        mainPage.transitionToTheChildrenAccount();
        personalAccountPage.clickButtonWithNameDifferent();
        healthIndicatorsPage.tabOfHealthIndicatorsIsNotVisible();
        refresh();
        personalAccountPage.buttonWithNameDifferentVisible();
        healthIndicatorsPage.tabOfHealthIndicatorsIsNotVisible();
    }
}