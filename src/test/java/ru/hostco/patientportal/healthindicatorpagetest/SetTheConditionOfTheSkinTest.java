package ru.hostco.patientportal.healthindicatorpagetest;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static ru.hostco.patientportal.data.TestData.TestDataTheConditionOfTheSkinTest.*;

public class SetTheConditionOfTheSkinTest extends BaseTest {

    @Test(description="Проверка отображения параметра 'Состояние кожных покровов' после добавления")
    @Description("Тестирование одиночного сценария")
    public void parameterTemperatureIsVisibleWithFirstSuccessValue() {
            healthIndicatorsPage
                    .setTheConditionOfTheSkin(VALUE_OF_THE_CONDITION_OF_THE_SKIN)
                    .baseValueIsVisible(receiveOfData.getLocalDateTime(),
                            INDICATOR_OF_CLASS, VALUE_OF_THE_CONDITION_OF_THE_SKIN);
    }
}
