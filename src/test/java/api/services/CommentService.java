package api.services;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class CommentService {
    private Response response;

    public void setGetCommentsServiceEndpoint() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/comments";
    }

    public void searchCommentByName(String name) {
        response = given().queryParam("name", name).when().get();
    }

    public int getStatusCode() {
        return response.getStatusCode();
    }

    public String getEmailFromResponse() {
        return response.then().extract().path("email[0]");
    }
}
