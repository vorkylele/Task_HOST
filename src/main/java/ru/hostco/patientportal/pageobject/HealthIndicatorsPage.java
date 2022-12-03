package ru.hostco.patientportal.pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.HashMap;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static ru.hostco.patientportal.uri.BaseURI.TAB_HEALTH_INDICATORS;

public class HealthIndicatorsPage {
    // Elements
    private SelenideElement tabOfHealthIndicators = $(By.xpath("//a[text()='Показатели здоровья']")),
            elementHealthMonitoring = $(By.className("control-health-block__caption")),
            messageOfSuccessSaveIndicator = $(By.cssSelector(".ui-toast-summary")),
            buttonOfCloseOfMessageOfSuccessSaveIndicator = $(By.cssSelector(".ui-toast-close-icon")),
            textOfSuccessSaveIndicator = $(By.cssSelector(".ui-toast-detail"));
    private ElementsCollection allCloseMessageButton = $$(By.cssSelector(".ui-toast-close-icon"));

    private SelenideElement dropDownLabelIndicator = $(By.cssSelector(".ng-tns-c69-9.ui-dropdown-label")),
            indicatorTemperature = $(By.xpath("//li[@aria-label='Температура']")),
            indicatorWeight = $(By.xpath("//li[@aria-label='Вес']")),
            indicatorPressure = $(By.xpath("//li[@aria-label='Давление']")),
            indicatorBloodSugarLevels = $(By.xpath("//li[@aria-label='Уровень сахара в крови']")),
            indicatorPulse = $(By.xpath("//li[@aria-label='Пульс']")),
            indicatorMood = $(By.xpath("//li[@aria-label='Настроение']")),
            indicatorAlcoholInTheBlood = $(By.xpath("//li[@aria-label='Алкоголь в крови']")),
            indicatorAmbivalence = $(By.xpath("//li[@aria-label='Амбивалентность']")),
            indicatorGeneralStateOfHealth = $(By.xpath("//li[@aria-label='Общее состояние здоровья']")),
            indicatorTheConditionOfTheSkin = $(By.xpath("//li[@aria-label='Состояние кожных покровов']"));

    private SelenideElement dateAndTime = $(By.xpath("//div[@class='col date']/div[@class='sml break-word']")),
            indicator = $(By.xpath("//div[@class='col indicator']/div[@class='sml break-word']")),
            value = $(By.xpath("//div[@class='col val']/div[@class='sml break-word']")),
            badValue = $(By.xpath("//div[@class='col val']//span[@style='color: red;']")),
            deleteButton = $(By.xpath("//a[text()='Удалить ']")),
            buttonYesInDeleteWindows = $(By.xpath("//button[text()='Да ']"));

    private SelenideElement editButton = $(By.xpath("//a[text()='Редактировать ']")),
            inputFieldTemperatureInEditWindow = $(By.xpath("//input[@class='ui-inputtext ui-corner-all ui-state-default ui-widget ui-state-filled']")),
            inputFieldCustomizingInEditWindow = $(By.xpath("//input[@class='ng-untouched ng-pristine ng-valid ng-star-inserted']")),
            inputFieldWithNotCustomizingInEditWindow = $(By.xpath("//textarea[@class='ng-untouched ng-pristine ng-valid ng-star-inserted']")),
            firstInputFieldOfPressure = $(By.xpath("//input[@class='ng-untouched ng-pristine ng-valid' and @formcontrolname='1']")),
            secondInputFieldOfPressure = $(By.xpath("//input[@class='ng-untouched ng-pristine ng-valid' and @formcontrolname='2']"));

    private SelenideElement buttonOfRecordAnIndicator = $(By.xpath("//a[text()='Записать показатель']")),
            inputFieldTemperatureInRecordAnIndicator = $(By.xpath("//input[@class='ui-inputtext ui-corner-all ui-state-default ui-widget']")),
            inputFieldWeightInRecordAnIndicator = $(By.xpath("//form/div[2]/div[2]/input")),
            firstInputPressureInRecordAnIndicator = $(By.xpath("//input[@formcontrolname='1']")),
            secondInputPressureInRecordAnIndicator = $(By.xpath("//input[@formcontrolname='2']")),
            inputBloodSugarLevelsInRecordAnIndicator = $(By.xpath("//form/div[4]/div[2]/input")),
            inputPulseInRecordAnIndicator = $(By.xpath("//form/div[5]/div[2]/input")),
            inputMoodInRecordAnIndicator = $(By.xpath("//form/div[6]/div[2]/textarea")),
            inputAlcoholInTheBloodInRecordAnIndicator = $(By.xpath("//form/div[7]/div[2]/input")),
            inputAmbivalenceInRecordAnIndicator = $(By.xpath("//form/div[8]/div[2]/input")),
            inputGeneralStateOfHealthInRecordAnIndicator = $(By.xpath("//form/div[9]/div[2]/textarea")),
            inputTheConditionOfTheSkinInRecordAnIndicator = $(By.xpath("//form/div[10]/div[2]/textarea"));

