package e2e.stepDefinitions;


import e2e.pages.AlbumsPhotosPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.IOException;
import java.util.Map;

public class AlbumsPhotosSteps {
    private WebDriver driver;
    private AlbumsPhotosPage albumsPhotosPage;
    public AlbumsPhotosSteps() {

        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        driver = new FirefoxDriver(options);
        albumsPhotosPage = new AlbumsPhotosPage(driver);
    }

    @Given("I am on the JsonPlaceholder guide page")
    public void onTheJsonPlaceholderPage() {
        driver.get("https://jsonplaceholder.typicode.com/guide/");
    }

    @When("I navigate to the link and open it")
    public void navigateToTheLinkAlbunsPhoto() {
        albumsPhotosPage.scrollToElement(By.xpath(albumsPhotosPage.pathAlbunsPhotosElement));
        driver.findElement(By.xpath(albumsPhotosPage.pathAlbunsPhotosElement)).click();
    }


    @Then("I validate the data for the object with id = 6")
    public void validateObjectWithId() throws IOException {
        int id = 6;
        Map<String, Object> album = albumsPhotosPage.getAlbumById(id);

        String expectedTitle = "accusamus ea aliquid et amet sequi nemo";
        String expectedUrl = "https://via.placeholder.com/600/56a8c2";
        String expectedThumbnailUrl = "https://via.placeholder.com/150/56a8c2";

        Assert.assertEquals("Title does not match", expectedTitle, album.get("title"));
        Assert.assertEquals("URL does not match", expectedUrl, album.get("url"));
        Assert.assertEquals("Thumbnail URL does not match", expectedThumbnailUrl, album.get("thumbnailUrl"));

    }


    @After
    public void cleanUp() {
        if (driver != null) {
            driver.quit();
        }
    }
}