package com.cydeo.tests.day8_properties_config_reader;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void java_properties_reading_test(){
        //System.getProperty("os.name").soutv+enter yaptık. aşağıdaki satır çıktı.
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        //sonuç:  System.getProperty("os.name") = Windows 10 oldu. mac bilgisayarlarda Mac OS X oluyor.

        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
        //sonuç: System.getProperty("user.name") = mehme yani bu bilgisayarın adı geldi


    }

}
