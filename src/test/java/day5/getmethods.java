package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethods {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.opencart.com/");
	//1.GET TITLE METHOD
	System.out.println(driver.getTitle());
	
	//2.GET CURRENTURL METHOD
	System.out.print(driver.getCurrentUrl());
	
	//3.GET PAGESOURCE METHOD
	System.out.println(driver.getPageSource());

	//4.GET WINDOWHANDLE METHOD
		System.out.println(driver.getWindowHandle());

	driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div/h4/a")).click();
	
	//5.GET WINDOWHANDLES METHOD
			System.out.println(driver.getWindowHandles());
			driver.close();
			driver.quit();
}
}
