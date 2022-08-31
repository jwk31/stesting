package UI.pageObjects.yandex;

import UI.pageObjects.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@id='passp-field-login']")
    public WebElement loginInputField;

    @FindBy(xpath = "//input[@id='passp-field-passwd']")
    public WebElement passwordInputField;

    @FindBy(xpath = "//button[@id='passp:sign-in']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class='passp-add-account-page-title']")
    public WebElement assertText;

    @FindBy(xpath = "//div[@id='field:input-passwd:hint']")
    public WebElement assertTextMissingPassword;

    @FindBy(xpath = "//div[@id='field:input-login:hint']")
    public WebElement assertTextInvalidUserName;

    public LoginPage inputUserNameOrEmail(String userNameOrEmail) {
        helper.sendKeysWithClear(loginInputField, userNameOrEmail);
        return this;
    }

    public LoginPage inputPassword(String password) {
        helper.sendKeysWithClear(passwordInputField, password);
        return this;
    }

    public LoginPage clickLoginButton() {
        helper.click(loginButton);
        return this;
    }

    public void loginToSystem(String userName, String password) {
        inputUserNameOrEmail(userName).clickLoginButton().inputPassword(password);
    }

    public void assertText (){
        Assert.assertEquals("Войдите с Яндекс ID", helper.getText(assertText));
    }

    public void assertTextMissingPassword (){
        Assert.assertEquals("Пароль не указан", helper.getText(assertTextMissingPassword));
    }

    public void assertTextInvalidUserName (){
        Assert.assertEquals("Такого аккаунта нет", helper.getText(assertTextInvalidUserName));
    }
}
