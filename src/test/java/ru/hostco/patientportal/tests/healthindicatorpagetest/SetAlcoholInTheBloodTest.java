package ru.hostco.patientportal.tests.healthindicatorpagetest;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static ru.hostco.patientportal.data.TestData.TestDataAlcoholInTheBlood.*;

@Epic("Установка показателя здоровья 'Алкоголь в крови'")
public class SetAlcoholInTheBloodTest extends BaseTest {

    @Feature("Добавление показателя 'Алкоголь в крови' с положительным значением")
    @Test(description="Проверка отображения параметра 'Алкоголь в крови' после добавления с первым положительным параметром")
    public void parameterAlcoholInTheBloodIsVisibleWithFirstSuccessValue() {
            healthIndicatorsPage
                    .setIndicatorOfAlcoholInTheBlood(FIRST_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS)
                    .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                            INDICATOR_OF_CLASS, FIRST_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Алкоголь в крови' с положительным значением")
    @Test(description="Проверка отображения параметра 'Алкоголь в крови' после добавления с вторым положительным параметром")
    public void parameterAlcoholInTheBloodIsVisibleWithSecondSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfAlcoholInTheBlood(SECOND_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Алкоголь в крови' с положительным значением")
    @Test(description="Проверка отображения параметра 'Алкоголь в крови' после добавления с третьим положительным параметром")
    public void parameterAlcoholInTheBloodIsVisibleWithThirdSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfAlcoholInTheBlood(THIRD_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Алкоголь в крови' с положительным значением")
    @Test(description="Проверка отображения параметра 'Алкоголь в крови' после добавления с четвертым положительным параметром")
    public void parameterAlcoholInTheBloodIsVisibleWithFourthSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfAlcoholInTheBlood(FOURTH_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Алкоголь в крови' с положительным значением")
    @Test(description="Проверка отображения параметра 'Алкоголь в крови' после добавления с пятым положительным параметром")
    public void parameterAlcoholInTheBloodIsVisibleWithFifthSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfAlcoholInTheBlood(FIFTH_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIFTH_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Алкоголь в крови' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Алкоголь в крови' после добавления с первым отрицательным параметром")
    public void parameterAlcoholInTheBloodIsVisibleWithFirstNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfAlcoholInTheBlood(FIRST_VALUE_OF_ALOHOL_IN_THE_BLOOD_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIRST_VALUE_OF_ALOHOL_IN_THE_BLOOD_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Алкоголь в крови' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Алкоголь в крови' после добавления с вторым отрицательным параметром")
    public void parameterAlcoholInTheBloodIsVisibleWithSecondNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfAlcoholInTheBlood(SECOND_VALUE_OF_ALOHOL_IN_THE_BLOOD_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_ALOHOL_IN_THE_BLOOD_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Алкоголь в крови' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Алкоголь в крови' после добавления с третьим отрицательным параметром")
    public void parameterAlcoholInTheBloodIsVisibleWithThirdNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfAlcoholInTheBlood(THIRD_VALUE_OF_ALOHOL_IN_THE_BLOOD_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_ALOHOL_IN_THE_BLOOD_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Алкоголь в крови' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Алкоголь в крови' после добавления с четвертым отрицательным параметром")
    public void parameterAlcoholInTheBloodIsVisibleWithFourthNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfAlcoholInTheBlood(FOURTH_VALUE_OF_ALOHOL_IN_THE_BLOOD_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_ALOHOL_IN_THE_BLOOD_NOT_SUCCESS, UNIT_OF_CLASS);
    }
}
