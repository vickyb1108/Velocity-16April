package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ByPagePOMClasses 
{
      private WebDriver driver;
      
      @FindBy(xpath="//button[@id='finish']")
      
      WebElement FINISHTAB;
      
      public void ClickOnFINISHButton()
      {
    	  FINISHTAB.click();
      }
      
      @FindBy(xpath="//button[@id='cancel']")
      
      WebElement CancelButton;
      
      public void ClickOncancelButton()
      {
    	  CancelButton.click();
    	  
      }
      
      @FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']")
  	
  	   WebElement ShowMsgonlast;
  	
  	   public void TextShowMsgonlast()
  	   {
  		ShowMsgonlast.getText();
  	   }

      
      public ByPagePOMClasses(WebDriver driver)
      {
    	  this.driver = driver;
    	  
    	  PageFactory.initElements(driver, this);
      }
      
      
      
      
      
      
      
      
  
}
