package uk.gov.harrow.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Chaitanya
 */
public class BasePage {
    //declared web driver below in base page class
    public static WebDriver driver;

    public BasePage(){
        PageFactory.initElements(driver,this);
        PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/test/java/uk/gov/harrow/resources/propertiesfile/log4j.properties");

    }
}
