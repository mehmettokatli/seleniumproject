package com.cydeo.tests.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class d4_p5 {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://mt-tasarim10.web.app/");


        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        //sonuç:driver.getCurrentUrl() = https://mt-tasarim10.web.app/ olur.

        String pageTitle = driver.getTitle();
        System.out.println("pageTitle = " + pageTitle);

        //aşağıdaki kod: html'nin sayfa kaynağını alır. tüm kodları getirir. önemli
       //System.out.println("driver.getPageSource() = " + driver.getPageSource());




    }
}
