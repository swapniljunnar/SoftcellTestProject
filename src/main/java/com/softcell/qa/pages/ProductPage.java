package com.softcell.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.softcell.qa.base.TestBase;
import com.softcell.qa.util.TestUtil;

public class ProductPage extends TestBase
{
	//Page Factory - Object Repository-Page Objects
	
		
		@FindBy(xpath=".//span[@class='nav-sprite nav-logo-base']")
		WebElement pageLogo;
		
		@FindBy(xpath=".//input[@value='Go']")
		WebElement enterSearchBtn;
		
		//Initializing the page objects
		public ProductPage()
		{
			PageFactory.initElements(driver,this);
		}
		
		
		//Actions
		public boolean validateHomePageLogo()
		{
			return pageLogo.isDisplayed();
		}


		public String validateHomePageTitle() 
		{
			//Amazon.in: nike sport shoes for men white
			return driver.getTitle();
		}
		

		public void allProductNames()
		{
			List<WebElement> productlist = driver.findElements(By.xpath(".//img[contains(@class,'s-image')]"));
			for(WebElement pageresult : productlist)
			{
				System.out.println("List of all products from this page are:"+pageresult.getText());
			}
		}
	
		public ShoppingCartPage srollAndSelectProduct()
		{
			TestUtil.scrolldown();
			return new ShoppingCartPage();
		}
		
}
