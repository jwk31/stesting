package UI.pageObjects.google;

import UI.pageObjects.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleIndexPage extends BasePage {

    @FindBy(xpath = "//div/div/input")
    public WebElement searchInputField;

    @FindBy(xpath = "(//div/center/input[1])[2]")
    public WebElement searchButton;

    public GoogleIndexPage sendTextToSearchField(String str) {
        helper.sendKeysWithClear(searchInputField, str);

        return this;
    }

}
