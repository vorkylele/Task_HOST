package ru.hostco.patientportal.tests.healthindicatorpagetest;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static ru.hostco.patientportal.data.TestData.TestDataAmbivalence.*;

@Epic("Установка показателя здоровья 'Амбивалентность'")
public class SetAmbivalenceTest extends BaseTest {

    @Feature("Добавление показателя 'Амбивалентность' с положительным значением")
    @Test(description="Проверка отображения параметра 'Амбивалентность' после добавления с первым положительным параметром")
    public void parameterAmbivalenceIsVisibleWithFirstSuccessValue() {
            healthIndicatorsPage
                    .setIndicatorOfAmbivalence(FIRST_VALUE_OF_AMBIVALENCE_SUCCESS)
                    .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                            INDICATOR_OF_CLASS, FIRST_VALUE_OF_AMBIVALENCE_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Амбивалентность' с положительным значением")
    @Test(description="Проверка отображения параметра 'Амбивалентность' после добавления с вторым положительным параметром")
    public void parameterAmbivalenceIsVisibleWithSecondSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfAmbivalence(SECOND_VALUE_OF_AMBIVALENCE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_AMBIVALENCE_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Амбивалентность' с положительным значением")
    @Test(description="Проверка отображения параметра 'Амбивалентность' после добавления с третьим положительным параметром")
    public void parameterAmbivalenceIsVisibleWithThirdSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfAmbivalence(THIRD_VALUE_OF_AMBIVALENCE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_AMBIVALENCE_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Амбивалентность' с положительным значением")
    @Test(description="Проверка отображения параметра 'Амбивалентность' после добавления с четвертым положительным параметром")
    public void parameterAmbivalenceIsVisibleWithFourthSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfAmbivalence(FOURTH_VALUE_OF_AMBIVALENCE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_AMBIVALENCE_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Амбивалентность' с положительным значением")
    @Test(description="Проверка отображения параметра 'Амбивалентность' после добавления с пятым положительным параметром")
    public void parameterAmbivalenceIsVisibleWithFifthSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfAmbivalence(FIFTH_VALUE_OF_AMBIVALENCE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIFTH_VALUE_OF_AMBIVALENCE_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Амбивалентность' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Амбивалентность' после добавления с первым отрицательным параметром")
    public void parameterAmbivalenceIsVisibleWithFirstNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfAmbivalence(FIRST_VALUE_OF_AMBIVALENCE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIRST_VALUE_OF_AMBIVALENCE_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Амбивалентность' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Амбивалентность' после добавления с вторым отрицательным параметром")
    public void parameterAmbivalenceIsVisibleWithSecondNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfAmbivalence(SECOND_VALUE_OF_AMBIVALENCE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_VALUE_OF_AMBIVALENCE_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Амбивалентность' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Амбивалентность' после добавления с третьим отрицательным параметром")
    public void parameterAmbivalenceIsVisibleWithThirdNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfAmbivalence(THIRD_VALUE_OF_AMBIVALENCE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_VALUE_OF_AMBIVALENCE_NOT_SUCCESS, UNIT_OF_CLASS);
    }

    @Feature("Добавление показателя 'Амбивалентность' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Амбивалентность' после добавления с четвертым отрицательным параметром")
    public void parameterAmbivalenceIsVisibleWithFourthNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfAmbivalence(FOURTH_VALUE_OF_AMBIVALENCE_NOT_SUCCESS)
                .badValueIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_VALUE_OF_AMBIVALENCE_NOT_SUCCESS, UNIT_OF_CLASS);
    }
}
