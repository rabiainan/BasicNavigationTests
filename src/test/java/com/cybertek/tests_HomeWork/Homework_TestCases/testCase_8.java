package com.cybertek.tests_HomeWork.Homework_TestCases;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase_8 {
    WebDriver driver;
   @Test
    //Test case #8
    //Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
    // Step 2. And click on “Autocomplete”.
    // Step 3. Enter “United States of America” into country input box.
    // Step 4. Verify that following message is displayed: “You selected: United States of America”

   public  void test1() {
    driver= WebDriverFactory.getDriver("chrome");
    driver.get("https://practice-cybertekschool.herokuapp.com");
    driver.findElement(By.linkText("Autocomplete")).click();
    driver.findElement(By.cssSelector("#myCountry")).sendKeys("United States of America");
    driver.findElement(By.xpath("//*[@value='Submit']")).click();

    String message=driver.findElement(By.id("result")).getText();
       Assert.assertEquals(message,"You selected: United States of America","Verify that following message is displayed:");
   }


}
