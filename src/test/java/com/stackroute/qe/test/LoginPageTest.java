package com.stackroute.qe.test;


import org.testng.annotations.Test;
import com.stackroute.qe.base.TestBase;
import com.stackroute.qe.pages.LoginPage;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;


 
public class LoginPageTest extends TestBase{
@Test
public void init() throws Exception{

	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	ChromeOptions options1 = new ChromeOptions();
	options1.addArguments("--disable-notifications");
loginpage.clickOnSignIn();
loginpage.setEmail("testmailaish20@gmail.com");
loginpage.clickOnContinue();
loginpage.clickOnForgetPwd();
loginpage.clickOnContinue();
loginpage.clickOnSubmit();
loginpage.setPassword("aishamazon@20");
loginpage.passwordConfirm("aishamazon@20");
loginpage.isEnabled();
loginpage.clickOnLoginButton();
}
}
