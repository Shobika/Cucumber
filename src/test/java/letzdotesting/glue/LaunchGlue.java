package letzdotesting.glue;

import Helper.ConfigReader;
import Helper.RunTimeContext;

import cucumber.api.java.en.Given;

import java.io.IOException;

public class LaunchGlue {

    @Given("I launch my site")
    public void launchSite() throws IOException {
        RunTimeContext.driver.get(ConfigReader.getProperty("url"));
        System.out.printf("First run passed");
    }
}
