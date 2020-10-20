package com.stackroute.qe.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CartPage {
	WebDriver driver;
	 
    public CartPage(WebDriver driver){
             this.driver=driver;
    }

//Using FindBy for locating elements
@FindBy(how=How.ID, using="submit.add-to-cart") WebElement addToCartButton;
@FindBy(how=How.ID, using="nav-cart-count") WebElement cartButton;
@FindBy(how=How.NAME, using="quantity") WebElement quantitySelect;
@FindBy(how=How.ID, using="searchDropdownBox") WebElement categorySelect;
@FindBy(how=How.ID, using="ap_fpp_password") WebElement passwordTextBox;
@FindBy(how=How.ID, using="ap_fpp_password_check") WebElement passwordCheck;
@FindBy(how=How.ID, using="continue") WebElement signinButton;
@FindBy(how=How.ID, using="searchDropdownBox") WebElement itemSelect;
@FindBy(how=How.ID, using="nav-search-submit-text") WebElement searchButton;
@FindBy(how=How.PARTIAL_LINK_TEXT, using="Add to Cart") WebElement subCategoryAddToCartButton;

    // Defining all the user actions (Methods) that can be performed in the Amazon page

public void cartButtonIsEnabled()
{
Assert.assertTrue(addToCartButton.isEnabled());
}

public void clickOnAddToCart(){
	addToCartButton.click();
}

public void clickOnCart(){
	cartButton.click();
}

public  void optionViaDropDown() {
	//Thread.sleep(3000);
	Select drpQuantity = new Select(quantitySelect);
	drpQuantity.selectByVisibleText("2");
}

public  void categoryDropDown(){
	
	Select drpQuantity = new Select(categorySelect);
	drpQuantity.selectByVisibleText("Computers & Accessories");
}

public void clickOnSearch(){
	searchButton.click();
}



public void assertTitle(){
	String actualTitle =driver.getTitle();
	String compTitle = "Amazon.in: Buy LG 24 inch Gaming Monitor";
	Assert.assertTrue(actualTitle.contains(compTitle));
	}

public void clickOnsubCategoryAddToCart() throws InterruptedException{
	
	subCategoryAddToCartButton.click();
}

}
