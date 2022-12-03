package ru.hostco.patientportal.healthindicatorpagetest;

import org.testng.annotations.*;
import io.qameta.allure.Description;

import static ru.hostco.patientportal.data.TestData.TestDataTemperature.*;

public class SetTemperatureTest extends BaseTest {

    @Test(description="Проверка отображения параметра 'Температура' после добавления с первым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterTemperatureIsVisibleWithFirstSuccessValue() {
            healthIndicatorsPage.setIndicatorOfTemperature(FIRST_VALUE_OF_TEMPERATURE_SUCCESS)
                    .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                            INDICATOR_OF_CLASS, FIRST_VALUE_OF_TEMPERATURE_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Температура' после добавления с вторым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterTemperatureIsVisibleWithSecondSuccessValue() {
        healthIndicatorsPage.setIndicatorOfTemperature(SECOND_VALUE_OF_TEMPERATURE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_TEMPERATURE_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Температура' после добавления с третьим положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterTemperatureIsVisibleWithThirdSuccessValue() {
        healthIndicatorsPage.setIndicatorOfTemperature(THIRD_VALUE_OF_TEMPERATURE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_TEMPERATURE_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Температура' после добавления с четвертым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterTemperatureIsVisibleWithFourthSuccessValue() {
        healthIndicatorsPage.setIndicatorOfTemperature(FOURTH_VALUE_OF_TEMPERATURE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_TEMPERATURE_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Температура' после добавления с пятым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterTemperatureIsVisibleWithFifthSuccessValue() {
        healthIndicatorsPage.setIndicatorOfTemperature(FIFTH_VALUE_OF_TEMPERATURE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIFTH_VALUE_OF_TEMPERATURE_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Температура' после добавления с первым отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterTemperatureIsVisibleWithFirstNotSuccessValue() {
        healthIndicatorsPage.setIndicatorOfTemperature(FIRST_VALUE_OF_TEMPERATURE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIRST_VALUE_OF_TEMPERATURE_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Температура' после добавления с вторым отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterTemperatureIsVisibleWithSecondNotSuccessValue() {
        healthIndicatorsPage.setIndicatorOfTemperature(SECOND_VALUE_OF_TEMPERATURE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_TEMPERATURE_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Температура' после добавления с третьим отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterTemperatureIsVisibleWithThirdNotSuccessValue() {
        healthIndicatorsPage.setIndicatorOfTemperature(THIRD_VALUE_OF_TEMPERATURE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_TEMPERATURE_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Температура' после добавления с четвертым отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterTemperatureIsVisibleWithFourthNotSuccessValue() {
        healthIndicatorsPage.setIndicatorOfTemperature(FOURTH_VALUE_OF_TEMPERATURE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_TEMPERATURE_NOT_SUCCESS, UNIT_OF_CLASS);
    }
}
