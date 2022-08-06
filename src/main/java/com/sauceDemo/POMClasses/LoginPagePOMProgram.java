package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMProgram 
{
      //Declare globally driver
	   private WebDriver driver;
	   
	  //find Element 
	   
	   @FindBy(xpath="//input[@id='user-name']")
	   private WebElement username;
	   
	   // perform action on web element
	   
	   public void sendusername()
	   {
		   username.sendKeys("standard_user");
	   }
	   
	   //Password
	   
	   @FindBy(xpath="//input[@id='password']")
	   private WebElement Password;
	   
	   //action
	   
	   public void sendpassword()
	   {
		   Password.sendKeys("secret_sauce"); 
	   }
	   
	   //Login Button
	   
	   @FindBy(xpath = "//input[@id='login-button']")
	   private WebElement LoginButton;
	   
	   //action
	   
	   public void LoginButtonclick()
	   {
		   LoginButton.click();
	   }
	   
	   //Constructor Declare
	   
	   public LoginPagePOMProgram (WebDriver driver)
	   {
		     // global   local
		   this.driver = driver;
		   
		   // selenium clas
		   
		   PageFactory.initElements(driver, this);
	   }
	 
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
      
      
      
      
      
      
      
      
      
      
      
}
