package com.cybertek.tests_Lesson_SelfStudy.day3_webElement_Intro;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {
    /*
      open browser
      go to http://practice.cybertekschool.com/forgot_password Links to an external site.
      enter any email
      verify that email is displayed in the input box
      click on Retrieve password
      verify that confirmation message says 'Your e-mail's been sent!'
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
       // verify that email is displayed in the input box
        WebElement emailInputBox=driver.findElement(By.name("email"));
        String expectedEmail="test@gmail.com";

        emailInputBox.sendKeys(expectedEmail);
             // getText()  if it doe not work you can use getAttribute("value")  method
        String actualEmail=emailInputBox.getAttribute("value");
        if(expectedEmail.equals(actualEmail)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("actualEmail = " + actualEmail);
            System.out.println("expectedEmail = " + expectedEmail);
        }
        //click on Retrieve password

        WebElement retrievePassWordButton= driver.findElement(By.id("form_submit"));
        retrievePassWordButton.click();
    //verify that confirmation message says 'Your e-mail's been sent!'

     String expectedMessage="Your e-mail's been sent!";

     WebElement messageElement= driver.findElement(By.name("confirmation_message"));
     String actualMessage=messageElement.getText();

        if(expectedMessage.equals(actualMessage)){
            System.out.println("PASS");

        }else{
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }
        Thread.sleep(5000);
        driver.quit();
    }






}
