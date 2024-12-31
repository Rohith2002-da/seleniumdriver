package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalandnavigationmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		//NAVIGATE TO,BACK,FORWARDAND REFRESH METHOD
		
//		driver.get("https://demo.opencart.com/");
//		driver.navigate().to("https://www.google.com");
//		driver.navigate().back();
//		driver.navigate().forward();
		
		//ISDISPLAYED METHOD
		driver.get("https://demo.nopcommerce.com/register");
		WebElement hi=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		System.out.println(hi.isDisplayed());
		
       //ISENABLED METHOD
		boolean status=driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).isEnabled();
		System.out.println(status);
		
		boolean status1=driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).isEnabled();
		System.out.println(status1);
		
		//ISSELECTED METHOD
		
		boolean status2=driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).isSelected();
		System.out.println(status2);
		driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
		boolean status3=driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).isSelected();
		System.out.println(status3);
	}
}
