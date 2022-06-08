package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_Library_login {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://library2.cybertekschool.com/login.html");

        WebElement usernameInput = driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("incorrect@email.com");

        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrect password");

        //yukarıdakileri yaptıktan sonraki adım
        //click to sign in button-oturum açmak için tıklayın

        WebElement signInButtom = driver.findElement(By.tagName("button"));
        signInButtom.click();//bu adım önmeli, bu örnekte tagName kullanımı yaptık. açılan sayfadaki sign in buttonuna
        //click yapmak için, önce button satırının tamamını (yani sign in e sağ tıkla, incele de, ordaki button a)
        // almak için (By.tagName("button")); button yazdık. sonrasında signInButtom.click(); diyerek click işlemini
        //yaptık.

        //sonuç: sorry, wrong email or password uyarısını aldık.
















    }
}
