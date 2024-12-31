package day9;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class capturescreenshot {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File target=new File(System.getProperty("user.dir")+"\\screenshot\\sc.png");
	source.renameTo(target);
	
//	//1.take full screenshot
//	TakesScreenshot ts=(TakesScreenshot) driver;
//	File sourcefile=ts.getScreenshotAs(OutputType.FILE);//capturing file
//	File targetfile=new File(System.getProperty("user.dir")+"\\screenshot\\fullpage.png");//storing the file
//	sourcefile.renameTo(targetfile);//copy source file to target file
//	
//	
////	//2.take screenshot of specific area
//	WebElement scrn=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
//	File sourcefile=scrn.getScreenshotAs(OutputType.FILE);
//	File targetfile1=new File(System.getProperty("user.dir")+"\\screenshot\\featured.png");//storing the file
//	sourcefile.renameTo(targetfile1);
	
	
//	//3.capturescreenshot of weblement
//	WebElement logo=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
//	File sourcefile=logo.getScreenshotAs(OutputType.FILE);
//	File targetfile2=new File(System.getProperty("user.dir")+"\\screenshot\\logo.png");//storing the file
//	sourcefile.renameTo(targetfile2);
	
	
	
	
	
}
}
