package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T5_Window_P {
    WebDriver driver;//bu ilk başta aşağıdaki ilk satırdaydı. sonra buraya aldık.


    @BeforeMethod
    //@BeforeClass // beforeMethod yerine BeforeClass da kullanabiliriz
    public void setUpMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/windows");

    }

    @Test
    public void multiple_window_test() throws InterruptedException {
        //ana sayfanın pencere tutamağını dize olarak saklamak, gelecekteki yeniden kullanılabilir amaçlar için iyi bir
        // uygulamadır
        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);
        //sonuç: mainHandle = CDwindow-BD99AABBC3C49653A4ECE5C2EF5BBE0C pencerenin unique numarasını aldık.

        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

        System.out.println("Title before click- Tıklamadan önce başlık " + actualTitle);

        //click here - linkine tıklayın
        Thread.sleep(1000);
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        Thread.sleep(1000);
        clickHereLink.click();


        //yeni pencereye geç
        Set<String> allWindowHAndles = driver.getWindowHandles();

        for (String each : allWindowHAndles) {

            driver.switchTo().window(each);
            System.out.println("pencereleri değiştirirken şu anda başlık " + driver.getTitle());
        }


        System.out.println("----------------------------------------------------------");
        for (String each : driver.getWindowHandles()) {

            driver.switchTo().window(each);
            System.out.println("pencereleri değiştirirken şu anda başlık " + driver.getTitle());
        }

        actualTitle = driver.getTitle();

        System.out.println("Title after click -Tıkladıktan sonra başlık " + actualTitle);

        //assert : Title is "new window"

        String expectedTitleAfterClick = "New Window";
        actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitleAfterClick);
        System.out.println("Title after click " + actualTitle);


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
