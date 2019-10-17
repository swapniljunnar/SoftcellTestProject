package com.softcell.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.softcell.qa.base.TestBase;

 
public class ShoppingCartPage extends TestBase

{

 //Page Factory - Object Repository-Page Objects
@FindBy(xpath=".//span[@class='nav-sprite nav-logo-base']")
WebElement pageLogo;


//Initializing the page objects

public ShoppingCartPage()
{
PageFactory.initElements(driver,this);
}

public boolean validateHomePageLogo()
{
	return pageLogo.isDisplayed();
}
 

public String validateHomePageTitle()
{
//Title  - Nike Revolution 4 Sports Running Shoe for Men: Buy Online at Low Prices in India - Amazon.in
return driver.getTitle();
}

 
public WebElement viewSelectedProduct()
{
WebElement productTitleText = driver.findElement(By.xpath(".//span[@id='productTitle']"));
return productTitleText;
}

public VerifyCartPage productAddToCart()
{
Select size = new Select(driver.findElement(By.name("dropdown_selected_size_name")));
size.selectByVisibleText("8 UK (8.5 US)");
WebElement addTocart = (WebElement) driver.findElements(By.xpath(".//input[@name='submit.add-to-cart']"));
return new VerifyCartPage();

}
}