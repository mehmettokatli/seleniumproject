package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_JS_executor {
    @Test
    public void jsExecutor_test(){
        //1- Open a chrome browser
        //2- Go to: "https://practice.cydeo.com/infinite_scroll"
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

        //3- Use below JavaScript method and scroll
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();//alternatifi şu:
        //((JavascriptExecutor) Driver.getDriver()).executeScript("");



        //a. 750 pixels down 10 times.
        for (int i = 0; i <10 ; i++) {
            BrowserUtils.sleep(1);
            //JavaScript method to use : window.scrollBy(0,0)
            //                                   x, y
            js.executeScript("window.scrollBy(0,750)");

        }


        //b. 750 pixels up 10 times
        for (int i = 0; i <10 ; i++) {
            BrowserUtils.sleep(1);
            //JavaScript method to use : window.scrollBy(0,0)
            //                                   x, y
            js.executeScript("window.scrollBy(0,-750)");

        }







    }




}
