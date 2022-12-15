package ru.hostco.patientportal.tests.healthindicatorpagetest;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static ru.hostco.patientportal.data.TestData.TestDataPressure.*;

@Epic("Установка показателя здоровья 'Давление'")
public class SetPressureTest extends BaseTest {

    @Feature("Добавление показателя 'Давление' с положительным значением")
    @Test(description="Проверка отображения параметра 'Давление' после добавления с первым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterPressureIsVisibleWithFirstSuccessValue() {
            healthIndicatorsPage
                    .setIndicatorOfPressure(FIRST_UPPER_VALUE_OF_PRESSURE_SUCCESS, FIRST_LOWER_VALUE_OF_PRESSURE_SUCCESS)
                    .goodValueOfPressureIsVisible(receiveOfData.getLocalDateTime(),
                            INDICATOR_OF_CLASS, FIRST_EXPECTED_VALUE_OF_PRESSURE_SUCCESS);
    }

    @Feature("Добавление показателя 'Давление' с положительным значением")
    @Test(description="Проверка отображения параметра 'Температура' после добавления с вторым положительным параметром")
    public void parameterPressureIsVisibleWithSecondSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPressure(SECOND_UPPER_VALUE_OF_PRESSURE_SUCCESS, SECOND_LOWER_VALUE_OF_PRESSURE_SUCCESS)
                .goodValueOfPressureIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_EXPECTED_VALUE_OF_PRESSURE_SUCCESS);
    }

    @Feature("Добавление показателя 'Давление' с положительным значением")
    @Test(description="Проверка отображения параметра 'Давление' после добавления с третьим положительным параметром")
    public void parameterPressureIsVisibleWithThirdSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPressure(THIRD_UPPER_VALUE_OF_PRESSURE_SUCCESS, THIRD_LOWER_VALUE_OF_PRESSURE_SUCCESS)
                .goodValueOfPressureIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_EXPECTED_VALUE_OF_PRESSURE_SUCCESS);
    }

    @Feature("Добавление показателя 'Давление' с положительным значением")
    @Test(description="Проверка отображения параметра 'Давление' после добавления с четвертым положительным параметром")
    public void parameterPressureIsVisibleWithFourthSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPressure(FOURTH_UPPER_VALUE_OF_PRESSURE_SUCCESS, FOURTH_LOWER_VALUE_OF_PRESSURE_SUCCESS)
                .goodValueOfPressureIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_EXPECTED_VALUE_OF_PRESSURE_SUCCESS);
    }

    @Feature("Добавление показателя 'Давление' с положительным значением")
    @Test(description="Проверка отображения параметра 'Давление' после добавления с пятым положительным параметром")
    public void parameterPressureIsVisibleWithFifthSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPressure(FIFTH_UPPER_VALUE_OF_PRESSURE_SUCCESS, FIFTH_LOWER_VALUE_OF_PRESSURE_SUCCESS)
                .goodValueOfPressureIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIFTH_EXPECTED_VALUE_OF_PRESSURE_SUCCESS);
    }

    @Feature("Добавление показателя 'Давление' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Давление' после добавления с первым отрицательным параметром")
    public void parameterPressureIsVisibleWithFirstNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPressure(FIRST_UPPER_VALUE_OF_PRESSURE_NOT_SUCCESS, FIRST_LOWER_VALUE_OF_PRESSURE_NOT_SUCCESS)
                .badValuePressureIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIRST_EXPECTED_VALUE_OF_TPRESSURE_NOT_SUCCESS);
    }

    @Feature("Добавление показателя 'Давление' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Давление' после добавления с вторым отрицательным параметром")
    public void parameterPressureIsVisibleWithSecondNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPressure(SECOND_UPPER_VALUE_OF_PRESSURE_NOT_SUCCESS, SECOND_LOWER_VALUE_OF_PRESSURE_NOT_SUCCESS)
                .badValuePressureIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_EXPECTED_VALUE_OF_TPRESSURE_NOT_SUCCESS);
    }

    @Feature("Добавление показателя 'Давление' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Давление' после добавления с третьим отрицательным параметром")
    public void parameterPressureIsVisibleWithThirdNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPressure(THIRD_UPPER_VALUE_OF_PRESSURE_NOT_SUCCESS, THIRD_LOWER_VALUE_OF_PRESSURE_NOT_SUCCESS)
                .badValuePressureIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_EXPECTED_VALUE_OF_TPRESSURE_NOT_SUCCESS);
    }

    @Feature("Добавление показателя 'Давление' с отрицательным значением")
    @Test(description="Проверка отображения параметра 'Давление' после добавления с четвертым отрицательным параметром")
    public void parameterPressureIsVisibleWithFourthNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPressure(FOURTH_UPPER_VALUE_OF_PRESSURE_NOT_SUCCESS, FOURTH_LOWER_VALUE_OF_PRESSURE_NOT_SUCCESS)
                .badValuePressureIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_EXPECTED_VALUE_OF_TPRESSURE_NOT_SUCCESS);
    }

    @Feature("Добавление показателя 'Давление' с отрицательным значением второго параметра, вне рамках допустимого диапазона")
    @Test(description="Проверка отображения параметра 'Давление' после добавления с пятым отрицательным параметром")
    @Description("Тестирование отображения ошибки, при заполнении второго параметра вне рамках допустимого диапазона")
    public void parameterPressureIsVisibleWithFifthNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPressure(FIFTH_UPPER_VALUE_OF_PRESSURE_NOT_SUCCESS, FIFTH_LOWER_VALUE_OF_PRESSURE_NOT_SUCCESS)
                .badValuePressureIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIFTH_EXPECTED_VALUE_OF_TPRESSURE_NOT_SUCCESS);
    }

    @Feature("Добавление показателя 'Давление' с отрицательным значением первого параметра, вне рамках допустимого диапазона")
    @Test(description="Проверка отображения параметра 'Давление' после добавления с шестым отрицательным параметром")
    public void parameterPressureIsVisibleWithSixthNotSuccessValue() {
        healthIndicatorsPage
                .setIndicatorOfPressure(SIXTH_UPPER_VALUE_OF_PRESSURE_NOT_SUCCESS, SIXTH_LOWER_VALUE_OF_PRESSURE_NOT_SUCCESS)
                .badValuePressureIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SIXTH_EXPECTED_VALUE_OF_TPRESSURE_NOT_SUCCESS);
    }
}
