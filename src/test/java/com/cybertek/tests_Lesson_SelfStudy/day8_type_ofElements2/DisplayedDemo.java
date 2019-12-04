package com.cybertek.tests_Lesson_SelfStudy.day8_type_ofElements2;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDemo {


    @Test
    public  void test1() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome") ;
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        WebElement usernameInput=driver.findElement(By.id("username"));

        System.out.println(usernameInput.isDisplayed());//element exist html code but not display screen

        Assert.assertFalse(usernameInput.isDisplayed(), "verif that username input not display");

        WebElement startButton= driver.findElement(By.cssSelector("#start>button"));
        startButton.click();
        Thread.sleep(5000);
        System.out.println(usernameInput.isDisplayed());
        Assert.assertTrue(usernameInput.isDisplayed());

    }
}
