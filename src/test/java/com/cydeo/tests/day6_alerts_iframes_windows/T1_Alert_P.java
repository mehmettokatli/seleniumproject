package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_P {

    WebDriver driver;//bu ilk başta aşağıdaki ilk satırdaydı. sonra buraya aldık.
    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/javascript_alerts");

    }
    @Test
    public void alert_test1() throws InterruptedException {
        WebElement informationAlertBtn= driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        informationAlertBtn.click();
        //alert penceresindeki ok butanuna tıklayın

        Alert alert = driver.switchTo().alert();//burası önemli

        //click to OK button from alert
        Thread.sleep(1000);
        alert.accept();

        Thread.sleep(1000);
        //verify "you successfully clicked an alert" text is displayed.
        //"Bir uyarıyı başarıyla tıkladınız" metninin görüntülendiğini doğrulayın.
        // incele bölümündeki arama çubuğuna //p[@id='result'] şeklinde locator yazıp ilgili bölüme ulaşıyoruz.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //ÖNEMLİ**********: bundan sonra şu adımı izlemeliyiz
        Assert.assertTrue(resultText.isDisplayed(), "Result text is not Displayed");
        //başarısızlık mesajı yalnızca onaylama başarısız olursa görüntülenecektir

        String exceptText = "You successfully clicked an alert";
        String actualText = resultText.getText();
                                                            //"Gerçek sonuç testi beklendiği gibi değil
        Assert.assertEquals(actualText, exceptText, "Actual result test is not as expected!!!");




    }




}
