package tests;

import org.junit.Test;
import pages.ClientPage;

public class AccountDemoTestUsingPOStep5 extends BaseTestCaseUsingPOStep5 {


    @Test
    public void testEditAccount() {

        ClientPage clientPage = clientsHomePage.selectClient("tcs");
        clientPage.editClientDetails("Jaggu" , "Mantri Woodlands , near Arakere gate");
    }

    @Test
    public void testAddQuotationForClient() {

        ClientPage clientPage = clientsHomePage.selectClient("tcs");
        clientPage.addQuotation("Mr.Raju" , "Nasscom Product Conclave");
    }


}
