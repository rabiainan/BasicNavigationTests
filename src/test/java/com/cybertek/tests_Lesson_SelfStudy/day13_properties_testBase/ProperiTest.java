package com.cybertek.tests_Lesson_SelfStudy.day13_properties_testBase;

import com.cybertek.utilities_forlesson.ConfigurationReader;
import org.testng.annotations.Test;

import javax.security.auth.login.Configuration;

public class ProperiTest {

@Test
    public void test1(){

String browser= ConfigurationReader.get("browser");
    System.out.println(browser);

    System.out.println(ConfigurationReader.get("url"));

  //configuration readere sen provied key o sana get ile valuyu donuyor
    System.out.println(ConfigurationReader.get("salesmanager_username"));
}



}
