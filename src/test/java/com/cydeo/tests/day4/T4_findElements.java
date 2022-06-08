package com.cydeo.tests.day4;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElements {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Aşağıdaki implicitlyWait methoduna dikkat
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");


        //driver.findElements(By.tagName("a")); bunu yazdık sonra, solda çıkan sarı lambaya tıklayıp üstteki linke
        // tıklayınca otomatik olarak  List<WebElement> çıkıyor, sonra değişken ismi verdik, yani allLinks dedik.
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));//alt satıra bak. 2.yol
        // ikinci yol driver.findElements(By.tagName("a")); yazıp alt+enter+enter deyince de otomatik çıkıyor.

        System.out.println("allLinks.size() = " + allLinks.size());//allLinks.size().soutv+enter yaptık

        //bağlantıların href attribute nin value lerini yazdırın.yani açılan web sayfasındaki linklerin, yani <a>
        // taglerinin href valuelerini, o da şu ki sayfada 2 tane link yani <a> tagi var, home ve CYDEO olarak.
        //iter+enter yaptık aşağıdakİ FOR EACH LOOP ÇIKTI
        for (WebElement each : allLinks) {
            System.out.println("text of link: " +each.getText());
            //sonuç: text of link: Home
            //       text of link: CYDEO olur.
            System.out.println("HREF Values: " + each.getAttribute("href"));//getAttribute içine attribute name'ni
            // yazdık. yani href i.

        }

        /*
        körsırın üstünde olduğu satır ctrl+shift+yukarı aşağı ok tuşları veya alt+shift+yukarı aşağı ok tuşları ile
        aşağı yukarı hızlıca kaydırılabiliyor.
         */







    }
}
