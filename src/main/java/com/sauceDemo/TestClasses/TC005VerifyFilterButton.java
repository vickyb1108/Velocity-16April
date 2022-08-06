package com.sauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.MultipleElementPOMclass;
import com.sauceDemo.UtilityClasses.ScreenShot;



public class TC005VerifyFilterButton extends BasicTestClassRepetedCode 
{
	
	 @Test
	 public void filterbuttonFunctionality() throws IOException
	 {
	  MultipleElementPOMclass ME = new MultipleElementPOMclass(driver);
	  
	  ME.ClickOnFilterButtonDropDown();
	  ScreenShot.TakeScreenShots(driver);
	  System.out.println("Click on FilterButton");
	  //Validation
	  String ExpectedText = "Price (low to high)";
	  String ActualText = ME.DropDowngettext();
	  
	  
	  Assert.assertEquals(ActualText, ExpectedText);
	  
	  
	  
//	  if (ExpectedText.equals(ActualText))
//	  {
//		  System.out.println("Test case is Pass");
//	  }
//	  else
//	  {
//		  System.out.println("Test case is Fail");
//		  
//	  }
	 }
	 
}
	

