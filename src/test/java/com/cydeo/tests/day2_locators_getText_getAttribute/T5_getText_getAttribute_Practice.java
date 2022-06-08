package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute_Practice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");
        //burdaki adım şöyle; ilk önce run deyip sayfaya gidiyoruz. açılan sayfada başlığa sağ tıkla incele de,
        // başlığın h kodunu tagName içine yaz. aşağıdaki gibi

        WebElement headerText = driver.findElement(By.tagName("h2"));

        String expectedHeaderText = "Registration form";
        String actualHeaderText = headerText.getText();

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("header Text verification PASSED");
        }else {
            System.out.println("header Text verification Failed");
        }

        //locate "first name" input box
        WebElement firstNameInput = driver.findElement(By.name("firstname"));

        String expectedPlaceholder = "first name";
        String actualPlaceholder = firstNameInput.getAttribute("placeholder");

        if (actualPlaceholder.equals(expectedPlaceholder)){
            System.out.println("Placeholder text verification PASS");
        }else {
            System.out.println("Placeholder text verification Failed");
        }

        driver.close();











    }
}
