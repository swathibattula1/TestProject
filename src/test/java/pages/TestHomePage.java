package pages;

import LIB.CommonClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.io.FileNotFoundException;

public class TestHomePage extends CommonClass {


    public TestHomePage()  {

    }

    public void enterSearchtext(String place) throws InterruptedException {
        //sendKeys("xpath", ".//*[@id='searchLocation']", place);
        WebElement searchbox=driver.findElement(By.xpath(".//*[@id='searchLocation']"));
        Actions builder = new Actions(driver);
        Action enterText=builder.moveToElement(searchbox).sendKeys(place).doubleClick().build();
        enterText.perform();

    }

    public void SelectInputText(String text) {
        SelectByVisibleText("xpath", ".//*[@id='searchLocation']", "Ilford, Essex");
   }

    public FindPropertiesPage clickButton(String button) {
        click("id", button);
        return new FindPropertiesPage();
    }
}
