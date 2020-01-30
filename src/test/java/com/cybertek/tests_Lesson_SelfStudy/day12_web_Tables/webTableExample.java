package com.cybertek.tests_Lesson_SelfStudy.day12_web_Tables;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class webTableExample {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/tables");
    }

    @AfterMethod
    public void tearDownMethod() {

        //driver.quit();
    }

    @Test

    public void printTable() {

        WebElement table = driver.findElement(By.id("table1"));
        System.out.println(table.getText());
        String wholeTable = table.getText();
        // verify that jsmith@gmail.com in the table
        Assert.assertTrue(wholeTable.contains("jsmith@gmail.com"), "verify that jsmith@gmail.com in the table");
    }

    @Test
    public void getAllHeaders() {

        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));

        System.out.println("number of colums " + headers.size());

        for (WebElement header : headers) {
            System.out.println(header.getText());
        }
    }

    @Test

    public void printTableSize() {
        //number of colum th dir
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));

        System.out.println("number of colums " + headers.size());

        //number of rows with header or without

        List<WebElement> allRowsWithHeader = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println("allrowswith headers " + allRowsWithHeader.size());


        List<WebElement> allRowsWithoutHeader = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println("allrows without headers " + allRowsWithoutHeader);


    }

    @Test

    public void getRow() {

        WebElement secondRow = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]"));
        System.out.println(secondRow);


        //  get all rows dynamikli
        //1  get number of rows
        //2  base on num of rows iterate each row

        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));

        for (int i = 1; i <= allRows.size(); i++) {

            String rowXpath = "//table[@id='table1']/tbody/tr[" + i + "]";
            System.out.println(rowXpath);
            WebElement singleRow = driver.findElement(By.xpath(rowXpath));
            System.out.println(singleRow.getText());


        }

    }


    @Test
    public void getAllCellsInOneRow() {

        List<WebElement> allCellsOneRow = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));

        for (WebElement cell : allCellsOneRow) {

            System.out.println(cell.getText());
        }


    }

    @Test
    public void getSingleCellByIndex() {

        WebElement singleCell = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[3]"));
        System.out.println(singleCell.getText());

    }

     @Test
    public void printAllCellByIndex() {

        //number of rows
        int rowNumber = getNumberOfRow();
    // number of colums
  int   columNumber=getNumberOfColums();

         for (int i = 1; i <= rowNumber; i++) {

             for (int j = 1; j <=columNumber; j++) {

           String xpath="//table[@id='table1']/tbody/tr[" +i + "]/td[" +j +"]";
               //  System.out.println(xpath);
                 WebElement singleCell=driver.findElement(By.xpath(xpath));
                 System.out.println(singleCell.getText());
             }
         }

    }





















    private int getNumberOfColums() {

        List<WebElement>allColums  =driver.findElements(By.xpath("//table[@id='table1']//th"));
       return allColums.size();
    }

    private int getNumberOfRow() {

    List<WebElement>allRows  =driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));

     return  allRows.size();
          }













    }












