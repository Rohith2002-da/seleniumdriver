package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pageobjectmodel {

	WebDriver driver;
	
	//constructor
	Pageobjectmodel(WebDriver driver){
		this.driver=driver;
		
	}
	
	//locators
	By username=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	By password=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	By click=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");

	//action methods
	public void setusername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	
	public void setpassword(String pswd) {
		driver.findElement(password).sendKeys(pswd);
	}
	
	public void Pressclick() {
		driver.findElement(click).click();
	}
}
