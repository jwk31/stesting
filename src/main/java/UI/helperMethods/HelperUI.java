package UI.helperMethods;

import UI.utils.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HelperUI {

    public HelperUI waitElementToBeDisplayed(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public HelperUI waitElementToBeClickAble(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public HelperUI click(WebElement element) {
        waitElementToBeDisplayed(element).waitElementToBeClickAble(element);
        element.click();
        return this;
    }

       public HelperUI sendKeysWithClear(WebElement element, String str) {
        waitElementToBeDisplayed(element);
        element.clear();
        element.sendKeys(str + Keys.ENTER);
        return this;
    }

    public String getText(WebElement element) {
        waitElementToBeDisplayed(element);
        return element.getText();
    }
}
