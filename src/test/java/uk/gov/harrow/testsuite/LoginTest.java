package uk.gov.harrow.testsuite;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.pages.LoginPage;
import uk.gov.harrow.testbase.TestBase;

/**
 * Created by Chaitanya
 */
//login test class extends with test base class
public class LoginTest extends TestBase {
    //object created
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(groups = {"sanity", "smoke", "regression"})
    public void setUp() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }


    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNotNavigateToLoginPage() {
        //below methods calling from pages package
        homePage.clickOnLoginLink();

        //compare expected with actual result
        String expectedResult = "Log in";
        String actualResult = loginPage.loginWelcomeText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
