package _case;

import _driver.CustomDriver;
import _public.CardFilePublic;
import _public.LoginUser;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @ Author     ：HouZengYu.
 * @ Date       ：Created in 14:39 2018/12/19
 * @ Class      ：
 */
public class CardFile_Test {
    private WebDriver drivers;
    private Logger logger;
    private Random ra;
    private String baseUrl;
    private static Properties properties;
    @BeforeClass
    public synchronized void setUp() throws IOException {
        InputStream stream = this.getClass().getClassLoader().getResourceAsStream("env.properties");
        properties = new Properties();
        properties.load(stream);
        String host = properties.getProperty("douban.host");
        System.out.println(host);
        stream.close();
        drivers = CustomDriver.getDriver();
      //  baseUrl ="https://test.smartlink.aidong-ai.com";
        baseUrl=host;
        drivers.navigate().to(baseUrl);
        drivers.manage().window().maximize();
        drivers.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println(drivers.getTitle());
        ra = new Random();
        logger = LogManager.getLogger(CardFile_Test.class.getName());
        LoginUser.login(drivers, "chrome", "123456");
        CardFilePublic.getCardFileMananer(drivers);
    }

    @DataProvider(name = "cardName")
    public Object[][] cName() {
        return new Object[][]{
                {"刘峰测试03-不要动"},
                {"皇家一号mqy"},
                {"皇家三号~mqy"},
                {"侯增宇"},
                {""}
        };
    }

    //查询车辆
    @Test(priority = 0, dataProvider = "cardName")
    public void getCardTest(String cardName) {
        if ("刘峰测试03-不要动".equals(cardName)) {
            CardFilePublic.getCardFile(drivers, cardName);
        } else if ("皇家一号mqy".equals(cardName)) {
            CardFilePublic.getCardFile(drivers, cardName);
        } else if ("皇家三号~mqy".equals(cardName)) {
            CardFilePublic.getCardFile(drivers, cardName);
        } else if ("侯增宇".equals(cardName)) {
            CardFilePublic.getCardFile(drivers, cardName);
        } else if ("".equals(cardName)) {
            CardFilePublic.getCardFile(drivers, cardName);
        } else {
            CardFilePublic.getCardFile(drivers, cardName);
        }
    }

  /*  //新增车辆
    @Test(priority = 1)
    public void getAddCard() throws Exception {
        Thread.sleep(2000);
        CardFilePublic.getAddCardFile(drivers, "自动化" + ra.nextInt(100) + 1, "chetihao" + ra.nextInt(100) + 1);
        logger.info("提交成功");
    }*/

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
