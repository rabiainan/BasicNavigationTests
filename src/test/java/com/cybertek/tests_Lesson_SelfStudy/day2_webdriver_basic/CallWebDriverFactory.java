package com.cybertek.tests_Lesson_SelfStudy.day2_webdriver_basic;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {

    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();
//
//        WebDriver driver= new ChromeDriver();  bu iki satirin yerine utilite ollusturdugumuz methodu kullandik


        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.google.com");
    }


}
