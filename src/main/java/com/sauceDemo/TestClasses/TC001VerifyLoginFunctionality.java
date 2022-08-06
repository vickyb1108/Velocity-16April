package com.sauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001VerifyLoginFunctionality extends BasicTestClassRepetedCode 
{

	  //Home page
	@Test
	  public void loginFunctionality()
	{
	  String expectedTitle = "Swag Labs";
	  String actualTitle =  driver.getTitle();
	  
	  //assertion concept apply
	  Assert.assertEquals(actualTitle, expectedTitle);
	}
	// if else do not work in testNG
//	  if(expectedTitle.equals(actualTitle))
//	  {
//		  System.out.println("Test case is Pass");
//	  }
//	  else
//	  {
//		  System.out.println("Test case is fail");
//	  }
//	 
//	  
//	  System.out.println("END OF PROGRAM");
//	  }
	  
	  
	   
	}

