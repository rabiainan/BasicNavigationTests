package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
   static  WebDriver driver = null;
    public static WebDriver getDriver(String browserName) {

        String OS = System.getProperty("os.name");
        if (browserName.equals("safari") && OS.equals("windows")) {
            return null;
        } else if (browserName.equals("safari") && OS.equals("windows")) {

        } else {
            switch (browserName) {

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "edge":

                    System.getProperty("webdriver.edge.driver", "C:\\Users\\rabia\\Downloads\\MicrosoftWebDriver.exe");
                    driver = new EdgeDriver();
                    break;
                default:
            }
        }
            return driver;
        }

    }

