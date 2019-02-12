package _case;

import _driver.CustomDriver;
import _public.LoginUser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import util.ExtentTestNGITestListener;

import java.util.concurrent.TimeUnit;
public class Linde_Test {
    private WebDriver drivers;
    private String baseUrl;

    @BeforeClass
    public synchronized void setUp() {
        drivers = CustomDriver.getDriver();
        baseUrl="https://test.smartlink.aidong-ai.com";
        drivers.manage().window().maximize();
        drivers.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println(drivers.getTitle());
    }

    @DataProvider(name = "user")
    public Object[][] userCase() {
        return new Object[][]{
                {"chrome",""},
                {"","123456"},
                {"","",},
                {"chrome","111222"},
                {"chrome","123456"},
        };
    }
    @Test(dataProvider = "user")
    public void testCase_1(String userName,String passWord) throws Exception {
        drivers.navigate().to(baseUrl);
        Thread.sleep(1000);
        if(userName.equals("chrome")&&passWord.equals("")){
            ExtentTestNGITestListener.ExtenTestlog("请输入密码");
        }else if(userName.equals("")&&passWord.equals("123456")){
            ExtentTestNGITestListener.ExtenTestlog("请输入账号");
        }else if(userName.equals("")&&passWord.equals("")){
            ExtentTestNGITestListener.ExtenTestlog("请输入账号");
        }else if(userName.equals("chrome")&&passWord.equals("111222")){
            ExtentTestNGITestListener.ExtenTestlog("账号密码错误");
        }else if(userName.equals("chrome")&&passWord.equals("123456")){
            ExtentTestNGITestListener.ExtenTestlog("登录成功");
        }
        LoginUser.login(drivers, userName, passWord);
        Thread.sleep(3000);
    }
    @AfterClass
    public void testLogOurInfo()throws Exception{
        LoginUser.logOutInfo(drivers);
    }
}
