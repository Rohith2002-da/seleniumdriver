package day9;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {

	/*
	 * link href="https://xyz.com"
	 * 
	 * server--> status code
	 * status code>400 --broken link
	 */
		public static void main(String[] args) throws IOException {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.deadlinkcity.com/");
			driver.manage().window().maximize();
       
			
		    List<WebElement> hi=driver.findElements(By.tagName("a"));
		    System.out.print(hi.size());
		    for(WebElement i:hi) {
		      String href=i.getAttribute("href");
		      if(href==null||href.isEmpty()) {
		    	  System.out.print("null orempty");
		    	  continue;
		      }
		      URL link=new URL(href);
		      HttpURLConnection conn=(HttpURLConnection) link.openConnection();//open connection to theserver
		      conn.connect();
		      if(conn.getResponseCode()>400) {
		    	System.out.print("broken");
		    	
		      }else {
			    	System.out.print("not broken");
  
		      }
		      }
	}

}
