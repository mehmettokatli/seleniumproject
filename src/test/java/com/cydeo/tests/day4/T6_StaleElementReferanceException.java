package com.cydeo.tests.day4;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6_StaleElementReferanceException {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Aşağıdaki implicitlyWait methoduna dikkat
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");

        //CYDEO bağlantısını bulun, görüntülendiğini doğrulayın
        //ilk önce run, sonra açılan sayfadan CYDEO yazısına sağ tıkla+incele,ctrl+f //a[text()='CYDEO'] yaz, anlamı şu
        //a tag i içinde value si CYDEO olan elementi getir./doğrula
        WebElement cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());//bu şekilde CYDEO bağlantısının,
        // görüntülendiğini doğruluyoruz. SONUÇ: cydeoLink.isDisplayed() = true oldu.

        //sayfayı yenileyin.aşağıdaki koda dikkat
        driver.navigate().refresh();
        //tekrar verify i görüntüleyin
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());//bu durumda hata verir.
        /*
        bu durumda tekrar WebElement cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']")); atayabiliriz

        WebElement cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed()); YAPABİLİRİZ
         */


    }

}
