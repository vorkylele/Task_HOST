package ru.hostco.patientportal.pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static ru.hostco.patientportal.uri.BaseURI.LOGIN_PAGE;

public class LoginPage {
    private static final String TITLE_TEXT_LOGIN_PAGE = "Sign in to your account";
    // Elements
    private SelenideElement loginPage = $(By.id("kc-page-title")),
            usernameOrEmail = $(By.id("username")),
            password = $(By.id("password")),
            signInButton = $(By.id("kc-login"));

    // Actions
    @Step("Открытие страницы авторизации")
    public LoginPage openLoginPage() {
        open(LOGIN_PAGE);
        loginPage.shouldHave(text(TITLE_TEXT_LOGIN_PAGE));

        return this;
    }

    @Step("Авторизация пользователя")
    public LoginPage fullAuthorization(String username, String password) {
        openLoginPage();
        usernameOrEmail.setValue(username);
        this.password.setValue(password);
        signInButton.click();

        return this;
    }
}
