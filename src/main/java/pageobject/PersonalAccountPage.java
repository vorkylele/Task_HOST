package pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PersonalAccountPage {
    SelenideElement buttonWithNameDifferent = $(By.xpath("//a[text()='Разное']"));

    @Step("Нажатие на кнопку 'Разное'")
    public void clickButtonWithNameDifferent() {
        buttonWithNameDifferent.click();
    }

    @Step("Отображение кнопки 'Разное'")
    public void buttonWithNameDifferentVisible() {
        buttonWithNameDifferent.shouldBe(Condition.visible);
    }
}
