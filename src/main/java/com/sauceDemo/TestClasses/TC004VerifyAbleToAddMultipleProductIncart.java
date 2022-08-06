package com.sauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.MultipleElementPOMclass;
import com.sauceDemo.UtilityClasses.ScreenShot;



public class TC004VerifyAbleToAddMultipleProductIncart extends BasicTestClassRepetedCode 
{
	
      @Test
	  public void Multiproductaddtocartfunctionality() throws IOException 
	  {  
	  MultipleElementPOMclass ME = new MultipleElementPOMclass(driver);
	  
	  ME.multiaddtocard();
	  ScreenShot.TakeScreenShots(driver);
	  String Actualcount = ME.gettextFromaddtocartbutton();
	  String ExpectedCount = "6";
	  
	  
	  Assert.assertEquals(Actualcount, ExpectedCount);
	  
	  
	  
	  
//	  if(ExpectedCount.equals(Actualcount))
//	  {
//		  System.out.println("Test case is pass");
//	  }
//	  else
//	  {
//		  System.out.println("Test case is fail");
//		
//	  }
	  }
      
}
