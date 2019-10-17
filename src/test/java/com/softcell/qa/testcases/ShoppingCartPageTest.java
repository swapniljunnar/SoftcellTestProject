package com.softcell.qa.testcases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.softcell.qa.base.TestBase;
import com.softcell.qa.pages.HomePage;
import com.softcell.qa.pages.ProductPage;
import com.softcell.qa.pages.ShoppingCartPage;
import com.softcell.qa.pages.VerifyCartPage;

 
public class ShoppingCartPageTest extends TestBase
{
ProductPage productpageobj;
ShoppingCartPage shopcart;
VerifyCartPage mycart;

 
public ShoppingCartPageTest()
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
Assert.assertEquals(pageTitle,"Nike Revolution 4 Sports Running Shoe for Men: Buy Online at Low Prices in India - Amazon.in");
}

@Test(priority=2)
public void validatePageLogoTest()
{
boolean flag = shopcart.validateHomePageLogo();
Assert.assertTrue(flag);
}

@Test(priority=3)
public void viewSelectedProductTest()
{
WebElement productTitleText = shopcart.viewSelectedProduct();
Assert.assertEquals(productTitleText,"Nike Revolution 4 Sports Running Shoe for Men");
}

@Test(priority=4)
public void productAddToCartTest()
{
mycart=shopcart.productAddToCart();
}

@AfterMethod
public void tearDown()
{
driver.close();
}

}