package ru.hostco.patientportal.healthindicatorpagetest;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static ru.hostco.patientportal.data.TestData.TestDataBloodSugarLevels.*;

public class SetBloodSugarLevelsTest extends BaseTest {

    @Test(description="Проверка отображения параметра 'Уровень сахара в крови' после добавления с первым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterBloodSugarLevelsIsVisibleWithFirstSuccessValue() {
            healthIndicatorsPage
                    .setIndicatorOfBloodSugarLevels(FIRST_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS)
                    .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                            INDICATOR_OF_CLASS, FIRST_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Уровень сахара в крови' после добавления с вторым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterBloodSugarLevelsIsVisibleWithSecondSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfBloodSugarLevels(SECOND_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Уровень сахара в крови' после добавления с третьим положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterBloodSugarLevelsIsVisibleWithThirdSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfBloodSugarLevels(THIRD_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Уровень сахара в крови' после добавления с четвертым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterBloodSugarLevelsIsVisibleWithFourthSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfBloodSugarLevels(FOURTH_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Уровень сахара в крови' после добавления с пятым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterBloodSugarLevelsIsVisibleWithFifthSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfBloodSugarLevels(FIFTH_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIFTH_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Уровень сахара в крови' после добавления с первым отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterBloodSugarLevelsIsVisibleWithFirstNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfBloodSugarLevels(FIRST_VALUE_OF_BLOOD_SUGAR_LEVELS_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIRST_VALUE_OF_BLOOD_SUGAR_LEVELS_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Уровень сахара в крови' после добавления с вторым отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterBloodSugarLevelsIsVisibleWithSecondNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfBloodSugarLevels(SECOND_VALUE_OF_BLOOD_SUGAR_LEVELS_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_BLOOD_SUGAR_LEVELS_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Уровень сахара в крови' после добавления с третьим отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterBloodSugarLevelsIsVisibleWithThirdNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfBloodSugarLevels(THIRD_VALUE_OF_BLOOD_SUGAR_LEVELSE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_BLOOD_SUGAR_LEVELSE_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Уровень сахара в крови' после добавления с четвертым отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterBloodSugarLevelsIsVisibleWithFourthNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfBloodSugarLevels(FOURTH_VALUE_OF_BLOOD_SUGAR_LEVELS_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_BLOOD_SUGAR_LEVELS_NOT_SUCCESS, UNIT_OF_CLASS);
    }
}
