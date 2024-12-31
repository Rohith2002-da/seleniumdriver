package day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keypboardactions {

	public static void main(String [] args){
	
		   WebDriver driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   driver.get("https://text-compare.com/");
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//*[@id=\"inputText1\"]")).sendKeys("hello");
		   
		   //ctr+a
		   
		   Actions act=new Actions(driver);
		   
		   act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		   
		   
		   //ctrl+c
		   act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		   
		   //tab
		   
		   act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		   
		   //enter
		   
		  // act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

		   
		   //ctrl+v
		   act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

		   
	}
}
