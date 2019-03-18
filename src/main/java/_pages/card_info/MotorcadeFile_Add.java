package _pages.card_info;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @ Author     ：HouZengYu.
 * @ Date       ：Created in 18:22 2019/3/18
 * @ Class      ：新增车辆
 */
public class MotorcadeFile_Add {
    private static WebElement motorcadeTest;

    //新增按钮
    public static WebElement getAddBotton(WebDriver driver) {
        motorcadeTest = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/form/div[6]/div/div/button"));
        return motorcadeTest;
    }

    //单个录入
    public static WebElement getSingleInfo(WebDriver driver) {
        motorcadeTest = driver.findElement(By.xpath("//*[contains(text(),'单个')]"));
        return motorcadeTest;
    }

    //所属机构
    public static WebElement getAddInfoCard(WebDriver driver) throws Exception {
        motorcadeTest = driver.findElement(By.xpath("//*[@id=\"pane-baseInfo\"]/form/div[1]/div/span/div/input"));
        Thread.sleep(2000);
        motorcadeTest = driver.findElement(By.xpath("//*[contains(text(),'aidong')]"));
        return motorcadeTest;
    }
    //车牌号
    public static WebElement getCardInfo(WebDriver driver,String cardName)throws Exception{
        motorcadeTest = driver.findElement(By.xpath("//*[@id=\"pane-baseInfo\"]/form/div[2]/div/div[1]/input"));
        Thread.sleep(2000);
        return  motorcadeTest;
    }
    //车体号
    public static WebElement getCardBodyInfo(WebDriver driver)throws Exception{
        motorcadeTest = driver.findElement(By.xpath("//*[@id=\"pane-baseInfo\"]/form/div[4]/div/div/div/input"));
        Thread.sleep(2000);
        return motorcadeTest;
    }
    //型号
    public static WebElement getCardModel(WebDriver driver)throws Exception{
        motorcadeTest = driver.findElement(By.xpath("//*[@id=\"pane-baseInfo\"]/form/div[5]/div/div/div/input"));
        motorcadeTest = driver.findElement(By.xpath("//*[contains(text(),'L12')]"));
        Thread.sleep(2000);
        return motorcadeTest;
    }
    //类型
    public static WebElement getCardType(WebDriver driver)throws Exception{
        motorcadeTest = driver.findElement(By.xpath("//*[@id=\"pane-baseInfo\"]/form/div[6]/div/div/div/input"));
        motorcadeTest = driver.findElement(By.xpath("//*[contains(text(),'平衡重叉车')]"));
        Thread.sleep(2000);
        return motorcadeTest;
    }
}
