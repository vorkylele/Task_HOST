package pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    SelenideElement loginInButton = $(By.xpath("//a[@data-testid='signInBtn']"));
    SelenideElement nameOfUserDropDownList = $(By.xpath("//div/app-login-menu/app-dropdown[@class='long']//a[@data-testid='userBtn']"));
    SelenideElement buttonOfPersonalAccount = $(By.xpath("//span[text()='Личный кабинет']"));
    SelenideElement buttonOfChildren = $(By.xpath("//span[text()='Петрова Юлия']"));

    @Step("Нажатие на кнопку 'Войти в кабинет'")
    public void clickLoginInButton() {
        loginInButton.click();
    }

    @Step("Нажатие на выпадающий список 'Имени пользователя'")
    public void clickNameOfUserDropDownList() {
        nameOfUserDropDownList.click();
    }

    @Step("Нажатие на кнопку 'Личный кабинет'")
    public void clickButtonOfPersonalAccount() {
        buttonOfPersonalAccount.click();
    }

    @Step("Нажатие на кнопку с именем ребенка 'Петрова Юлия'")
    public void clickButtonOfChildren() {
        buttonOfChildren.click();
    }

    @Step("Переход на аккаунт ребенка")
    public void transitionToTheChildrenAccount() {
        clickNameOfUserDropDownList();
        clickButtonOfChildren();
    }

    @Step("Переход в 'Личный кабинет'")
    public void transitionToThePersonalAccount() {
        clickNameOfUserDropDownList();
        clickButtonOfPersonalAccount();
    }
}
