package day6;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxesandalerts {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//1.clickmethod to selecting and deselecting single checbox
		
		driver.findElement(By.xpath("//*[@id=\"sunday\"]")).click();
		
		//2.selecting all checkboxes using userdefined xpath
		
		List<WebElement> elements=driver.findElements(By.xpath("//input[@class=\"form-check-input\"and @type=\"checkbox\"]"));
//        for(WebElement a:elements) {
//        	a.click();
//        }
        for(int i=0;i<elements.size();i++) {
        	
        	elements.get(i).click();
        	}
        
        //3.select last 3 checkboxes
        for(int i=4;i<elements.size();i++) {
        	elements.get(i).click();
        }
        
        //4.unselecting checkboxes that are already selected
        for(int i=0;i<elements.size();i++) {
        	if(elements.get(i).isSelected()) {
        		elements.get(i).click();
        	}
        }
	}
}
