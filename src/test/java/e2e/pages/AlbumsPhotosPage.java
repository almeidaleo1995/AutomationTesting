package e2e.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlbumsPhotosPage {
    private WebDriver driver;

    public String pathAlbunsPhotosElement = "/html/body/div[2]/main/ul/li[2]/a";
    public AlbumsPhotosPage(WebDriver driver) {
        this.driver = driver;
    }
    public void scrollToElement(By by) {
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public String getAlbumTitleById(int id) {
        return driver.findElement(By.cssSelector("div[data-id='" + id + "'] .album-title")).getText();
    }

    public String getAlbumUrlById(int id) {
        return driver.findElement(By.cssSelector("div[data-id='" + id + "'] .album-url")).getAttribute("href");
    }

    public String getAlbumThumbnailUrlById(int id) {
        return driver.findElement(By.cssSelector("div[data-id='" + id + "'] .album-thumbnail-url")).getAttribute("src");
    }

}
