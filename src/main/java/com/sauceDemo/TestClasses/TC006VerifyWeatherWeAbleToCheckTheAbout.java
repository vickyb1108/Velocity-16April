package com.sauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomepagePOMclass;

import com.sauceDemo.UtilityClasses.ScreenShot;



public class TC006VerifyWeatherWeAbleToCheckTheAbout extends BasicTestClassRepetedCode 
{
	
	@Test
	public void checkaboutTabFuntionality() throws IOException
	{
	  
	  //create Home page POM class object
	  HomepagePOMclass hp = new HomepagePOMclass(driver);
	  
	  hp.OpenMenubutton();
	  System.out.println("Click on MenuButton");
	  ScreenShot.TakeScreenShots(driver);
	  hp.AboutTab();
	  System.out.println("Click on about tab");
	  
	  String ExpectedURL = "https://saucelabs.com/";
	  String ActualURL =  driver.getCurrentUrl();
	  
	  Assert.assertEquals(ActualURL, ExpectedURL);
	  
	  
	  
	  
	  
//	  if(ExpectedURL.equals(ActualURL))
//	  {
//		  System.out.println("TEST case is Pass");
//	  }
//	  else
//	  {
//		  System.out.println("Test case is Fail");
//	  }
	}
	  
}

