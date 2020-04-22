package uk.gov.harrow.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import uk.gov.harrow.Utility.Utility;

/**
 * Created by Chaitanya
 */
//homepage class extends with utility class
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //below locators for elements on home page
    @FindBy(className = "icon-fallback")
    WebElement _loginLink;
    @FindBy(xpath = "//span[@class='icon toggle-icon toggle-icon--search']")
    WebElement _searchSymbolLink;
    @FindBy(xpath = "//span[@class='button__text'][contains(text(),'Services')]")
    WebElement _servicesButton;
    @FindBy(xpath = "//div[@class='widget-row widget-row--flush widget-row--full-width']//a[2]")
    WebElement _councilTaxButton;

    //below method creation for web elements and doing action on elements
    public void clickOnLoginLink() {
        Reporter.log("Clicking on login button " + _loginLink.toString()+"<br>");
        clickOnElement(_loginLink);
        log.info("Clicking on login button " + _loginLink.toString());
    }

    public void clickOnSearchButton() {
        Reporter.log("Clicking on search button " + _searchSymbolLink.toString()+"<br>");
        clickOnElement(_searchSymbolLink);
        log.info("Clicking on search button " + _searchSymbolLink.toString());
    }

    public void clickOnServiceButton() {
        Reporter.log("Clicking on service button " + _servicesButton.toString()+"<br>");
        clickOnElement(_servicesButton);
        log.info("Clicking on service button " + _servicesButton.toString());
    }

    public void clickOnCouncilTaxFeature() {
        Reporter.log("Clicking on council tax button " + _councilTaxButton.toString()+"<br>");
        clickOnElement(_councilTaxButton);
        log.info("Clicking on council tax button " + _councilTaxButton.toString());
    }


}