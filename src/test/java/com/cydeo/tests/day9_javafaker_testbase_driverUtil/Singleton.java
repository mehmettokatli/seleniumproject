package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

public class Singleton {

    //1- create private constructor
    private Singleton (){}

    //2-create private static String
    //erişimi engelle ve bir getter method sağla
    private static String word;

    //bu utility method "word" ü bizim istediğimiz şekilde döndürecektir.
    public static String getWord(){
        if (word == null){
            System.out.println("İlk kez çağırdığında. word nesnesi null. Şimdi ona değer atama");
            word = "something";
        }else {
            System.out.println("word ün zaten value si var");
        }
            return word;
    }

}
