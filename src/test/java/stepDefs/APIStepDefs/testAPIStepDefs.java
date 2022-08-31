package stepDefs.APIStepDefs;

import API.helperMethods.HelperAPI;
import dataProviders.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.junit.Assert;

public class testAPIStepDefs {

    Response response;
    @Given("get single user info")
    public void get_single_user_info() {
        response = HelperAPI.requestWithOutBody(ConfigReader.getProperty("endPoint"), Method.GET);
    }
    @Then("check status code as {int} and first name as {string}")
    public void check_status_code_as_and_first_name_as(int int1, String expected) {
        Assert.assertEquals(int1, response.statusCode());
        HelperAPI.assertFirstName(response,expected);
    }

}
