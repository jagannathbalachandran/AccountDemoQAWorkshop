package pages;

import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;
import entities.ClientDetails;
import entities.QuotationDetails;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by jbalacha on 15/10/15.
 */
public class ClientPage {

        private WebDriver webDriver;

        @FindBy(linkText = "Edit Client Details")
        private WebElement edit_clients_details_link;

        @FindBy(id = "client_contact_person_name")
        private WebElement client_contact_textbox;

        @FindBy(id = "client_address")
        private WebElement client_address_textbox;

        @FindBy(name = "commit")
        private WebElement update_button;

        @FindBy(linkText = "Quotations")
        private WebElement quotations_link;

    @FindBy(partialLinkText = "Add New Quotation")
    private WebElement add_new_quotation_link;

    @FindBy(id = "quotation_order_placed_by")
    private WebElement quotation_order_placed_by_textbox;

    @FindBy(id = "quotation_event_name")
    private WebElement quotation_event_name_textbox;

    @FindBy(id = "quotation_event_date")
    private WebElement quotation_event_date_calendar;


        public ClientPage(WebDriver webDriver) {
            this.webDriver = webDriver;
            PageFactory.initElements(webDriver, this);
        }

    public void editClientDetails(ClientDetails details) {
        edit_clients_details_link.click();
        client_contact_textbox.clear();
        client_contact_textbox.sendKeys(details.getContact());
        client_address_textbox.clear();
        client_address_textbox.sendKeys(details.getAddress());
        update_button.click();
    }

    public void editClientDetails(String contact , String address) {
        edit_clients_details_link.click();
        client_contact_textbox.clear();
        client_contact_textbox.sendKeys(contact);
        client_address_textbox.clear();
        client_address_textbox.sendKeys(address);
        update_button.click();
    }

    public void addQuotation(String client_contact , String address) {
        quotations_link.click();
        add_new_quotation_link.click();
        quotation_order_placed_by_textbox.clear();
        quotation_order_placed_by_textbox.sendKeys(client_contact);
        quotation_event_name_textbox.clear();
        quotation_event_name_textbox.sendKeys(address);
        quotation_event_date_calendar.sendKeys("21-10-2015");
        update_button.click();
        Alert alert = new WebDriverWait(webDriver, 10).until(ExpectedConditions.alertIsPresent());
        webDriver.switchTo().alert().accept();
    }


    public void addQuotation(QuotationDetails qDetails) {
        quotations_link.click();
        add_new_quotation_link.click();
        quotation_order_placed_by_textbox.clear();
        quotation_order_placed_by_textbox.sendKeys(qDetails.getContact());
        quotation_event_name_textbox.clear();
        quotation_event_name_textbox.sendKeys(qDetails.getAddress());
        quotation_event_date_calendar.sendKeys("21-10-2015");
        update_button.click();
        Alert alert = new WebDriverWait(webDriver, 10).until(ExpectedConditions.alertIsPresent());
        webDriver.switchTo().alert().accept();

    }
}
