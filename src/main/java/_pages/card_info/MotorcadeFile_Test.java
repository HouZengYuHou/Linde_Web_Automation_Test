package _pages.card_info;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.TableUtil;

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


}
