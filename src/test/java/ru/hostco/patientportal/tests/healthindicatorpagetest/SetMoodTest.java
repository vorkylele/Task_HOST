package ru.hostco.patientportal.tests.healthindicatorpagetest;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static ru.hostco.patientportal.data.TestData.TestDataMood.*;

@Epic("Установка показателя здоровья 'Общее состояние здоровья'")
public class SetMoodTest extends BaseTest {

    @Feature("Добавление показателя 'Настроение'")
    @Test(description="Проверка отображения параметра 'Настроение' после добавления")
    public void parameterTemperatureIsVisibleWithFirstSuccessValue() {
            healthIndicatorsPage
                    .setIndicatorOfMood(VALUE_OF_MOOD)
                    .baseValueIsVisible(receiveOfData.getLocalDateTime(),
                            INDICATOR_OF_CLASS, VALUE_OF_MOOD);
    }
}
