package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_Config_Practice {
   /*



    public WebDriver driver;
    @BeforeMethod
    public void setUp(){

        //configuration.properties sayfasından browser=Chrome bölümünün browser key ini aldık
        //tarayıcı tipini configuration.properties dosyamızdan dinamik olarak alıyoruz
        String browserType = ConfigurationReader.getProperty("browser");


        driver = WebDriverFactory.getDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    */
    @Test
    public void google_searh_test (){
        //Driver.getDriver() --> driver demektir.

        Driver.getDriver().get("https://www.google.com");

        //arama kutusuna "apple" yaz
        WebElement googleSearhBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        //driver ları Driver.getDriver() yaptık
        googleSearhBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);


        //expected : apple - Google'da Ara
        String expectedTitle = ConfigurationReader.getProperty("searchValue") +"- Google'da Ara";//burda apple ın yerine
        // ConfigurationReader.getProperty("searchValue") + ekledik
        String actualTitle = Driver.getDriver().getTitle();//driver ları Driver.getDriver() yaptık

        Assert.assertEquals(actualTitle, expectedTitle);




    }

}
