package com.softcell.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.softcell.qa.base.TestBase;
import com.softcell.qa.pages.HomePage;
import com.softcell.qa.pages.ProductPage;
import com.softcell.qa.pages.ShoppingCartPage;

public class ProductPageTest extends TestBase 
{
	
	ProductPage productpageobj;
	ShoppingCartPage shopcart;
	
	public ProductPageTest()
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
		String pageTitle = productpageobj.validateHomePageTitle();
		Assert.assertEquals(pageTitle,"Amazon.in: nike sport shoes for men white");
	}
	
	@Test(priority=2)
	public void validatePageLogoTest()
	{
		boolean flag = productpageobj.validateHomePageLogo();
		Assert.assertTrue(flag);
	}

	@Test(priority=4)
	public void srollAndSelectProductTest()
	{
		shopcart= productpageobj.srollAndSelectProduct();
		
	}
	
	@Test(priority=3)
	public void allProductNamesTest()
	{
		 productpageobj.allProductNames();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	

}
