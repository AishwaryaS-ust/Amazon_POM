package com.stackroute.qe.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
 
public class LoginPage {
 
WebDriver driver;
 
        public LoginPage(WebDriver driver){
                 this.driver=driver;
        }
 
//Using FindBy for locating elements
@FindBy(how=How.ID, using="nav-link-accountList") WebElement signInClick;
@FindBy(how=How.ID, using="ap_email") WebElement emailTextBox;
@FindBy(how=How.ID, using="ap_password") WebElement pwdTextBox;
@FindBy(how=How.ID, using="continue") WebElement continueButton;
@FindBy(how=How.ID, using="auth-fpp-link-bottom") WebElement forgetPwdButton;
@FindBy(how=How.CLASS_NAME, using="a-button-input") WebElement submitButton;
@FindBy(how=How.ID, using="ap_fpp_password") WebElement passwordTextBox;
@FindBy(how=How.ID, using="ap_fpp_password_check") WebElement passwordCheck;
@FindBy(how=How.ID, using="continue") WebElement signinButton;
@FindBy(how=How.ID, using="signInSubmit") WebElement signinSubmitButton;
@FindBy(how=How.PARTIAL_LINK_TEXT, using="Hello,") WebElement accountOption;
@FindBy(how=How.ID, using="nav-item-signout") WebElement signOutButton;

        // Defining all the user actions (Methods) that can be performed in the Amazon page
 
public void clickOnSignIn(){
	signInClick.click();
}
public void setEmail(String strEmail){
emailTextBox.sendKeys(strEmail);
}

public void setPasswordText(String strPassword){
	pwdTextBox.sendKeys(strPassword);
}

public void clickOnContinue(){
continueButton.click();
}

public void clickOnForgetPwd() {
	forgetPwdButton.click();

}

public void enterEmailForPwdChange(String strEmail) {
emailTextBox.sendKeys(strEmail);
}

public void clickOnSubmit() throws InterruptedException{
	Thread.sleep(15000);
	submitButton.click();

}

public void setPassword(String strPassword){
passwordTextBox.sendKeys(strPassword);
}

public void passwordConfirm(String strPassword){
	passwordCheck.sendKeys(strPassword);
}

public void isEnabled(){
	Assert.assertTrue(signinButton.isEnabled());
	System.out.println("Assert 03 :Sign in Button is Enabled");
}
public void clickOnSignInSubmitButton(){
	signinSubmitButton.click();
}
// This method is to click on Login Button
public void clickOnLoginButton(){
signinButton.click();
}

public void mouseHoverOnAccount(){
	Actions hover = new Actions(driver);
	hover.moveToElement(accountOption).build().perform();
}

public void clickOnSignOutButton(){
	signOutButton.click();
}
}
