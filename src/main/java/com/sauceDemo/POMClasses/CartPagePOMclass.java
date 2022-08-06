package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPagePOMclass 
{
    //1.WebDriver --declare
	//2.@FindBy -- find element
	//3.method -- action perform on element
	//4.constructor crate-- global n local this keyword,pagefactory class
	
	private WebDriver driver;
	
	@FindBy(xpath="(//button[text()='Remove'])[1]")
	
	private WebElement Remove1;
	
	public void Remove1ele()
	{
		Remove1.click();
	}
	
	@FindBy(xpath="(//button[text()='Remove'])[2]")
	
	private WebElement Remove2;
	
	public void Remove2ele()
	{
		Remove2.click();
	}
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	
	private WebElement continueshopping;
	
	public void continueshopping()
	{
		continueshopping.click();
	}
	
	@FindBy(xpath="//button[@id='checkout']")
	
	private WebElement Checkout;
	
	public void Checkout()
	{
		Checkout.click();
	}
	
		
	public CartPagePOMclass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
