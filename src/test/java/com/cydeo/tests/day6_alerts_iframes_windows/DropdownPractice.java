package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractice {


    public WebDriver driver;//bu olayı Gürhan hoca yeni söyledi. WebDriver driver ı aşağıdan aldı. başına public koydu.
    //buraya koydu. çok ilginç.



    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/dropdown");


    }



    @Test
    public void dropdown_test() throws InterruptedException {

                                                                        //*[@id="state"]
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        // <Select> tag ini ve id sini kullanıyoruz.

        Thread.sleep(2000);
        //dropdown menüden Colorado eyaletini seçin
        stateDropdown.selectByVisibleText("Colorado");

        Thread.sleep(2000);
        //dropdown menüden Arizona eyaletini seçin
        //.selectByValue(); methodunu kullanarak seçin
        stateDropdown.selectByValue("AZ");


        //California eyaletini ByIndex ile seçin
        //bunun için sağ tıkla incele sonra birinci seçenekten itibaren yukardan aşağı sayıyoruz.
        //California 5. sırada olduğu için, 5 yazıyoruz. şöyleki sıfırıncı index default değer oluyor. ondan sonra
        // saydığımızda California 5. sırada yer alıyor.
        Thread.sleep(2000);
        stateDropdown.selectByIndex(5);



        //son seçilen seçeneğin California olduğunu doğrulayın

        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();//burda önemli nokta şu:
        //bir değişkene .getFirstSelectedOption() methodunu atadık, ancak hata verir. bunu önlemek için
        //.getText() methodunu sonuna ekleriz. (sebenini şu anda bulamadım)

        Assert.assertEquals(actualOptionText, expectedOptionText);




        }

     //1 Aralık 1923'ü seçin ve seçili olduğunu doğrulayın
    @Test
    public void dropdown_test6(){
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
////select[@id='year'] bu kısmı sayfayı sağ tık+ incele gün ay yıl bölümünden aldık.
        //<Select id="year"> bölümünden aldık.

        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //select year using: visible test (kullanarak yılı seçin)
        yearDropdown.selectByVisibleText("1923");

        //select month using: value attribute
        monthDropdown.selectByValue("11");

        //select day using: index number
        dayDropdown.selectByIndex(0);

        //creating expected values: beklenen değerleri oluştur.
        String expectedYear = "1923";
        String expectedMonth = "December";
        String expectedDay = "1";

        //tarayıcıdan gerçek değerleri alın

        String actualYear = yearDropdown.getFirstSelectedOption().getText();//.getFirstSelectedOption() bu methodu tek
        // başına kullanamadık. buraya dikkat. .getText();methodunu ekledik

        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        //1. yol
        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertEquals(actualMonth, expectedMonth);
        Assert.assertEquals(actualDay, expectedDay);

        /*ikinci yol
        if (actualYear.equals(expectedYear)){
            System.out.println("year is passed");
        }else{
            System.out.println("year is failed");
        }

         */


    }
    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }


}
