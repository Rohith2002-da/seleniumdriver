package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class waitmethod {

	public static void main(String [] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		//IMPLICIT WAIT METHOD-SHOULD BETHERE AFER CREATING DRIVER INSTANCE,HANDLES SYNCHRONIZATION PROBLEM
		//CAN BE CREATED ONLY ONE TIME,PRESENT TILL CLOSING THE DRIVER
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//1.Thread.sleep(3000); //pause the execution(It will wait the whole time for pausing the execution)
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("rohith");
	}
}
