package ru.hostco.patientportal.healthindicatorpagetest;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static ru.hostco.patientportal.data.TestData.TestDataPulse.*;

public class SetPulseTest extends BaseTest {

    @Test(description="Проверка отображения параметра 'Пульс' после добавления с первым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterPulseIsVisibleWithFirstSuccessValue() {
            healthIndicatorsPage
                    .setIndicatorOfPulse(FIRST_VALUE_OF_PULSE_SUCCESS)
                    .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                            INDICATOR_OF_CLASS, FIRST_VALUE_OF_PULSE_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Пульс' после добавления с вторым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterPulseIsVisibleWithSecondSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPulse(SECOND_VALUE_OF_PULSE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_PULSE_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Пульс' после добавления с третьим положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterPulseIsVisibleWithThirdSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPulse(THIRD_VALUE_OF_PULSE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_PULSE_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Пульс' после добавления с четвертым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterPulseIsVisibleWithFourthSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPulse(FOURTH_VALUE_OF_PULSE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_PULSE_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Пульс' после добавления с пятым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterPulseIsVisibleWithFifthSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPulse(FIFTH_VALUE_OF_PULSE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIFTH_VALUE_OF_PULSE_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Пульс' после добавления с первым отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterPulseIsVisibleWithFirstNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPulse(FIRST_VALUE_OF_PULSE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIRST_VALUE_OF_PULSE_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Пульс' после добавления с вторым отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterPulseIsVisibleWithSecondNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPulse(SECOND_VALUE_OF_PULSE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_PULSE_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Пульс' после добавления с третьим отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterPulseIsVisibleWithThirdNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPulse(THIRD_VALUE_OF_PULSE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_PULSE_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Пульс' после добавления с четвертым отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterPulseIsVisibleWithFourthNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPulse(FOURTH_VALUE_OF_PULSE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_PULSE_NOT_SUCCESS, UNIT_OF_CLASS);
    }
}
