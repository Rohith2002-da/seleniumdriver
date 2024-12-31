package day15;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class paramtest {
	public static WebDriver driver;
    public Properties p;
	@BeforeClass
	@Parameters({"os","browser"})
	void setup(String os,String br) throws InterruptedException, IOException {
		FileReader file=new FileReader("C:\\Users\\User\\eclipse-workspace\\seleniumdriver\\src\\test\\resources\\config.properties");
		p=new Properties();
		p.load(file);
		if(p.getProperty("execution_env").equalsIgnoreCase("remote")){
			
			DesiredCapabilities capabilities=new DesiredCapabilities();
			if(os.equalsIgnoreCase("windows")) {
				capabilities.setPlatform(Platform.WIN11);
			}else if{
				capabilities.setPlatform(Platform.MAC);
			}else {
				System.out.print("no matchig os");
				return;
			}
			switch(br.toLowerCase()) {
			
			case "chrome":capabilities.setBrowserName("chrome");break;
			case "edge":capabilities.setBrowserName("MicrosoftEdge");break;
			default:System.out.print("invalid browser");return;//exits from entire method

			}
			driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
			
			
			
		
			
		}
	
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	void testlogo() {
		boolean logo=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();
		Assert.assertEquals(logo,true);
		driver.manage().window().maximize();

		
	}
	void testurl() {
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	void testtitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void teardown() {
		driver.close();
	}
}
