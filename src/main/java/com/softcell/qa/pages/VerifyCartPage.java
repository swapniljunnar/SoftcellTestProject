
package com.softcell.qa.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.softcell.qa.base.TestBase;

public class VerifyCartPage extends TestBase
{

	//Page Factory - Object Repository-Page Objects

@FindBy(xpath=".//span[@class='nav-sprite nav-logo-base']")
WebElement pageLogo;

@FindBy(xpath=".//a[@id='hlb-view-cart-announce']")
WebElement cartBtn;


//initilizing the page objects
public VerifyCartPage()
{
PageFactory.initElements(driver,this);
}

 
public String validateHomePageTitle()
{
//Nike Revolution 4 Sports Running Shoe for Men: Buy Online at Low Prices in India - Amazon.in
return driver.getTitle();
}

public boolean validateHomePageLogo()
{
	return pageLogo.isDisplayed();
}
 

public void verifyProductCart()
{
	cartBtn.click();
	WebElement verify = driver.findElement(By.partialLinkText("com/images/I/71VW5dZvkLL"));
	Assert.assertEquals(verify,"https://images-na.ssl-images-amazon.com/images/I/71VW5dZvkLL._AC_AA180_.jpg");
	System.out.println("Cart product is verified");
}

}