package searchtests;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import steps.LoginSteps;
import steps.SearchSteps;
import utils.DriverManager;

public class Search {
    SearchSteps searchSteps= new SearchSteps();

    @BeforeSuite
    @Parameters("browser")
    public void  launch(String browser)
    {
        new DriverManager(browser);
    }

    @Test
    public void search()
    {

        int count= searchSteps.searchItembytype("Bag");
        System.out.println("text:"+count);
        Assert.assertEquals(2,count);

    }

    @AfterSuite
    public void tearDown()
    {
        DriverManager.driver.quit();
    }
}
