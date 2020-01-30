package com.cybertek.tests_Lesson_SelfStudy.day13_properties_testBase;

import com.cybertek.tests_Lesson_SelfStudy.TestBase;
import com.cybertek.utilities_forlesson.ConfigurationReader;
import com.cybertek.utilities_forlesson.Driver;
import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginTest extends TestBase {

@Test

    public void test1(){

      driver.get(ConfigurationReader.get("url"));
      driver.findElement(By.id("prependedInput")).sendKeys("user1");
    driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+ Keys.ENTER);


}



}
