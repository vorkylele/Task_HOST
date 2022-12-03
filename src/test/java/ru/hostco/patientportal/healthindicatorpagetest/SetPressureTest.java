package ru.hostco.patientportal.healthindicatorpagetest;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static ru.hostco.patientportal.data.TestData.TestDataPressure.*;

public class SetPressureTest extends BaseTest {

    @Test(description="Проверка отображения параметра 'Давление' после добавления с первым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterPessureIsVisibleWithFirstSuccessValue() {
            healthIndicatorsPage.setIndicatorOfPressure(FIRST_UPPER_VALUE_OF_PRESSURE_SUCCESS, FIRST_LOWER_VALUE_OF_PRESSURE_SUCCESS)
                    .goodValueOfPressureIsVisible(receiveOfData.getLocalDateTime(),
                            INDICATOR_OF_CLASS, FIRST_EXPECTED_VALUE_OF_PRESSURE_SUCCESS);
    }

    @Test(description="Проверка отображения параметра 'Температура' после добавления с вторым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterPessureIsVisibleWithSecondSuccessValue() {
        healthIndicatorsPage.setIndicatorOfPressure(SECOND_UPPER_VALUE_OF_PRESSURE_SUCCESS, SECOND_LOWER_VALUE_OF_PRESSURE_SUCCESS)
                .goodValueOfPressureIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_EXPECTED_VALUE_OF_PRESSURE_SUCCESS);
    }

    @Test(description="Проверка отображения параметра 'Давление' после добавления с третьим положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterPessureIsVisibleWithThirdSuccessValue() {
        healthIndicatorsPage.setIndicatorOfPressure(THIRD_UPPER_VALUE_OF_PRESSURE_SUCCESS, THIRD_LOWER_VALUE_OF_PRESSURE_SUCCESS)
                .goodValueOfPressureIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_EXPECTED_VALUE_OF_PRESSURE_SUCCESS);
    }

    @Test(description="Проверка отображения параметра 'Давление' после добавления с четвертым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterPessureIsVisibleWithFourthSuccessValue() {
        healthIndicatorsPage.setIndicatorOfPressure(FOURTH_UPPER_VALUE_OF_PRESSURE_SUCCESS, FOURTH_LOWER_VALUE_OF_PRESSURE_SUCCESS)
                .goodValueOfPressureIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_EXPECTED_VALUE_OF_PRESSURE_SUCCESS);
    }

    @Test(description="Проверка отображения параметра 'Давление' после добавления с пятым положительным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterPessureIsVisibleWithFifthSuccessValue() {
        healthIndicatorsPage.setIndicatorOfPressure(FIFTH_UPPER_VALUE_OF_PRESSURE_SUCCESS, FIFTH_LOWER_VALUE_OF_PRESSURE_SUCCESS)
                .goodValueOfPressureIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIFTH_EXPECTED_VALUE_OF_PRESSURE_SUCCESS);
    }

    @Test(description="Проверка отображения параметра 'Давление' после добавления с первым отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterPessureIsVisibleWithFirstNotSuccessValue() {
        healthIndicatorsPage.setIndicatorOfPressure(FIRST_UPPER_VALUE_OF_PRESSURE_NOT_SUCCESS, FIRST_LOWER_VALUE_OF_PRESSURE_NOT_SUCCESS)
                .badValuePressureIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIRST_EXPECTED_VALUE_OF_TPRESSURE_NOT_SUCCESS);
    }

    @Test(description="Проверка отображения параметра 'Давление' после добавления с вторым отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterPessureIsVisibleWithSecondNotSuccessValue() {
        healthIndicatorsPage.setIndicatorOfPressure(SECOND_UPPER_VALUE_OF_PRESSURE_NOT_SUCCESS, SECOND_LOWER_VALUE_OF_PRESSURE_NOT_SUCCESS)
                .badValuePressureIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SECOND_EXPECTED_VALUE_OF_TPRESSURE_NOT_SUCCESS);
    }

    @Test(description="Проверка отображения параметра 'Давление' после добавления с третьим отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterPessureIsVisibleWithThirdNotSuccessValue() {
        healthIndicatorsPage.setIndicatorOfPressure(THIRD_UPPER_VALUE_OF_PRESSURE_NOT_SUCCESS, THIRD_LOWER_VALUE_OF_PRESSURE_NOT_SUCCESS)
                .badValuePressureIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, THIRD_EXPECTED_VALUE_OF_TPRESSURE_NOT_SUCCESS);
    }

    @Test(description="Проверка отображения параметра 'Давление' после добавления с четвертым отрицательным параметром")
    @Description("Тестирование КЭ и ГЗ")
    public void parameterPessureIsVisibleWithFourthNotSuccessValue() {
        healthIndicatorsPage.setIndicatorOfPressure(FOURTH_UPPER_VALUE_OF_PRESSURE_NOT_SUCCESS, FOURTH_LOWER_VALUE_OF_PRESSURE_NOT_SUCCESS)
                .badValuePressureIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FOURTH_EXPECTED_VALUE_OF_TPRESSURE_NOT_SUCCESS);
    }

    @Test(description="Проверка отображения параметра 'Давление' после добавления с пятым отрицательным параметром")
    @Description("Тестирование отображения ошибки, при заполнении второго параметра вне рамках допустимого диапазона")
    public void parameterPessureIsVisibleWithFifthNotSuccessValue() {
        healthIndicatorsPage.setIndicatorOfPressure(FIFTH_UPPER_VALUE_OF_PRESSURE_NOT_SUCCESS, FIFTH_LOWER_VALUE_OF_PRESSURE_NOT_SUCCESS)
                .badValuePressureIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, FIFTH_EXPECTED_VALUE_OF_TPRESSURE_NOT_SUCCESS);
    }

    @Test(description="Проверка отображения параметра 'Давление' после добавления с шестым отрицательным параметром")
    @Description("Тестирование отображения ошибки, при заполнении первого параметра вне рамках допустимого диапазона")
    public void parameterPessureIsVisibleWithSixthNotSuccessValue() {
        healthIndicatorsPage.setIndicatorOfPressure(SIXTH_UPPER_VALUE_OF_PRESSURE_NOT_SUCCESS, SIXTH_LOWER_VALUE_OF_PRESSURE_NOT_SUCCESS)
                .badValuePressureIsVisible(receiveOfData.getLocalDateTime(),
                        INDICATOR_OF_CLASS, SIXTH_EXPECTED_VALUE_OF_TPRESSURE_NOT_SUCCESS);
    }
}
