package stepDefs.UIStepDefs;

import UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSearchUIStepDefs extends BaseUITest {

    @Given("user is on {string}")
    public void user_is_on(String url) {
        Driver.getDriver().get(url);
    }

    @Then("user enters {string} in the search-field")
    public void user_enters_in_the_search_field(String str) {
        googleIndexPage.sendTextToSearchField(str);
    }

    List<WebElement> list;
    @Then("user should see more than {int} results")
    public void user_should_see_more_than_results(Integer numberOfResults) {
        list = resultPage.getListOfElements();
        resultPage.assertNumberOfResults(numberOfResults);
    }

    @Then("result contains {string}")
    public void result_contains(String str) {
        resultPage.assertListContains(list,str);
        Driver.closeDriver();
    }
}
