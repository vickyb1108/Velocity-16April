package com.sauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.ByPagePOMClasses;
import com.sauceDemo.POMClasses.CartPagePOMclass;
import com.sauceDemo.POMClasses.CheckoutPOMclasses;
import com.sauceDemo.POMClasses.HomepagePOMclass;
import com.sauceDemo.UtilityClasses.ScreenShot;



public class TC008VerifyWeatherWeAreAbleToBuyTheProductOrNot extends BasicTestClassRepetedCode 
{
	 
    @Test
    public void buyProductFuntionality() throws IOException
    {
    
      //Create object of home page
	  
	  HomepagePOMclass hp = new HomepagePOMclass(driver);
	  
	  hp.bagaddtocart();
	  System.out.println("Click on bagaddtocartbutton");
	  ScreenShot.TakeScreenShots(driver);
	  hp.AddTocart();
	  System.out.println("Click on AlladdtocartButton");
	  
	  //create object of cartpage POM class
	  CartPagePOMclass ac = new CartPagePOMclass(driver);
	  
	  ac.Checkout();
	  System.out.println("Click on Checkout button");
	  ScreenShot.TakeScreenShots(driver);
	  //crate object of checkoutPOMclass
	  
	  CheckoutPOMclasses cp = new CheckoutPOMclasses(driver);
	  
	  cp.SendFirstName();
	  System.out.println("Enter the first name");
	  cp.sendLastname();
	  System.out.println("Enter the last name");
	  cp.sendpostalcode();
	  System.out.println("Enter the postal code");
	  ScreenShot.TakeScreenShots(driver);
	  cp.ClickonContinueTab();
	  System.out.println("Click on continue tab");
	  
	  //crate object of Bypage POM class
	  
	  ByPagePOMClasses bp = new ByPagePOMClasses(driver);
	  ScreenShot.TakeScreenShots(driver);
	  bp.ClickOnFINISHButton();
	  System.out.println("Click on finish button");
	  bp.TextShowMsgonlast();
	  System.out.println("THANK YOU FOR YOUR ORDER");
	  
	  
	  String expectedURL = "https://www.saucedemo.com/checkout-complete.html";
	  String ActualURL = driver.getCurrentUrl();
	  
	  
	  Assert.assertEquals(ActualURL, expectedURL);
	  

//	  if(expectedURL.equals(ActualURL))
//	  {
//		  System.out.println("TEST CASE IS PASS");
//	  }
//	  else
//	  {
//		  System.out.println("TEST CASE IS FAIL");
//	  }
	  
    }
    
    
}
