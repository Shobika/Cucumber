package letzdotesting.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Launch.feature",
        glue = "letzdotesting.glue",
        tags = "@Test1"
)

public class Runner {
}
