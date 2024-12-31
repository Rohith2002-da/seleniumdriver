package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderdemo {

	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	
	@Test(dataProvider="dp")//attribute of test annotation,receives the data
	void testlogin(String username,String pswd) {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		boolean logo=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();
		System.out.println(logo);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(pswd);
		if(logo==false) {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        Assert.assertTrue(true);
		}else {
			Assert.fail();
		}
		
	}
	
	@AfterClass
	void teardown() {
	driver.close();
	}
	
	@DataProvider(name="dp",indices= {0,3,2})//no for loop needed,same dp name should not be used again
	
	Object[][] logindata() {//can use object or string
		
		Object data[][]= {//stores data in 2d array
				          //creatig testdata and sending it 
							{"abc@gmail.com","test123"},
							{"xyz@gmail.com","test012"},
							{"john@gmail.com","test@123"},
							{"pavanol123@gmail.com","test@123"},
				
		};
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
