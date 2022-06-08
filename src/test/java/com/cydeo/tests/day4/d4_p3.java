package com.cydeo.tests.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d4_p3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.oguzkimya.com");

        //"Çevrimiçi doğruluk kontrolü için yararlı ipuçları" öğesini tanımlayın ve kaydedin
        //identify and save the "helpful tips to fact check information online" element

        /*
        benim google sayfamda yukarıdaki metin olmadığı için şöyle yapacağım, kendi web sayfama gidip orda bir metin
        bulup, o metne sağ tıklayıp, class ismini alıp kullanacağım
         */

        WebElement text = driver.findElement(By.className("title"));

        if (text.getText().equals("HİZMETLERİMİZ")){
            System.out.println("text appear correctly!!! yani metin doğru görünüyor");
        }else{
            System.out.println("text does not appear correctly! yani metin doğru görünmüyor");
        }

        WebElement hTag = driver.findElement(By.tagName("h2"));

        System.out.println(hTag.getText());


        WebElement iletisimLink = driver.findElement(By.linkText("İletişim"));

        //CLİCK ON THE LİNK
        iletisimLink.click();

        Thread.sleep(3000);

        //WebElement

       // driver.quit();

    }

}
