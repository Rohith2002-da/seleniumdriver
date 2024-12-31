package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageobjectmodel2 {

	WebDriver driver;
	
	//constructor
	Pageobjectmodel2(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//locators
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")WebElement username;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")WebElement password;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button") WebElement click;

	//action methods
	public void setusername(String user) {
		username.sendKeys(user);
	}
	
	public void setpassword(String pswd) {
		password.sendKeys(pswd);
	}
	
	public void Pressclick() {
	  click.click();
	}
}
