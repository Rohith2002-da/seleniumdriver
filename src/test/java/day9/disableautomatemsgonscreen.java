package day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class disableautomatemsgonscreen {
	public static void main(String[] args) {//to remove chrome is cntrolled by automatedsoftware
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});//accepts ssl certificates
		
		
		//options.addArguments("--incognito");//runs in incognito mode
	
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://demo.opencart.com/");
		System.out.print(driver.getTitle());//privacy error
	}
}
