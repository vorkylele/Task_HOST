package ru.hostco.patientportal.tests.healthindicatorpagetest;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.clearBrowserLocalStorage;
import static ru.hostco.patientportal.config.ConfigSingle.config;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import ru.hostco.patientportal.data.ReceiveOfData;
import org.testng.annotations.BeforeSuite;
import ru.hostco.patientportal.api.generatingclasses.GeneratingIndicators;
import ru.hostco.patientportal.api.models.IndicatorValue;
import ru.hostco.patientportal.pageobject.HealthIndicatorsPage;
import ru.hostco.patientportal.pageobject.LoginPage;

import java.util.List;

public class BaseTest {
    HealthIndicatorsPage healthIndicatorsPage = new HealthIndicatorsPage();
    LoginPage loginPage = new LoginPage();
    ReceiveOfData receiveOfData = new ReceiveOfData();
    List<IndicatorValue> indicatorValue;

    @BeforeSuite(description = "Предварительная конфигурация тестов")
    public void beforeSuite() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        indicatorValue = GeneratingIndicators.getAllIndicators();

        loginPage.fullAuthorization(config.getUsername(), config.getPassword());

        healthIndicatorsPage
                .openTabOfHealthIndicators()
                .deleteAllIndicators()
                .setAllIndicators(indicatorValue, healthIndicatorsPage.getCookie());
    }

    @AfterMethod(description = "Конфигурация после окончания теста")
    public void afterMethod() {
        healthIndicatorsPage.deleteAllIndicators();
    }

    @AfterSuite(description = "Конфигурация после выполнения тестов")
    public void afterSuite() {
        clearBrowserCookies();
        clearBrowserLocalStorage();
    }
}
