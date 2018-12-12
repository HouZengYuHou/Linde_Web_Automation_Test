package _pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*车队档案*/
public class MotorcadeFile_Test {
    private static WebElement motorcadeTest;

    public static WebElement getMotorcadeFile(WebDriver driver){
        try {
            motorcadeTest = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/a[2]"));
            motorcadeTest.click();
            Thread.sleep(3000);
            WebElement data_Export_button = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/form/div[5]/div/button"));
            data_Export_button.click();
            Thread.sleep(5000);
            WebElement driver_button = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/ul/li[2]/div"));
            driver_button.click();
            Thread.sleep(3000);
            WebElement driver_All_button = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/ul/li[2]/ul/li"));
            driver_All_button.click();
            Thread.sleep(3000);
            WebElement driver_Data_button = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/form/div[4]/div/button"));
            driver_Data_button.click();
            Thread.sleep(5000);
            //1231
        } catch (Exception e) {
            e.printStackTrace();
        }
        return motorcadeTest;
    }
}
