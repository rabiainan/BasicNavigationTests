package com.cybertek.tests_HomeWork.LcatorsHomework1;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsHomework1_TestCase2 {
    /*
   Test case 2
   go to amazon
   Go to ebay
   enter search term
  click on search button
   verify title contains search term
     */

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.ebay.co.uk/");

        WebElement searchInput=driver.findElement(By.xpath("//*[@type='text']"));

        searchInput.sendKeys("java");

        WebElement searchButton= driver.findElement(By.id("gh-btn"));

        searchButton.click();

        WebElement result= driver.findElement(By.xpath("//*[@class='srp-controls__count-heading']/span[2]"));

        driver.get("https://www.amazon.co.uk/");

       searchInput=driver.findElement(By.id("twotabsearchtextbox"));
        searchInput.sendKeys("java");
        searchButton= driver.findElement(By.xpath("//*[@value='Go']"));
        searchButton.click();

        result= driver.findElement(By.xpath("//*[@class='a-color-state a-text-bold']"));


       String expextedResultem=result.getText();

       if(expextedResultem.contains("java")){

           System.out.println("PASS");
       }else{
           System.out.println("FAIL");

       }


    }

}
