package letzdotesting.glue;

import Helper.RunTimeContext;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver//chromedriver");
        RunTimeContext.driver = new ChromeDriver();
    }
}
