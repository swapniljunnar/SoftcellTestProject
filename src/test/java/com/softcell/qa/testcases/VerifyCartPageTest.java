package com.softcell.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.softcell.qa.base.TestBase;
import com.softcell.qa.pages.Cart;
import com.softcell.qa.pages.HomePage;
import com.softcell.qa.pages.ProductPage;
import com.softcell.qa.pages.ShoppingCartPage;
import com.softcell.qa.pages.VerifyCartPage;

	 
	public class VerifyCartPageTest extends TestBase
	{
	ProductPage productpageobj;
	ShoppingCartPage shopcart;
	VerifyCartPage mycart;

	public VerifyCartPageTest()
	{
	super();
	}

	 
	@BeforeMethod
	public void setUp()
	{
	initilization();
	}

	@Test(priority=1)
	public void validateHomePageTitleTest()
	{
	String pageTitle = shopcart.validateHomePageTitle();
	Assert.assertEquals(pageTitle,"Amazon.in Shopping Cart");
	}

	 
	@Test(priority=2)
	public void validateHomePageLogoTest()
	{
	boolean flag = mycart.validateHomePageLogo();
	Assert.assertTrue(flag);
	//return Cart;
	}
	
	@Test(priority=3)
	public void verifyProductCartTest()
	{
		mycart.verifyProductCart();
		
	}

	@AfterMethod
	public void tearDown()
	{
	driver.close();
	}

	}
	
