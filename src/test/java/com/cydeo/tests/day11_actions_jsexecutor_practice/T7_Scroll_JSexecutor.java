package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_Scroll_JSexecutor {
@Test
    public void task7_scroll_test(){//day 10 un taskı
    //TC #7: Scroll using JavascriptExecutor
    //1- Open a chrome browser
    //2- Go to: https://practice.cydeo.com/large
    Driver.getDriver().get("https://practice.cydeo.com/large");

    WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
    WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

    //sürücü türümüzü JavascriptExecutor'a indirgemek, böylece bu arayüzden gelen yöntemleri kullanabiliriz
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    //3- Scroll down to “Cydeo” link-“Cydeo” linkine ilerleyin
    BrowserUtils.sleep(2);
    js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink);//arguments[0].scrollIntoView(true) bu kodu
    // aşağıdan hazır aldık

    //4- Scroll up to “Home” link
    BrowserUtils.sleep(2);
    //                                          index number:   0          1
    //js.executeScript("arguments[1].scrollIntoView(true)",cydeoLink, homeLink);

    js.executeScript("arguments[0].scrollIntoView(true)", homeLink);//yukarıdaki satırın alternatifi

    //5- Use below provided JS method only
    //JavaScript method to use : arguments[0].scrollIntoView(true)
    //Not: Bağlantıları web öğeleri olarak bulmanız ve bunları executeScript() yöntemine argüman olarak iletmeniz
    // gerekir.
}


}
