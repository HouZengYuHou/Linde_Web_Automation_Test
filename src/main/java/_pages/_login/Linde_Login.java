package _pages._login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/*登录页面*/
public class Linde_Login {

    private static WebElement userLogin = null;
    //账号

    public static WebElement login_UserName(WebDriver driver) {
        userLogin = driver.findElement(By.className("el-input__inner"));
        return userLogin;
    }

    //密码
    public static WebElement login_userPassord(WebDriver driver) {
        userLogin = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/form/div[2]/div/div/input"));
        return userLogin;
    }

    //登录按钮
    public static WebElement login_userButton(WebDriver driver) {
        userLogin = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/form/div[3]/div/button"));
        return userLogin;
    }

    //点击个人中心
    public static WebElement userInfo(WebDriver driver) {
        userLogin = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/span"));
        Actions action = new Actions(driver);
        action.clickAndHold(userLogin).perform();
        return userLogin;
    }

    //点击退出登录
    public static WebElement logOutClick(WebDriver driver) throws Exception {
        userLogin=driver.findElement(By.xpath("//*[contains(text(),'退出登录')]"));
        Thread.sleep(1000);
        //driver.switchTo().alert().accept();
        return userLogin;
    }
    //提示框点击确定退出
    public static WebElement logOutHint(WebDriver driver)throws  Exception{
       userLogin= driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[2]"));
        return userLogin;
    }

}
