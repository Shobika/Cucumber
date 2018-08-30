package letzdotesting.glue;

import Helper.RunTimeContext;
import cucumber.api.java.en.Given;

public class LaunchGlue {

    @Given("I launch my site")
    public void launchSite(){
        RunTimeContext.driver.get("http://letzdotesting.com");
        System.out.printf("First run passed");
    }
}
