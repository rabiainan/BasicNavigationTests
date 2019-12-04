package com.cybertek.tests_Lesson_SelfStudy.day7_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionDemo {

    @Test

    public  void test1(){

        System.out.println("second assertion");
        Assert.assertEquals(1,23);
//    ilk assertion fail oldugu icin 2. assertiona gecmedi code doesnt run
        System.out.println("first assertion");
        Assert.assertEquals("one", "one");

    }

    @Test
    public  void test2(){
       //verify that title satart with C
        String actualTitle="CYBERTEK";
        String expectedTitleBegining="B";
        Assert.assertTrue(actualTitle.startsWith(expectedTitleBegining),"verify that title satart with C");


        Assert.assertTrue("as@hotmail.com".contains("@"),"verify @ in email");

    }

    @Test
    public void tets3(){

     Assert.assertNotEquals("one", "two");
    }
    @Test
    public void test4(){
        Assert.assertFalse(1<0);

    }
}
