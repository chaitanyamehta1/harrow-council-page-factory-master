package uk.gov.harrow.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.gov.harrow.pages.CouncilTaxPage;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.testbase.TestBase;

/**
 * Created by Chaitanya
 */
//council tax test class extends with test base class
public class CouncilTaxTest extends TestBase {
    //object created
    HomePage homePage;
    CouncilTaxPage councilTaxPage;

    @BeforeMethod(groups = {"smoke","regression","sanity"})
    public void setUp(){
        homePage = new HomePage();
        councilTaxPage = new CouncilTaxPage();

    }

    @Test(groups = {"sanity","smoke"})
    public void verifyUserShouldNavigateToCouncilTaxFeature() {
        //below methods calling from pages package
        homePage.clickOnCouncilTaxFeature();
        //compare expected with actual result
        String expectedResult = "Primary school offers";
        String actualResult = councilTaxPage.getCouncilTaxText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
