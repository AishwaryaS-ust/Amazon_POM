package com.stackroute.qe.test;



import org.testng.annotations.Test;

import com.stackroute.qe.base.TestBase;
import com.stackroute.qe.pages.FirstPage;
import com.stackroute.qe.pages.RegisterPage;
import org.openqa.selenium.support.PageFactory;

 
public class FirstPageTest extends TestBase{
@Test
public void init() throws Exception{
 

	FirstPage firstpage = PageFactory.initElements(driver, FirstPage.class);
	firstpage.clickSignInButton();
	firstpage.buttonIsEnabled();
	firstpage.clickButton();
RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
registerpage.setName("Aishwarya S");
registerpage.setMob("9876543210");
registerpage.setEmail("testmailaish20@gmail.com");
registerpage.setPassword("aishamazon@2020");
registerpage.clickOnContinueButton();
}
}
