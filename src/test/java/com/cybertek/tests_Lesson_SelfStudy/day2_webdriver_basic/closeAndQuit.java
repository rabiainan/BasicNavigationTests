package com.cybertek.tests_Lesson_SelfStudy.day2_webdriver_basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeAndQuit {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

      driver.get("https://practice.cybertekschool.com");

       Thread.sleep(3000);

       driver.close();

       driver = new ChromeDriver();

        driver.get("https://practice.cybertekschool.com/open_new_tab");

        Thread.sleep(5000);
        driver.close();

        driver.quit();


    }


}
