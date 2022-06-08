package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_practice {
@Test
    public void upload_test(){
    //1. Go to https://practice.cydeo.com/upload

    Driver.getDriver().get("https://practice.cydeo.com/upload");

    //2. Find some small file from your computer, and get the path of it.
    //Bilgisayarınızdan küçük bir dosya bulun ve yolunu bulun.
    /*
    Yüklemek istediğiniz dosyaya sağ tıklayın-Özellikleri Seçin-güvenliğe gidin-Sağ tıklayın ve “nesne adından” yolu
    kopyalayın-IntelliJ'e yapıştırın
     */
    String path ="C:/Users/mehme/OneDrive/Masaüstü/bjk.png";//burda önemli nokta sola yatık olan slash ları sağa yatık
    // yaptım

    //3. Upload the file-Dosyayı yükleyin.
    WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload"));
    BrowserUtils.sleep(2);//bu ve alt satır önemli, çünkü öncesinde hata verdi. gürhan hoca böyle düzeltti.
    fileUpload.sendKeys(path);

    WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));//file-submit bunu sayfadan upload
    // düğmesinin id sinden aldık
    uploadButton.click();

    WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));
    System.out.println("fileUploadedHeader = " + fileUploadedHeader);//bunu ben kendim yaptım. sonuç:
    //fileUploadedHeader = [[ChromeDriver: chrome on WINDOWS (a548c7d4f4fe07a68a5bf8e25e35502a)] -> tag name: h3] oldu


    //4. Assert:
    //-File uploaded text is displayed on the page-Dosya yüklenen metin sayfada görüntüleniyor
    Assert.assertTrue(fileUploadedHeader.isDisplayed());
}



}
