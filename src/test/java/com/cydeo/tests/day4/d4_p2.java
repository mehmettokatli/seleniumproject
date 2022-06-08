package com.cydeo.tests.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d4_p2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //google'a gidin ve başlığı yazdırın
        driver.get("https://google.com");

        driver.manage().window().fullscreen();//bu satırı driver.get ten sonra yazınca fullscreen oluyor

        String title1 = driver.getTitle();
        System.out.println("title = " + title1);


        if (title1.equals("Google")){
            System.out.println("test passed");
        }else {
            System.out.println("test fail");
        }

        WebElement text = driver.findElement(By.className("RNmpXc"));

        String textAttribute = text.getAttribute("value");

        if (textAttribute.equals("Kendimi Şanslı Hissediyorum")){
            System.out.println("textAttribute verification is Passed");
        }else {
            System.out.println("textAttribute verification is Failed");
        }
        Thread.sleep(3000);
        System.out.println("****************************************************");

        //arama kutusu öğesini tanımlayın ve kaydedin

        WebElement searhBoxName = driver.findElement(By.name("q"));

        //"instagram" metnini girin ve arayın
        searhBoxName.sendKeys("instagram" + Keys.ENTER);
        Thread.sleep(3000);
       driver.quit(); //yazılabilir

        System.out.println("-------------------------------------------");




    }
}
