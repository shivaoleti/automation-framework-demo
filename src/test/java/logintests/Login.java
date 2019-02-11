package logintests;

import org.testng.Assert;
import org.testng.annotations.Test;
import steps.LoginSteps;
import suite.SuiteManager;

public class Login extends SuiteManager {

    LoginSteps  loginSteps;



    @Test (groups = { "Sanity"} )
    public void login() throws InterruptedException
    {
         loginSteps = new LoginSteps();
//
        loginSteps.login("amr@gmail.com","geetha@18");
       System.out.println("text:");
        Assert.assertEquals("Invalid email or password.",loginSteps.getSuccessText());
    }

    @Test(groups={"Regression"},priority=1)
    public void loginWithFailure() throws InterruptedException
    {
        loginSteps = new LoginSteps();
//       new DriverManager();
        loginSteps.login("amr1@gmail1.com","geetha@18");
        Assert.assertEquals("Invalid email or password.","Invalid email or password.");
    }

    public static class LoginTestWithDataProvider extends SuiteManager {




    }
}
