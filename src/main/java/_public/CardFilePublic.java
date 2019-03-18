package _public;

import _pages.card_info.MotorcadeFile_Add;
import _pages.card_info.MotorcadeFile_Test;
import org.openqa.selenium.WebDriver;

/**
 * @ Author     ：HouZengYu.
 * @ Date       ：Created in 14:37 2018/12/19
 * @ Class      ：
 */
public class CardFilePublic {
    //查询车辆
    public static void getCardFile(WebDriver driver,String cardName) throws Exception{
        MotorcadeFile_Test.getCardInfo(driver).click();
        Thread.sleep(10000);
        MotorcadeFile_Test.getCardData(driver).sendKeys(cardName);
        Thread.sleep(2000);
        MotorcadeFile_Test.getCardDtaQuery(driver).click();
        Thread.sleep(2000);
        MotorcadeFile_Test.getRefresh(driver).click();
    }
    //新增车辆
    public static void getAddCardFile(WebDriver driver,String cardName)throws Exception{
        MotorcadeFile_Add.getAddBotton(driver).click();
        Thread.sleep(2000);
        MotorcadeFile_Add.getSingleInfo(driver).click();
        MotorcadeFile_Add.getAddInfoCard(driver).click();
        MotorcadeFile_Add.getCardInfo(driver,cardName);

    }
}
