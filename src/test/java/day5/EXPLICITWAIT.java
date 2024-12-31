package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EXPLICITWAIT {

public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//WEBDRIVER WAITCLASS
	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	//explicitwait till the visibility of element located
	//for username till that element be loaded
	WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")));
	username.sendKeys("rohith");
	
	WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")));
    password.sendKeys("rohith@2002");
    
    WebElement loginbutton=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
    loginbutton.click();
}
}