    private SelenideElement buttonOfSettings = $(By.xpath("//a[text()='Настроить']")),
            inputFieldMinTemperateInSettings = $(By.xpath("//form/div[1]//input[@class='ng-untouched ng-pristine ng-valid' and @formcontrolname='min']")),
            inputFieldMaxTemperateInSettings = $(By.xpath("//form/div[1]//input[@class='ng-untouched ng-pristine ng-valid' and @formcontrolname='max']")),
            inputFieldMinWeightInSettings = $(By.xpath("//form/div[2]//input[@class='ng-untouched ng-pristine ng-valid' and @formcontrolname='min']")),
            inputFieldMaxWeightInSettings = $(By.xpath("//form/div[2]//input[@class='ng-untouched ng-pristine ng-valid' and @formcontrolname='max']")),
            firstInputFieldMinPressureInSettings = $(By.xpath("//form/div[3]//div[1]/div[1]/input")),
            secondInputFieldMinPressureInSettings = $(By.xpath("//form/div[3]//div[1]/div[3]/input")),
            firstInputFieldMaxPressureInSettings = $(By.xpath("//form/div[3]//div[2]/div[1]/input")),
            secondInputFieldMaxPressureInSettings = $(By.xpath("//form/div[3]//div[2]/div[3]/input")),
            inputFieldMinBloodSugarLevelsInSettings = $(By.xpath("//form/div[4]//input[@class='ng-untouched ng-pristine ng-valid' and @formcontrolname='min']")),
            inputFieldMaxBloodSugarLevelsInSettings = $(By.xpath("//form/div[4]//input[@class='ng-untouched ng-pristine ng-valid' and @formcontrolname='max']")),
            inputFieldMinPulseInSettings = $(By.xpath("//form/div[5]//input[@class='ng-untouched ng-pristine ng-valid' and @formcontrolname='min']")),
            inputFieldMaxPulseInSettings = $(By.xpath("//form/div[5]//input[@class='ng-untouched ng-pristine ng-valid' and @formcontrolname='max']")),
            inputFieldMinAlcoholInTheBloodInSettings = $(By.xpath("//form/div[6]//input[@class='ng-untouched ng-pristine ng-valid' and @formcontrolname='min']")),
            inputFieldMaxAlcoholInTheBloodInSettings = $(By.xpath("//form/div[6]//input[@class='ng-untouched ng-pristine ng-valid' and @formcontrolname='max']")),
            inputFieldMinAmbivalenceInSettings = $(By.xpath("//form/div[7]//input[@class='ng-untouched ng-pristine ng-valid' and @formcontrolname='min']")),
            inputFieldMaxAmbivalenceInSettings = $(By.xpath("//form/div[7]//input[@class='ng-untouched ng-pristine ng-valid' and @formcontrolname='max']")),
            buttonOfSave = $(By.xpath("//button//b[text()='Сохранить']"));

    // Actions
    @Step("Открытие вкладки 'Показатели здоровья'")
    public HealthIndicatorsPage openTabOfHealthIndicators() {
        open(TAB_HEALTH_INDICATORS);
        tabOfHealthIndicatorsIsVisible();

        return this;
    }

    @Step("Отображение вкладки 'Показатели здоровья'")
    public HealthIndicatorsPage tabOfHealthIndicatorsIsVisible() {
        tabOfHealthIndicators.shouldBe(Condition.visible);
        elementHealthMonitoring.shouldBe(Condition.visible);

        return this;
    }

    @Step("Удаление всех показателей")
    public HealthIndicatorsPage deleteAllIndicator() {
        while (deleteButtonIsVisible()) {
            deleteIndicator();
            sleep(1000);
        }

        return this;
    }

