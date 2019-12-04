package com.cybertek.tests_HomeWork.Homework_TestCases;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestScripts_testCases1_5 {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDMethod(){

       //driver.quit();
    }

    @Test
    public  void test1() throws InterruptedException {
        //Test case #1
        // Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
        // Step 2. Click on “Registration Form”
        // Step 3. Enter “wrong_dob” into date of birth input box.Step
        // 4. Verify that warning message is displayed: “The date of birth is not valid”

        driver.get("https://practice-cybertekschool.herokuapp.com");

        driver.findElement(By.xpath("//*[@name='birthday']")).sendKeys( "wrong_dob");

        String actualMessage=driver.findElement(By.xpath("//*[@data-bv-validator='date']")).getText();
        Assert.assertEquals(actualMessage,"The date of birth is not valid","Verify that warning message is displayed" );
    }

       @Test
      public void test2() throws InterruptedException {
           //Test case #2
           //Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
           // Step 2. Click on “Registration Form”Step
           // 3. Verify that following options for programming languages are displayed: c++, java, JavaScript

        driver.get("https://practice-cybertekschool.herokuapp.com");
           driver.findElement(By.linkText("Registration Form")).click();
           Thread.sleep( 5000);
           System.out.println(driver.findElement(By.xpath("//*[@for='inlineCheckbox1']")).isDisplayed());
           Assert.assertTrue(driver.findElement(By.xpath("//*[@for='inlineCheckbox1']")).isDisplayed(),"Verify that following options for programming languages are displayed: c++");

           System.out.println(driver.findElement(By.xpath("//*[@for='inlineCheckbox2']")).isDisplayed());
           Assert.assertTrue(driver.findElement(By.xpath("//*[@for='inlineCheckbox2']")).isDisplayed(),"Verify that following options for programming languages are displayed: java");

           System.out.println(driver.findElement(By.xpath("//*[@for='inlineCheckbox3']")).isDisplayed());
           Assert.assertTrue(driver.findElement(By.xpath("//*[@for='inlineCheckbox3']")).isDisplayed(),"Verify that following options for programming languages are displayed: JavaScript");
       }


       @Test
       public  void test3(){
           // Test case #3
           //  Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
           // Step 2. Click on “Registration Form”
           // Step 3. Enter only one alphabetic character into first name input box.
           // Step 4. Verify that warning message is displayed: “first name must be more than 2 and less than 64 characters long”
         driver.get("https://practice-cybertekschool.herokuapp.com");
         driver.findElement(By.linkText("Registration Form")).click();
         driver.findElement(By.name("firstname")).sendKeys("S");
          String message=driver.findElement(By.cssSelector("[data-bv-result='INVALID']")).getText();

          Assert.assertEquals(message,"first name must be more than 2 and less than 64 characters long", "Verify that warning message is displayed");

       }


       @Test

     public  void test4(){
           //Test case #4
           //Step 1. Go to https://practice-cybertekschool.herokuapp.com
           // Step 2. Click on “Registration Form”
           // Step 3. Enter only one alphabetic character into last name input box.
           // Step 4. Verify that warning message is displayed: “The last name must be more than 2 and less than 64 characters long”

       driver.get("https://practice-cybertekschool.herokuapp.com");
       driver.findElement(By.linkText("Registration Form")).click();
       driver.findElement(By.name("lastname")).sendKeys("K");
       String message=driver.findElement(By.xpath("//*[@data-bv-for='lastname'][2]")).getText();
       Assert.assertEquals(message,"The last name must be more than 2 and less than 64 characters long","Verify that warning message is displayed: ");
       }

       @Test
       public void test5() throws InterruptedException {
           //Test case #5
           //Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
           // Step 2. Click on “Registration Form”
           // Step 3. Enter any valid first name.
           // Step 4. Enter any valid last name.
           // Step 5. Enter any valid user name.
           // Step 6. Enter any valid password.
           // Step 7. Enter any valid phone number.
           // Step 8. Select gender.
           // Step 9. Enter any valid date of birth.
           // Step 10. Select any department.
           // Step 11. Enter any job title.
           // Step 12. Select java as a programming language.
           // Step 13. Click Sign up.
           // Step 14. Verify that following success message is displayed: “You've successfully completed registration!”

        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.name("firstname")).sendKeys("Esma");
        driver.findElement(By.name("lastname")).sendKeys("Aydin");
        driver.findElement(By.name("username")).sendKeys("Esma123");
        driver.findElement(By.name("email")).sendKeys("email@email.com");
        driver.findElement(By.name("password")).sendKeys("Abc12345");
        driver.findElement(By.name("phone")).sendKeys("571-999-1448");
        WebElement genderFemale=driver.findElement(By.xpath("//*[@value='female']"));
        Thread.sleep(5000);
        genderFemale.click();
        Assert.assertTrue(genderFemale.isSelected(),"verify that female radio button selected");
        driver.findElement(By.name("birthday")).sendKeys("12/09/1987");
        WebElement departmanDropdown=driver.findElement(By.name("department"));
        Select departmans=new Select(departmanDropdown);
        departmans.selectByVisibleText("Department of Engineering");

           WebElement jobDropdown=driver.findElement(By.name("job_title"));
           Select job=new Select(jobDropdown);
           job.selectByVisibleText("SDET");
        driver.findElement(By.xpath("//*[@value='java']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@value='java']")).isSelected(),"verify that java is selected");
        driver.findElement(By.id("wooden_spoon")).click();
        String message= driver.findElement(By.tagName("p")).getText();
        Assert.assertEquals(message,"You've successfully completed registration!","Verify that following success message is displayed:");
       }


}
