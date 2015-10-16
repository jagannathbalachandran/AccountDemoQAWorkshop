package workflows;

import entities.ClientDetails;
import entities.QuotationDetails;
import org.openqa.selenium.WebDriver;
import pages.ClientPage;
import pages.HomePage;
import pages.LoginPage;

/**
 * Created by jbalacha on 15/10/15.
 */
public class ClientWorkflows {

    WebDriver driver ;
    HomePage homePage;

    public ClientWorkflows(WebDriver driver) {
        this.driver = driver;
        homePage = new HomePage(driver);
    }

    public void editClient(String clientName, ClientDetails newClientDetails){
        ClientPage clientPage = homePage.selectClient(clientName);
        clientPage.editClientDetails(newClientDetails);
    }

    public void AddQuotation(String clientName, QuotationDetails quotationDetails) {
        ClientPage clientPage = homePage.selectClient(clientName);
        clientPage.addQuotation(quotationDetails);
    }
}
