package com.cybertek.tests_Lesson_SelfStudy.day10_sync;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExpilicitWait {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void tearDownMethod() {
        //driver.quit();
    }


    @Test
    public void test1(){

        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
       driver.findElement(By.tagName("button")).click();

        WebElement username= driver.findElement(By.id("username"));

        WebDriverWait wait= new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(username));


        username.sendKeys("asj");


    }
}