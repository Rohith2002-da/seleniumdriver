package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.opencart.com/");
    driver.manage().window().maximize();//maximise the browser window
    //driver.findElement(By.cssSelector("input#carousel-banner-1")).sendKeys("apple phone");//CSS SELECTOR FOR TAGNAME ID
    //driver.findElement(By.cssSelector("input.form-control form-control-lg")).sendKeys("phone");//CSS SELECTOR FOR TAGNAME class
    //driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("phone");//css selector for tag attribute

//LOCATOR USING NAME
//    driver.findElement(By.name("search")).sendKeys("macbook");
    
    
  //LOCATOR USING ID
//    boolean display=driver.findElement(By.id("search")).isDisplayed();
//    System.out.println(display);
    
  //LOCATOR USING LINKTEXT
//    driver.findElement(By.linkText("MacBook")).click();
//    driver.findElement(By.linkText("iPhone")).click();
    
  //LOCATOR USING CLASSNAME

//    List<WebElement> links =driver.findElements(By.className("list-inline-item"));
//    System.out.println("no of header links:"+links.size());
//    
//    
//  //LOCATOR USING TAGNAME
//
//    List<WebElement> divtags=driver.findElements(By.tagName("a"));
//	System.out.print(divtags.size());
	
   // driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("phone");//css selector for tag attribute
//    driver.findElement(By.cssSelector("img[title='Your Store']")).click();//css selector for tag attribute
    //driver.findElement(By.cssSelector("img.img-fluid")).click();
    //	driver.findElement(By.cssSelector("input.form-control form-control-lg")).sendKeys("phone");
    // driver.findElement(By.cssSelector("button.btn btn-light btn-lg")).click();
    //driver.findElement(By.cssSelector("img.img-fluid")).click();
    driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/input")).sendKeys("my phone");
    driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("my phone");

    
    
    }
	
	

}
