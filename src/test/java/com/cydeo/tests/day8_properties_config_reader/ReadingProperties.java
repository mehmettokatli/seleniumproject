package com.cydeo.tests.day8_properties_config_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    //NOT configuration.properties dosyasının oluşumu için seleniumproject sağtık+ new file isim ver.
    // (configuration.properties) içine browser=chrome
    //env=https://login1.nextbasecrm.com
    //username=helpdesk1@cydeo.com ekle. ÖNEMLİ
    @Test
    public void reading_from_properties_test() throws IOException {
        //propertiesin objelerini oluşturun
        Properties properties = new Properties();

        //dosyayı java belleğinde açmamız gerekiyor
        FileInputStream file = new FileInputStream("configuration.properties");
        //burda target in altındaki configuration.properties e sağ tıkla, Copy Path/Referance tıkla, Path from Content->
        // Root a tıkla, sonra gel yukarıdaki name in içine yapıştır.

        //properties nesnesini FileInput Stream nesnesini kullanarak yükleyin
        properties.load(file);//load ın içine FileInputStream in file ını eklediğimize dikkat.

        //value yı okumak için "properties" nesnesini kullanın
        // properties.getProperty().soutv+enter yaptık
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        //sonuç: properties.getProperty("browser") = chrome oldu

        //properties.getProperty("env").soutv+enter yaptık
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
        //sonuç:properties.getProperty("env") = https://login1.nextbasecrm.com oldu.

        //properties.getProperty("username").soutv +enter
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
        //sonuç:properties.getProperty("username") = helpdesk1@cydeo.com olur.


    }

}
