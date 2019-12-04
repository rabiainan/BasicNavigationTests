package com.cybertek.tests_Lesson_SelfStudy.day2_webdriver_basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.google.com");

        driver.navigate().to("https://www.facebook.com");

         driver.navigate().back();

        Thread.sleep(3000);

         driver.navigate().forward();
        driver.navigate().refresh();




    }
}
