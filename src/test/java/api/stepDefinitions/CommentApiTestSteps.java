package api.stepDefinitions;

import api.services.CommentService;
import io.cucumber.java.en.*;

import java.util.Optional;

import static org.junit.Assert.*;

public class CommentApiTestSteps {

    private CommentService commentService = new CommentService();

    @Given("I set GET comments service endpoint")
    public void setGetCommentService() {
        commentService.setGetCommentsServiceEndpoint();
    }

    @When("I search a comment by the name {string}")
    public void searchCommentByName(String name) {
        commentService.searchCommentByName(name);
    }

    @Then("I should receive status code {int}")
    public void shouldReceiveApiCommentStatusCode(Integer statusCode) {
        assertEquals(statusCode.intValue(), commentService.getStatusCode());
    }

    @And("I should see the email associated with the name")
    public void shouldSeeInfosEmail() {
        assertNotNull(commentService.getEmailFromResponse());
    }
}
