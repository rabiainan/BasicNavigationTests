package com.cybertek.tests_Lesson_SelfStudy.day7_type_ofElements;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisbleElementTest {
@Test
    public  void test1(){
    WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/radio_buttons");
    WebElement greenButton= driver.findElement(By.id("green"));

    Assert.assertFalse(greenButton.isEnabled(),"verify that green button is disable");

    greenButton.click();

}

@Test

    public  void test2(){
    WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/dynamic_controls");

WebElement inputBox= driver.findElement(By.cssSelector("[type='text']"));
    System.out.println("is input enable"+inputBox.isEnabled());
    inputBox.sendKeys("mike smith");



}

}
