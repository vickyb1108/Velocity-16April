package com.sauceDemo.UtilityClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.sauceDemo.TestClasses.SampleListnerScreenshot;


public class ListnersScreenshot implements ITestListener
{
    WebDriver driver;
	
	
	public void onTestFailure(ITestResult result)
	{
		   System.out.println("Test case is failed and hence taking the screenshot");

            this.driver = ((SampleListnerScreenshot)result.getInstance()).driver;
		   
		   TakesScreenshot ts = (TakesScreenshot)driver;
		   File sourceFile =	ts.getScreenshotAs(OutputType.FILE);	
		   File destFile = new File("./ScreenShots/SauceDemoLogin.jpg");	
		   try 
		   {
			FileHandler.copy(sourceFile, destFile);
		    } 
		   catch (IOException e) 
		   {
			e.printStackTrace();
		   }
	}

}
