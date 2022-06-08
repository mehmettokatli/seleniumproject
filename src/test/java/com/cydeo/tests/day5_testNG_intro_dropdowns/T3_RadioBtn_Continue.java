package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioBtn_Continue {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");

        //WebElement hockeyRadioBtn = driver.findElement(By.xpath("//input[@id='hockey']"));

        //name attribute value si sport dur.


        //name=sports radyo düğmelerini bulun ve bunları bir web öğesi listesinde saklayın
        //List<WebElement> sportsRadioBtn = driver.findElements(By.name("sport"));//bu satırı sonra kesip aşağı aldık

        //web elemanı listesinde dolaşın ve eşleşen sonucu "hokey" seçin
        //burda iter+enter yaptık
        //aşağıdaki kodu aldık daha aşağı koyduk
        /*
        for (WebElement each : sportsRadioBtn) {
            String eachId = each.getAttribute("id");
            System.out.println("eachId = " + eachId);//direkt soutv + enter yapınca çıktı

            if (eachId.equals("hockey")){
                each.click();
                System.out.println("hokey is Selected() = " + each.isSelected());

                break;
            }

        }

         */

        //aşağıda private olarak oluşturduğumuz methodu buraya yazmaya başlıyoruz
        clickAndVerifyRadioBtn(driver,"sport", "hockey");
        clickAndVerifyRadioBtn(driver,"sport","football");
        clickAndVerifyRadioBtn(driver,"color","yellow");
        clickAndVerifyRadioBtn(driver,"color","green");
    }

    private static void clickAndVerifyRadioBtn(WebDriver driver, String nameAttribute, String idValue){
        List<WebElement> RadioBtns = driver.findElements(By.name(nameAttribute));

        //web elemanı listesinde dolaşın ve eşleşen sonucu "hokey" seçin
        //burda iter+enter yaptık

        for (WebElement each : RadioBtns) {
            String eachId = each.getAttribute("id");

            if (eachId.equals(idValue)){
                each.click();
                System.out.println(eachId+ " is Selected() = " + each.isSelected());

                break;
            }

        }
    }

}

