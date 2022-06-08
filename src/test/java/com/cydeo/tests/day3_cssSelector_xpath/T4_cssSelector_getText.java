package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //sınıf attributunu ve value sini kullanarak parolayı sıfırla düğmesini bulma
       //                                                                   tagName[attribute='value']
        //WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));

       // VALUE attributunu ve value sini kullanarak parolayı sıfırla düğmesini bulma
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));

        String expectedResetPasswordButtonText = "Reset password";
        String actualResetPasswordButtonText =resetPasswordButton.getText();
        if (actualResetPasswordButtonText.equals(expectedResetPasswordButtonText)){
            System.out.println("Button text verification Passed");
        }else {
            System.out.println("Button text verification FAİLED");
        }








    }
}
