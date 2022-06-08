package com.cydeo.tests.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class d4_p1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com/open_new_tab");

        //herhangi bir geçerli sekmeyi kapatmak için
      //  driver.close();//kullanılır

        //driver tarafından açılan tüm tarayıcı pencerelerini kapatmak için
        driver.quit();

    }
}
