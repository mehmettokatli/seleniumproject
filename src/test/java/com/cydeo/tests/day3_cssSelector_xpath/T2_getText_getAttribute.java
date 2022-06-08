package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");//utilities paketinden WebDriverFactory
        // classından getDriver() methodunu çağırdık
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com");//bu sayfadaki "Remember me on this computer" kısmının clasını
        // aldık alttaki satır

        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();//bir üst satırdan oluşturduğumuz rememberMeLabel
        // objesini aldı.getText ile çağırdık

        if (actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("label verification Pass");
        }else {
            System.out.println("label verification failed");
        }

        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgotPasswordLinkText = "Forgot your password?";
        String actualForgotPasswordLinkText = forgotPasswordLink.getText();

        if (actualForgotPasswordLinkText.equals(expectedForgotPasswordLinkText)){//equalsIgnore yaparsak pass olur
            System.out.println("fORGOT PASSWORD LİNK verification PASSED");
        }else {
            System.out.println("actualForgotPasswordLinkText = " + actualForgotPasswordLinkText);
            System.out.println("expectedForgotPasswordLinkText = " + expectedForgotPasswordLinkText);
            System.out.println("fORGOT PASSWORD LİNK verification FAİLED!!!");

        }
        String expectedInHref = "forgot_password=yes";
        String actualHrefAttributeValue = forgotPasswordLink.getAttribute("href");//sadece href yazdık

        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);
        //actualHrefAttributeValue.soutv+enter yapınca üstteki satır otomatik çıkar

        if(actualHrefAttributeValue.contains(expectedInHref)){
            System.out.println("href attribute value VERİFİCATİON passed");
        }else {
            System.out.println("href attribute value VERİFİCATİON Failed");
        }







    }
}
