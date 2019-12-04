package com.cybertek.tests_Lesson_SelfStudy.day7_testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BeforeAndAfterTest {
    @Ignore
    @Test
    public void tets1(){
        System.out.println("this is  my test one");

    }
    @Test
    public void tets2(){
        System.out.println("this is my test two");
    }
    @Test
    public void test3(){
        System.out.println("this my test three");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("befeore method");
        System.out.println("opening the browser");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("close browser");
    }

     @BeforeClass
    public void beforeEverything(){
         System.out.println("before close code");

     }
     @AfterClass
    public  void afterClass(){
         System.out.println("after class code");
         System.out.println("reporting");
     }
}
