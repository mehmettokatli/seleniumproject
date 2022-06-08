package com.cydeo.tests.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class d4_p6 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://mt-tasarim10.web.app/urunler.html");

        /* bu aradaki kodları By Name konusunda kullandım
        driver.get("https:google.com");
        WebElement serachBox = driver.findElement(By.name("q"));//web sayfasının kod bölümündeki name i q olan element
        serachBox.sendKeys("instagram");
        //serachBox.submit();

        System.out.println("serachBox.getAttribute(\"value\") = " + serachBox.getAttribute("value"));
        //sonuç: instagram

        System.out.println("serachBox.getTagName() = " + serachBox.getTagName());//sonuç: input

         */

        /*
        WebElement link1 = driver.findElement(By.tagName("a"));
        System.out.println("link1.getText() = " + link1.getText());

        //findElements method return List<WebElement> döndürür

        List<WebElement> link2 =  driver.findElements(By.tagName("a"));
        System.out.println("link2.size() = " + link2.size());// .size() ile kaç satır link yani a tag i olduğunu verir.


        for (WebElement eachLink : link2) {
            System.out.println("Link text is " + eachLink.getText());
        }//bu for each döngüsü de o linklerin isimlerini yazdırır.


         */




    }
}
