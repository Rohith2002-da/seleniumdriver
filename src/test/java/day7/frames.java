package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
 public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://ui.vision/demo/webtest/frames/");
	 driver.manage().window().maximize();
	 //passed frame as web element ,switchs to frame1 
	 WebElement frame1=driver.findElement(By.xpath("/html/frameset/frame[1]"));
	 driver.switchTo().frame(frame1);
	 driver.findElement(By.xpath("//*[@id=\"id1\"]/div/input")).sendKeys("hello");
	 driver.switchTo().defaultContent();//moves to main page 
	 
	 //switching to frame 2
	 WebElement frame2=driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
	 driver.switchTo().frame(frame2);
	 driver.findElement(By.xpath("//*[@id=\"id2\"]/div/input")).sendKeys("selenium");
	 driver.switchTo().defaultContent();//moves to main page 

	 
	 //switching to frame 3
	 WebElement frame3=driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
	 driver.switchTo().frame(frame3);
	 driver.findElement(By.xpath("//*[@id=\"id3\"]/div/input")).sendKeys("selenium");
	 driver.switchTo().frame(0);
	 
	 driver.findElement(By.xpath("//*[@id=\"i6\"]/div[3]/div")).click();
	 driver.switchTo().defaultContent();
	 
 }
}
