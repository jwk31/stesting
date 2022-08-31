package UI.pageObjects.google;

import UI.pageObjects.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultPage extends BasePage {

    @FindBy(xpath = "//div[@id='search']/div/div")
    public WebElement searchBlock;

    List<WebElement> listOfElements;

    public List<WebElement> getListOfElements() {
        helper.waitElementToBeDisplayed(searchBlock);
        return listOfElements = searchBlock.findElements(By.tagName("a"));
    }

    public ResultPage assertNumberOfResults(int number) {
        Assert.assertTrue(number <= listOfElements.size());
        return this;
    }

    public void assertListContains(List<WebElement> list, String str) {
        int temp = 0;
        for (WebElement element : list) {
            if (element.getText().contains(str)) {
                temp++;
            }
        }
        if (temp <= 0) {
            Assert.fail();
        }
    }

}
