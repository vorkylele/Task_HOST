package ru.hostco.patientportal.tests.healthindicatorpagetest;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static ru.hostco.patientportal.data.TestData.TestDataPulse.*;

@Epic("Установка показателя здоровья 'Пульс'")
public class SetPulseTest extends BaseTest {

    @Feature("Добавление показателя 'Пульс' с положительным значением")
    @Test(description="Проверка отображения параметра 'Пульс' после добавления с первым положительным параметром")
    public void parameterPulseIsVisibleWithFirstSuccessValue() {
            healthIndicatorsPage
                    .setIndicatorOfPulse(FIRST_VALUE_OF_PULSE_SUCCESS)
                    .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                            INDICATOR_OF_CLASS, FIRST_VALUE_OF_PULSE_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Пульс' с положительным значением")
    @Test(description="Проверка отображения параметра 'Пульс' после добавления с вторым положительным параметром")
    public void parameterPulseIsVisibleWithSecondSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPulse(SECOND_VALUE_OF_PULSE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_PULSE_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Пульс' с положительным значением")
    @Test(description="Проверка отображения параметра 'Пульс' после добавления с третьим положительным параметром")
    public void parameterPulseIsVisibleWithThirdSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPulse(THIRD_VALUE_OF_PULSE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_PULSE_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Пульс' с положительным значением")
    @Test(description="Проверка отображения параметра 'Пульс' после добавления с четвертым положительным параметром")
    public void parameterPulseIsVisibleWithFourthSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPulse(FOURTH_VALUE_OF_PULSE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_PULSE_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Пульс' с положительным значением")
    @Test(description="Проверка отображения параметра 'Пульс' после добавления с пятым положительным параметром")
    public void parameterPulseIsVisibleWithFifthSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPulse(FIFTH_VALUE_OF_PULSE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIFTH_VALUE_OF_PULSE_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Пульс' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Пульс' после добавления с первым отрицательным параметром")
    public void parameterPulseIsVisibleWithFirstNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPulse(FIRST_VALUE_OF_PULSE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIRST_VALUE_OF_PULSE_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Пульс' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Пульс' после добавления с вторым отрицательным параметром")
    public void parameterPulseIsVisibleWithSecondNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPulse(SECOND_VALUE_OF_PULSE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_PULSE_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Пульс' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Пульс' после добавления с третьим отрицательным параметром")
    public void parameterPulseIsVisibleWithThirdNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPulse(THIRD_VALUE_OF_PULSE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_PULSE_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Пульс' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Пульс' после добавления с четвертым отрицательным параметром")
    public void parameterPulseIsVisibleWithFourthNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPulse(FOURTH_VALUE_OF_PULSE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_PULSE_NOT_SUCCESS, UNIT_OF_CLASS);
    }
}
