package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Action_Hover {

    @Test
    public void hovering_test(){
    //1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers");
        /*
        ÖNEMLİ: SAYFAYA GİDİP RESMİ İNCELEYİP CNTL+f yapıp (//img)[3] bunu yazınca yani parantez içinde ÇİFT slash
        KULLANARAK img yazıp index numarasını köşeli parantez içinde verince direkt o elemente gider
         */
    //locate all images under here - tüm resimleri burada bul
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

    //locate all the user texts under here -altındaki tüm kullanıcı metinlerini bulun

        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        //****AÇIKLAMASI ŞU ÖNEMLİ: h5 tag inin altındaki text i yani text value si name: user1 olan elementi bul*****

        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));

        Actions actions = new Actions(Driver.getDriver());//Action ile Actions farkına dikkat.

        BrowserUtils.sleep(2);//hoca bunu ekledi??
    //2. Hover over to first image
        actions.moveToElement(img1).perform();

    //3. Assert:
    //a. “name: user1” is displayed
        Assert.assertTrue(user1.isDisplayed());


    //4. Hover over to second image
        BrowserUtils.sleep(2);
        actions.moveToElement(img2).perform();
    //5. Assert:
    //a. “name: user2” is displayed
        Assert.assertTrue(user2.isDisplayed());

    //6. Hover over to third image
        BrowserUtils.sleep(2);
        actions.moveToElement(img3).perform();



        //7. Confirm:
    //a. “name: user3” is displayed

        Assert.assertTrue(user3.isDisplayed());
}


}
