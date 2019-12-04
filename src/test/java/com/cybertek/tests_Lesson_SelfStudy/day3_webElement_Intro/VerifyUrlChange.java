package com.cybertek.tests_Lesson_SelfStudy.day3_webElement_Intro;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlChange {
//    open browser
//    go to http://practice.cybertekschool.com/forgot_password Links to an external site.
//    enter any email
//    click on Retrieve password
//    verify that url changed to http://practice.cybertekschool.com/email_sent

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInput= driver.findElement(By.name("email"));
         emailInput.sendKeys("email@gmail.com");

         WebElement retrivePasswordButton= driver.findElement(By.id("form_submit"));
         retrivePasswordButton.click();

         String expectedUrl="http://practice.cybertekschool.com/email_sent";

         String actualUrl = driver.getCurrentUrl();

         if(expectedUrl.equals(actualUrl)){

             System.out.println("PASS");
         }else{
             System.out.println("FAIL");
             System.out.println("actualUrl = " + actualUrl);
             System.out.println("expectedUrl = " + expectedUrl);
         }

        //close
       // driver.quit();

    }



}
