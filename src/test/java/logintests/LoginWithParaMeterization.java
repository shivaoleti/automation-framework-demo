package logintests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import steps.LoginSteps;
import suite.SuiteManager;

public class LoginWithParaMeterization extends SuiteManager {

    LoginSteps loginSteps;



    @Test(groups = { "Sanity"} )
    @Parameters({"username","password"})
    public void login(String username,String password) throws InterruptedException
    {
        loginSteps = new LoginSteps();
//
        loginSteps.login(username,password);
        System.out.println("text:");
        Assert.assertEquals("Invalid email or password.","Invalid email or password.");
    }
}
