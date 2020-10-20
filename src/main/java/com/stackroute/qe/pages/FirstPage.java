package com.stackroute.qe.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
 
public class FirstPage {
 
WebDriver driver;
 
        public FirstPage(WebDriver driver){
                 this.driver=driver;
        }
 
//Using FindBy for locating elements
@FindBy(how=How.ID, using="nav-link-accountList") WebElement SignInButton;
@FindBy(how=How.ID, using="createAccountSubmit") WebElement CreateButton;

        // Defining all the user actions (Methods) that can be performed in the Facebook home page
 
        // This method is to set Email in the email text box
public void clickSignInButton()
{
	SignInButton.click();
	
}

public void buttonIsEnabled()
{
Assert.assertTrue(CreateButton.isEnabled());
System.out.println("Assert 01 :Create Button is Enabled");
}

public void clickButton(){
	CreateButton.click();
}

}
