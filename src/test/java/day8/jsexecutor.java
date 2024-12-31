package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsexecutor {
 public static void main(String[] args)
 {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://testautomationpractice.blogspot.com/");
	 driver.manage().window().maximize();
	 WebElement name=driver.findElement(By.xpath("//*[@id=\"name\"]"));
	 //alternate of sendkeys function
	 
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].setAttribute('value','John')",name);
	 //clicking the radio button
	 
	 WebElement male=driver.findElement(By.xpath("//*[@id=\"male\"]"));
	 js.executeScript("arguments[0].click()", male);
	 
	 //selecting chkbox
	 WebElement chkbox=driver.findElement(By.xpath("//*[@id=\"sunday\"]"));
	 js.executeScript("arguments[0].click()", chkbox);
	 
 }
}
