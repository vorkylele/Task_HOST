package ru.hostco.patientportal.healthindicatorpagetest;

import ru.hostco.patientportal.data.ReceiveOfData;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import ru.hostco.patientportal.pageobject.HealthIndicatorsPage;
import ru.hostco.patientportal.pageobject.LoginPage;

import static ru.hostco.patientportal.data.TestData.DataOfParametersOfHealthIndicators.*;

public class BaseTest {
    private static final String USERNAME = "71450643575";
    private static final String PASSWORD = "123";
    HealthIndicatorsPage healthIndicatorsPage = new HealthIndicatorsPage();
    LoginPage loginPage = new LoginPage();
    ReceiveOfData receiveOfData = new ReceiveOfData();
    //  Set<Cookie> cookies;

    @BeforeSuite
    public void beforeSuite() {
        loginPage.fullAuthorization(USERNAME, PASSWORD);

//      cookies = WebDriverRunner.getWebDriver().manage().getCookies();
//      cookies.stream().peek(cookie->WebDriverRunner.getWebDriver().manage().addCookie(cookie)).count(); - добавление сразу всех куки

        healthIndicatorsPage.openTabOfHealthIndicators()
                .deleteAllIndicator()
                .clickButtonOfSettings()
                .setSettingsOfTemperature(MIN_VALUE_OF_TEMPERATURE, MAX_VALUE_OF_TEMPERATURE)
                .setSettingsOfWeight(MIN_VALUE_OF_WEIGHT, MAX_VALUE_OF_WEIGH)
                .setSettingsOfPressure(FIRST_MIN_VALUE_OF_PRESSURE, SECOND_MIN_VALUE_OF_PRESSURE, FIRST_MAX_VALUE_OF_PRESSURE, SECOND_MAX_VALUE_OF_PRESSURE)
                .setSettingsOfBloodSugarLevels(MIN_VALUE_OF_BLOOD_SUGAR_LEVELS, MAX_VALUE_OF_BLOOD_SUGAR_LEVELS)
                .setSettingsOfPulse(MIN_VALUE_OF_PULSE, MAX_VALUE_OF_PULSE)
                .setSettingsOfAlcoholInTheBlood(MIN_VALUE_OF_ALCOHOL_IN_THE_BLOOD, MAX_VALUE_OF_ALCOHOL_IN_THE_BLOOD)
                .setSettingsOfAmbivalence(MIN_VALUE_OF_AMBIVALENCE, MAX_VALUE_OF_AMBIVALENCE)
                .clickButtonOfSaveInSettings()
                .messageOfSuccessSaveIndicatorInSettingsIsVisible();
    }

    @AfterMethod
    public void afterMethod() {
        healthIndicatorsPage.deleteAllIndicator();
    }
}
