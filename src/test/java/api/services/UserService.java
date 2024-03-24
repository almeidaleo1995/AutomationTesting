package api.services;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class UserService {
    private Response response;

    public void setPostUserServiceEndpoint() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/users";
    }

    public void sendPostRequest() {
        response = given()
                .contentType("application/json")
                .body("{ \"name\": \"new user\" }")
                .when()
                .post();
    }

    public int getStatusCode() {
        return response.getStatusCode();
    }

    public int getUserIdFromResponse() {
        return response.then().extract().path("id");
    }

    public void setPutUserServiceEndpoint(int userId) {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/users/" + userId;
    }

    public void updateUserDetails() {
        response = given()
                .contentType("application/json")
                .body("{ \"email\": \"newemail@example.com\", \"address\": { \"geo\": { \"lat\": \"-37.3159\", \"lng\": \"81.1496\" }}}")
                .when()
                .put();
    }

    public boolean verifyUpdatedDetails() {
        response.then().body("email", equalTo("newemail@example.com"));
        response.then().body("address.geo.lat", equalTo("-37.3159"));
        response.then().body("address.geo.lng", equalTo("81.1496"));
        return true;
    }
}
