package logintests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import steps.LoginSteps;
import suite.SuiteManager;
import utils.DriverManager;

public class LoginTestsWithDataProvider extends SuiteManager {
    LoginSteps loginSteps;
    @DataProvider(name="login")
    public static Object[][] loginData()
    {
        return new Object[][]{{"amr@gmail.com","geetha@18"},{"abc@tr.com","xtxt"}};
    }

    @Test(dataProvider = "login")
    public void verifyValidlogin(String username, String password) throws InterruptedException
    {
        loginSteps = new LoginSteps();
//
        loginSteps.login(username,password);

    }
}
