package com.sauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomepagePOMclass;
import com.sauceDemo.UtilityClasses.ScreenShot;

public class TC002VerifyTheLogoutFunctionality extends BasicTestClassRepetedCode 
{
	  
	  //create Home page POM class object
      @Test
      public void logoutFunctionality() throws IOException 
      {
	  HomepagePOMclass hp = new HomepagePOMclass(driver);
	  
	  hp.OpenMenubutton();
	  System.out.println("Click on MenuButton");
	  ScreenShot.TakeScreenShots(driver);
	  hp.logouttab();
	  System.out.println("Click on LogoutTab");
	  
	  String ExpectedResult = "https://www.saucedemo.com/";
	  String ActualResult = driver.getCurrentUrl();
	  
	  //Apply hard assertion
      
	  
	  Assert.assertEquals(ActualResult, ExpectedResult);
	  
      }
}
	  
//	  do not apply If else in TestNG
//	  if(ExpectedResult.equals(ActualResult))
//	  {
//		  System.out.println("Test case is Pass");
//	  }
//	  else
//	  {
//		  System.out.println("Test case is Fail");
//	  }
//      }
	  

