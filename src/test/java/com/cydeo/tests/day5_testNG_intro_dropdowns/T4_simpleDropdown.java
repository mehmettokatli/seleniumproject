package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_simpleDropdown {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //WebDriver driver = WebDriverFactory.getDriver("chrome"); en başta bu satır böyleydi ancak bu satırdan
        // WebDriver ibaresini alıp en üste koyduk ki alt taraftaki diğer method ve elemeanlar WebDriver in driverini
        // kullanabilsin.
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/dropdown");

    }
    @Test
    public void simpleDropdownTest(){

        //"simple dropdown" varsayılan seçili değerin doğru olduğunu doğrulayın. sayfaya gittiğimizde simple dropdomn
        //isimli menüyü sağ tık inceliyoruz

        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));


        WebElement currentlySelectionOption = simpleDropdown.getFirstSelectedOption();
        String actualSimpleDropdownText = currentlySelectionOption.getText();
        String expectlySimpleDropdownText = "Please select an option";

        Assert.assertEquals(actualSimpleDropdownText, expectlySimpleDropdownText);
        //System.out.println("actualSimpleDropdownText = " + actualSimpleDropdownText); optinal olarak yaılabilir.

        //"State selection" varsayılan seçili değerinin doğru olduğunu doğrulayın

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String expectedStateDropdownText = "Select a State";
        String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText();

       Assert.assertEquals(actualStateDropdownText,expectedStateDropdownText);
        //Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(), "Select a State");


    }


}