    @Step("Удаление показателя здоровья")
    public HealthIndicatorsPage deleteIndicator() {
        deleteButton.click();
        buttonYesInDeleteWindows.click();

        return this;
    }

    @Step("Нажатие на кнопку 'Настройки'")
    public HealthIndicatorsPage clickButtonOfSettings() {
        buttonOfSettings.click();

        return this;
    }

    @Step("Нажатие на кнопку 'Сохранить'")
    public HealthIndicatorsPage clickButtonOfSaveInSettings() {
        buttonOfSave.click();

        return this;
    }

    @Step("Установка предварительных настроек 'Температура'")
    public HealthIndicatorsPage setSettingsOfTemperature(String minValueOfTemperature, String maxValueOfTemperature) {
        inputFieldMinTemperateInSettings.setValue(minValueOfTemperature);
        inputFieldMaxTemperateInSettings.setValue(maxValueOfTemperature);

        return this;
    }

    @Step("Установка предварительных настроек 'Вес'")
    public HealthIndicatorsPage setSettingsOfWeight(String minValueOfWeight, String maxValueOfWeight) {
        inputFieldMinWeightInSettings.setValue(minValueOfWeight);
        inputFieldMaxWeightInSettings.setValue(maxValueOfWeight);

        return this;
    }
    @Step("Установка предварительных настроек 'Давление'")
    public HealthIndicatorsPage setSettingsOfPressure(String firstMinValueOfPressure, String secondMinValueOfPressure,
                                                    String firstMaxValueOfPressure, String secondMaxValueOfPressure) {
        firstInputFieldMinPressureInSettings.setValue(firstMinValueOfPressure);
        secondInputFieldMinPressureInSettings.setValue(secondMinValueOfPressure);
        firstInputFieldMaxPressureInSettings.setValue(firstMaxValueOfPressure);
        secondInputFieldMaxPressureInSettings.setValue(secondMaxValueOfPressure);

        return this;
    }

    @Step("Установка предварительных настроек 'Уровень сахара в крови'")
    public HealthIndicatorsPage setSettingsOfBloodSugarLevels(String minValueOfBloodSugarLevels, String maxValueOfBloodSugarLevels) {
        inputFieldMinBloodSugarLevelsInSettings.setValue(minValueOfBloodSugarLevels);
        inputFieldMaxBloodSugarLevelsInSettings.setValue(maxValueOfBloodSugarLevels);

        return this;
    }

    @Step("Установка предварительных настроек 'Пульс'")
    public HealthIndicatorsPage setSettingsOfPulse(String minValueOfPulse, String maxValueOfPulse) {
        inputFieldMinPulseInSettings.setValue(minValueOfPulse);
        inputFieldMaxPulseInSettings.setValue(maxValueOfPulse);

        return this;
    }
    @Step("Установка предварительных настроек 'Алкоголь в крови'")
    public HealthIndicatorsPage setSettingsOfAlcoholInTheBlood(String minValueOfAlcoholInTheBlood, String maxValueOfAlcoholInTheBlood) {
        inputFieldMinAlcoholInTheBloodInSettings.setValue(minValueOfAlcoholInTheBlood);
        inputFieldMaxAlcoholInTheBloodInSettings.setValue(maxValueOfAlcoholInTheBlood);

        return this;
    }
    @Step("Установка предварительных настроек 'Амбивалентность'")
    public HealthIndicatorsPage setSettingsOfAmbivalence(String minValueOfAmbivalence, String maxValueOfAmbivalence) {
        inputFieldMinAmbivalenceInSettings.setValue(minValueOfAmbivalence);
        inputFieldMaxAmbivalenceInSettings.setValue(maxValueOfAmbivalence);

        return this;
    }

    @Step("Отображение кнопки 'Удалить'")
    public boolean deleteButtonIsVisible() {
        return deleteButton.has(Condition.visible);
    }

    @Step("Запись показателя 'Температура'")
    public HealthIndicatorsPage setIndicatorOfTemperature(String temperature) {
        buttonOfRecordAnIndicator.click();
        sleep(1000);
        inputFieldTemperatureInRecordAnIndicator.setValue(temperature);
        sleep(1000);
        clickButtonOfSaveInSettings();

        return this;
    }

