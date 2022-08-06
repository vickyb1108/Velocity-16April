package com.sauceDemo.TestClasses;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomepagePOMclass;
import com.sauceDemo.UtilityClasses.ScreenShot;



public class TC003VerifyWeatherWeAreAbleToSelectTheProductOrNot extends BasicTestClassRepetedCode 
{

	//Create object of home page
	  
	 @Test
	 public void checkproductaddtocart() throws IOException
	 {
	  HomepagePOMclass hp = new HomepagePOMclass(driver);
	  
	  hp.bagaddtocart();
	  System.out.println("Click on bagaddtocartbutton");
	  hp.Tshirtaddtocart();
	  System.out.println("Click on TshirtaddtocartButton");
	  ScreenShot.TakeScreenShots(driver);
//	  hp.TshirtRedaddtocart();
//	  hp.Onesieaddtocart();
//	  hp.Fleecejacketaddtocart();
//	  hp.bikelightaddtocart();
	  
	 
	  hp.AddTocart();
	  System.out.println("Click on AlladdtocartButton");
	  ScreenShot.TakeScreenShots(driver);
//	  hp.OpenMenubutton();
//	  System.out.println("Click on Allitems Button");
//	  hp.logouttab();
//	  System.out.println("Click on logout Button");
	  
	  String expectedURL = "https://www.saucedemo.com/cart.html";
	  String ActualURL = driver.getCurrentUrl();
	  
	  
	  Assert.assertEquals(ActualURL, expectedURL);
	  
	  
	 }
	  
//	  if(expectedURL.equals(ActualURL))
//	  {
//		  System.out.println("TEST CASE IS PASS");
//	  }
//	  else
//	  {
//		  System.out.println("TEST CASE IS FAIL");
//	  }
//	 }
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

  }

