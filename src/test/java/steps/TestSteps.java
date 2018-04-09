package steps;

import LIB.CommonClass;
import cucumber.api.java.en.*;
import pages.AbstractPage;
import pages.*;

import java.io.FileNotFoundException;


public class TestSteps extends CommonClass {

    private AbstractPage abstractPage = new AbstractPage(driver);
    private TestHomePage testHomePage = new TestHomePage();
    private FindPropertiesPage findPropertiesPage = new FindPropertiesPage();
    private FilteredPropertiesPage filteredPropertiesPage = new FilteredPropertiesPage();

    public TestSteps() throws FileNotFoundException {
    }

    @Given("^I am on right move home page$")
    public void iAmOnRightMoveHomePage() throws Throwable {
        abstractPage.NavigateToTestAPP();

    }

    @And("^select radius$")
    public void selectRadius() throws Throwable {
        findPropertiesPage.searchRadiusDropdown();
    }

    @And("^I selected Property type$")
    public void iSelectedPropertyType() throws Throwable {
        findPropertiesPage.propertyTypeDropdown();
    }

    @And("^I selected price ranges$")
    public void iSelectedPriceRanges() throws Throwable {
        findPropertiesPage.PriceRanges();
    }

    @And("^I selected Added to site$")
    public void iSelectedAddedToSite() throws Throwable {
        findPropertiesPage.AddedToSite();
    }


    @And("^I selected number of bedrooms$")
    public void iSelectedNumberOfBedrooms() throws Throwable {
        findPropertiesPage.NumberOfBedrooms();
    }

    @And("^I clicked on FindProperties button$")
    public void iClickedOnFindPropertiesButton() throws Throwable {
        findPropertiesPage.clickFindProperties();
    }

    @And("^click on first non featured file$")
    public void clickOnFirstNonFeaturedFile() throws Throwable {
        filteredPropertiesPage.SelectFirstNonFeaturedProperty();
    }

    @When("^I enter a desired ([^\"]*)$\" to search and clicked on desired ([^\"]*)$")
    public void iEnterADesiredPlaceToSearchAndClickedOnDesiredButton(String place, String button) throws Throwable {
        testHomePage.enterSearchtext(place);
        testHomePage.clickButton(button);

    }

    @When("^I enter a desired ([^\"]*)$")
    public void iEnterADesiredPlaceToSearch(String place) throws Throwable {
        testHomePage.enterSearchtext(place);
    }

    @And("^clicked on desired ([^\"]*)$")
    public void clickedOnDesiredButton(String button) throws Throwable {
        testHomePage.clickButton(button);
    }


}





