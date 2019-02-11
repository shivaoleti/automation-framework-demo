package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

    @FindBy(id="spree_user_email")
    WebElement userName;

    @FindBy(id="spree_user_password")
    WebElement password;

    @FindBy(name="commit")
    WebElement submit;

    public void enteruserName(String username){
        this.userName.sendKeys(username);
    }

    public void enterPassword(String password){
        this.password.sendKeys(password);
    }

    public void clickSubmit(){
        this.submit.click();
    }


}
