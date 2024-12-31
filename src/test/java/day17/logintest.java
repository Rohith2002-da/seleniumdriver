package day17;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class logintest {

    WebDriver driver;
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
	}
	
	@Test
	void testlogin() {
		Pageobjectmodel pom=new Pageobjectmodel(driver);
		pom.setusername("Admin");
		pom.setpassword("admin123");
		pom.Pressclick();	
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void teardown() {
		driver.quit();
	}
}
