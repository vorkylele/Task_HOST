package ru.hostco.patientportal.tests.healthindicatorpagetest;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static ru.hostco.patientportal.data.TestData.TestDataWeight.*;

@Epic("Установка показателя здоровья 'Вес'")
public class SetWeightTest extends BaseTest {

    @Feature("Добавление показателя 'Вес' с положительным значением")
    @Test(description="Проверка отображения параметра 'Вес' после добавления с первым положительным параметром")
    public void parameterWeightIsVisibleWithFirstSuccessValue() {
            healthIndicatorsPage
                    .setIndicatorOfWeight(FIRST_VALUE_OF_WEIGHT_SUCCESS)
                    .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                            INDICATOR_OF_CLASS, FIRST_VALUE_OF_WEIGHT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Вес' с положительным значением")
    @Test(description="Проверка отображения параметра 'Вес' после добавления с вторым положительным параметром")
    public void parameterWeightIsVisibleWithSecondSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfWeight(SECOND_VALUE_OF_WEIGHT_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_WEIGHT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Вес' с положительным значением")
    @Test(description="Проверка отображения параметра 'Вес' после добавления с третьим положительным параметром")
    public void parameterWeightIsVisibleWithThirdSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfWeight(THIRD_VALUE_OF_WEIGHT_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_WEIGHT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Вес' с положительным значением")
    @Test(description="Проверка отображения параметра 'Вес' после добавления с четвертым положительным параметром")
    public void parameterWeightIsVisibleWithFourthSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfWeight(FOURTH_VALUE_OF_WEIGHT_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_WEIGHT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Вес' с положительным значением")
    @Test(description="Проверка отображения параметра 'Вес' после добавления с пятым положительным параметром")
    public void parameterWeightIsVisibleWithFifthSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfWeight(FIFTH_VALUE_OF_WEIGHT_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIFTH_VALUE_OF_WEIGHT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Вес' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Вес' после добавления с первым отрицательным параметром")
    public void parameterWeightIsVisibleWithFirstNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfWeight(FIRST_VALUE_OF_WEIGHT_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIRST_VALUE_OF_WEIGHT_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Вес' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Вес' после добавления с вторым отрицательным параметром")
    public void parameterWeightIsVisibleWithSecondNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfWeight(SECOND_VALUE_OF_WEIGHT_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_WEIGHT_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Вес' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Вес' после добавления с третьим отрицательным параметром")
    public void parameterWeightIsVisibleWithThirdNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfWeight(THIRD_VALUE_OF_WEIGHT_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_WEIGHT_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Вес' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Вес' после добавления с четвертым отрицательным параметром")
    public void parameterWeightIsVisibleWithFourthNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfWeight(FOURTH_VALUE_OF_WEIGHT_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_WEIGHT_NOT_SUCCESS, UNIT_OF_CLASS);
    }
}
