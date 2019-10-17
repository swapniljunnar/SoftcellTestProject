package com.softcell.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.softcell.qa.base.TestBase;

public class HomePage extends TestBase
{

	//Page Factory - Object Repository-Page Objects
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy(xpath=".//span[@class='nav-sprite nav-logo-base']")
	WebElement pageLogo;
	
	@FindBy(xpath=".//input[@value='Go']")
	WebElement enterSearchBtn;
	
	//Initializing the page objects
	public HomePage()
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
		
		return driver.getTitle();
	}
	
	public ProductPage searchProductPage()
	{
		searchBox.sendKeys("Nike Revolution 4 Sports Running Shoe for Men");
		enterSearchBtn.click();
		return new ProductPage();
	}
	
	

}
