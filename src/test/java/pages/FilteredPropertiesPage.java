package pages;

import LIB.CommonClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;

import static org.testng.Assert.assertTrue;

public class FilteredPropertiesPage extends CommonClass {
    public FilteredPropertiesPage() {
    }

    public void SelectFirstNonFeaturedProperty() {
        String str = driver.getTitle();
        String[] splited = str.split(" ");
        for (String line : splited) {
            System.out.println(line);
        }

        if (str.contains("Sale")) {
            String text = driver.findElement(By.xpath(".//*[@id='l-searchResults']/div[1]")).getText();
            String[] lines = text.split("\\n");
            for (String x : lines) {
                System.out.println("line " + x);
            }
            if (lines[1].contains("FEATURED PROPERTY")) {
                driver.findElement(By.xpath(".//*[@id='l-searchResults']/div[2]")).click();
            } else {
                driver.findElement(By.xpath(".//*[@id='l-searchResults']/div[1]")).click();
            }
            String text2 = driver.findElement(By.xpath(".//*[@id='primaryContent']/div[1]/div/div/div[2]/div/h1")).getText();
            System.out.println(text2);
            assertTrue(text2.equalsIgnoreCase(lines[3]));
        } else if (str.contains("Rent")) {
            String text = driver.findElement(By.xpath(".//*[@id='l-searchResults']/div[1]")).getText();
            String[] lines = text.split("\\n");
            for (String x : lines) {
                System.out.println("line " + x);
            }
            if (lines[1].contains("FEATURED PROPERTY")) {
                driver.findElement(By.xpath(".//*[@id='l-searchResults']/div[2]")).click();
            } else {
                driver.findElement(By.xpath(".//*[@id='l-searchResults']/div[1]")).click();
            }
            String text2 = driver.findElement(By.xpath(".//*[@id='primaryContent']/div[1]/div/div/div[2]/div/address")).getText();
            System.out.println(text2);
            for (String x : lines) {

                System.out.println(x);
            }
        }

    }

}
