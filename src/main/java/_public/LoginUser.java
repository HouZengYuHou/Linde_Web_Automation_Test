package _public;

import _pages.Linde_Login;
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
    public static String getLoginErrorInfo(WebDriver driver){
        String text = Linde_Login.loginErrorInfo(driver).getText();
        return text;
    }
   /* public static WebElement login(WebDriver driver){
        try {
            String username="chrome";
            String userpassword="123456";
            //Linde_Login.login_UserName(driver).clear();
            Linde_Login.login_UserName(driver).sendKeys(username);
            Thread.sleep(2000);
            // Linde_Login.login_userPassord(driver).clear();
            Linde_Login.login_userPassord(driver).sendKeys(userpassword);
            Thread.sleep(2000);
            Linde_Login.login_userButton(driver).click();
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userLogin;
    }*/
}
