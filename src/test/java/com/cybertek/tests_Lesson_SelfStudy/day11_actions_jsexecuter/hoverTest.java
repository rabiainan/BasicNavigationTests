package com.cybertek.tests_Lesson_SelfStudy.day11_actions_jsexecuter;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class hoverTest {
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

    public  void test2() throws InterruptedException {
       driver.get("http://practice.cybertekschool.com/hovers");

       for (int i = 1; i < 4; i++) {
        String imageXpath="(//img)["+i+"]";   //(//img)[1]
           System.out.println(imageXpath);

           WebElement img=driver.findElement(By.xpath(imageXpath));
           Actions actions = new Actions(driver);
           Thread.sleep(4000);
            actions.moveToElement(img).perform();
       }
       //   WebElement img2=driver.findElement(By.xpath("(//img2])"));
       //  WebElement img3=driver.findElement(By.xpath("(//img[3])"));


//       WebElement img= driver.findElement(By.tagName("img"));
//
//       Actions actions = new Actions(driver);
//       actions.moveToElement(img).perform();
     //  String textXpath="//h5[.='name: user"+i+"']";
//      WebElement text=driver.findElement(By.xpath(textXpath);
//
//       Assert.assertTrue(text.isDisplayed());



   }
}
