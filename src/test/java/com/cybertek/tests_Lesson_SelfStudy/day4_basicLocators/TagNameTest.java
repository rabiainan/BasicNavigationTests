package com.cybertek.tests_Lesson_SelfStudy.day4_basicLocators;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome") ;
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput=driver.findElement(By.tagName("input"));
        fullNameInput.sendKeys("mike smith");

        WebElement emailInput=driver.findElement(By.name("email"));
        emailInput.sendKeys("email@gmail.com");
        WebElement signUpbutton=driver.findElement(By.tagName("button"));
        signUpbutton.click();

        WebElement message=driver.findElement(By.tagName("h3"));

        System.out.println(message.getText());

        //System.out.println(driver.findElement(By.tagName("h3")).getText());  Quik way


    }
}
