package pages;

import LIB.CommonClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FindPropertiesPage extends CommonClass {
    public FindPropertiesPage() {
    }
   public void searchRadiusDropdown() {
        click("xpath", ".//*[@id='radius']");
        WebDriverWait myWait = new WebDriverWait(driver, 10);
        myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='radius']"))).sendKeys("Within ½ mile");
    }

    public void propertyTypeDropdown() throws InterruptedException {
        SelectByVisibleText("id", "displayPropertyType", "Flats / Apartments");
        click("id", "displayPropertyType");
    }

    public void PriceRanges() {
        if (driver.findElement(By.id("minPrice")).getText().contains("100,000")) {
            SelectByVisibleText("id", "minPrice", "100,000");
        } else {
            SelectByVisibleText("id", "minPrice", "100 PCM");
        }
        if (driver.findElement(By.id("maxPrice")).getText().contains("200,000")) {
            SelectByVisibleText("id", "maxPrice", "200,000");
        } else {
            SelectByVisibleText("id", "maxPrice", "1,000 PCM");
        }
    }

    public void AddedToSite() {
        SelectByVisibleText("id", "maxDaysSinceAdded", "Last 7 days");
    }

    public void NumberOfBedrooms() {
        SelectByVisibleText("id", "minBedrooms", "1");
        SelectByVisibleText("id", "maxBedrooms", "2");

    }

    public FilteredPropertiesPage clickFindProperties() {
        click("id", "submit");
        return new FilteredPropertiesPage();

    }


}
