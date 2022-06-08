package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    //JavaFaker, organize bir şekilde rastgele veri üretmemizi sağlayan bir kütüphanedir.

    @Test
    public void test1(){
        //methodlara ulaşmak için faker objesi oluşturma
        Faker faker = new Faker();

        //alternatif olarak Faker faker = new Faker(new Locale("fr")); faker kütüphanesinden böyle eklenerek yapılabilir


        //faker.name().firstName().soutv+enter
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        //sonuç: faker.name().firstName() = Elane --> her seferinde isim değişiyor
        //faker.name().lastName().soutv+enter
        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        //faker.name().fullName().soutv+enter
        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        //numerify yöntemi, almak istediğimiz biçimde rasgele sayılar üretecektir.
        //faker.numerify("###-###-####").soutv
        System.out.println("faker.numerify(\"#- ###-###-##-##\") = " + faker.numerify("#- ###-###-##-##"));
        //"#- ###-###-##-##" almak istediğimiz rastgele numara, istediğimiz formatta olabilir. ör: ##-#### gibi

        //onlarca başka yöntem var
        //ör: Letherify -- > faker.letterify (letterString:"?????") gibi

        System.out.println("faker.letterify(\"???-????\") = " + faker.letterify("???-????"));
        System.out.println("faker.letterify(\"???xxx????\") = " + faker.letterify("???-????"));

        System.out.println("faker.bothify(\"##?#-###???-##\") = " + faker.bothify("##?#-###???-##"));
        //System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());

        //sadece numaraları yazdırmak için aralardaki tireleri kalıdırabiliriz
       /* bunu tam anlamadım ama önemli bi konu değil
       System.out.println("faker.finance().creditCard() = "
                + faker.finance().creditCard().replaceAll("-", ""));
        */
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muhtar"));



    }

}
