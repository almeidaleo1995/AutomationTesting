package api.stepDefinitions;

import api.services.UserService;
import io.cucumber.java.en.*;

import java.util.Optional;

import static org.junit.Assert.*;

public class UserApiTestSteps {

    private final UserService userService = new UserService();

    @Given("I set POST user service endpoint")
    public void setPostUserService() {
        userService.setPostUserServiceEndpoint();
    }

    @When("I send a POST HTTP request")
    public void sendPostApiUserRequest() {
        userService.sendPostRequest();
    }

    @Then("I should receive user api status code {int}")
    public void shouldReceiveUserApiStatusCode(Integer statusCode) {
        assertEquals(statusCode.intValue(), userService.getStatusCode());
    }

    @And("I should receive a valid user ID in response")
    public void shouldReceiveUserApiResponse() {
        int userId = userService.getUserIdFromResponse();
        assertTrue(userId > 0);
    }

    @Given("I set PUT user service endpoint for user with id {int}")
    public void putUserWithId(Integer id) {
        userService.setPutUserServiceEndpoint(id);
    }

    @When("I update email, latitude and longitude of the user")
    public void updateInfos() {
        userService.updateUserDetails();
    }

    @And("I should see the updated email, latitude and longitude")
    public void shouldSeeInfos() {
        assertTrue(userService.verifyUpdatedDetails());
    }
}
