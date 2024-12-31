package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//XPATH FOR SINGLE ATTRIBUTE
      //  driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("phone is ok");
		
		//XPATH FOR MULTIPLE ATTRIBUTE
       // driver.findElement(By.xpath("//*[@name=\"search\"][@placeholder=\"Search\"]")).sendKeys("PHONEIS NOTOK");

        //XPATH USING AND/OR
        //driver.findElement(By.xpath("//*[@name='search' or @placeholder='Search']")).sendKeys("phone");
        
        //XPATH USING INNER TEXT(text())
        //driver.findElement(By.xpath("//a[text()='MacBook']")).click();
        
		//isdisplayed method
        boolean textvalue=driver.findElement(By.xpath("//a[text()='MacBook']")).isDisplayed();
        System.out.println(textvalue);
        
        //gettext method
        String text=driver.findElement(By.xpath("//a[text()='MacBook']")).getText();
        System.out.print(text);
        
        //contains method
        driver.findElement(By.xpath("//input[contains(@name,'search')]")).sendKeys("hello");
        
        //start-with method
        driver.findElement(By.xpath("//input[starts-with(@name,'sea')]")).sendKeys(" rohith");

	}

}
