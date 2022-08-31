package stepDefs.UIStepDefs;

import UI.utils.Driver;
import dataProviders.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class YandexLoginUIStepDefs extends BaseUITest {

    @Given("user is on Index page {string}")
    public void user_is_on_index_page(String url) {
        Driver.getDriver().get(url);
    }

    @Then("user clicks on login button")
    public void user_clicks_on_login_button() {
        indexPage.clickLoginButton();
        loginPage.assertText();
    }

    @Then("user login with valid credentials")
    public void user_login_with_valid_credentials() {
        loginPage.loginToSystem(ConfigReader.getProperty("userName"), ConfigReader.getProperty("password"));
        mailPage.assertText();
        Driver.closeDriver();
    }


    @Then("user login without password")
    public void user_login_without_password() {
        loginPage.loginToSystem(ConfigReader.getProperty("userName"), "");
        loginPage.assertTextMissingPassword();
        Driver.closeDriver();
    }


    @Then("user login with invalid credentials")
    public void user_login_with_invalid_credentials() {
        loginPage.inputUserNameOrEmail(ConfigReader.getProperty("invalidUserName"));
        loginPage.assertTextInvalidUserName();
        Driver.closeDriver();
    }

}
