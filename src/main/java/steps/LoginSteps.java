package steps;


import Pages.Home;
import Pages.Login;
import Pages.UserLanding;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;


public class LoginSteps {

    Home homePage=new Home();
    Login loginPage=new Login();
    UserLanding landingPage=new UserLanding();

    public LoginSteps()
    {
        homePage= PageFactory.initElements(DriverManager.driver,Home.class);
        loginPage = PageFactory.initElements(DriverManager.driver,Login.class);
        landingPage = PageFactory.initElements(DriverManager.driver,UserLanding.class);
    }

    public void login(String username, String password) throws InterruptedException
    {
        //WebDriver driver= DriverManager.driver;
        homePage.clickOnLogin();
        loginPage.enteruserName(username);
        loginPage.enterPassword(password);
        loginPage.clickSubmit();

    }

    public String getSuccessText()
    {
        return landingPage.getSuccessLinkText();
    }

    /*public String loginWithUserNamePassword(String username,String password)
    {
        WebDriver driver= DriverManager.driver;
        WebElement lnlLogin=driver.findElement(By.id("link-to-login"));
        lnlLogin.click();
        WebElement txtUsername=driver.findElement(By.id("spree_user_email"));
        WebElement txtPassword=driver.findElement(By.id("spree_user_password"));

        txtUsername.clear();
        txtUsername.sendKeys(username);
        txtPassword.clear();
        txtPassword.sendKeys(password);
        WebElement btnLogin=driver.findElement(c);
        btnLogin.click();

        WebElement myaccountText=driver.findElement(By.linkText(""));

    String actualText=myaccountText.getText();
    return actualText;

    }*/
}
