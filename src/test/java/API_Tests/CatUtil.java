package API_Tests;

import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



///this doesn't go to a real API
public class CatUtil {
    RequestSpecification request;
    Response response;
    public Response PostRequest(String name, String colour, int age)
    {
        JsonObject postParams = new JsonObject();
        postParams.addProperty("name", name);
        postParams.addProperty("colour", colour);
        postParams.addProperty("age", age);
        System.out.print(postParams);
        request = RestAssured.given().body(postParams);
        return response = request.post("");
    }
}