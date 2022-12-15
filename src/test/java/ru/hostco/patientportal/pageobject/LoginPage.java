package ru.hostco.patientportal.pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static ru.hostco.patientportal.config.ConfigSingle.config;
import static ru.hostco.patientportal.config.EndPoints.LOGIN;

public class LoginPage {
    private static final String TITLE_TEXT_LOGIN_PAGE = "Sign in to your account";
    // Elements
    private SelenideElement
            loginPage = $(By.id("kc-page-title")),
            username = $(By.id("username")),
            password = $(By.id("password")),
            signInButton = $(By.id("kc-login"));

    // Actions
    @Step("Открытие страницы авторизации")
    public LoginPage openLoginPage() {
        open(config.getBaseUriLoginProperties() + LOGIN);
        loginPage.shouldHave(text(TITLE_TEXT_LOGIN_PAGE));

        return this;
    }

    @Step("Авторизация пользователя")
    public LoginPage fullAuthorization(String username, String password) {
        openLoginPage();
        this.username.setValue(username);
        this.password.setValue(password);
        signInButton.click();

        return this;
    }
}
