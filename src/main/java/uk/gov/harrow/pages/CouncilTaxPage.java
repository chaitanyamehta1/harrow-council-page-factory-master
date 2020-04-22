package uk.gov.harrow.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.gov.harrow.Utility.Utility;


/**
 * Created by Chaitanya
 */
//council tax page class extends utility class to use properties of utility class
public class CouncilTaxPage extends Utility {

    private static final Logger log = LogManager.getLogger(CouncilTaxPage.class.getName());

    //locators for each elements on home page
   @FindBy(className = "page-heading")
    WebElement _councilTaxText;

    //below return type method to compare expected and actual result
    public String getCouncilTaxText() {
        Reporter.log("Getting council tax message "+ _councilTaxText.toString()+"<br>");
        log.info("Getting council tax message "+ _councilTaxText.toString());
        return getTextFromElement(_councilTaxText);
    }




}
