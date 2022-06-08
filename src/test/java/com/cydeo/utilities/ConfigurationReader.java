package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //propertiesin objelerini oluşturun
    private static Properties properties = new Properties();

   static{

       try {
           //dosyayı java belleğinde açmamız gerekiyor
           FileInputStream file = new FileInputStream("configuration.properties");
           //burda target in altındaki configuration.properties e sağ tıkla, Copy Path/Referance tıkla, Path from Content->
           // Root a tıkla, sonra gel yukarıdaki name in içine yapıştır.

           //properties nesnesini FileInput Stream nesnesini kullanarak yükleyin
           properties.load(file);//load ın içine FileInputStream in file ını eklediğimize dikkat.

           file.close();

       } catch (IOException e) {
           System.out.println("dosya configurationReader sınıfında bulunamadı.");
           e.printStackTrace();
       }
   }
        //burasını anlamadım ama önemli
        public static String getProperty (String keyword){
        return properties.getProperty(keyword);//hoca configıration.properties dosyasına atıfta bulunuyor.

        }



}
