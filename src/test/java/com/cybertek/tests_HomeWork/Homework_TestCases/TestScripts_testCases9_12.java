package com.cybertek.tests_HomeWork.Homework_TestCases;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestScripts_testCases9_12 {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Status Codes")).click();
        Thread.sleep(5000);

    }

    @AfterMethod
    public void tearDMethod() {
       // driver.quit();
    }

    @Test
    //Test case #9
    //Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
    // Step 2. And click on “Status Codes”.
    // Step 3. Then click on “200”.
    // Step 4. Verify that following message is displayed: “This page returned a 200 status code”
    public  void test9() throws InterruptedException {

        driver.findElement(By.linkText("200")).click();

       String statusMessage=driver.findElement(By.xpath("//p[contains(text(),'This page returned a 200 status code.')]")).getText();
      System.out.println(statusMessage);


     String[] ActualM=statusMessage.split("For a definition and common list of HTTP status codes, go here");
     String ActualMessage=ActualM[0].trim();
     System.out.println(ActualMessage);

  Assert.assertEquals(ActualMessage,"This page returned a 200 status code.","Verify that following message is displayed:");
    }
    @Test
    public  void test10() throws InterruptedException {

        driver.findElement(By.linkText("301")).click();

        String statusMessage=driver.findElement(By.xpath("//p[contains(text(),'This page returned a 301 status code.')]")).getText();
        System.out.println(statusMessage);


        String[] ActualM=statusMessage.split("For a definition and common list of HTTP status codes, go here");
        String ActualMessage=ActualM[0].trim();
        System.out.println(ActualMessage);

        Assert.assertEquals(ActualMessage,"This page returned a 301 status code.","Verify that following message is displayed:");
    }
    @Test
    public  void test11() throws InterruptedException {

        driver.findElement(By.linkText("404")).click();

        String statusMessage=driver.findElement(By.xpath("//p[contains(text(),'This page returned a 404 status code.')]")).getText();
        System.out.println(statusMessage);


        String[] ActualM=statusMessage.split("For a definition and common list of HTTP status codes, go here");
        String ActualMessage=ActualM[0].trim();
        System.out.println(ActualMessage);

        Assert.assertEquals(ActualMessage,"This page returned a 404 status code.","Verify that following message is displayed:");
    }
    @Test
    public  void test12() throws InterruptedException {

        driver.findElement(By.linkText("500")).click();

        String statusMessage=driver.findElement(By.xpath("//p[contains(text(),'This page returned a 500 status code.')]")).getText();
        System.out.println(statusMessage);


        String[] ActualM=statusMessage.split("For a definition and common list of HTTP status codes, go here");
        String ActualMessage=ActualM[0].trim();
        System.out.println(ActualMessage);

        Assert.assertEquals(ActualMessage,"This page returned a 500 status code.","Verify that following message is displayed:");
    }




}
