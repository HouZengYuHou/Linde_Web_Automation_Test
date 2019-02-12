package _public;

import _pages.Linde_Login;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginUser {
    //登录方法
    public static void login(WebDriver driver,String userName,String passWord){
        Linde_Login.login_UserName(driver).clear();
        Linde_Login.login_UserName(driver).sendKeys(userName);
        Linde_Login.login_userPassord(driver).clear();
        Linde_Login.login_userPassord(driver).sendKeys(passWord);
        Linde_Login.login_userButton(driver).click();
    }
   /* public static String getLoginErrorInfo(WebDriver driver){
        String text = Linde_Login.loginErrorInfo(driver).getText();
        return text;
    }*/
    public static void logOutInfo(WebDriver driver)throws Exception{
        Linde_Login.userInfo(driver).click();//个人中心点击事件
        Linde_Login.logOutClick(driver).click();//退出登录
         Linde_Login.logOutHint(driver).click();//提示框
    }
}
