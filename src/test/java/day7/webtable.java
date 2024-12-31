package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {o
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demo.opencart.com/admin/index.php");
	driver.manage().window().maximize();
	
	WebElement usrname=driver.findElement(By.xpath("//*[@id=\"input-username\"]"));
	usrname.clear();
	usrname.sendKeys("demo");
	
	
	WebElement password=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
	password.clear();
	password.sendKeys("demo");
	
	driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click();
	
	
	
}
}
