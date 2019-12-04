package com.cybertek.tests_HomeWork.LcatorsHomework1;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsHomework1_TestCase3 {
    public static void main(String[] args) {
     /*
     Test case 3
    Go to wikipedia.org (Links to an external site.)
    enter search term `selenium webdriver`
    click on search button
    click on search result `Selenium (software)`
    Verify url ends with `Selenium_(software)'
      */
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.wikipedia.org/");

        WebElement serchInput=driver.findElement(By.id("searchInput"));
        serchInput.sendKeys("selenium webdriver");
        WebElement serchButton=driver.findElement(By.xpath("//button[@type='submit']"));

        serchButton.click();
       WebElement searchResult=driver.findElement(By.xpath("//a[@title='Selenium (software)']"));
       searchResult.click();
     String actualUrl=driver.getCurrentUrl();

     if(actualUrl.endsWith("Selenium_(software)")){
         System.out.println("PASS");
     }else{
         System.out.println("FALSE");

     }
       driver.quit();

    }



}
