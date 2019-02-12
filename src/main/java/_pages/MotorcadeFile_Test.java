package _pages;

import com.sun.org.apache.regexp.internal.RE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

/*车队档案*/
public class MotorcadeFile_Test {
    private static WebElement motorcadeTest;

    //切换到车队档案
    public static WebElement getCardInfo(WebDriver driver) {
        motorcadeTest = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/a[2]"));
        return motorcadeTest;
    }

    //搜索车队数据
    public static WebElement getCardData(WebDriver driver) {
        motorcadeTest = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/form/div[1]/div/div/input"));
        return motorcadeTest;
    }

    //查询按钮
    public static WebElement getCardDtaQuery(WebDriver driver) {
        motorcadeTest = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/form/div[3]/div/button"));
        return motorcadeTest;
    }

    //刷新按钮
    public static WebElement getRefresh(WebDriver driver) {
        motorcadeTest = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/form/div[4]/div/button"));
        return motorcadeTest;
    }
    //车辆类型
    public static WebElement getCardType(WebDriver driver){
       // motorcadeTest=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/form/div[2]/div/div/div[2]/input"));
        Select dropList = new Select(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/form/div[2]/div/div/div[2]/input")));
        dropList.selectByVisibleText("平衡重电车");

       /* Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[1]/span"))).perform();
        actions.click(By.xpath("\"/html/body/div[3]/div[1]/div[1]/ul/li[1]/span\"").perform();*/
        return motorcadeTest;
    }
    /*//平衡重点车
    public static WebElement getCardOne(WebDriver driver) {
        motorcadeTest = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[1]"));
        return  motorcadeTest;
    }
    //内燃叉车
    public static WebElement getCardTwo(WebDriver driver){
        motorcadeTest=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[2]"));
        return motorcadeTest;
    }
    public static WebElement getCardThree(WebDriver driver){
        motorcadeTest=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[3]"));
        return motorcadeTest;
    }*/
    //仓储车
    /*  //切换到车队管理
    public static WebElement getCardManage(WebDriver driver) {
        motorcadeTest = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/form/div[5]/div/button"));
        motorcadeTest = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/ul/li[2]/ul/li"));
        return motorcadeTest;
    }*/

   /* public static WebElement getMotorcadeFile(WebDriver driver) {
        try {

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
    }*/
}
