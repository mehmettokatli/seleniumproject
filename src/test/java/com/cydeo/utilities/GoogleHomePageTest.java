package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GoogleHomePageTest {

    WebDriver driver;

    @BeforeMethod
    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    @Test
    public void testHomePage() throws InterruptedException {

        driver.get("https://google.com");

        Thread.sleep(1000);

        assertEquals(driver.getTitle(), "Google");
        Thread.sleep(1000);
    }

    @Test
    public void testSearch() throws InterruptedException {

        driver.get("https://google.com");

        driver.findElement(By.name("q")).sendKeys("Selenium"+ Keys.ENTER);//input name i q olan
        //elemente yani arama kutusuna Selenium yaz + enter yap demek
        Thread.sleep(1000);

        assertEquals(driver.getTitle(),"Selenium - Google'da Ara");

    }

    @AfterMethod
    public void lastMethod() {
        driver.close();

    }


}
