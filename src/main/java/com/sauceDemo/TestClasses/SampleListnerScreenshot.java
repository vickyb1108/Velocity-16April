package com.sauceDemo.TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.LoginPagePOMProgram;
import com.sauceDemo.UtilityClasses.ScreenShot;

@Listeners(com.sauceDemo.UtilityClasses.ListnersScreenshot.class)
public class SampleListnerScreenshot 
{

	public WebDriver driver;
	
	@Test
	public void verifyTitle()
	{
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		LoginPagePOMProgram lp = new LoginPagePOMProgram(driver);
		  
		  lp.sendusername();
//		  log.info("Enter The Username");
		  lp.sendpassword();
//		  log.info("Enter The Passoword");
		  Assert.assertTrue(false);
		  lp.LoginButtonclick();
//		  log.info("Click on login Button");
//		  ScreenShot.TakeScreenShots(driver);
//		  log.info("TakenScreenshot");
		
	}


}
