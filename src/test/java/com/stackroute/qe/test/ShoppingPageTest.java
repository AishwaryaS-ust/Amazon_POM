package com.stackroute.qe.test;


import org.testng.annotations.Test;
import com.stackroute.qe.base.TestBase;
import com.stackroute.qe.pages.LoginPage;
import com.stackroute.qe.pages.CartPage;
import com.stackroute.qe.pages.ShoppingPage;

import java.util.ArrayList;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPageTest extends TestBase{
	@Test
	public void init() throws Exception{

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		ChromeOptions options1 = new ChromeOptions();
		options1.addArguments("--disable-notifications");
	loginpage.clickOnSignIn();
	loginpage.setEmail("testmailaish20@gmail.com");
	loginpage.clickOnContinue();
	loginpage.setPasswordText("aishamazon@20");
	loginpage.clickOnSignInSubmitButton();
	ShoppingPage shoppingpage = PageFactory.initElements(driver, ShoppingPage.class);
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	shoppingpage.clickOnHamburgerIcon();
	shoppingpage.optionViaDropDown();
	shoppingpage.clickOnSubCategory();
	shoppingpage.clickOnType();
	shoppingpage.clickOnPrice();
	shoppingpage.clickOnItem();
	ArrayList<String> windowHandles = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(windowHandles.get(1));
	CartPage cartpage = PageFactory.initElements(driver, CartPage.class);
	ChromeOptions options2 = new ChromeOptions();
	options2.addArguments("--disable-notifications");
	cartpage.cartButtonIsEnabled();
	cartpage.clickOnAddToCart();
	cartpage.clickOnCart();
	cartpage.optionViaDropDown();
	cartpage.categoryDropDown();
	cartpage.clickOnSearch();
	shoppingpage.clickOnSubCategoryPrice();
	shoppingpage.clickOnSubCategoryItem();
	ArrayList<String> windowHandles1 = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(windowHandles1.get(2));
	cartpage.assertTitle();
	cartpage.clickOnsubCategoryAddToCart();
	cartpage.clickOnCart();
	loginpage.mouseHoverOnAccount();
	loginpage.clickOnSignOutButton();
	loginpage.setEmail("testmailaish20@gmail.com");
	loginpage.clickOnContinue();
	loginpage.setPasswordText("aishamazon@20");
	loginpage.clickOnSignInSubmitButton();
	cartpage.clickOnCart();
	}

}
