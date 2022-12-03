package ru.hostco.patientportal.healthindicatorpagetest;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static ru.hostco.patientportal.data.TestData.TestDataGeneralStateOfHealth.*;

public class SetGeneralStateOfHealthTest extends BaseTest {

    @Test(description="Проверка отображения параметра 'Общее состояние здоровья' после добавления")
    @Description("Тестирование одиночного сценария")
    public void parameterTemperatureIsVisibleWithFirstSuccessValue() {
            healthIndicatorsPage.setGeneralStateOfHealth(VALUE_OF_GENERAL_STATE_OF_HEALTH)
                    .baseValueIsVisible(receiveOfData.getLocalDateTime(),
                            INDICATOR_OF_CLASS, VALUE_OF_GENERAL_STATE_OF_HEALTH);
    }
}
