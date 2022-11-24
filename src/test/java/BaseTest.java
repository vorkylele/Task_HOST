import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Description;
import org.openqa.selenium.Cookie;
import org.testng.annotations.BeforeTest;
import pageobject.LoginPage;
import pageobject.MainPage;

import java.util.Set;

import static com.codeborne.selenide.Selenide.open;
import static uri.BaseURI.MAIN_PAGE;

public class BaseTest {
    private static final String USERNAME = "71450643575";
    private static final String PASSWORD = "123";
    Set<Cookie> cookies;
    MainPage mainPage = new MainPage();

    @BeforeTest
    @Description("Авторизация пользователя")
    public void beforeTest() {
        mainPage = open(MAIN_PAGE, MainPage.class);
        mainPage.clickLoginInButton();

        LoginPage loginPage = new LoginPage();
        loginPage.login(USERNAME, PASSWORD);

        cookies = WebDriverRunner.getWebDriver().manage().getCookies();
//  cookies.stream().peek(cookie->WebDriverRunner.getWebDriver().manage().addCookie(cookie)).count(); - добавление сразу всех куки
    }
}
