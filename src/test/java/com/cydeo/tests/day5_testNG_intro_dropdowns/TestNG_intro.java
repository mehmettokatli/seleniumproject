package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_intro {

    @Test(priority=1)//öncelik;
    public void test1(){

        System.out.println("test 1  is running...");

        //ASSERT EQUALS: aynı şeylerden 2 tanesini karşılaştır

        String actual = "apple";
        String expected = "apple2";

        Assert.assertEquals(actual, expected);



        }


        @Test(priority=2)
    public void test2(){
        System.out.println("test 2  is running...");
            String actual = "apple";
            String expected = "apple2";
            Assert.assertTrue(actual.equals(expected));
    }

    @BeforeClass
    public void setUpClass(){
        System.out.println("before class is running");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println( "after class is running");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("before method is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println( "after method is running");
    }




}
