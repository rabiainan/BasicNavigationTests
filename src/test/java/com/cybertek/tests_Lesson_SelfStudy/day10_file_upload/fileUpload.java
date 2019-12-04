package com.cybertek.tests_Lesson_SelfStudy.day10_file_upload;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class fileUpload {
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
    public  void test1(){
    driver.get("http://practice.cybertekschool.com/upload");
         driver.findElement(By.name("file")).sendKeys("C:\\Users\\rabia\\Desktop\\file.txt");
         driver.findElement(By.id("file-submit")).click();
}



}
