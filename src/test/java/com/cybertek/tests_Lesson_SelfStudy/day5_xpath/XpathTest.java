package com.cybertek.tests_Lesson_SelfStudy.day5_xpath;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathTest {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button1=driver.findElement(By.xpath("//button[ @onclick='button1()']"));
        button1.click();

        //    /html/body/div/div[2]/div/div[1]/p           locate to p
    }

}
