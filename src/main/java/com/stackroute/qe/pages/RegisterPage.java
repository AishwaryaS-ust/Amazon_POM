package com.stackroute.qe.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
 
public class RegisterPage {
 
WebDriver driver;
 
        public RegisterPage(WebDriver driver){
                 this.driver=driver;
        }
 
//Using FindBy for locating elements
@FindBy(how=How.ID, using="ap_customer_name") WebElement name;
@FindBy(how=How.ID, using="ap_phone_number") WebElement mobNo;
@FindBy(how=How.ID, using="ap_email") WebElement emailId;

@FindBy(how=How.ID, using="ap_password") WebElement Password;


@FindBy(how=How.ID, using="continue") WebElement continueButton;
       
public void setName(String fname){
name.sendKeys(fname);
}

public void setMob(String mob){
	mobNo.sendKeys(mob);
}

public void setEmail(String mail){
	emailId.sendKeys(mail);
}



public void setPassword(String password){
	Password.sendKeys(password);
}


public void buttonIsEnabled()
{
Assert.assertTrue(continueButton.isEnabled());
System.out.println("Assert 02 :Sign up Button is Enabled");
}


public void clickOnContinueButton(){
	continueButton.click();
}
}
