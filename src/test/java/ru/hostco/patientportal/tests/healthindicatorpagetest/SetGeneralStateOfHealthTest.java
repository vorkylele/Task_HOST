package ru.hostco.patientportal.tests.healthindicatorpagetest;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static ru.hostco.patientportal.data.TestData.TestDataGeneralStateOfHealth.*;

@Epic("Установка показателя здоровья 'Общее состояние здоровья'")
public class SetGeneralStateOfHealthTest extends BaseTest {

    @Feature("Добавление показателя 'Общее состояние здоровья'")
    @Test(description="Проверка отображения параметра 'Общее состояние здоровья' после добавления")
    public void parameterTemperatureIsVisibleWithFirstSuccessValue() {
            healthIndicatorsPage
                    .setGeneralStateOfHealth(VALUE_OF_GENERAL_STATE_OF_HEALTH)
                    .baseValueIsVisible(receiveOfData.getLocalDateTime(),
                            INDICATOR_OF_CLASS, VALUE_OF_GENERAL_STATE_OF_HEALTH);
    }
}
