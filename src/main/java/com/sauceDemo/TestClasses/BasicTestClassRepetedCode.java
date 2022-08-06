package com.sauceDemo.TestClasses;

import java.io.IOException;




import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauceDemo.POMClasses.LoginPagePOMProgram;
import com.sauceDemo.UtilityClasses.ScreenShot;

public class BasicTestClassRepetedCode 
{
    public WebDriver driver;
	
	Logger log = Logger.getLogger("SauceDemo11");
	
    @Parameters("browserName")
    
	@BeforeMethod
    public void setUp(String browserName) throws IOException
    {
    	
    	if(browserName.equals("chrome"))
    	{
		System.setProperty("webdriver.chrome.driver", 
				"./Drivers/chromedriver.exe");
	  
	     driver = new ChromeDriver();
    	}
    	
    	else if (browserName.equals("firfox"))
    	{
    		
    		System.setProperty("webdriver.gecko.driver", 
    				"./Drivers/geckodriver.exe");
    		
    		driver = new FirefoxDriver();
    		
    	}
    	else
    	{
    		System.out.println("Throws the Exceptions");
    	}
    	
    	PropertyConfigurator.configure("Log4j.Properties");
    	

	  log.info("Open the Browser");
	  driver.manage().window().maximize();
	  log.info("Maximize the window");
	  driver.get("https://www.saucedemo.com/");
	  log.info("Open the URL");
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  log.info("Apply Waits");
	  ScreenShot.TakeScreenShots(driver);
	  log.info("Taken ScreenShot");
	  //Create object of Parent class
	  //POM class
	  
	  LoginPagePOMProgram lp = new LoginPagePOMProgram(driver);
	  
	  lp.sendusername();
	  log.info("Enter The Username");
	  lp.sendpassword();
	  log.info("Enter The Passoword");
	  lp.LoginButtonclick();
	  log.info("Click on login Button");
	  ScreenShot.TakeScreenShots(driver);
	  log.info("TakenScreenshot");
    }
	
	@AfterMethod
	  public void tearDown()
	  {

	  driver.close();
	  log.info("Close the driver");
	  }
	  
	
}
