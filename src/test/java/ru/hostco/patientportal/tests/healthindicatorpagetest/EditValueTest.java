package ru.hostco.patientportal.tests.healthindicatorpagetest;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import ru.hostco.patientportal.data.TestData.*;

import static ru.hostco.patientportal.data.TestData.TestDataBloodSugarLevels.*;
import static ru.hostco.patientportal.data.TestData.TestDataPressure.*;
import static ru.hostco.patientportal.data.TestData.TestDataPulse.*;
import static ru.hostco.patientportal.data.TestData.TestDataTemperature.*;
import static ru.hostco.patientportal.data.TestData.TestDataWeight.*;
import static ru.hostco.patientportal.data.TestData.TestDataMood.*;
import static ru.hostco.patientportal.data.TestData.TestDataTheConditionOfTheSkinTest.*;
import static ru.hostco.patientportal.data.TestData.TestDataAmbivalence.*;
import static ru.hostco.patientportal.data.TestData.TestDataAlcoholInTheBlood.*;
import static ru.hostco.patientportal.data.TestData.TestDataGeneralStateOfHealth.*;

@Epic("Корректное отображение показателей, после их редактирования")
public class EditValueTest extends BaseTest{

    @Feature("Редактирование показателя 'Температура'")
    @Test(description="Проверка редактирования добавленного показателя 'Температура'")
    public void editParameterTemperature() {
        healthIndicatorsPage
                .setIndicatorOfTemperature(FIRST_VALUE_OF_TEMPERATURE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        TestDataTemperature.INDICATOR_OF_CLASS, FIRST_VALUE_OF_TEMPERATURE_SUCCESS, TestDataTemperature.UNIT_OF_CLASS)
                .editIndicatorOfTemperature(SECOND_VALUE_OF_TEMPERATURE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        TestDataTemperature.INDICATOR_OF_CLASS, SECOND_VALUE_OF_TEMPERATURE_SUCCESS, TestDataTemperature.UNIT_OF_CLASS);
    }

    @Feature("Редактирование показателя 'Вес'")
    @Test(description="Проверка редактирования добавленного показателя 'Вес'")
    public void editParameterWeight() {
        healthIndicatorsPage
                .setIndicatorOfWeight(FIRST_VALUE_OF_WEIGHT_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        TestDataWeight.INDICATOR_OF_CLASS, FIRST_VALUE_OF_WEIGHT_SUCCESS, TestDataWeight.UNIT_OF_CLASS)
                .editIndicatorOfCustomizing(SECOND_VALUE_OF_WEIGHT_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        TestDataWeight.INDICATOR_OF_CLASS, SECOND_VALUE_OF_WEIGHT_SUCCESS, TestDataWeight.UNIT_OF_CLASS);
    }

    @Feature("Редактирование показателя 'Давление'")
    @Test(description="Проверка редактирования добавленного показателя 'Давление'")
    @Description("Проверка редактирования показателя")
    public void editParameterPressure() {
        healthIndicatorsPage
                .setIndicatorOfPressure(FIRST_UPPER_VALUE_OF_PRESSURE_SUCCESS, FIRST_LOWER_VALUE_OF_PRESSURE_SUCCESS)
                .goodValueOfPressureIsVisible(receiveOfData.getLocalDateTime(),
                        TestDataPressure.INDICATOR_OF_CLASS, FIRST_EXPECTED_VALUE_OF_PRESSURE_SUCCESS)
                .editIndicatorOfPressure(SECOND_UPPER_VALUE_OF_PRESSURE_SUCCESS, SECOND_LOWER_VALUE_OF_PRESSURE_SUCCESS)
                .goodValueOfPressureIsVisible(receiveOfData.getLocalDateTime(),
                        TestDataPressure.INDICATOR_OF_CLASS, SECOND_EXPECTED_VALUE_OF_PRESSURE_SUCCESS);
    }

    @Feature("Редактирование показателя 'Уровень сахара в крови'")
    @Test(description="Проверка редактирования добавленного показателя 'Уровень сахара в крови'")
    @Description("Проверка редактирования показателя")
    public void editParameterBloodSugarLevels() {
        healthIndicatorsPage
                .setIndicatorOfBloodSugarLevels(FIRST_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        TestDataBloodSugarLevels.INDICATOR_OF_CLASS, FIRST_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS, TestDataBloodSugarLevels.UNIT_OF_CLASS)
                .editIndicatorOfCustomizing(SECOND_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        TestDataBloodSugarLevels.INDICATOR_OF_CLASS, SECOND_VALUE_OF_BLOOD_SUGAR_LEVELS_SUCCESS, TestDataBloodSugarLevels.UNIT_OF_CLASS);
    }

    @Feature("Редактирование показателя 'Пульс'")
    @Test(description="Проверка редактирования добавленного показателя 'Пульс")
    @Description("Проверка редактирования показателя")
    public void editParameterPulse() {
        healthIndicatorsPage
                .setIndicatorOfPulse(FIRST_VALUE_OF_PULSE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        TestDataPulse.INDICATOR_OF_CLASS, FIRST_VALUE_OF_PULSE_SUCCESS, TestDataPulse.UNIT_OF_CLASS)
                .editIndicatorOfCustomizing(SECOND_VALUE_OF_PULSE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        TestDataPulse.INDICATOR_OF_CLASS, SECOND_VALUE_OF_PULSE_SUCCESS, TestDataPulse.UNIT_OF_CLASS);
    }

