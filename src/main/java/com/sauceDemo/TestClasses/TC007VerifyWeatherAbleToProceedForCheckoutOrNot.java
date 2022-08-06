package com.sauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.CartPagePOMclass;

import com.sauceDemo.POMClasses.HomepagePOMclass;
import com.sauceDemo.UtilityClasses.ScreenShot;


public class TC007VerifyWeatherAbleToProceedForCheckoutOrNot extends BasicTestClassRepetedCode 
{
   
   @Test
   public void checkOutButtonFuntionality() throws IOException
   {
	  //crate home page POM class object
      HomepagePOMclass hp = new HomepagePOMclass(driver);
	  
	  hp.bagaddtocart();
	  System.out.println("Click on bagaddtocartbutton");
	  
	  hp.AddTocart();
	  System.out.println("Click on AlladdtocartButton");
	  ScreenShot.TakeScreenShots(driver);
	//create object of cartpage POM class
	  CartPagePOMclass ac = new CartPagePOMclass(driver);
	  ScreenShot.TakeScreenShots(driver);
	  ac.Checkout();
	  System.out.println("Click on Checkout button");
	  
	  String ExpectedURL = "https://www.saucedemo.com/checkout-step-one.html";
	  String ActualURl = driver.getCurrentUrl();
	  
	  Assert.assertEquals(ActualURl, ExpectedURL);
	  
//	  if(ExpectedURL.equals(ActualURl))
//	  {
//		  System.out.println("TEST case is pass");
//	  }
//	  else
//	  {
//		  System.out.println("Test case is Fail");
//	  }
   }
   
}
