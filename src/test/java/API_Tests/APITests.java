package API_Tests;

import ObjectModels.CatModel;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

public class APITests {
    CatUtil cat = new CatUtil();
    Response GETResponse;
    Response POSTResponse;
    String url;
    RequestSpecification request;
    @Test
    public void TestingAPIGETRequest() {
        ///////////////////////////////////////////////////////////
        url = "https://catfact.ninja/fact";
        request = RestAssured.given();
        GETResponse= request.get(url);
        System.out.println(GETResponse.asString());
        Assert.assertEquals("Get Request Failed",200,GETResponse.getStatusCode());
    }
    @Test
    public void TestingAPIPOSTRequest() {
        ///////////////////////////////////////////////////////////
        POSTResponse = cat.PostRequest("Cat1","Black",2);
        System.out.println(POSTResponse.asString());
        Assert.assertEquals("POST Request Failed",200,POSTResponse.getStatusCode());
    }
}