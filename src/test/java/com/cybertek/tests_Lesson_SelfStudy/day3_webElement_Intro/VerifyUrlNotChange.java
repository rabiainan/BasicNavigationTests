package com.cybertek.tests_Lesson_SelfStudy.day3_webElement_Intro;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlNotChange {
    /**Verify URL not changed
     open browser
     go to http://practice.cybertekschool.com/forgot_password Links to an external site.
     click on Retrieve password
     verify that url did not change
     */

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        String expectedUrl= driver.getCurrentUrl();

        WebElement retrivePasswordButton=driver.findElement(By.id("form_submit"));
        retrivePasswordButton.click();

        String actualUrl= driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.quit();
    }


}
