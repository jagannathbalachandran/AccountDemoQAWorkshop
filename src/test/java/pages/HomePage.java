package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by jbalacha on 15/10/15.
 */
public class HomePage {

        private WebDriver webDriver;

        @FindBy(linkText = "CLIENTS")
        private WebElement Clients_link;

        @FindBy(id = "search")
        private WebElement search_textbox;

        @FindBy(className = "searchBtn")
        private WebElement search_button;

        @FindBy(linkText = "Select Client")
        private WebElement select_client_link;



        public HomePage(WebDriver webDriver) {
            this.webDriver = webDriver;
            PageFactory.initElements(webDriver, this);
        }

    public ClientPage selectClient(String client) {
        Clients_link.click();
        search_textbox.sendKeys(client);
        search_button.click();
        select_client_link.click();
        return new ClientPage(webDriver);
    }

}
