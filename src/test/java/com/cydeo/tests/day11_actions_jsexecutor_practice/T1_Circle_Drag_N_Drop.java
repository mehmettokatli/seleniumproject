package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Circle_Drag_N_Drop {
    @Test
    public void drag_and_drop_test(){
        //TC #: Drag and drop
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        //"çerezleri kabul et" düğmesini bulun ve tıklayın
        WebElement accepstCookiesButton = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        accepstCookiesButton.click();

        //etraflarında sürükleyebilmek için küçük ve büyük daireleri bulun
       WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
       WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        //2. Drag and drop the small circle to bigger circle.
        //Küçük daireyi daha büyük daireye sürükleyip bırakın.
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(smallCircle, bigCircle).perform();

        //alternatif yol aşağıda
        /*actions.clickAndHold(smallCircle)
                .pause(2000)
                .moveToElement(bigCircle)
                .release()
                .perform();

         */

        //3. Assert:
        //-Text in big circle changed to: “You did great!”
        //Büyük daire içindeki metin şu şekilde değişti: "Harika iş çıkardın!"

        String actualBigCircleText = bigCircle.getText();
        String expectedBigCircleText = "You did great!";

        Assert.assertEquals(actualBigCircleText, expectedBigCircleText);

    }

}
