package ru.hostco.patientportal.healthindicatorpagetest;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static ru.hostco.patientportal.data.TestData.TestDataMood.*;

public class SetMoodTest extends BaseTest {

    @Test(description="Проверка отображения параметра 'Настроение' после добавления")
    @Description("Тестирование одиночного сценария")
    public void parameterTemperatureIsVisibleWithFirstSuccessValue() {
            healthIndicatorsPage
                    .setIndicatorOfMood(VALUE_OF_MOOD)
                    .baseValueIsVisible(receiveOfData.getLocalDateTime(),
                            INDICATOR_OF_CLASS, VALUE_OF_MOOD);
    }
}
