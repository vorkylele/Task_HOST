package ru.hostco.patientportal.healthindicatorpagetest;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static ru.hostco.patientportal.data.TestData.TestDataWeight.*;

public class SetWeightTest extends BaseTest {

    @Test(description="Проверка отображения параметра 'Вес' после добавления с первым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterWeightIsVisibleWithFirstSuccessValue() {
            healthIndicatorsPage
                    .setIndicatorOfWeight(FIRST_VALUE_OF_WEIGHT_SUCCESS)
                    .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                            INDICATOR_OF_CLASS, FIRST_VALUE_OF_WEIGHT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Вес' после добавления с вторым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterWeightIsVisibleWithSecondSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfWeight(SECOND_VALUE_OF_WEIGHT_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_WEIGHT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Вес' после добавления с третьим положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterWeightIsVisibleWithThirdSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfWeight(THIRD_VALUE_OF_WEIGHT_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_WEIGHT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Вес' после добавления с четвертым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterWeightIsVisibleWithFourthSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfWeight(FOURTH_VALUE_OF_WEIGHT_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_WEIGHT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Вес' после добавления с пятым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterWeightIsVisibleWithFifthSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfWeight(FIFTH_VALUE_OF_WEIGHT_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIFTH_VALUE_OF_WEIGHT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Вес' после добавления с первым отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterWeightIsVisibleWithFirstNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfWeight(FIRST_VALUE_OF_WEIGHT_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIRST_VALUE_OF_WEIGHT_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Вес' после добавления с вторым отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterWeightIsVisibleWithSecondNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfWeight(SECOND_VALUE_OF_WEIGHT_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_WEIGHT_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Вес' после добавления с третьим отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterWeightIsVisibleWithThirdNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfWeight(THIRD_VALUE_OF_WEIGHT_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_WEIGHT_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Вес' после добавления с четвертым отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterWeightIsVisibleWithFourthNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfWeight(FOURTH_VALUE_OF_WEIGHT_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_WEIGHT_NOT_SUCCESS, UNIT_OF_CLASS);
    }
}
