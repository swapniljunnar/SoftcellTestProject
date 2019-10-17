package com.softcell.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.softcell.qa.base.TestBase;
import com.softcell.qa.pages.HomePage;
import com.softcell.qa.pages.ProductPage;

public class HomePageTest extends TestBase 
{
	HomePage hpobj;
	ProductPage productpageobj;
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initilization();
		hpobj = new HomePage();
	}
	
	@Test(priority=1)
	public void validateHomePageTitleTest()
	{
		String pageTitle = hpobj.validateHomePageTitle();
		Assert.assertEquals(pageTitle,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@Test(priority=2)
	public void validatePageLogoTest()
	{
		boolean flag = hpobj.validateHomePageLogo();
		Assert.assertTrue(flag);
	}

	@Test(priority=3)
	public void SearchProductTest()
	{
		productpageobj = hpobj.searchProductPage();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}