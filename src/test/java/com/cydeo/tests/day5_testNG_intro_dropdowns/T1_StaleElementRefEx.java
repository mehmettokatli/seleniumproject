package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementRefEx {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/add_remove_elements/");

        //click to add element button

        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));//texti
        // yani metin kısmı Add Element olan button demek. //button[.='Add Element'] burdaki . text demek ÖNEMLİ


        Thread.sleep(2000);
        addElementButton.click();

        Thread.sleep(2000);
        WebElement deleteElementButton = driver.findElement(By.xpath("//button[.='Delete']"));
        //üst satırın diğer  yolu //button[@class='added-manually'] dir.


        System.out.println("deleteElementButton.isDisplayed() = " + deleteElementButton.isDisplayed());
        deleteElementButton.click();

        try {
            System.out.println("deleteElementButton.isDisplayed() = " + deleteElementButton.isDisplayed());

        }catch (StaleElementReferenceException e){
            System.out.println("StaleElementReferenceException exception is throw");
            System.out.println("bu, web öğesinin web sayfasından tamamen silindiği anlamına gelir");
            System.out.println("deleteElementButton.isDisplayed() = false");
        }

        driver.close();



















    }
}
