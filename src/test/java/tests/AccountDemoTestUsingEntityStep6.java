package tests;

import entities.ClientDetails;
import entities.QuotationDetails;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.ClientPage;
import workflows.ClientWorkflows;

public class AccountDemoTestUsingEntityStep6 extends BaseTestCaseUsingPOStep5 {


    @Test
    public void testEditAccount() {
        ClientPage clientPage = homePage.selectClient("tcs");
        ClientDetails details = new ClientDetails("Jaggu" , "Mantri Woodlands , near Arakere gate");
        clientPage.editClientDetails(details);
    }

    @Test
    public void testAddQuotationForClient() {

        ClientPage clientPage = homePage.selectClient("tcs");
        QuotationDetails qDetails = new QuotationDetails("Mr.Raju" , "Nasscom Product Conclave");
        clientPage.addQuotation(qDetails);
    }


}
