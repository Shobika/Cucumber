package letzdotesting.glue;

import Helper.ConfigReader;
import Helper.RunTimeContext;
import com.google.inject.Inject;
import cucumber.api.java.en.Given;

import java.io.IOException;

public class LaunchGlue {

    @Inject
    ConfigReader configReader;

    @Given("I launch my site")
    public void launchSite() throws IOException {
        RunTimeContext.driver.get(configReader.getProperty("url"));
        System.out.printf("First run passed");
    }
}
