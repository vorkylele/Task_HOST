package pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    SelenideElement usernameOrEmail = $(By.id("username"));
    SelenideElement password = $(By.id("password"));
    SelenideElement signInButton = $(By.id("kc-login"));

    @Step("Ввод данных в поле 'Username or email'")
    public void setUsernameOrEmail(String username) {
        usernameOrEmail.setValue(username);
    }

    @Step("Ввод данных в поле 'Password'")
    public void setPasswordField(String password) {
        this.password.setValue(password);
    }

    @Step("Нажатие на кнопку 'Sign in'")
    public void clicksSgnInButton() {
        signInButton.click();
    }

    @Step("Авторизация")
    public void login(String username, String password) {
        setUsernameOrEmail(username);
        setPasswordField(password);
        clicksSgnInButton();
    }
}
