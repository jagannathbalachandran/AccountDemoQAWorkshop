package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;
import pages.LoginPage;
import util.PropertyReader;

import java.util.concurrent.TimeUnit;

public class BaseTestCaseUsingPOStep5 {

    WebDriver driver;
    PropertyReader propertyReader;
    LoginPage loginPage;
    HomePage homePage;


    @Before
    public void setUp(){

        propertyReader = new PropertyReader();
        driver = getAppropriateDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        loginPage = new LoginPage(driver);
        loginPage.navigateToLoginPage(propertyReader.readProperty("url"));
        homePage = loginPage.login(propertyReader.readProperty("username") ,propertyReader.readProperty("password"));

    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }

    protected WebDriver getAppropriateDriver()  {
        String browser = propertyReader.readProperty("browser");
        if(browser.equalsIgnoreCase("chrome")) return new ChromeDriver();
        if(browser.equalsIgnoreCase("firefox")) return new FirefoxDriver();
        return new FirefoxDriver();
    }




}
