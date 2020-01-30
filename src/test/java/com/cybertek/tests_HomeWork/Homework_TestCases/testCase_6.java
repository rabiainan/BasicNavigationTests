
package com.cybertek.tests_HomeWork.Homework_TestCases;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase_6 {
    WebDriver driver;
    //Test case #6
    //Step 1. Go to "https://www.tempmailaddress.com/"
    // Step 2. Copy and save email as a string.
    //   Step 3. Then go to “https://practice-cybertekschool.herokuapp.com”
    // Step 4. And click on “Sign Up For Mailing List".
    // Step 5. Enter any valid name.
    // Step 6. Enter email from the Step 2.
    // Step 7. Click Sign Up
    // Step 8. Verify that following message is displayed: “Thank you for signing up. Click the button below to return to the home page.”
    // Step 9. Navigate back to the “https://www.tempmailaddress.com/”
    // Step 10. Verify that you’ve received an email from “do-not-reply@practice.cybertekschool.com”
    //Step 11. Click on that email to open it.
    // Step 12. Verify that email is from: “do-not-reply@practice.cybertekschool.com”
    //Step 13. Verify that subject is: “Thanks for subscribing to practice.cybertekschool.com!”

   @Test
    public  void test1(){
       driver= WebDriverFactory.getDriver("chrome");
       driver.get("https://www.tempmailaddress.com/");
       String email= driver.findElement(By.id("email")).getText();
       System.out.println(email);
       driver.get("https://practice-cybertekschool.herokuapp.com");
       driver.findElement(By.linkText("Sign Up For Mailing List")).click();
       driver.findElement(By.name("full_name")).sendKeys("asya");
       driver.findElement(By.name("email")).sendKeys(email);
       driver.findElement(By.name("wooden_spoon")).click();
       String message=driver.findElement(By.name("signup_message")).getText();
       Assert.assertEquals(message,"Thank you for signing up. Click the button below to return to the home page.");
       driver.navigate().to("https://www.tempmailaddress.com/");



    WebElement emailFromCybertek=driver.findElement(By.cssSelector("tbody#schranka td:nth-of-type(1)"));
      emailFromCybertek.click();
  System.out.println(emailFromCybertek.getText());

   }






}
