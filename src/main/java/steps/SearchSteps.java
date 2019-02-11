package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverManager;

import java.util.List;

public class SearchSteps {

    public int searchItembytype(String itemtype) {
        WebDriver driver = DriverManager.driver;
        WebElement txtsearchitem = driver.findElement(By.id("keywords"));
        txtsearchitem.click();
        txtsearchitem.clear();
        txtsearchitem.sendKeys(itemtype);
        WebElement btnSearch = driver.findElement(By.xpath("//input[@type='submit']"));
        btnSearch.click();
        List<WebElement> items = driver.findElements(By.cssSelector("div.product-image"));
        int count = items.size();
        return count;
    }

}


