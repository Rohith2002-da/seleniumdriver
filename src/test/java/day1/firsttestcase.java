package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firsttestcase {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("form-control form-control-lg")).sendKeys("apple phone");
        String title=driver.getTitle();
        if(title.equals("Your Store")) {
        	System.out.println("testpassed");
        }
        else
        {
        	System.out.println("testfailed");

        }
        driver.close();
	}

}
