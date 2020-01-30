package com.cybertek.tests_Lesson_SelfStudy.day13_properties_testBase;

import com.cybertek.utilities_forlesson.ConfigurationReader;
import com.cybertek.utilities_forlesson.Driver;
import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import javax.security.auth.login.Configuration;

public class SingletonTest {
    @Test

    public  void test(){

//Singleton s1= new Singleton();  we can not create object bec the class has private conctriuctor


String s1= Singleton.getInstance();  //this is variable
        //100 line of codes mesela driver in  butun testler boyunca ayni kalmasini sagliyor
String s2=Singleton.getInstance();  //this is variable

        System.out.println("s1= "+s1);
        System.out.println("s2= "+s2);
    }





    @Test

    public void test2(){

      //  WebDriver  driver= WebDriverFactory.getDriver("chrome");  onceden webdriverfactory ile yaptigimiz
          WebDriver  driver= Driver.get(); // artik yeni olusturdugumuz Driver clasi ile boyle yaziyoruz bu degeri configuratinproperties den aliyor extradan chrome yazmana gerek yok
        driver.get(ConfigurationReader.get("url"));
       Driver.get().navigate().refresh();

    }

    @Test

    public void test3() throws InterruptedException {

      Thread.sleep(2000);
        Driver.get().get("http://amozon.com");
      //driver      .get()  yukraridaki ile same

        Driver.closeDriver();


    }



}
