package pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HealthIndicatorsPage {
    SelenideElement tabOfHealthIndicators = $(By.xpath("//a[text()='Показатели здоровья']"));
    SelenideElement elementHealthMonitoring = $(By.className("control-health-block__caption"));
    SelenideElement buttonRecordAnIndicator = $(By.xpath("//a[text()='Записать показатель']"));

//    SelenideElement dropDownLabelIndicator = $(By.className("ui-dropdown-label-container ng-tns-c69-9"));
    SelenideElement indicatorTemperature = $(By.linkText("Температура"));
    SelenideElement indicatorWeight = $(By.linkText("Вес"));
    SelenideElement indicatorPressure = $(By.linkText("Вес"));
    SelenideElement indicatorBloodSugarLevels = $(By.linkText("Уровень сахара в крови"));
    SelenideElement indicatorPulse = $(By.linkText("Пульс"));
    SelenideElement indicatorMood = $(By.linkText("Настроение"));
    SelenideElement indicatorAlcoholInTheBlood = $(By.linkText("Алкоголь в крови"));
    SelenideElement indicatorAmbivalence = $(By.linkText("Амбивалентность"));
    SelenideElement indicatorGeneralStateOfHealth = $(By.linkText("Общее состояние здоровья"));
    SelenideElement indicatorTheConditionOfTheSkin = $(By.linkText("Состояние кожных покровов"));

//    @Step("Отображение вкладки 'Показатели здоровья'")
//    public void dropDownLabelIndicatorVisible() {
//        dropDownLabelIndicator.shouldBe(Condition.visible);
//    }
    @Step("Отображение вкладки 'Показатели здоровья'")
    public void indicatorTheConditionOfTheSkinVisible() {
        indicatorTheConditionOfTheSkin.shouldBe(Condition.visible);
    }


    SelenideElement firstCalendar = $(By.className("ng-tns-c79-10 range-date ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted"));
    SelenideElement secondCalendar = $(By.className("ng-tns-c79-11 range-date ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted"));
    SelenideElement buttonSettings = $(By.xpath("//a[text()='Настроить']"));

    @Step("Отображение вкладки 'Показатели здоровья'")
    public void tabOfHealthIndicatorsVisible() {
        tabOfHealthIndicators.shouldBe(Condition.visible);
    }

    @Step("Вкладка 'Показатели здоровья' не отображается")
    public void tabOfHealthIndicatorsIsNotVisible() {
        tabOfHealthIndicators.shouldBe(Condition.hidden);
    }

    @Step("Отображение элемента 'Контроль состояния здоровья' вкладки 'Показатели здоровья'")
    public void elementHealthMonitoringVisible() {
        elementHealthMonitoring.shouldBe(Condition.visible);
    }
}
