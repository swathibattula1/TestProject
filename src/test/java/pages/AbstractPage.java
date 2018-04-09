package pages;

import LIB.CommonClass;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class AbstractPage extends CommonClass {

    public AbstractPage(WebDriver driver) throws FileNotFoundException {
        super.getDriver();
    }

    public TestHomePage NavigateToTestAPP() throws InterruptedException, FileNotFoundException {
        Properties obj = new Properties();
        try {
            obj.load(new FileInputStream("C:\\Users\\swathi.battula\\IdeaProjects\\TestProject\\src\\test\\java\\resources.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String URL = obj.getProperty("application_url");
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return new TestHomePage();
    }

    public void closeDriver() {
        driver.quit();
    }

}
