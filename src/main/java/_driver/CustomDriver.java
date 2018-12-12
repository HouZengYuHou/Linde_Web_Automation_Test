package _driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomDriver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome._driver", ".\\tools\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }


    public static void quit(){
        driver.quit();
        driver=null;
    }
}
