package UI.pageObjects.yandex;

import UI.pageObjects.BasePage;
import dataProviders.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MailPage extends BasePage {

    @FindBy(xpath = "//span[@class='username desk-notif-card__user-name ']")
    public WebElement assertText;

    public void assertText (){
        Assert.assertEquals(ConfigReader.getProperty("userName"), helper.getText(assertText));
    }
}
