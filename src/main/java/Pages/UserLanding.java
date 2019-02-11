package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLanding {

    @FindBy(xpath="//div[@class='flash error']")
    WebElement failureText;

    @FindBy(xpath="//div[@class='flash notice']")
    WebElement successText;



    public String getFailureLinkText()
    {
        return  failureText.getText();
    }

    public String getSuccessLinkText()
    {
        return  successText.getText();
    }
}
