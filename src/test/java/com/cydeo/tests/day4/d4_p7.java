package com.cydeo.tests.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d4_p7 {//güzel örnek
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://search.yahoo.com");

        //arama kutusunu tanımlamak için xpath kullanın ve "xpath" girin

        WebElement searhBox= driver.findElement(By.xpath("//input[@name='p']"));
        Thread.sleep(2000);

        searhBox.sendKeys("xpath");

        //x buttonuna click yapın.
        driver.findElement(By.xpath("//*[@id='sbq-clear']/span")).click();//burda önemli nokta şu, yukarıda
        // , bir defa WebElement searhBox= şeklinde obje tanımladık, aşağıda bir kez daha TANIMLAMAYA GEREK YOK
        //Ayrıca bu yaptığımız satırın alternatifler aşağıda yazdım.
        /*
         driver.findElement(By.xpath("//*[@id='sbq-clear']/span[@class='sprite']")).click();tek slash hali
         driver.findElement(By.xpath("//*[@id='sbq-clear']//span[@class='sprite']")).click(); çift slash lı
         */

        Thread.sleep(3000);
        searhBox.sendKeys("selenium");

        driver.quit();














    }


}
