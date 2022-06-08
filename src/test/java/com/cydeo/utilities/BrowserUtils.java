package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {
/*
bu yöntem int'yi (saniye olarak) kabul edecek ve verilen süre boyunca Thead.sleep'i çalıştıracaktır.

 */
    public static void sleep (int second){
        second *=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }


    public static void switchWindowAndVerify(WebDriver driver, String expectedInURL, String expectedTitle){//ilk başta aşağıdaki driver ler hata verdi. ancak
        // methodun içine WebDriver driver yazınca düzeldi
        Set<String> allWindowsHandles = driver.getWindowHandles();
        //iter +enter yaptık
        for (String each : allWindowsHandles) {
            //syntax şöyleydi
            // driver.switchTo().window(windowHandle); idi.
            driver.switchTo().window(each);
            System.out.println("current  url/ geçerli url : " + driver.getCurrentUrl());

            if(driver.getCurrentUrl().contains(expectedInURL)){//public static void switchWindowAndVerify(WebDriver
                // driver, String expectedInURL) başlıktan expectedInURL aldık buraya yazdık
                break;
            }
            String actualTitle = driver.getTitle();
            //burdaki String expectedTitle ibaresini de burdan kesip, methodun parametresinin içine aldık.
            // switchWindowAndVerify(WebDriver driver, String expectedInURL, String expectedTitle)

            Assert.assertTrue(actualTitle.contains(expectedTitle));

        }



    }
    //bu yöntem "expectedTitle" stringin'i kabul eder ve doğru olup olmadığını belirtir
    public static void verifyTitle (WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }


}
