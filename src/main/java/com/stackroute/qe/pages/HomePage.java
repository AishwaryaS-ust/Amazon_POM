package com.stackroute.qe.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
 
public class HomePage {
WebDriver driver;
 
        public HomePage(WebDriver driver){
                this.driver=driver;
        }
        //Using FindBy for locating elements
@FindBy(how=How.XPATH, using="//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[1]/ul/li[2]/span/div/a") WebElement friends;
@FindBy(how=How.XPATH, using="//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[1]/ul/li[3]/span/div/a") WebElement groups;
@FindBy(how=How.XPATH, using="//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/span/div/div[1]") WebElement notifications;
@FindBy(how=How.XPATH, using="//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[1]/div[2]/span/div/div[1]") WebElement messenger;
@FindBy(how=How.XPATH, using="//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[1]/span/div/div[1]") WebElement account;  
@FindBy(how=How.XPATH, using="//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div") WebElement logout;  
// Defining all the user actions (Methods) that can be performed in the Facebook home page

public void clickFriends(){
	//WebDriverWait wait=new WebDriverWait(driver,1000);
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"mount_0_0\\\"]/div/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[1]/ul/li[2]/span/div/a/div")));
friends.click();
}

public void clickGroups(){
	
	//WebDriverWait wait=new WebDriverWait(driver,1000);
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"mount_0_0\\\"]/div/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[1]/ul/li[3]/span/div/a/div")));
groups.click();
}

public void notificationEnabled(){
	Assert.assertTrue(notifications.isEnabled());
	System.out.println("Assert 04 :Notification is Enabled");
}

public void clickNotifications(){
notifications.click();
}

public void clickMessenger(){
	messenger.click();
}

public void account(){
	account.click();
	WebDriverWait wait=new WebDriverWait(driver,1000);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div")));
	logout.click();
}
 
}
