package com.cybertek.tests_Lesson_SelfStudy.day8_type_ofElements2;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributeTest {


    @Test
    public  void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome") ;
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement radioButton=driver.findElement(By.id("blue")) ;
        System.out.println(radioButton.getAttribute("name"));// attribute name yaz valuyusunu al
        System.out.println(radioButton.getAttribute("id"));
        System.out.println(radioButton.getAttribute("href")); //try to get attribute does not exist null return
        System.out.println(radioButton.getAttribute("checked"));
        System.out.println(radioButton.getAttribute("outerHTML"));// outerHTML return full html that element

       //3 rd way of getting text web element
       // radioButton.getAttribute("innerHTML");




    }
}
