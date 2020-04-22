package uk.gov.harrow.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.gov.harrow.basepage.BasePage;
import uk.gov.harrow.browserselector.BrowserSelector;
import uk.gov.harrow.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;

/**
 * Created by Chaitanya
 */
//test base class extends base page class
public class TestBase extends BasePage {

    //object created for browser selector
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();


    String browser = loadProperty.getProperty("browser");
    String baseUrl = loadProperty.getProperty("baseUrl");


    //before method comes from TestNG to do action before method
    @BeforeMethod(groups = {"sanity", "smoke", "regression"})
    //below code to open chrome browser
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);


    }

    //after method comes from TestNG to do action after class
    @AfterMethod(groups = {"sanity", "smoke"})
    //below code closed browsers
    public void tearDown() {
        driver.quit();
    }

}
