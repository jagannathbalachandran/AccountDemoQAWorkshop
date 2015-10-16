package tests;

import entities.ClientDetails;
import entities.QuotationDetails;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import pages.ClientPage;
import pages.LoginPage;
import util.PropertyReader;
import workflows.ClientWorkflows;

import java.util.concurrent.TimeUnit;

public class AccountDemoTestUsingWorkFlowsStep7 extends BaseTestCaseUsingPOStep5 {

    ClientWorkflows clientWorkflows ;

    @Before
    public void setUp(){
        super.setUp();
        clientWorkflows = new ClientWorkflows(driver);
    }


    @Test
    @Category(Smoke.class)
    public void testEditAccount() {
        ClientPage clientPage = homePage.selectClient("tcs");
        ClientDetails details = new ClientDetails("Jaggu" , "Mantri Woodlands , near Arakere gate");
        clientPage.editClientDetails(details);
    }

    @Test
    @Category(Smoke.class)
    public void testAddQuotationForClient() {

        ClientPage clientPage = homePage.selectClient("tcs");
        QuotationDetails qDetails = new QuotationDetails("Mr.Raju" , "Nasscom Product Conclave");
        clientPage.addQuotation(qDetails);
    }

    @Test
    @Category(Smoke.class)
    public void UpdateClientAndAddQuotation() {

        String clientName = "tcs";

        ClientDetails clientDetails = new ClientDetails("Jaggu" , "Mantri Woodlands , near Arakere gate");
        clientWorkflows.editClient(clientName,clientDetails);

        QuotationDetails quotationDetails = new QuotationDetails("Mr.Raju" , "Nasscom Product Conclave");
        clientWorkflows.AddQuotation(clientName, quotationDetails);
    }

}