package com.cydeo.tests.day4;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_cssSelector_practice {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement homelink = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //syntax 2 class , using value
        WebElement homelink2 = driver.findElement(By.cssSelector("a.nav-link"));

        //locate homelink using cssSelector, href value
        WebElement homelink3 = driver.findElement(By.cssSelector("a[href='/']"));

        //locate header using cssSelector: locate parent element and move down to h2
        //cssSelector kullanarak header i bulun: parent elementi bulun ve h2'ye gidin
       WebElement header = driver.findElement(By.cssSelector("div.example > h2"));

        // web sayfasında //h2[text()='Forgot Password'] aratınca veya h2 nin yerine * koyunca bütün Forgot Password
        // olan value leri getirir
        //xpath kullanarak ve web öğesi metnini kullanarak başlığı bulun
        WebElement header2= driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        //email bulma

        WebElement emailLabel= driver.findElement(By.xpath("//label[@for='email']"));

        //input box //input[@name='email]
        WebElement inputBox = driver.findElement(By.xpath("//input[@name='email']"));

        //web sayfasında //tagName[contains(@attribute,'value')] şeklinde aratarak aşağıdaki codu yazıyoruz
        //attribute value sinin sadece belli bir kısmını yazsak yeterli oluyor.

        WebElement inputBox2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

        WebElement retrievePasswordBtn = driver.findElement(By.xpath("//button[@id='form_submit']"));

        //powered by CYDEO test-CYDEO testi tarafından desteklenmektedir
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //tüm web öğelerinin görüntülendiğini doğrulayın
        //ÖNEMLİ NOT:  aşağıdaki kodları şöyle yadık. mesela birinci satırdaki homelink değişkenini yazıp, yanına
        // .soutv + enter yapınca System.out.println("homelink2 = " + homelink2); oluyor. sonra şöyle yaptık,
        //homelink.isDisplay().soutv+enter yapınca
        System.out.println("homelink = " + homelink);
        System.out.println("homelink.isDisplayed() = " + homelink.isDisplayed());
        System.out.println("homelink2 = " + homelink2);

        System.out.println("homelink2.isDisplayed() = " + homelink2.isDisplayed());
        //diğerlerini sadece isDisplayed() li yapıyorum.
        System.out.println("homelink3.isDisplayed() = " + homelink3.isDisplayed());
        System.out.println("header.isDisplayed() = " + header.isDisplayed());
        System.out.println("header2.isDisplayed() = " + header2.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());

        //inputBox.soutv + enter yapınca otomatik çıkıyor. önemli bir özellik
        System.out.println("inputBox.isDisplayed() = " + inputBox.isDisplayed());
        System.out.println("inputBox2.isDisplayed() = " + inputBox2.isDisplayed());
        System.out.println("retrievePasswordBtn.isDisplayed() = " + retrievePasswordBtn.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());
        /*sonuç
        homelink2.isDisplayed() = true
        homelink3.isDisplayed() = true
        header.isDisplayed() = true
        header2.isDisplayed() = true
        emailLabel.isDisplayed() = true
        inputBox.isDisplayed() = true
        inputBox2.isDisplayed() = true
        retrievePasswordBtn.isDisplayed() = true
        poweredByCydeoText.isDisplayed() = true oldu

         /*
         COMMONLY USED XPATH SYNTAXES:YAYGIN KULLANILAN XPATH syntax'leri
        #1- //tagName[@attribute='value']
        #2- //tagName[contains(@attribute, 'value')]
        #3- //tagName[.='text']  same as //tagName[text()='text']
        #4- //*[@attribute='value']
         */

        /*önemli not: bir satırı copy-paste yapmadan aşağı yukarı taşımak için:
        --> How to move lines up and down without having to copy paste:
            - Windows : control + shift + ok tuşları   *****************************************

         */

    }
}
