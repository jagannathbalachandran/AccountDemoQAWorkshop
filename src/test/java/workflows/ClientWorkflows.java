package workflows;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

/**
 * Created by jbalacha on 15/10/15.
 */
public class ClientWorkflows {

    WebDriver driver ;

    public void editClient(WebDriver driver){

        this.driver = driver;
        LoginPage loginPage = new LoginPage(driver);
    }
}
