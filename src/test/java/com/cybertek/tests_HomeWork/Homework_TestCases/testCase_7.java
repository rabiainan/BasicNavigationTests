package com.cybertek.tests_HomeWork.Homework_TestCases;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase_7 {
    WebDriver driver;
    @Test
    //Test case #7
     //Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
    // Step 2. And click on “File Upload".
    // Step 3. Upload any file with .txt extension from your computer.
    // Step 4. Click “Upload” button.
    // Step 5. Verify that subject is: “File Uploaded!”
    // Step 6. Verify that uploaded file name is displayed.
    // Note: use element.sendKeys(“/file/path”) with specifying path to the file for uploading. Run this method against “Choose File” button.

    public void test1() {
    driver = WebDriverFactory.getDriver("chrome");
    driver.get("https://practice-cybertekschool.herokuapp.com");
    driver.findElement(By.linkText("File Upload")).click();
    driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\rabia\\Desktop\\testCase_7.txt");
    driver.findElement(By.id("file-submit")).click();

    String message= driver.findElement(By.tagName("h3")).getText();
    Assert.assertEquals(message,"File Uploaded!","Verify that subject is:");
    System.out.println(driver.findElement(By.id("uploaded-files")).getText());
}
}