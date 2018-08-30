package Helper;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static String getProperty(String propertyName) throws IOException {
        Properties prop = new Properties();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/cucumber.properties");
        prop.load(file);
        String propValue = prop.getProperty(propertyName);
        return  propValue;
    }
}
