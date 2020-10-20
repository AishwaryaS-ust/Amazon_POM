package com.stackroute.qe.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingPage {
	WebDriver driver;
	 
    public ShoppingPage(WebDriver driver){
             this.driver=driver;
    }

//Using FindBy for locating elements
@FindBy(how=How.ID, using="nav-hamburger-menu") WebElement HamburgerIconClick;
@FindBy(how=How.XPATH, using="//*[@id=\"hmenu-content\"]/ul[1]/li[9]/a") WebElement optionSelect;
@FindBy(how=How.XPATH, using="//*[@id=\"hmenu-content\"]/ul[8]/li[24]/a") WebElement subCategorySelect;
@FindBy(how=How.XPATH, using="//*[@id=\"leftNav\"]/ul[4]/div/li[1]/span/span/div") WebElement typeOption;
@FindBy(how=How.ID, using="p_36/7252030031") WebElement priceOption;
@FindBy(how=How.ID, using="ap_fpp_password") WebElement passwordTextBox;
@FindBy(how=How.ID, using="ap_fpp_password_check") WebElement passwordCheck;
@FindBy(how=How.ID, using="continue") WebElement signinButton;
@FindBy(how=How.CLASS_NAME, using="s-image") WebElement itemSelect;
@FindBy(how=How.PARTIAL_LINK_TEXT, using="5,000 - ") WebElement subCategoryPriceOption;
@FindBy(how=How.PARTIAL_LINK_TEXT, using="LG 24 inch Gaming") WebElement subCategoryItemOption;



    // Defining all the user actions (Methods) that can be performed in the Amazon page

    // This method is to set Email in the email text box
public void clickOnHamburgerIcon(){
	HamburgerIconClick.click();
}

public  void optionViaDropDown(){
	//Thread.sleep(3000);
    Actions action = new Actions(driver);
    action.moveToElement(optionSelect).click();
}



public void clickOnSubCategory(){
	//Thread.sleep(3000);
	Actions action = new Actions(driver);
    action.moveToElement(subCategorySelect).click();
}

public void clickOnType() {
	typeOption.click();

}


public void clickOnPrice() {

	priceOption.click();

}

public void clickOnItem() {

	itemSelect.click();

}

public void clickOnSubCategoryPrice() {

	subCategoryPriceOption.click();

}

public void clickOnSubCategoryItem() {

	subCategoryItemOption.click();

}



}
