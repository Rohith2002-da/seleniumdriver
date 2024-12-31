package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextclick {
   public static void main(String[] args) {
	   WebDriver driver=new ChromeDriver();
	   driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	   driver.manage().window().maximize();
	   WebElement rightclick=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
	   Actions act=new Actions(driver);
	   act.contextClick(rightclick).click().perform();
   }}