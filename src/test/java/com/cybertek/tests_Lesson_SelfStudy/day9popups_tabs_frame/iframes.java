package com.cybertek.tests_Lesson_SelfStudy.day9popups_tabs_frame;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframes {

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
    public void tets1() {
        driver.get("http://practice.cybertekschool.com/iframe");

        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.id("tinymce")).sendKeys("asss");
        driver.switchTo().defaultContent();// go back parent en basdaki temel html
        driver.switchTo().parentFrame();// one parent gider
        //2. using index
        driver.switchTo().frame(0);
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("asssnnn");
    }

    @Test
    public void multipleFrame() {
        driver.get("http://practice.cybertekschool.com/nested_frames");
       driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
    }
}