package com.cybertek.pages;


import com.cybertek.utilities_forlesson.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    //OR  biri dogru olsa yeter
    // @FindAll({    we can give multiple locator

    // @FindBy(id="prependedInput2")   ,
    // @FindBy(xpath="_username")
   // })

    //AND ikiside dogru olmali
    // @FindBys({
    //  @FindBy(id="prependedInput2")   ,
    //  @FindBy(xpath="_username")
    // })
    // public Webelement username2



    //same with driver.findElement(By.id("prependedInput"));
    @FindBy(name = "_username")
    public WebElement usernameInput;
    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;
    @FindBy(id = "_submit")
    public WebElement loginBtn;


   public void login(String usernameStr,String passwordStr){
       usernameInput.sendKeys(usernameStr);
       passwordInput.sendKeys(passwordStr);
       loginBtn.click();
   }



}
