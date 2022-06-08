package com.cydeo.tests.day4;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkboxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/checkboxes");

        //açılan web sayfasından checkbox1 e sağ tıkla incele de checkboxı bul ctrl + f //input[@name='checkbox1'] bunu
        //yaz
        WebElement checkbox1= driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2= driver.findElement(By.xpath("//input[@name='checkbox2']"));

        //onay kutusu #1 varsayılan olarak seçili değil iken
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        //onay kutusu seçilirse true, aksi takdirde false döndürür
        //onay kutusu #2 varsayılan olarak seçili değil iken
        //checkbox2.isSelected().soutv +enter yap
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        //click checkbox1 select
        Thread.sleep(2000);//bunu yazınca hata verdi. main methoda throws InterruptedException ekleyince düzeldi
        checkbox1.click();

        // //click checkbox2 select
        Thread.sleep(2000);//bunu yazınca hata verdi. main methoda throws InterruptedException ekleyince düzeldi
        checkbox2.click();

        //checkbox1 i onayla yani confirm
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());

        //checkbox2 i onayla yani confirm

        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());


    }
}
