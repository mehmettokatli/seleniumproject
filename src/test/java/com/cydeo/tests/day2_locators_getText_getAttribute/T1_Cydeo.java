package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Cydeo {
    public static void main(String[] args) {
        //Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Go to https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");

        //Verify URL contains-URL'yi doğrula
        //Expected: cydeo

        String expectedURL = "cydeo";
        String acyualURL = driver.getCurrentUrl();

        if (acyualURL.contains(expectedURL)){
            System.out.println("URL verification PASSED");
        }else {
            System.out.println("URL verification FAİLED!!!");
        }

        //Verify title: başlığı doğrula
        //Expected: Practice

        String expectedTitle = "Practice";
        String actualTitle =  driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("title verification PASSED");
        }else {
            System.out.println("title verification FAİLED!!!");
        }

        driver.close();



    }
}
