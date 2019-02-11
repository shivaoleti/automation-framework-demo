package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class DriverManager {

    public static WebDriver driver;

    public DriverManager(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println(System.getProperty("user.dir") + File.separator + "drivers" + File.separator);
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver");
            driver = new ChromeDriver();
            driver.get("http://10.136.127.143:3000/");
        }
    }
}
