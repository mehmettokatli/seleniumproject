package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_linkTextPractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//max deyince açılan pencere büyük oluyor.

        driver.get("https://practice.cydeo.com");

        //driver.findElement(By.linkText("A/B Testing")).click();//bu task te, yukarıdaki https adresinden ilk linkin
        // yani AB testing tam yazılışını aldık. web sayfasında sağ tıklayıp <a> tag inin içinden AB testing ibaresini
        // kopyaladık ayrıca .click() ekleyince hedef web sayfasında belirtilen sayfaya direkt gider.

        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();// yukarıdaki driver.findElement(By.linkText("A/B Testing")).click(); komut satırırnın 2.yolu

        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASS");
        }else {
            System.out.println("Title verification FAİLED");
        }

        driver.navigate().back();

        String expectedTitle2 = "Practice";//baştaki String i silebiliriz.expectedTitle bu değere yeni değer atamış
        // oluruz. veya sadece expectedTitle= "Practice"; diyebiliriz
        actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle2)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAİLED");
        }

    }

}
