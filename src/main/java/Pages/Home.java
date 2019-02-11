package Pages;

import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;

public class Home {

    @FindBy(id="link-to-login")
    WebElement loginLink;


    public void clickOnLogin() throws InterruptedException
    {

        this.loginLink.click();
    }
}