    @Step("Запись показателя 'Вес'")
    public HealthIndicatorsPage setIndicatorOfWeight(String weight) {
        buttonOfRecordAnIndicator.click();
        sleep(1000);
        inputFieldWeightInRecordAnIndicator.setValue(weight);
        sleep(1000);
        clickButtonOfSaveInSettings();

        return this;
    }

    @Step("Запись показателя 'Давление'")
    public HealthIndicatorsPage setIndicatorOfPressure(String upperPressure, String lowerPressure) {
        buttonOfRecordAnIndicator.click();
        sleep(1000);
        firstInputPressureInRecordAnIndicator.setValue(upperPressure);
        secondInputPressureInRecordAnIndicator.setValue(lowerPressure);
        sleep(1000);
        clickButtonOfSaveInSettings();

        return this;
    }

    @Step("Запись показателя 'Уровень сахара в крови'")
    public HealthIndicatorsPage setIndicatorOfBloodSugarLevels(String bloodSugarLevels) {
        buttonOfRecordAnIndicator.click();
        sleep(1000);
        inputBloodSugarLevelsInRecordAnIndicator.setValue(bloodSugarLevels);
        sleep(1000);
        clickButtonOfSaveInSettings();

        return this;
    }

    @Step("Запись показателя 'Пульс'")
    public HealthIndicatorsPage setIndicatorOfPulse(String pulse) {
        buttonOfRecordAnIndicator.click();
        sleep(1000);
        inputPulseInRecordAnIndicator.setValue(pulse);
        sleep(1000);
        clickButtonOfSaveInSettings();

        return this;
    }

    @Step("Запись показателя 'Алкоголь в крови'")
    public HealthIndicatorsPage setIndicatorOfAlcoholInTheBlood(String alcoholInTheBlood) {
        buttonOfRecordAnIndicator.click();
        sleep(1000);
        inputAlcoholInTheBloodInRecordAnIndicator.setValue(alcoholInTheBlood);
        sleep(1000);
        clickButtonOfSaveInSettings();

        return this;
    }

    @Step("Запись показателя 'Амбивалентность'")
    public HealthIndicatorsPage setIndicatorOfAmbivalence(String ambivalence) {
        buttonOfRecordAnIndicator.click();
        sleep(1000);
        inputAmbivalenceInRecordAnIndicator.setValue(ambivalence);
        sleep(1000);
        clickButtonOfSaveInSettings();

        return this;
    }

    @Step("Запись показателя 'Настроение'")
    public HealthIndicatorsPage setIndicatorOfMood(String mood) {
        buttonOfRecordAnIndicator.click();
        sleep(1000);
        inputMoodInRecordAnIndicator.setValue(mood);
        sleep(1000);
        clickButtonOfSaveInSettings();

        return this;
    }

    @Step("Запись показателя 'Общее состояние здоровья'")
    public HealthIndicatorsPage setGeneralStateOfHealth(String generalStateOfHealth) {
        buttonOfRecordAnIndicator.click();
        sleep(1000);
        inputGeneralStateOfHealthInRecordAnIndicator.setValue(generalStateOfHealth);
        sleep(1000);
        clickButtonOfSaveInSettings();

        return this;
    }
    @Step("Запись показателя 'Состояние кожных покровов'")
    public HealthIndicatorsPage setTheConditionOfTheSkin(String theConditionOfTheSkin) {
        buttonOfRecordAnIndicator.click();
        sleep(1000);
        inputTheConditionOfTheSkinInRecordAnIndicator.setValue(theConditionOfTheSkin);
        sleep(1000);
        clickButtonOfSaveInSettings();

        return this;
    }

    @Step("Отображение показателя удовлетворяющего требования настроек")
    public HealthIndicatorsPage goodValueIsVisible(String dateAndTime, String indicator, String value, String unit) {
        this.dateAndTime.shouldBe(Condition.visible).shouldHave(text(dateAndTime));
        this.indicator.shouldBe(Condition.visible).shouldHave(text(indicator));
        this.value.shouldBe(Condition.visible).shouldHave(text(value + unit));
        messageOfSuccessAfterRecordIsVisibleAfterRecord();

        return this;
    }

