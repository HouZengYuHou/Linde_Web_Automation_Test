package _public;

import _pages.MotorcadeFile_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @ Author     ：HouZengYu.
 * @ Date       ：Created in 14:37 2018/12/19
 * @ Class      ：
 */
public class CardFilePublic {
    public static void getCardFile(WebDriver driver,String cardName) throws Exception{
        MotorcadeFile_Test.getCardInfo(driver).click();
        Thread.sleep(5000);
       // MotorcadeFile_Test.getCardData(driver).clear();
        MotorcadeFile_Test.getCardData(driver).sendKeys(cardName);
        Thread.sleep(5000);
        MotorcadeFile_Test.getCardType(driver).click();
        Thread.sleep(5000);
        /* Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[1]/span"))).perform();
        actions.click().perform();*/
       /* MotorcadeFile_Test.getCardOne(driver).click();
        MotorcadeFile_Test.getCardTwo(driver).click();
        MotorcadeFile_Test.getCardThree(driver).click();*/
        MotorcadeFile_Test.getCardDtaQuery(driver).click();
        Thread.sleep(6000);
        MotorcadeFile_Test.getRefresh(driver).click();
    }
}
