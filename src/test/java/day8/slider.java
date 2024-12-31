package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement scroll=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		System.out.print(scroll.getLocation().getX());
		act.dragAndDropBy(scroll, 150,269);
	}

}
