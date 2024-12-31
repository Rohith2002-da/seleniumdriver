package day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertspopups {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
//	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
//	Thread.sleep(3000);
//	//normal alert
//	driver.switchTo().alert().accept();
//	//another method
//	Alert myalert=driver.switchTo().alert();
//	System.out.print(myalert.getText());
//	myalert.accept();
	
	//2.Confirmation alert-ok and cancel
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().dismiss();
	
	//3.Prompt alert-input box ,ok,cancel
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
	Alert myalert=driver.switchTo().alert();
	Thread.sleep(3000);
	myalert.sendKeys("i am rohith!");
	Thread.sleep(3000);
	myalert.accept();
	
	//4.Handling authentication popups
	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
}
