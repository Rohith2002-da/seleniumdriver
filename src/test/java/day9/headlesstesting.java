package day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlesstesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ChromeOptions options=new ChromeOptions();
      options.addArguments("--headless=new");//setting for headless testing,can deal with settimgs of the browser
      //can do multipe tasks-like do some activities in system
      //fasterexecution
     
      WebDriver driver=new ChromeDriver(options);//pass as argument -chromeoptions
      driver.get("https://demo.opencart.com/");//runs the test without browser ,dont open everything done in backend
      
	}

}
