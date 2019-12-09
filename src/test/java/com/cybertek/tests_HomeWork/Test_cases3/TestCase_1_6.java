package com.cybertek.tests_HomeWork.Test_cases3;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestCase_1_6 {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa1.vytrack.com/");
        WebElement usernameInput= driver.findElement(By.id("prependedInput"));
        usernameInput.sendKeys("storemanager85");
        WebElement password=driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();

        WebElement activitiesModule=driver.findElement(By.xpath("(//span[@class='title title-level-1'])[5]"));
        WebElement  calendar=driver.findElement(By.xpath("(//span[contains(text(),'Calendar Events' )])"));

        WebDriverWait waits= new WebDriverWait(driver,10);
        waits.until(ExpectedConditions.elementToBeClickable(activitiesModule));

        Actions actions= new Actions(driver);
        actions.moveToElement(activitiesModule).clickAndHold().moveToElement(calendar).click().build().perform();
        Thread.sleep(5000);
    }

    @AfterMethod
    public void tearDownMethod() {

        //driver.quit();
    }

@Test
    public void test1() throws InterruptedException {
    // 4.Verify that page subtitle "Options" is displayed

    WebElement optionsPage=driver.findElement(By.xpath("//div[@class='btn btn-link dropdown-toggle']"));
    Thread.sleep(5000);
    Assert.assertTrue(optionsPage.isDisplayed(),"Verify that page subtitle 'Options' is displayed");

}
@Test
    public void test2() throws InterruptedException{
   // 4.Verify that page number is equals to "1"

    WebDriverWait wait= new WebDriverWait(driver,15);
    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@value='1']"))));


    WebElement pageNumber=driver.findElement(By.xpath("//input[@value='1']"));

    String actualPagenumber= pageNumber.getAttribute("value");
    System.out.println(actualPagenumber);

    Assert.assertEquals(actualPagenumber,"1","Verify that page number is equals to '1'");


}
@Test
public void test3() throws InterruptedException {
        // 4.Verify that view per page number is equals to "25"

    WebElement viewPage = driver.findElement(By.xpath("//button[@class='btn dropdown-toggle ']"));
    String  actualpage= viewPage.getText();
    Thread.sleep(5000);
    Assert.assertEquals(actualpage,"25","Verify that view per page number is equals to '25' ");
}

@Test
 public void test4() throws InterruptedException {
  //  4.Verify that number of calendar events (rows in the table) is equals to number of records

    List<WebElement> allRowsWithoutHeader=driver.findElements(By.xpath("//tr[@class='grid-row row-click-action']"));
    Thread.sleep(5000);
    System.out.println(allRowsWithoutHeader.size());

   WebElement numberOfRecord=driver.findElement(By.xpath("//label[text()='Total of 24 records']"));
    Thread.sleep(5000);
   String  numberRecord=numberOfRecord.getText();
    System.out.println(numberRecord);

   Assert.assertTrue( numberRecord.contains("24"),"Verify that number of calendar events (rows in the table) is equals to number of records");

}

@Test
    public  void test5() throws InterruptedException {
    // 5.Verify that all calendar events were selected
    WebElement checkbox=driver.findElement(By.xpath("(//input[@type='checkbox'])[7]"));
    Thread.sleep(5000);
    checkbox.click();
   Assert.assertTrue(checkbox.isSelected(),"Verify that all calendar events were selected");
}

@Test

    public  void test6() throws InterruptedException {

   // 4.Select “Testers meeting”
   // 5.Verify that following data is displayed:

   WebElement checkBox=driver.findElement(By.xpath("(//input[@tabindex='-1'])[14]"));
   Thread.sleep(5000);
    checkBox.click();
    Assert.assertTrue(checkBox.isSelected()," Verify that Select 'Testers meeting'");

 WebElement checkBoxClick=driver.findElement(By.xpath("(//td[text()='Testers Meeting'])[1]"));
    Thread.sleep(5000);
    checkBox.click();


}

}
