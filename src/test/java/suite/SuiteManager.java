package suite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import utils.DriverManager;

public class SuiteManager {


    @BeforeSuite(alwaysRun = true)
    @Parameters("browser")
    public void intilizeBrowser(String browser)
    {

        new DriverManager(browser);
    }
    @AfterSuite(alwaysRun = true)
    @Parameters("browser")
        public void closeBrowser(String browser) {
       DriverManager.driver.quit();
    }
}
