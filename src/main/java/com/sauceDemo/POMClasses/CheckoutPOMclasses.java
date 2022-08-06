package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPOMclasses 
{
      private WebDriver driver;
     
      @FindBy(xpath="//input[@id='first-name']")
      WebElement FirstName;
     
     public void SendFirstName()
     {
    	 FirstName.sendKeys("Vicky");
     }
     
     @FindBy(xpath="//input[@id='last-name']")
     WebElement LastName;
     
     public void sendLastname()
     {
    	 LastName.sendKeys("Bachhav");
     }
     
     @FindBy(xpath="//input[@id='postal-code']")
     WebElement Postalcode;
     
     public void sendpostalcode()
     {
    	 Postalcode.sendKeys("422009");
     }
     
     @FindBy(xpath="//input[@id='continue']")
     WebElement ContinueTab;
     public void ClickonContinueTab()
     {
    	 ContinueTab.click();
     }
     
     @FindBy(xpath="//button[@id='cancel']")
     WebElement CancelTab;
     
     public void ClickOnCancelTab()
     {
    	 CancelTab.click();
     }
     
     public CheckoutPOMclasses(WebDriver driver)
     {
    	 this.driver = driver;
    	 
    	 PageFactory.initElements(driver, this);
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
