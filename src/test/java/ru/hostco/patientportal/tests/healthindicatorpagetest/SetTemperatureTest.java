package ru.hostco.patientportal.tests.healthindicatorpagetest;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.*;

import static ru.hostco.patientportal.data.TestData.TestDataTemperature.*;

@Epic("Установка показателя здоровья 'Температура'")
public class SetTemperatureTest extends BaseTest {

    @Feature("Добавление показателя 'Температура' с положительным значением")
    @Test(description="Проверка отображения параметра 'Температура' после добавления с первым положительным параметром")
    public void parameterTemperatureIsVisibleWithFirstSuccessValue() {
            healthIndicatorsPage
                    .setIndicatorOfTemperature(FIRST_VALUE_OF_TEMPERATURE_SUCCESS)
                    .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                            INDICATOR_OF_CLASS, FIRST_VALUE_OF_TEMPERATURE_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Температура' с положительным значением")
    @Test(description="Проверка отображения параметра 'Температура' после добавления с вторым положительным параметром")
    public void parameterTemperatureIsVisibleWithSecondSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfTemperature(SECOND_VALUE_OF_TEMPERATURE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_TEMPERATURE_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Температура' с положительным значением")
    @Test(description="Проверка отображения параметра 'Температура' после добавления с третьим положительным параметром")
    public void parameterTemperatureIsVisibleWithThirdSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfTemperature(THIRD_VALUE_OF_TEMPERATURE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_TEMPERATURE_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Температура' с положительным значением")
    @Test(description="Проверка отображения параметра 'Температура' после добавления с четвертым положительным параметром")
    public void parameterTemperatureIsVisibleWithFourthSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfTemperature(FOURTH_VALUE_OF_TEMPERATURE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_TEMPERATURE_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Температура' с положительным значением")
    @Test(description="Проверка отображения параметра 'Температура' после добавления с пятым положительным параметром")
    public void parameterTemperatureIsVisibleWithFifthSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfTemperature(FIFTH_VALUE_OF_TEMPERATURE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIFTH_VALUE_OF_TEMPERATURE_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Температура' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Температура' после добавления с первым отрицательным параметром")
    public void parameterTemperatureIsVisibleWithFirstNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfTemperature(FIRST_VALUE_OF_TEMPERATURE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIRST_VALUE_OF_TEMPERATURE_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Температура' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Температура' после добавления с вторым отрицательным параметром")
    public void parameterTemperatureIsVisibleWithSecondNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfTemperature(SECOND_VALUE_OF_TEMPERATURE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_TEMPERATURE_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Температура' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Температура' после добавления с третьим отрицательным параметром")
    public void parameterTemperatureIsVisibleWithThirdNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfTemperature(THIRD_VALUE_OF_TEMPERATURE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_TEMPERATURE_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Температура' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Температура' после добавления с четвертым отрицательным параметром")
    public void parameterTemperatureIsVisibleWithFourthNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfTemperature(FOURTH_VALUE_OF_TEMPERATURE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_TEMPERATURE_NOT_SUCCESS, UNIT_OF_CLASS);
    }
}
