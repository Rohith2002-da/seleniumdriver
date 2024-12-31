package day9;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handlessl {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);//accepts ssl certificates
		
	
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com/");
		System.out.print(driver.getTitle());//privacy error,expired.badssl.com

}
}