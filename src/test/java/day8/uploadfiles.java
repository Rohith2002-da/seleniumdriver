package day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multipe-file-upload.php");
		driver.manage().window().maximize();
		
	}

}