    @Step("Отображение показателя 'Давление' удовлетворяющего требования настроек")
    public HealthIndicatorsPage goodValueOfPressureIsVisible(String dateAndTime, String indicator, String value) {
        this.dateAndTime.shouldBe(Condition.visible).shouldHave(text(dateAndTime));
        this.indicator.shouldBe(Condition.visible).shouldHave(text(indicator));
        this.value.shouldBe(Condition.visible).shouldHave(text(value));
        messageOfSuccessAfterRecordIsVisibleAfterRecord();

        return this;
    }

    @Step("Отображение показателя не удовлетворяющего требования настроек")
    public HealthIndicatorsPage badValueIsVisible(String dateAndTime, String indicator, String badValue, String unit) {
        this.dateAndTime.shouldBe(Condition.visible).shouldHave(text(dateAndTime));
        this.indicator.shouldBe(Condition.visible).shouldHave(text(indicator));
        this.badValue.shouldBe(Condition.visible).shouldHave(text(badValue));
        this.value.shouldBe(Condition.visible).shouldHave(text(unit));
        sleep(1000);
        messageOfSuccessAfterRecordIsVisibleAfterRecord();

        return this;
    }

    @Step("Отображение показателя 'Давление' не удовлетворяющего требования настроек")
    public HealthIndicatorsPage badValuePressureIsVisible(String dateAndTime, String indicator, String badValue) {
        this.dateAndTime.shouldBe(Condition.visible).shouldHave(text(dateAndTime));
        this.indicator.shouldBe(Condition.visible).shouldHave(text(indicator));
        this.badValue.shouldBe(Condition.visible).shouldHave(text(badValue));
        sleep(1000);
        messageOfSuccessAfterRecordIsVisibleAfterRecord();

        return this;
    }

    @Step("Отображение показателя нетребующего настройки")
    public HealthIndicatorsPage baseValueIsVisible(String dateAndTime, String indicator, String value) {
        this.dateAndTime.shouldBe(Condition.visible).shouldHave(text(dateAndTime));
        this.indicator.shouldBe(Condition.visible).shouldHave(text(indicator));
        messageOfSuccessAfterRecordIsVisibleAfterRecord();

        return this;
    }

    @Step("Проверка отображения сообщение об успешном сохранении настроек индикаторов и его закрытие")
    public HealthIndicatorsPage messageOfSuccessSaveIndicatorInSettingsIsVisible() {
        messageOfSuccessSaveIndicator.shouldHave(text("Успешно"));
        textOfSuccessSaveIndicator.shouldHave(text("Пороговые значения сохранены"));
        sleep(1000);
        for (SelenideElement selenideElement : allCloseMessageButton) {
            selenideElement.click();
        }

        return this;
    }

    @Step("Проверка отображения сообщение об успешном сохранении настроек индикаторов и его закрытие")
    public HealthIndicatorsPage messageOfSuccessAfterRecordIsVisibleAfterRecord() {
        messageOfSuccessSaveIndicator.shouldHave(text("Успешно"));
        textOfSuccessSaveIndicator.shouldHave(text("Показатель сохранен"));
        buttonOfCloseOfMessageOfSuccessSaveIndicator.click();

        return this;
    }

    @Step("Редактирование параметра 'Температура'")
    public HealthIndicatorsPage editIndicatorOfTemperature(String value) {
        editButton.click();
        sleep(1000);
        inputFieldTemperatureInEditWindow.setValue(value);
        clickButtonOfSaveInSettings();

        return this;
    }

    @Step("Редактирование параметра 'Давление'")
    public HealthIndicatorsPage editIndicatorOfPressure(String firstValu, String secondValue) {
        editButton.click();
        sleep(1000);
        firstInputFieldOfPressure.setValue(firstValu);
        secondInputFieldOfPressure.setValue(secondValue);
        clickButtonOfSaveInSettings();

        return this;
    }

    @Step("Редактирование параметра с настройкой")
    public HealthIndicatorsPage editIndicatorOfCustomizing(String value) {
        editButton.click();
        sleep(1000);
        inputFieldCustomizingInEditWindow.setValue(value);
        clickButtonOfSaveInSettings();

        return this;
    }

    @Step("Редактирование параметра без настройки")
    public HealthIndicatorsPage editIndicatorOfNotCustomizing(String value) {
        editButton.click();
        sleep(1000);
        inputFieldWithNotCustomizingInEditWindow.setValue(value);
        clickButtonOfSaveInSettings();

        return this;
    }
}
