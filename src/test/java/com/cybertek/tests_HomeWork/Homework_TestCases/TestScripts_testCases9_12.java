package com.cybertek.tests_HomeWork.Homework_TestCases;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestScripts_testCases9_12 {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDMethod() {
        driver.quit();
    }

    @Test
    //Test case #9
    //Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
    // Step 2. And click on “Status Codes”.
    // Step 3. Then click on “200”.
    // Step 4. Verify that following message is displayed: “This page returned a 200 status code”
    public  void test9(){

        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Status Codes")).click();
        driver.findElement(By.linkText("200")).click();
        String statusMessage=driver.findElement(By.xpath("//*[@id='content']/div/p/text()[1]")).getText();
        System.out.println(statusMessage);
    }


}
