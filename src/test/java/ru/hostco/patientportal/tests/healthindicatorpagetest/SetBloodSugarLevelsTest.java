package ru.hostco.patientportal.tests.healthindicatorpagetest;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static ru.hostco.patientportal.data.TestData.TestDataBloodSugarLevels.*;

@Epic("Установка показателя здоровья 'Уровень сахара в крови'")
public class SetBloodSugarLevelsTest extends BaseTest {

    @Feature("Добавление показателя 'Уровень сахара в крови' с положительным значением")
    @Test(description="Проверка отображения параметра 'Уровень сахара в крови' после добавления с первым положительным параметром")
    public void parameterBloodSugarLevelsIsVisibleWithFirstSuccessValue() {
            healthIndicatorsPage
                    .setIndicatorOfBloodSugarLevels(FIRST_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS)
                    .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                            INDICATOR_OF_CLASS, FIRST_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Уровень сахара в крови' с положительным значением")
    @Test(description="Проверка отображения параметра 'Уровень сахара в крови' после добавления с вторым положительным параметром")
    public void parameterBloodSugarLevelsIsVisibleWithSecondSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfBloodSugarLevels(SECOND_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Уровень сахара в крови' с положительным значением")
    @Test(description="Проверка отображения параметра 'Уровень сахара в крови' после добавления с третьим положительным параметром")
    public void parameterBloodSugarLevelsIsVisibleWithThirdSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfBloodSugarLevels(THIRD_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Уровень сахара в крови' с положительным значением")
    @Test(description="Проверка отображения параметра 'Уровень сахара в крови' после добавления с четвертым положительным параметром")
    public void parameterBloodSugarLevelsIsVisibleWithFourthSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfBloodSugarLevels(FOURTH_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Уровень сахара в крови' с положительным значением")
    @Test(description="Проверка отображения параметра 'Уровень сахара в крови' после добавления с пятым положительным параметром")
    public void parameterBloodSugarLevelsIsVisibleWithFifthSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfBloodSugarLevels(FIFTH_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIFTH_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Уровень сахара в крови' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Уровень сахара в крови' после добавления с первым отрицательным параметром")
    public void parameterBloodSugarLevelsIsVisibleWithFirstNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfBloodSugarLevels(FIRST_VALUE_OF_BLOOD_SUGAR_LEVELS_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIRST_VALUE_OF_BLOOD_SUGAR_LEVELS_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Уровень сахара в крови' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Уровень сахара в крови' после добавления с вторым отрицательным параметром")
    public void parameterBloodSugarLevelsIsVisibleWithSecondNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfBloodSugarLevels(SECOND_VALUE_OF_BLOOD_SUGAR_LEVELS_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_BLOOD_SUGAR_LEVELS_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Уровень сахара в крови' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Уровень сахара в крови' после добавления с третьим отрицательным параметром")
    public void parameterBloodSugarLevelsIsVisibleWithThirdNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfBloodSugarLevels(THIRD_VALUE_OF_BLOOD_SUGAR_LEVELSE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_BLOOD_SUGAR_LEVELSE_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Уровень сахара в крови' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Уровень сахара в крови' после добавления с четвертым отрицательным параметром")
    public void parameterBloodSugarLevelsIsVisibleWithFourthNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfBloodSugarLevels(FOURTH_VALUE_OF_BLOOD_SUGAR_LEVELS_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_BLOOD_SUGAR_LEVELS_NOT_SUCCESS, UNIT_OF_CLASS);
    }
}
