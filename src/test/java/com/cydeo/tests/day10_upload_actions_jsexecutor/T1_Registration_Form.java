package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_Registration_Form {

    @Test
    public void registration_form_test(){//vaybe, // yapıp peşinden yapıştıracağımız metni yapıştırınca otomatik
        // çıkıyor


        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form
      //  Driver.getDriver() --> driver demek, yani driver yerine Driver.getDriver() bunu yaz
       // Driver.getDriver().get("registration.form.url");hoca bunu yazdı sonra silip aşağıdaki kodu yazdı
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        //create JavaFaker object
        Faker faker = new Faker();//obje oluşturup aşağıya faker.name().firstName() ekledik

        //3. Enter first name
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        // //input[@name='firstname'] bu xpath i sayfaya gittik. first name kutucuğuna sağ tık+ incele sonra input tag i
        // içinden name attributenin value sini yani name:"firstname" ibaresini aldık.
        inputFirstName.sendKeys(faker.name().firstName());// bunun 2.yolu aşağıda
        //String fakerFirstName = faker.name().firstName();
       // inputFirstName.sendKeys(fakerFirstName);

        //4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());


        //5. Enter username
        WebElement inputUserName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        //inputUserName.sendKeys(faker.name().username().replaceAll(".",""));

        String user = faker.bothify("helpdesk###");//her seferinde ### yerine yeni rakam atar.
        inputUserName.sendKeys(user);


        //6. Enter email address
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(user + "@email.com");

        //7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.numerify("########"));
        //faker.internet().password().soutv+enter yaptık
        System.out.println("faker.internet().password() = " + faker.internet().password());

        //8. Enter phone number
        WebElement inputPhone = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhone.sendKeys(faker.numerify("###-###-####"));

        //9. Select a gender from radio buttons-Radyo düğmelerinden bir cinsiyet seçin
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();

        //10. Enter date of birth
        WebElement inputBirthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        //faker.number().numberBetween(2004,1920);
        inputBirthday.sendKeys("03/08/2000");

        //11. Select Department/Office
        Select departmentDropdown =
                new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));


        //12. Select Job Title
        //13. Select programming language from checkboxes
        //14. Click to sign up button
        //15. Verify success message “You’ve successfully completed registration.” is
        //displayed.






    }
}
