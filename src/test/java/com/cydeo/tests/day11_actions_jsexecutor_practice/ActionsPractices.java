package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractices {
    @Test
    public void task_4_and_5_test(){

        //TC #4: Scroll practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        //3- Scroll down to “Powered by CYDEO”-"Powered by CYDEO" seçeneğine ilerleyin"Powered by CYDEO" seçeneğine
        // ilerleyin
        Actions actions = new Actions(Driver.getDriver());

        //actions method a geçebilmek için cydeo linkini bulma
        WebElement cydeoLinkButton = Driver.getDriver().findElement(By.linkText("CYDEO"));

        //4- Scroll using Actions class “moveTo(element)” method
        actions.moveToElement(cydeoLinkButton).perform();



        //5- Scroll back up to “Home” link using PageUP button
        //PageUP buttonunu kullanarak “Home” linkine geri dönün
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();
        //Driver.getDriver().quit(); bunun yerine Driver.java classınde yeni oluşturduğumuz şu satırı yazıyoruz
        Driver.closeDriver();//.closeDriver(); bunu Driver classının içinde yeni oluşturduk

    }
    @Test
    public void test2(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();

    }
    @Test
    public void test3(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();

    }
}
