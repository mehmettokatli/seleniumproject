package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearh {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        //task:write "apple" in search box

        WebElement googleSearchBox = driver.findElement(By.name("q"));//google.com gir sağ tıkla incele, arama
        // kutusunun name'inde q yazıyor.

        //googleSearchBox.sendKeys("apple");ilk önce bu satırı yazdık sonra +Keys.ENTER ekledik

        googleSearchBox.sendKeys("apple"+ Keys.ENTER);//bu komuttan sonra ilk önce google da apple arattı
        // sonra o adrese gitti

        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification PASSed");
        }else {
            System.out.println("Title verification FAİLED");
        }






    }
}
