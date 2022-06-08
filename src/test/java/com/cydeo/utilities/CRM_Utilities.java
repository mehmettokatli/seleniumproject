package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {
    //bu yöntem çağrıldığında helpdesk1@cybertekschool.com kullanıcısı ile giriş yapacaktır.

    public static void crm_login(WebDriver driver) {

        //geçerli kullanıcı adı girin
        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys("helpdesk1@cybertekschool.com");

        //geçerli PASSWORD girin
        WebElement inputPassword= driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        //giriş yapmak için tıklayın
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

    }
    public static void crm_login(WebDriver driver, String username, String password) {

        //geçerli kullanıcı adı girin
        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys(username);//methodun parametresine String username bunu ekleyince burdaki sendKeys içine
        // username ekledik

        //geçerli PASSWORD girin
        WebElement inputPassword= driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(password);//methodun parametresine String password bunu ekleyince burdaki sendKeys içine
        // password ekledik

        //giriş yapmak için tıklayın
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

    }

}
