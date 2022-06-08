package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {
    public static void main(String[] args) {
        //1-web sürücüsü yöneticisini ayarlama
        WebDriverManager.chromedriver().setup();

        //2-crome sürücüsünün örneğini oluştur
        WebDriver driver = new ChromeDriver();

        //3-sürücünün beklendiği gibi çalışıp çalışmadığını test edin
        driver.get("https://mt-tasarim10.web.app/");



        System.out.println("------------------------------------");

        driver.navigate().to("https://mt-tasarim10.web.app/");
        String currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);


    }
}
