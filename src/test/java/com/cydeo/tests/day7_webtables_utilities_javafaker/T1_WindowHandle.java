package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T1_WindowHandle {
    public WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void window_handling_test(){
        driver.get("https://amazon.com");


        //bu araya başka web siteleri de açtık.(aşağıdaki satırları gürhanhoca sadece sayfaya yapıştırmamızı istedi.)
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");


        Set <String> allWindowsHandles = driver.getWindowHandles();
        //iter +enter yaptık
        for (String each : allWindowsHandles) {
            //syntax şöyleydi
           // driver.switchTo().window(windowHandle); idi.
            driver.switchTo().window(each);
            System.out.println("current  url/ geçerli url : " + driver.getCurrentUrl());

            if(driver.getCurrentUrl().contains("amazon")){
                break;
            }
            String actualTitle = driver.getTitle();
            String expectedTitle = "amazon";

           Assert.assertTrue(actualTitle.contains(expectedTitle));


        }
        //BrowserUtils sayfasından switchWindowAndVerify methodunu çağırdık.
        BrowserUtils.switchWindowAndVerify(driver, "etsy", "Etsy");

    }


}
