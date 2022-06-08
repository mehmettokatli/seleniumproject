package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    //özel bir (private) constructor oluşturarak bu sınıfın nesnesine sınıfın dışından erişimi kapatıyoruz
    private Driver(){ }
    //WebDriver'ı private yapıyoruz çünkü sınıfın dışından erişimi kapatmak istiyoruz
    //statik hale getiriyoruz çünkü statik bir yöntemde kullanacağız
    private static WebDriver driver;//value default olarak null


    //yeniden kullanılabilir bir 'utility method' oluşturmak, onu çağırdığımızda aynı sürücü örneğini döndürür
    public static WebDriver getDriver(){
        if (driver == null){
            /*
           browserType'ımızı configuration.properties'den okuyoruz.
           bu şekilde kodumuzun dışından, configuration.properties'den hangi tarayıcının açılacağını kontrol edebiliriz
             */
            String browserType = ConfigurationReader.getProperty("browser");


            /*
             configuration.properties dosyasından döndürülecek tarayıcı türüne bağlı olarak, dosya anahtarı ifadesi
             durumu belirleyecek ve eşleşen tarayıcıyı açacaktır.

             */

            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;


            }


        }
        return driver;
    }
        //this method will make sure our driver value is always null after using quit() method
        //bu yöntem, Quit() yöntemini kullandıktan sonra sürücü değerimizin her zaman boş olduğundan emin olacaktır.
        public static void closeDriver(){
            if (driver != null){
                driver.quit();//bu satır mevcut oturumu sonlandıracaktır.value boş bile olmayacak
                driver = null;

            }

        }

}
