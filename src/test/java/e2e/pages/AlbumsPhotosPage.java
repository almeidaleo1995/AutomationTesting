package e2e.pages;

import com.google.gson.Gson;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.TypeToken;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class AlbumsPhotosPage {
    private WebDriver driver;
    private Gson gson = new Gson();

    public String pathAlbunsPhotosElement = "/html/body/div[2]/main/ul/li[2]/a";

    public AlbumsPhotosPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToElement(By by) {
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public Map<String, Object> getAlbumById(int id) throws IOException {
        WebElement jsonElement = driver.findElement(By.xpath("/html/body/div[1]"));
        String json = jsonElement.getText();

        saveDataToJsonFile(json);

        Type listType = new TypeToken<List<Map<String, Object>>>() {}.getType();
        List<Map<String, Object>> albums = gson.fromJson(json, listType);

        return albums.stream()
                .filter(album -> ((Double) album.get("id")).intValue() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Album with id " + id + " not found"));
    }

    private void saveDataToJsonFile(String json) throws IOException {

        String filePath = "src/test/resources/jsonFile/executor.json";
        Files.createDirectories(Paths.get(filePath).getParent());

        try (FileWriter file = new FileWriter(filePath, false)) {
            file.write(json);
            file.flush();
        }
    }
}
