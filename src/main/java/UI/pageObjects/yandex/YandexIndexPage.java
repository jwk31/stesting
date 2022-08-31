package UI.pageObjects.yandex;

import UI.pageObjects.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YandexIndexPage extends BasePage {

    @FindBy(xpath = "//a[@href='https://passport.yandex.ru/auth?origin=home_yandexid&retpath=https%3A%2F%2Fyandex.ru&backpath=https%3A%2F%2Fyandex.ru']")
    public WebElement loginButton;

    public YandexIndexPage clickLoginButton() {
        helper.click(loginButton);
        return this;
    }
}
