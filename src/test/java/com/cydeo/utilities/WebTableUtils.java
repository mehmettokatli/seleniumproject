package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {


    public static String returnOrderDate(WebDriver driver, String customerName){

        //td[.='Bob Martin']/following-sibling::td[3]
        //ilk önce aşağıdaki satırı yaptı. sonra bob martini değiştirdi ve bir alttaki kodu yazdı.
        // String locator= "//td[.='Bob Martin']/following-sibling::td[3]";
        String locator= "//td[.='"+customerName+"']/following-sibling::td[3]";
/*
        String middleName = "L";
        String fullName = "Samuel  "+middleName+" Jackson";
*/

        WebElement customerDateCell = driver.findElement(By.xpath(locator));
        return customerDateCell.getText();
    }
    public static void orderVerify ( WebDriver driver, String customerName, String expectedOrderDate){
        String locator= "//td[.='"+customerName+"']/following-sibling::td[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        String actualOrderDate = customerDateCell.getText();
        Assert.assertEquals(actualOrderDate, expectedOrderDate);//parametre deki String expectedOrderDate ekledik


    }





}
