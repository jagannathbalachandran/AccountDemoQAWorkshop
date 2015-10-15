package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import pages.ClientPage;

public class AccountDemoTestUsingPOStep5 extends BaseTestCaseUsingPOStep5 {


    @Test
    public void testEditAccount() {

        ClientPage clientPage = homePage.selectClient("tcs");
        clientPage.editClientDetails("Jaggu" , "Mantri Woodlands , near Arakere gate");
    }

    @Test
    public void testAddQuotationForClient() {

        ClientPage clientPage = homePage.selectClient("tcs");
        clientPage.addQuotation("Mr.Raju" , "Nasscom Product Conclave");
    }


}