    @Feature("Редактирование показателя 'Настроение'")
    @Test(description="Проверка редактирования добавленного показателя 'Настроение")
    @Description("Проверка редактирования показателя")
    public void editParameterMood() {
        healthIndicatorsPage
                .setIndicatorOfMood(VALUE_OF_MOOD)
                .baseValueIsVisible(receiveOfData.getLocalDateTime(),
                        TestDataMood.INDICATOR_OF_CLASS, VALUE_OF_MOOD)
                .editIndicatorOfNotCustomizing(VALUE_OF_MOOD_FOR_EDIT)
                .baseValueIsVisible(receiveOfData.getLocalDateTime(),
                        TestDataMood.INDICATOR_OF_CLASS, VALUE_OF_MOOD_FOR_EDIT);
    }

    @Feature("Редактирование показателя 'Алкоголь в крови'")
    @Test(description="Проверка редактирования добавленного показателя 'Алкоголь в крови")
    @Description("Проверка редактирования показателя")
    public void editParameterAlcoholInTheBlood() {
        healthIndicatorsPage
                .setIndicatorOfAlcoholInTheBlood(FIRST_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        TestDataAlcoholInTheBlood.INDICATOR_OF_CLASS, FIRST_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS, TestDataAlcoholInTheBlood.UNIT_OF_CLASS)
                .editIndicatorOfCustomizing(SECOND_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        TestDataAlcoholInTheBlood.INDICATOR_OF_CLASS, SECOND_VALUE_OF_ALOHOL_IN_THE_BLOOD_SUCCESS, TestDataAlcoholInTheBlood.UNIT_OF_CLASS);
    }

    @Feature("Редактирование показателя 'Амбивалентность'")
    @Test(description="Проверка редактирования добавленного показателя 'Амбивалентность")
    @Description("Проверка редактирования показателя")
    public void editParameterAmbivalence() {
        healthIndicatorsPage
                .setIndicatorOfAmbivalence(FIRST_VALUE_OF_AMBIVALENCE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        TestDataAmbivalence.INDICATOR_OF_CLASS, FIRST_VALUE_OF_AMBIVALENCE_SUCCESS, TestDataAmbivalence.UNIT_OF_CLASS)
                .editIndicatorOfCustomizing(SECOND_VALUE_OF_AMBIVALENCE_SUCCESS)
                .goodValueIsVisible(receiveOfData.getLocalDateTime(),
                        TestDataAmbivalence.INDICATOR_OF_CLASS, SECOND_VALUE_OF_AMBIVALENCE_SUCCESS, TestDataAmbivalence.UNIT_OF_CLASS);
    }

    @Feature("Редактирование показателя 'Общее состояние здоровья'")
    @Test(description="Проверка редактирования добавленного показателя 'Общее состояние здоровья")
    @Description("Проверка редактирования показателя")
    public void editParameterGeneralStateOfHealth() {
        healthIndicatorsPage
                .setGeneralStateOfHealth(VALUE_OF_GENERAL_STATE_OF_HEALTH)
                .baseValueIsVisible(receiveOfData.getLocalDateTime(),
                        TestDataGeneralStateOfHealth.INDICATOR_OF_CLASS, VALUE_OF_GENERAL_STATE_OF_HEALTH)
                .editIndicatorOfNotCustomizing(VALUE_OF_GENERAL_STATE_OF_HEALTH_FOR_EDIT)
                .baseValueIsVisible(receiveOfData.getLocalDateTime(),
                        TestDataGeneralStateOfHealth.INDICATOR_OF_CLASS, VALUE_OF_GENERAL_STATE_OF_HEALTH_FOR_EDIT);
    }

    @Feature("Редактирование показателя 'Состояние кожных покровов'")
    @Test(description="Проверка редактирования добавленного показателя 'Состояние кожных покровов")
    @Description("Проверка редактирования показателя")
    public void editParameterTheConditionOfTheSkin() {
        healthIndicatorsPage
                .setTheConditionOfTheSkin(VALUE_OF_THE_CONDITION_OF_THE_SKIN)
                .baseValueIsVisible(receiveOfData.getLocalDateTime(),
                        TestDataTheConditionOfTheSkinTest.INDICATOR_OF_CLASS, VALUE_OF_THE_CONDITION_OF_THE_SKIN)
                .editIndicatorOfNotCustomizing(VALUE_OF_THE_CONDITION_OF_THE_SKIN_FOR_EDIT)
                .baseValueIsVisible(receiveOfData.getLocalDateTime(),
                        TestDataTheConditionOfTheSkinTest.INDICATOR_OF_CLASS, VALUE_OF_THE_CONDITION_OF_THE_SKIN_FOR_EDIT);
    }
}
