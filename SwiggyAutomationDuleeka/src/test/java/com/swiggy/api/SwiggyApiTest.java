package com.swiggy.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwiggyApiTest {

    @Test
    public void testSwiggyApi() {
        // Replace the placeholder URL with the actual API endpoint
        String apiUrl = "https://api.swiggy.com/v1/someEndpoint";

        // Make an API request
        Response response = RestAssured.get(apiUrl);

        // Validate the response
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200, "Unexpected status code");

        // Add more assertions as needed based on the API response content
    }
}
