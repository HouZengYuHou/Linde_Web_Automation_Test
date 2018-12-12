package _pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/*登录页面*/
public class Linde_Login {

    private static WebElement userLogin=null;
    //账号

    public static WebElement login_UserName(WebDriver driver){
        userLogin = driver.findElement(By.className("el-input__inner"));
        return userLogin;
    }
    //密码
    public static WebElement login_userPassord(WebDriver driver){
        userLogin = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/form/div[2]/div/div/input"));
        return userLogin;
    }
    //登录按钮
    public static WebElement login_userButton(WebDriver driver){
        userLogin=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/form/div[3]/div/button"));
        return userLogin;
    }
   /* //退出用户
    public static WebDriver userLogOut(WebDriver driver){
        Actions actions=new Actions(driver);
        actions.dragAndDrop()
        driver.
        return null;
    }*/
    //用户退出
    public static WebElement user_Quit(WebDriver driver){
        return userLogin;
    }
    //获取错误信息
    public static WebElement loginErrorInfo(WebDriver driver){
        userLogin=driver.findElement(By.xpath("el-message__content"));
        return userLogin;
    }
 /*   public static  WebElement getLogin(WebDriver driver){
        try {
            button = driver.findElement(By.className("el-input__inner"));
            button.click();
            button.sendKeys("chrome");
            Thread.sleep(2000);
            WebElement input1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/form/div[2]/div/div/input"));
            input1.click();
            input1.sendKeys("123456");
            Thread.sleep(3000);
            WebElement login=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/form/div[3]/div/button"));
            login.click();
            File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile,new File("d:\\Web截图\\screenshot.png"));
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return button;
    }*/
}
