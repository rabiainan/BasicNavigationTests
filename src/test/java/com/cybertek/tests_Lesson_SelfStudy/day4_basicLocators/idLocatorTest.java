package com.cybertek.tests_Lesson_SelfStudy.day4_basicLocators;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class idLocatorTest {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement dontClickButton= driver.findElement(By.id("disappearing_button"));
        dontClickButton.click();

         //driver.quit();
    }



}
