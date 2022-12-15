package ru.hostco.patientportal.tests.healthindicatorpagetest;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static ru.hostco.patientportal.data.TestData.TestDataTheConditionOfTheSkinTest.*;

@Epic("Установка показателя здоровья 'Состояние кожных покровов'")
public class SetTheConditionOfTheSkinTest extends BaseTest {

    @Feature("Добавление показателя 'Состояние кожных покровов'")
    @Test(description="Проверка отображения параметра 'Состояние кожных покровов' после добавления")
    public void parameterTemperatureIsVisibleWithFirstSuccessValue() {
            healthIndicatorsPage
                    .setTheConditionOfTheSkin(VALUE_OF_THE_CONDITION_OF_THE_SKIN)
                    .baseValueIsVisible(receiveOfData.getLocalDateTime(),
                            INDICATOR_OF_CLASS, VALUE_OF_THE_CONDITION_OF_THE_SKIN);
    }
}
