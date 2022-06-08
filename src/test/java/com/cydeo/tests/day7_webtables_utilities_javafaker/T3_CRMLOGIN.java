package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_CRMLOGIN extends TestBase {



    @Test
    public void crm_login_test(){
        driver.get("https://login1.nextbasecrm.com/");

        //geçerli kullanıcı adı girin
        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys("helpdesk1@cybertekschool.com");

        //geçerli PASSWORD girin
        WebElement inputPassword= driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        //giriş yapmak için tıklayın
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        BrowserUtils.verifyTitle(driver, "Portal");//daha önce oluşturduğumuz BrowserUtils sayfasından
        // verifyTitle isimli methodu çağırdık.

    }
    @Test
    public void crm_login_test2(){
        driver.get("https://login1.nextbasecrm.com/");

        //"helpdesk1"e giriş yapmak için utilitiy yöntemimi çağırıyorum
        CRM_Utilities.crm_login(driver);


        BrowserUtils.verifyTitle(driver, "Portal");//daha önce oluşturduğumuz BrowserUtils sayfasından
        // verifyTitle isimli methodu çağırdık.

    }

    @Test
    public void crm_login_test3(){
        driver.get("https://login1.nextbasecrm.com/");

        //"helpdesk1"e giriş yapmak için utilitiy yöntemimi çağırıyorum
        CRM_Utilities.crm_login(driver, "helpdesk2@cybertekschool.com", "UserUser");


        BrowserUtils.verifyTitle(driver, "Portal");//daha önce oluşturduğumuz BrowserUtils sayfasından
        // verifyTitle isimli methodu çağırdık.

    }

}
