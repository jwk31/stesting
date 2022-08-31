package API.helperMethods;

import dataProviders.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

public class HelperAPI {

    private static RequestSpecification setup() {
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri(ConfigReader.getProperty("baseUri"))
                .contentType(ContentType.JSON).accept(ContentType.JSON);
        return requestSpecification;
    }

    public static Response requestWithOutBody(String endPoint, Method method) {
        return setup()
                .when()
                .request(method, endPoint);
    }

    public static Response requestWithBody(String endPoint, String body, Method method) {
        return setup()
                .body(body)
                .when()
                .request(method, endPoint);
    }

    public static void assertFirstName(Response response, String expected) {
        String actualFirstName = response.body().jsonPath().getString("data.first_name");
        Assert.assertEquals(expected, actualFirstName);
    }
}
