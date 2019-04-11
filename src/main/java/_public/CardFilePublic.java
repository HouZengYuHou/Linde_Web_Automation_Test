package _public;

import _pages.card_info.MotorcadeFile_Add;
import _pages.card_info.MotorcadeFile_Test;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * @ Author     ：HouZengYu.
 * @ Date       ：Created in 14:37 2018/12/19
 * @ Class      ：
 */
public class CardFilePublic {

    //进入车队档案
    public static void getCardFileMananer(WebDriver driver){
        try {
            MotorcadeFile_Test.getCardInfo(driver).click();
            Thread.sleep(10000);
            System.out.println("进入车队档案");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //查询车辆
    public static void getCardFile(WebDriver driver, String cardName) {
        try {

            MotorcadeFile_Test.getCardData(driver).sendKeys(cardName);
            Thread.sleep(3000);
            MotorcadeFile_Test.getCardDtaQuery(driver).click();
            Thread.sleep(3000);
            MotorcadeFile_Test.getRefresh(driver).click();
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //新增车辆
    public static void getAddCardFile(WebDriver driver, String cardName, String bodyName) {
        try {
            MotorcadeFile_Add.getAddBotton(driver).click();
            Thread.sleep(1000);
            MotorcadeFile_Add.getSingleInfo(driver).click();
            Thread.sleep(2000);
            MotorcadeFile_Add.getAddInfoCard(driver);
            MotorcadeFile_Add.getCardInfo(driver, cardName);
            MotorcadeFile_Add.getCardBodyInfo(driver, bodyName);
            MotorcadeFile_Add.getCardBrand(driver);
            MotorcadeFile_Add.getCardModel(driver);
            MotorcadeFile_Add.getCardSubmit(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
