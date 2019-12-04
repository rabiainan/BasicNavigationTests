package com.cybertek.tests_Lesson_SelfStudy.day5_xpath;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amozonTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome") ;
        driver.get("https://www.amazon.co.uk/");

       WebElement inputSearch=driver.findElement(By.id("twotabsearchtextbox"));
       inputSearch.sendKeys("selenium");
   Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@value='Go']")).click();

    }


}
