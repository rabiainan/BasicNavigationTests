package com.cybertek.tests_Lesson_SelfStudy.day4_basicLocators;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LintextAndPartialLintext {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome") ;
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
       // driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 seconds")).click();

        //driver.findElement(By.linkText("Home")).click();

        // partial link   uniuk part its enought

        WebElement link6= driver.findElement(By.partialLinkText("Example 6"));
        link6.click();
    }

}
