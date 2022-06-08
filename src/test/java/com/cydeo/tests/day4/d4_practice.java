package com.cydeo.tests.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class d4_practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.com");

        //driver.get("https://www.google.com");
        Thread.sleep(3000);

        driver.navigate().back();

        Thread.sleep(3000);//bunlar optinal yani ben koydum


        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();






    }
}
