package com.sauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MultipleElementPOMclass
{
   private WebDriver driver;
   
   private Select s;
   
    @FindBy(xpath="//button[text()='Add to cart']")
   
    List<WebElement> multiaddtocard;
    
    // for loop -not select all items
//    public void clickallproduct()
//    {
//    	for (int i=0;i<multiaddtocard.size();i++)
//    	{
//    		multiaddtocard.get(i).click();
//    	}
//    }
    // for each loop for multiple
     public void multiaddtocard()
     {
    	 for(WebElement i:multiaddtocard) 
    	 {
    		 i.click();
    	 }
     }
    @FindBy(xpath="//span[@class='shopping_cart_badge']")
     
    WebElement addtocartbutton;
    
    public String gettextFromaddtocartbutton()
    {
    	String TotalProducts = addtocartbutton.getText();
    	return TotalProducts;
    }
    
    @FindBy(xpath="//select[@class='product_sort_container']")
    
    WebElement DropDownFilterButton;
    
    public void ClickOnFilterButtonDropDown()
    {
    	DropDownFilterButton.click();
    	 
    	s.selectByVisibleText("Price (low to high)");
    	
    	
    }
    @FindBy(xpath="//option[text()='Price (low to high)']")
    WebElement gettext;
    public String DropDowngettext()
    {
    	return gettext.getText();
    	
    }
    
    public MultipleElementPOMclass(WebDriver driver)
    {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    	s = new Select(DropDownFilterButton);
    }
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
