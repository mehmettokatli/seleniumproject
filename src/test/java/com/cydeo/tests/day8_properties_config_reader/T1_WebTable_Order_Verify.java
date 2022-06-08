package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.cydeo.utilities.WebTableUtils.returnOrderDate;

public class T1_WebTable_Order_Verify {

    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");

    }

    @Test
    public void order_name_verfiy_test(){
        //içinde bob martin metni bulunan hücreyi bulun
        WebElement bobMartinCell =
            driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

       // System.out.println("bobMartinCell = " + bobMartinCell);//run yap, consoldan sonucun nasıl çıktığını incele.

        System.out.println("bobMartinCell.getText() = " + bobMartinCell.getText());
        //sonuç:bobMartinCell.getText() = Bob Martin

        //bob'un adının beklendiği gibi listelendiğini doğrulayın
        String expectedBobName = "Bob Martin";
        String actualBobName = bobMartinCell.getText();

        Assert.assertTrue(actualBobName.equals(expectedBobName));
        System.out.println("actualBobName = " + actualBobName);

        //veya

        Assert.assertEquals(actualBobName, expectedBobName);

        //bob martin'in sipariş tarihinin beklendiği gibi olduğunu doğrulayın expected date:12/31/2021

        WebElement bobOrderDate =
        driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//" +
                "td[.='Bob Martin']/following-sibling::td[3]"));
        //alternatif bobOrderDate bulma, yani üst satırın alternatifi //td[.='Bob Martin']/../td[5]

        String expectedDate = "12/31/2021";
        String actualDate = bobOrderDate.getText();
        Assert.assertEquals(actualDate, expectedDate);

        //td[.='Bob Martin'] sadece bu kodu sayfada arattığımızda direkt bob martin elementini bulur.





    }

    //oluşturduğumuz utility yöntemini kullanıyoruz
    @Test
    public void test2(){
        String customerOrderDate1 = returnOrderDate(driver, "Alexandra Gray");
        System.out.println("customerOrderDate1 = " + customerOrderDate1);
        String customerOrderDate2 = returnOrderDate(driver, "Robert Baratheon");
        System.out.println("customerOrderDate2 = " + customerOrderDate2);

    }

    @Test
    public void test3(){

        WebTableUtils.orderVerify(driver,"Robert Baratheon","12/04/2021");


    }

}
