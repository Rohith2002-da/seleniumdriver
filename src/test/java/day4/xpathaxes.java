package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathaxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.opencart.com");
    String a=driver.getTitle();
     System.out.println(a);
     String b=driver.getCurrentUrl();
     System.out.println(b);
     String c=driver.getWindowHandle();
     System.out.println(c);
	}

}
