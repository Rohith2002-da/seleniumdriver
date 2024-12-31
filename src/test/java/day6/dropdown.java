package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	WebElement country=driver.findElement(By.xpath("//*[@id=\"country\"]"));
	Select drop=new Select(country);
	//select option from drpdown
	//drop.selectByVisibleText("France");//name of option
	//drop.selectByValue("Canada");//attribute of the element
	drop.selectByIndex(1);
	
	//capture options from dropdown and print all the options
	
	List<WebElement> options=drop.getOptions();
	System.out.print(options.size());
	for(int i=0;i<options.size();i++) {
		System.out.println(options.get(i).getText());
	}
	
	driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
	driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/ul/li[8]/a/label/input")).click();

	}
}
