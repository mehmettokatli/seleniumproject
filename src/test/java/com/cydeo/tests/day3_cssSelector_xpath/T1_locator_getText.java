package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locator_getText {
    public static void main(String[] args) {

        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");//yukarıdaki 2 satırı pasif yapıp
        // oluşturduğumuz utilitiy package den WebDriverFactory sayfasındaki getDriver methodunu çağırdık

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com");

        // driver.findElement(By.className("login-inp"));ilk önce bu satırı yazdık. bu satırdan önce run yaptık,açılan ,
        // pencereden login kısmına sağ tıkla incele de ve login kutusunun div ine gittik ve class ismini buraya yazdık.
        //sonra driver ın başına WebElement username yazdık ve obj oluşturduk.
        WebElement InputUsername = driver.findElement(By.className("login-inp"));
        InputUsername.sendKeys("incorrect");//sonra alt satıra username.sendKeys("incorrect"); yazdık
        //diğer yol:
        //WebElementle başlayan satırın alternatifi driver.findElement(By.className("login-inp")).sendKeys("incorrect");
        //bir diğer önemli nokta,className("login-inp") olan login kutusuna incorrect yazdırmış olduk.
        WebElement InputPassword = driver.findElement(By.name("USER_PASSWORD"));
        InputPassword.sendKeys("incorrect");

        //click to log in button.
        WebElement loginButton = driver.findElement(By.className("login-btn"));//clasname ismini web sayfasında login
        // tuşuna sağ tıklayıp incele dedik. login tuşunun class name ni aldık
        loginButton.click();

        //verify error message text is as expected:(hata mesajı metninin beklendiği gibi olduğunu doğrulayın:)
        //expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));//error mesajın clas name ini aldık

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();

        if (actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Error message verification PASSED");
        }else {
            System.out.println("Error message verification FAİLED");
        }
    }
}
