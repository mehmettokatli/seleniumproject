package com.cydeo.tests.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d4_p3_particalLink {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.oguzkimya.com");

        WebElement masterDentalText = driver.findElement(By.partialLinkText("Master Dental"));//sağ tık incele, ordan
        // partialLinkText i aldım yani "Master Dental"

        //print out text- metni yazdır
        System.out.println(masterDentalText.getText());//sonuç:Master Dental Makyaj Seti (ilk metni yazdırdım)


















    }
}
