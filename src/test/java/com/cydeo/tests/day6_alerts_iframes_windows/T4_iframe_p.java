package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_iframe_p {
    WebDriver driver;//bu ilk başta aşağıdaki ilk satırdaydı. sonra buraya aldık.
    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/iframe");

    }

    //not: @Test ibaresinin üstüne @Ignore yazılırsa o test kullanılamaz hale gelir. java ve selenium test bulunamadı
    // hatası verir.

    @Test
    public void ifrmae_test(){

        //p etiketini bulun //locate the p tag

      //  WebElement yourContentGoesHereText = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));//bu
        // durumda p tag ini bulamıyorum diye java hata verir.

        //o yüzden,sürücünün odağını iframe olarak değiştirmemiz gerekiyor.

        //1 numaralı seçenek, id attribute değerini kullanarak iframe'e geçiş
        driver.switchTo().frame("mce_0_ifr");//p taginin en üstteki iframe parentinin id'sini aldık
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        /*driver.switchTo().frame(0);ikinci kullanım, birden fazla iframe varsa yukarıdan aşağı doğru index numarası
        verilerek o iframe ulaşılabilir. mesela bizim bu örnek için, bir tane iframe olduğu için index noya 0 yazdık */

        /*
        3. yol
         driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"))); şeklindedir.
         */

        //iframe in üstündeki başlığı doğrulayabilmek için, "ana html"ye geri dönmeliyiz
        driver.switchTo().parentFrame();

        //header text olan "An iFrame containing the TinyMCE WYSIWYG Editor" başlığının yazdırılması, önce üstteki kodu
        // yazıyoruz  (driver.switchTo().parentFrame();)sonra header in xpath ini alıyoruz
        WebElement headerText = driver.findElement(By.xpath("//h3"));

        Assert.assertTrue(headerText.isDisplayed());









    }


}

