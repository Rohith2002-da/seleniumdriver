package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollanduploadfiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.nopcommerce.com/");
		 driver.manage().window().maximize();
		 
		 //1.scrolll down page by pixel number
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
//		 js.executeScript("window.scrollBy(100,1000)", "");
//		 System.out.println(js.executeScript("return window.pageYOffset;"));
//
//		 //2.scroll page till element visibile
//		 WebElement ele=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[6]/div[1]/strong"));
//		 js.executeScript("arguments[0].scrollIntoView();", ele);
//		 System.out.println(js.executeScript("return window.pageYOffset;"));
//
		 //3.scroll till end of page
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		 System.out.println(js.executeScript("return window.pageYOffset;"));
	
//		 Thread.sleep(5000);
//		//3.scroll till start of page
//		 js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
//		 System.out.println(js.executeScript("return window.pageYOffset;"));
//		 
		 //set zoom level to 50
		 //js.executeScript("document.body.style.zoom='50%'");
	}

}
