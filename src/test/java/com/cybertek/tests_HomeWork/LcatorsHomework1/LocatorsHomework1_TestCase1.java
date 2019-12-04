package com.cybertek.tests_HomeWork.LcatorsHomework1;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsHomework1_TestCase1 {

    /*
    Test case 1
    Go to ebay
    enter search term
    Click on search button
    print number of results
     */
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.ebay.co.uk/");

        WebElement searchInput=driver.findElement(By.xpath("//*[@type='text']"));

        searchInput.sendKeys("java");

        WebElement searchButton= driver.findElement(By.id("gh-btn"));

        searchButton.click();

       WebElement result= driver.findElement(By.xpath("//*[contains(text(),' results for ')]/span[1]"));

        System.out.println(result.getText());

        String expectedResult="3,500,903";
        String actualResult=result.getText();

        if (expectedResult.equals(actualResult)){

            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedResult = " + expectedResult);
            System.out.println("actualResult = " + actualResult);
        }



    }


}
