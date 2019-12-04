package com.cybertek.tests_Lesson_SelfStudy.day4_basicLocators;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocator {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome") ;
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement homeLink =driver.findElement(By.className("nav-link"));
        homeLink.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        System.out.println(driver.findElement(By.className("h3")).getText());
        // if there is space class value we can not use class name
    }
}
