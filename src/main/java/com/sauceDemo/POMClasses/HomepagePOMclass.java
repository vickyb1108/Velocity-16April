package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePOMclass
{
     //POM class
	//1.WebDriver declare -- globally
	//2.@FindBy -- element find
	//3.method -- element action
	//4.constructor -- global n local driver ,pagefactory
	
	     private WebDriver driver;
	     
	     @FindBy(xpath="(//button[text()='Add to cart'])[1]")
	     
	     private WebElement bagaddtocart1;
	     
	     public void bagaddtocart()
	     {
	    	 bagaddtocart1.click();
	     }
	
         @FindBy(xpath="((//button[text()='Add to cart'])[2]")
	     
	     WebElement bikelightaddtocart;
	
	     public void bikelightaddtocart()
	     {
	    	 bikelightaddtocart.click();
	     }
	     
	     @FindBy(xpath="")
	     WebElement Alladdtocart;
	
         @FindBy(xpath="(//button[text()='Add to cart'])[3]")
	     
	     WebElement Tshirtaddtocart;
         
         public void Tshirtaddtocart()
         {
        	 Tshirtaddtocart.click();
         }
         
         @FindBy(xpath="(//button[text()='Add to cart'])[4]")
         
         private WebElement Fleecejacket;
         
         public void Fleecejacketaddtocart()
         {
        	 Fleecejacket.click();
         }
         
         @FindBy(xpath="(//button[text()='Add to cart'])[5]")
         
         private WebElement Onesie;
         
         public void Onesieaddtocart()
         {
        	 Onesie.click();
         }
         
         @FindBy(xpath="(//button[text()='Add to cart'])[6]")
         
         private WebElement TshirtRed;
         
         public void TshirtRedaddtocart()
         {
        	 TshirtRed.click();
         }
         
         @FindBy(xpath="//button[text()='Open Menu']")
         
         private WebElement OpenMenu;
         
         public void OpenMenubutton()
         {
        	 OpenMenu.click();
         }
         
         @FindBy(xpath="//a[text()='All Items']")
         
         WebElement Allitems;
         
         public void Allitemstab()
         {
        	 Allitems.click();
         }
         
         @FindBy(xpath="//a[text()='About']")
         
         private WebElement About;
         
         public void AboutTab()
         {
        	 About.click();
         }
         
         @FindBy(xpath="//a[text()='Logout']")
         
         private WebElement logout;
         
         public void logouttab()
         {
        	 logout.click(); 
         }
         
         @FindBy(xpath = "//a[text()='Reset App State']")

         private WebElement ResetAppState;
         
         public void ResetAppStatetab()
         {
        	 ResetAppState.click();
         }
         
         @FindBy(xpath="//select[@class='product_sort_container']")
         
         private WebElement Filter;
         
         public void filtertab()
         {
        	 Filter.click(); 
         }
         
         @FindBy(xpath="//a[@class='shopping_cart_link']")
         
         private WebElement AddTocart;
         
         public void AddTocart()
         {
        	 AddTocart.click();
         }
         
         //constructor crate
         
         public HomepagePOMclass(WebDriver driver)
         {
        	 this.driver = driver;
        	 
        	 PageFactory.initElements(driver, this);
         }
         
         
         
         
         
         
         
         
	
	
	
}
