package ru.hostco.patientportal.healthindicatorpagetest;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static ru.hostco.patientportal.data.TestData.TestDataAlcoholInTheBlood.*;

public class SetAlcoholInTheBloodTest extends BaseTest {

    @Test(description="Проверка отображения параметра 'Алкоголь в крови' после добавления с первым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterAlcoholInTheBloodIsVisibleWithFirstSuccessValue() {
            healthIndicatorsPage.setIndicatorOfAlcoholInTheBlood(FIRST_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS)
                    .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                            INDICATOR_OF_CLASS, FIRST_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Алкоголь в крови' после добавления с вторым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterAlcoholInTheBloodIsVisibleWithSecondSuccessValue() {
        healthIndicatorsPage.setIndicatorOfAlcoholInTheBlood(SECOND_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Алкоголь в крови' после добавления с третьим положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterAlcoholInTheBloodIsVisibleWithThirdSuccessValue() {
        healthIndicatorsPage.setIndicatorOfAlcoholInTheBlood(THIRD_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Алкоголь в крови' после добавления с четвертым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterAlcoholInTheBloodIsVisibleWithFourthSuccessValue() {
        healthIndicatorsPage.setIndicatorOfAlcoholInTheBlood(FOURTH_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Алкоголь в крови' после добавления с пятым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterAlcoholInTheBloodIsVisibleWithFifthSuccessValue() {
        healthIndicatorsPage.setIndicatorOfAlcoholInTheBlood(FIFTH_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIFTH_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Алкоголь в крови' после добавления с первым отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterAlcoholInTheBloodIsVisibleWithFirstNotSuccessValue() {
        healthIndicatorsPage.setIndicatorOfAlcoholInTheBlood(FIRST_VALUE_OF_ALOHOL_IN_THE_BLOOD_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIRST_VALUE_OF_ALOHOL_IN_THE_BLOOD_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Алкоголь в крови' после добавления с вторым отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterAlcoholInTheBloodIsVisibleWithSecondNotSuccessValue() {
        healthIndicatorsPage.setIndicatorOfAlcoholInTheBlood(SECOND_VALUE_OF_ALOHOL_IN_THE_BLOOD_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_ALOHOL_IN_THE_BLOOD_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Алкоголь в крови' после добавления с третьим отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterAlcoholInTheBloodIsVisibleWithThirdNotSuccessValue() {
        healthIndicatorsPage.setIndicatorOfAlcoholInTheBlood(THIRD_VALUE_OF_ALOHOL_IN_THE_BLOOD_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_ALOHOL_IN_THE_BLOOD_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Алкоголь в крови' после добавления с четвертым отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterAlcoholInTheBloodIsVisibleWithFourthNotSuccessValue() {
        healthIndicatorsPage.setIndicatorOfAlcoholInTheBlood(FOURTH_VALUE_OF_ALOHOL_IN_THE_BLOOD_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_ALOHOL_IN_THE_BLOOD_NOT_SUCCESS, UNIT_OF_CLASS);
    }
}
