package ru.hostco.patientportal.healthindicatorpagetest;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static ru.hostco.patientportal.data.TestData.TestDataAmbivalence.*;

public class SetAmbivalenceTest extends BaseTest {

    @Test(description="Проверка отображения параметра 'Амбивалентность' после добавления с первым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterAmbivalenceIsVisibleWithFirstSuccessValue() {
            healthIndicatorsPage.setIndicatorOfAmbivalence(FIRST_VALUE_OF_AMBIALENCE_SUCCESS)
                    .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                            INDICATOR_OF_CLASS, FIRST_VALUE_OF_AMBIALENCE_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Амбивалентность' после добавления с вторым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterAmbivalenceIsVisibleWithSecondSuccessValue() {
        healthIndicatorsPage.setIndicatorOfAmbivalence(SECOND_VALUE_OF_AMBIALENCE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_AMBIALENCE_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Амбивалентность' после добавления с третьим положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterAmbivalenceIsVisibleWithThirdSuccessValue() {
        healthIndicatorsPage.setIndicatorOfAmbivalence(THIRD_VALUE_OF_AMBIALENCE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_AMBIALENCE_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Амбивалентность' после добавления с четвертым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterAmbivalenceIsVisibleWithFourthSuccessValue() {
        healthIndicatorsPage.setIndicatorOfAmbivalence(FOURTH_VALUE_OF_AMBIALENCE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_AMBIALENCE_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Амбивалентность' после добавления с пятым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterAmbivalenceIsVisibleWithFifthSuccessValue() {
        healthIndicatorsPage.setIndicatorOfAmbivalence(FIFTH_VALUE_OF_AMBIALENCE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIFTH_VALUE_OF_AMBIALENCE_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Амбивалентность' после добавления с первым отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterAmbivalenceIsVisibleWithFirstNotSuccessValue() {
        healthIndicatorsPage.setIndicatorOfAmbivalence(FIRST_VALUE_OF_AMBIALENCE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIRST_VALUE_OF_AMBIALENCE_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Амбивалентность' после добавления с вторым отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterAmbivalenceIsVisibleWithSecondNotSuccessValue() {
        healthIndicatorsPage.setIndicatorOfAmbivalence(SECOND_VALUE_OF_AMBIALENCE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_AMBIALENCE_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Амбивалентность' после добавления с третьим отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterAmbivalenceIsVisibleWithThirdNotSuccessValue() {
        healthIndicatorsPage.setIndicatorOfAmbivalence(THIRD_VALUE_OF_AMBIALENCE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_AMBIALENCE_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Test(description="Проверка отображения параметра 'Амбивалентность' после добавления с четвертым отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterAmbivalenceIsVisibleWithFourthNotSuccessValue() {
        healthIndicatorsPage.setIndicatorOfAmbivalence(FOURTH_VALUE_OF_AMBIALENCE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_AMBIALENCE_NOT_SUCCESS, UNIT_OF_CLASS);
    }
}
