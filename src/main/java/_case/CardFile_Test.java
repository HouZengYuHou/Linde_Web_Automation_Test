package _case;

import _driver.CustomDriver;
import _public.CardFilePublic;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import java.util.Random;

/**
 * @ Author     ：HouZengYu.
 * @ Date       ：Created in 14:39 2018/12/19
 * @ Class      ：
 */
public class CardFile_Test {
    private WebDriver drivers;
    private Logger logger;
    private Random ra;

    @BeforeClass
    public synchronized void setUp() {
        ra = new Random();
        drivers = CustomDriver.getDriver();
        logger = LogManager.getLogger(CardFile_Test.class.getName());
        //  LoginUser.login(drivers, "chrome", "123456");
    }

    @DataProvider(name = "cardName")
    public Object[][] cName() {
        return new Object[][]{
                {"刘峰测试03-不要动"},
                {"皇家一号mqy"},
                {"皇家三号~mqy"},
                {"超出限制超出限制超出限制超出限制超出限制超出限制"},
                {""}
        };
    }

    //查询车辆
    @Test(priority = 0, dataProvider = "cardName")
    public void getCardTest(String cardName) {
        switch (cardName) {
            case "":
                CardFilePublic.getCardFile(drivers, cardName);
                logger.info("查询为空");
            case "超出限制超出限制超出限制超出限制超出限制超出限制":
                CardFilePublic.getCardFile(drivers, cardName);
                logger.info("暂无数据");
            case "皇家三号~mqy":
                CardFilePublic.getCardFile(drivers, cardName);
                logger.info("正常搜索");
            case "皇家一号mqy":
                CardFilePublic.getCardFile(drivers, cardName);
                logger.info("正常搜索");
            case "刘峰测试03-不要动":
                CardFilePublic.getCardFile(drivers, cardName);
                logger.info("正常搜索");
                break;
        }

    }

    //新增车辆
    @Test(priority = 1)
    public void getAddCard() throws Exception {
        Thread.sleep(2000);
        CardFilePublic.getAddCardFile(drivers, "自动化" + ra.nextInt(100) + 1, "chetihao" + ra.nextInt(100) + 1);
        logger.info("提交成功");
    }

    //修改车辆
    public void getUpdateCard() {

    }

    //删除车辆
    public void getDeleteCard() {

    }

    @AfterClass
    public void getQuit() {
        //  drivers.quit();
    }
}
