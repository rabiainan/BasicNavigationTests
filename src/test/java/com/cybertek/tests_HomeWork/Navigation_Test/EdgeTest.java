package com.cybertek.tests_HomeWork.Navigation_Test;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class EdgeTest {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver= BrowserFactory.getDriver("edge");
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        String title1=driver.getTitle();

        driver.get("https://etsy.com");
        String title2=driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(title1,driver.getTitle());
        Thread.sleep(2000);

        driver.navigate().forward();
        StringUtility.verifyEquals(title2,driver.getTitle());

    }


}
