package e2e.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/e2e",
        glue = "e2e.stepDefinitions",
        plugin = { "pretty", "junit:src/test/resources/results/CucumberE2E.xml" },
        monochrome = true
)

public class E2ETestRunner {
}
