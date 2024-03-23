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

public class AlbumsPhotosSteps {
    private WebDriver driver;
    private AlbumsPhotosPage albumsPhotosPage;
    public AlbumsPhotosSteps() {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        albumsPhotosPage = new AlbumsPhotosPage(driver);
    }

    @Given("I am on the JsonPlaceholder guide page")
    public void i_am_on_the_JsonPlaceholder_guide_page() {
        driver.get("https://jsonplaceholder.typicode.com/guide/");
    }

    @When("I navigate to the link and open it")
    public void navigateToTheLinkAlbunsPhoto() {
        albumsPhotosPage.scrollToElement(By.xpath(albumsPhotosPage.pathAlbunsPhotosElement));
        driver.findElement(By.xpath(albumsPhotosPage.pathAlbunsPhotosElement)).click();
    }


    @Then("I validate the data for the object with id = 6")
    public void validateObjectWithId() {
        int id = 6;
        String expectedTitle = "accusamus ea aliquid et amet sequi nemo";
        String expectedUrl = "https://via.placeholder.com/600/56a8c2";
        String expectedThumbnailUrl = "https://via.placeholder.com/150/56a8c2";

        String actualTitle = albumsPhotosPage.getAlbumTitleById(id);
        String actualUrl = albumsPhotosPage.getAlbumUrlById(id);
        String actualThumbnailUrl = albumsPhotosPage.getAlbumThumbnailUrlById(id);

        Assert.assertEquals("Title does not match", expectedTitle, actualTitle);
        Assert.assertEquals("URL does not match", expectedUrl, actualUrl);
        Assert.assertEquals("Thumbnail URL does not match", expectedThumbnailUrl, actualThumbnailUrl);

    }


    @After
    public void cleanUp() {
        if (driver != null) {
            driver.quit();
        }
    }
}