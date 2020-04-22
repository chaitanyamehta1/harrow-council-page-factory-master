package uk.gov.harrow.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.gov.harrow.Utility.Utility;


/**
 * Created by Chaitanya
 */
//login page class extends utility class to use utilities property
public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    //locators for element
    @FindBy(xpath = "//h2[contains(text(),'Log in')]")
    WebElement _loginFeatureWelComeText;


    //below return type method to compare expected and actual result
    public String loginWelcomeText() {
        Reporter.log("Getting login welcome message " + _loginFeatureWelComeText.toString() + "<br>");
        log.info("Getting login welcome messgae " + _loginFeatureWelComeText.toString());
        return getTextFromElement(_loginFeatureWelComeText);
    }
}
