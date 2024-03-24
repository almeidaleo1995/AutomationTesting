package api.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/api",
        glue = "api.stepDefinitions",
        plugin = { "pretty", "junit:src/test/resources/results/CucumberApi.xml" },
        monochrome = true
)
public class ApiTestRunner {
}
