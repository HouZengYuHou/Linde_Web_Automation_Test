package _case;

import _driver.CustomDriver;
import _public.CardFilePublic;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @ Author     ：HouZengYu.
 * @ Date       ：Created in 14:39 2018/12/19
 * @ Class      ：
 */
public class CardFile_Test {
    private WebDriver drivers;
    @DataProvider(name = "cardName")
    public Object[][] cName(){
    return new Object[][]{
            {"刘峰测试03-不要动"},
            {"皇家一号mqy"},
            {"test-3"},
            {"FOTA1"},
            {"皇家三号~mqy"}
            };
    }
    @Test(dataProvider = "cardName")
    public void getCardTest(String cardName) throws Exception{
        drivers = CustomDriver.getDriver();
        CardFilePublic.getCardFile(drivers,cardName);
    }

    @AfterClass
    public void getQuit() {
      //  drivers.quit();
    }
}
